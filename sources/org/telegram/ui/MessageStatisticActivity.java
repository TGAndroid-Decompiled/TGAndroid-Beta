package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArraySet;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public class MessageStatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatAvatarContainer avatarContainer;
    private TLRPC.ChatFull chat;
    private final long chatId;
    private LruCache childDataCache;
    boolean drawPlay;
    private int emptyRow;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private int endRow;
    private boolean firstLoaded;
    boolean hasThumb;
    private int headerRow;
    private RLottieImageView imageView;
    private int interactionsChartRow;
    private StatisticActivity.ChartViewData interactionsViewData;
    private StatisticActivity.ZoomCancelable lastCancelable;
    private LinearLayoutManager layoutManager;
    private FrameLayout listContainer;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loading;
    private int loadingRow;
    private final int messageId;
    private MessageObject messageObject;
    private ArrayList messages;
    private boolean needActionbarMenu;
    private String nextOffset;
    private int overviewHeaderRow;
    private int overviewRow;
    private LinearLayout progressLayout;
    private int publicChats;
    private int reactionsByEmotionChartRow;
    private StatisticActivity.ChartViewData reactionsByEmotionData;
    private StatisticActivity.RecentPostInfo recentPostInfo;
    private int rowCount;
    ArraySet shadowDivideCells;
    private BaseChartView.SharedUiComponents sharedUi;
    private final Runnable showProgressbar;
    private int startRow;
    private boolean statsLoaded;
    ImageReceiver thumbImage;

    public MessageStatisticActivity(MessageObject messageObject) {
        this.childDataCache = new LruCache(15);
        this.messages = new ArrayList();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet();
        this.showProgressbar = new Runnable() {
            @Override
            public void run() {
                MessageStatisticActivity.this.progressLayout.animate().alpha(1.0f).setDuration(230L);
            }
        };
        this.messageObject = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.chatId = messageObject.getChatId();
            this.messageId = this.messageObject.getId();
        } else {
            this.chatId = -messageObject.getFromChatId();
            this.messageId = this.messageObject.messageOwner.fwd_msg_id;
        }
        this.chat = getMessagesController().getChatFull(this.chatId);
    }

    public MessageStatisticActivity(StatisticActivity.RecentPostInfo recentPostInfo, long j, boolean z) {
        this(recentPostInfo.message, j, z);
        this.recentPostInfo = recentPostInfo;
    }

    public MessageStatisticActivity(MessageObject messageObject, long j, boolean z) {
        this.childDataCache = new LruCache(15);
        this.messages = new ArrayList();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet();
        this.showProgressbar = new Runnable() {
            @Override
            public void run() {
                MessageStatisticActivity.this.progressLayout.animate().alpha(1.0f).setDuration(230L);
            }
        };
        this.messageObject = messageObject;
        this.messageId = 0;
        this.chatId = j;
        this.chat = getMessagesController().getChatFull(j);
        this.needActionbarMenu = z;
    }

    private void updateRows() {
        this.shadowDivideCells.clear();
        this.headerRow = -1;
        this.startRow = -1;
        this.endRow = -1;
        this.loadingRow = -1;
        this.interactionsChartRow = -1;
        this.reactionsByEmotionChartRow = -1;
        this.overviewHeaderRow = -1;
        this.overviewRow = -1;
        this.rowCount = 0;
        if (this.firstLoaded && this.statsLoaded) {
            AndroidUtilities.cancelRunOnUIThread(this.showProgressbar);
            if (this.listContainer.getVisibility() == 8) {
                this.progressLayout.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        MessageStatisticActivity.this.progressLayout.setVisibility(8);
                    }
                });
                this.listContainer.setVisibility(0);
                this.listContainer.setAlpha(0.0f);
                this.listContainer.animate().alpha(1.0f).start();
            }
            int i = this.rowCount;
            this.overviewHeaderRow = i;
            this.overviewRow = i + 1;
            ArraySet arraySet = this.shadowDivideCells;
            this.rowCount = i + 3;
            arraySet.add(Integer.valueOf(i + 2));
            if (this.interactionsViewData != null) {
                int i2 = this.rowCount;
                this.interactionsChartRow = i2;
                ArraySet arraySet2 = this.shadowDivideCells;
                this.rowCount = i2 + 2;
                arraySet2.add(Integer.valueOf(i2 + 1));
            }
            if (this.reactionsByEmotionData != null) {
                int i3 = this.rowCount;
                this.reactionsByEmotionChartRow = i3;
                ArraySet arraySet3 = this.shadowDivideCells;
                this.rowCount = i3 + 2;
                arraySet3.add(Integer.valueOf(i3 + 1));
            }
            if (!this.messages.isEmpty()) {
                int i4 = this.rowCount;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.headerRow = i4;
                this.startRow = i5;
                int size = i5 + this.messages.size();
                this.endRow = size;
                this.emptyRow = size;
                ArraySet arraySet4 = this.shadowDivideCells;
                this.rowCount = size + 2;
                arraySet4.add(Integer.valueOf(size + 1));
                if (!this.endReached) {
                    int i6 = this.rowCount;
                    this.rowCount = i6 + 1;
                    this.loadingRow = i6;
                }
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.chat != null) {
            loadStat();
            loadChats(100);
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.chatId, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.chat == null && chatFull.id == this.chatId) {
                setAvatarAndTitle();
                this.chat = chatFull;
                loadStat();
                loadChats(100);
                updateMenu();
            }
        }
    }

    public boolean checkIsDeletedStory(MessageObject messageObject) {
        if (messageObject == null || !messageObject.isStory() || !(messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString(R.string.StoryNotFound)).show();
        return true;
    }

    @Override
    public View createView(Context context) {
        CharSequence charSequenceReplaceEmoji;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(true);
        this.imageView.setAnimation(R.raw.statistic_preload, 120, 120);
        this.imageView.playAnimation();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i, getResourceProvider()));
        textView.setTag(Integer.valueOf(i));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i2 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i2, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(LocaleController.getString(R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        this.progressLayout.addView(this.imageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        this.progressLayout.setAlpha(0.0f);
        frameLayout2.addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, getResourceProvider());
        this.listView = recyclerListView;
        recyclerListView.setSections();
        RecyclerListView recyclerListView2 = this.listView;
        boolean z = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        ((SimpleItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                MessageStatisticActivity.$r8$lambda$fxrCYIJtEGGcqCNjKKhsZJ9FLFU(this.f$0, view, i3);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i3) {
                return MessageStatisticActivity.m3549$r8$lambda$p6gLYqoQpGIRcJY5mW_JEpd8w(this.f$0, view, i3);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                int iFindFirstVisibleItemPosition = MessageStatisticActivity.this.layoutManager.findFirstVisibleItemPosition();
                int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(MessageStatisticActivity.this.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (iAbs <= 0 || MessageStatisticActivity.this.endReached || MessageStatisticActivity.this.loading || MessageStatisticActivity.this.messages.isEmpty() || iFindFirstVisibleItemPosition + iAbs < itemCount - 5 || !MessageStatisticActivity.this.statsLoaded) {
                    return;
                }
                MessageStatisticActivity.this.loadChats(100);
            }
        });
        this.emptyView.showTextView();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.listContainer = frameLayout3;
        frameLayout3.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listContainer.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.listContainer.setVisibility(8);
        frameLayout2.addView(this.listContainer, LayoutHelper.createFrame(-1, -1.0f));
        AndroidUtilities.runOnUIThread(this.showProgressbar, 300L);
        updateRows();
        this.listView.setEmptyView(this.emptyView);
        this.avatarContainer = new ChatAvatarContainer(context, 0 == true ? 1 : 0, z) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                messageStatisticActivity.thumbImage.setImageCoords(messageStatisticActivity.avatarContainer.getAvatarImageView().getX(), MessageStatisticActivity.this.avatarContainer.getAvatarImageView().getY(), MessageStatisticActivity.this.avatarContainer.getAvatarImageView().getWidth(), MessageStatisticActivity.this.avatarContainer.getAvatarImageView().getHeight());
                if (MessageStatisticActivity.this.hasThumb) {
                    canvas.save();
                    canvas.scale(0.9f, 0.9f, MessageStatisticActivity.this.thumbImage.getCenterX(), MessageStatisticActivity.this.thumbImage.getCenterY());
                    MessageStatisticActivity.this.thumbImage.draw(canvas);
                    canvas.restore();
                }
                MessageStatisticActivity messageStatisticActivity2 = MessageStatisticActivity.this;
                if (messageStatisticActivity2.drawPlay) {
                    int centerX = (int) (messageStatisticActivity2.thumbImage.getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2));
                    int centerY = (int) (MessageStatisticActivity.this.thumbImage.getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2));
                    Drawable drawable = Theme.dialogs_playDrawable;
                    drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, Theme.dialogs_playDrawable.getIntrinsicHeight() + centerY);
                    Theme.dialogs_playDrawable.draw(canvas);
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageStatisticActivity.this.thumbImage.onAttachedToWindow();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                MessageStatisticActivity.this.thumbImage.onDetachedFromWindow();
            }
        };
        ImageReceiver imageReceiver = new ImageReceiver();
        this.thumbImage = imageReceiver;
        imageReceiver.setParentView(this.avatarContainer);
        this.thumbImage.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.hasThumb = false;
        int i3 = 50;
        if (!this.messageObject.isStory()) {
            if (!this.messageObject.needDrawBluredPreview() && (this.messageObject.isPhoto() || this.messageObject.isNewGif() || this.messageObject.isVideo())) {
                String str = this.messageObject.isWebpage() ? this.messageObject.messageOwner.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                    if (closestPhotoSizeWithSize != null) {
                        this.hasThumb = true;
                        this.drawPlay = this.messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (this.messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(this.messageObject) || FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            MessageObject messageObject = this.messageObject;
                            this.thumbImage.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, this.messageObject.photoThumbsObject), "50_50", (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size, null, this.messageObject, 0);
                        } else {
                            this.thumbImage.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, this.messageObject.photoThumbsObject), "50_50", (Drawable) null, this.messageObject, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(this.messageObject.caption)) {
                charSequenceReplaceEmoji = this.messageObject.caption;
            } else if (!TextUtils.isEmpty(this.messageObject.messageOwner.message)) {
                CharSequence charSequenceSubSequence = this.messageObject.messageText;
                if (charSequenceSubSequence.length() > 150) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, 150);
                }
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceSubSequence, this.avatarContainer.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequenceReplaceEmoji = this.messageObject.messageText;
            }
            if (this.messageObject.isVideo() || this.messageObject.isPhoto()) {
                this.avatarContainer.hideSubtitle();
            } else {
                this.avatarContainer.setSubtitle(charSequenceReplaceEmoji);
            }
        }
        if (this.hasThumb || this.messageObject.isStory()) {
            this.avatarContainer.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        } else {
            i3 = 56;
        }
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? i3 : 0.0f, 0.0f, 40.0f, 0.0f));
        setAvatarAndTitle();
        this.avatarContainer.setTitleColors(Theme.getColor(i, getResourceProvider()), Theme.getColor(i2, getResourceProvider()));
        View subtitleTextView = this.avatarContainer.getSubtitleTextView();
        if (subtitleTextView instanceof SimpleTextView) {
            ((SimpleTextView) subtitleTextView).setLinkTextColor(Theme.getColor(i2, getResourceProvider()));
        }
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, getResourceProvider()), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector, getResourceProvider()), false);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i4) {
                if (i4 == -1) {
                    MessageStatisticActivity.this.finishFragment();
                } else if (i4 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", MessageStatisticActivity.this.chatId);
                    MessageStatisticActivity.this.presentFragment(new StatisticActivity(bundle));
                }
            }
        });
        this.avatarContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MessageStatisticActivity.m3547$r8$lambda$VYGdaMFQXiJ8cwqT7n49pQ1cO8(this.f$0, view);
            }
        });
        updateMenu();
        return this.fragmentView;
    }

    public static void $r8$lambda$fxrCYIJtEGGcqCNjKKhsZJ9FLFU(MessageStatisticActivity messageStatisticActivity, View view, int i) {
        int i2 = messageStatisticActivity.startRow;
        if (i < i2 || i >= messageStatisticActivity.endRow) {
            return;
        }
        MessageObject messageObject = (MessageObject) messageStatisticActivity.messages.get(i - i2);
        if (messageObject.isStory()) {
            if (messageStatisticActivity.checkIsDeletedStory(messageObject)) {
                return;
            }
            messageStatisticActivity.getOrCreateStoryViewer().open(messageStatisticActivity.getContext(), messageObject.storyItem, StoriesListPlaceProvider.of(messageStatisticActivity.listView));
            return;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (messageStatisticActivity.getMessagesController().checkCanOpenChat(bundle, messageStatisticActivity)) {
            messageStatisticActivity.presentFragment(new ChatActivity(bundle));
        }
    }

    public static boolean m3549$r8$lambda$p6gLYqoQpGIRcJY5mW_JEpd8w(final MessageStatisticActivity messageStatisticActivity, View view, int i) {
        if (i >= messageStatisticActivity.startRow && i < messageStatisticActivity.endRow) {
            try {
                view.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final MessageObject messageObject = (MessageObject) messageStatisticActivity.messages.get(i - messageStatisticActivity.startRow);
            final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            final boolean zIsUserDialog = DialogObject.isUserDialog(dialogId);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            AlertDialog.Builder builder = new AlertDialog.Builder(messageStatisticActivity.getParentActivity(), messageStatisticActivity.getResourceProvider());
            if (messageObject.isStory()) {
                arrayList.add(LocaleController.getString(zIsUserDialog ? R.string.OpenProfile : R.string.OpenChannel2));
                arrayList3.add(Integer.valueOf(zIsUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
            } else {
                arrayList.add(LocaleController.getString(R.string.ViewMessage));
                arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
            }
            arrayList2.add(0);
            builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]), AndroidUtilities.toIntArray(arrayList3), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MessageStatisticActivity.$r8$lambda$VaLGC5jxQ_FyZ9DY1nZo7TtHjKE(this.f$0, messageObject, zIsUserDialog, dialogId, dialogInterface, i2);
                }
            });
            messageStatisticActivity.showDialog(builder.create());
        }
        return false;
    }

    public static void $r8$lambda$VaLGC5jxQ_FyZ9DY1nZo7TtHjKE(MessageStatisticActivity messageStatisticActivity, MessageObject messageObject, boolean z, long j, DialogInterface dialogInterface, int i) {
        messageStatisticActivity.getClass();
        if (messageObject.isStory()) {
            messageStatisticActivity.presentFragment(z ? ProfileActivity.of(j) : ChatActivity.of(j));
            return;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putInt("message_id", messageObject.getId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (messageStatisticActivity.getMessagesController().checkCanOpenChat(bundle, messageStatisticActivity)) {
            messageStatisticActivity.presentFragment(new ChatActivity(bundle));
        }
    }

    public static void m3547$r8$lambda$VYGdaMFQXiJ8cwqT7n49pQ1cO8(MessageStatisticActivity messageStatisticActivity, View view) {
        if (messageStatisticActivity.messageObject.isStory()) {
            return;
        }
        if (messageStatisticActivity.getParentLayout().getFragmentStack().size() > 1) {
            BaseFragment baseFragment = (BaseFragment) messageStatisticActivity.getParentLayout().getFragmentStack().get(messageStatisticActivity.getParentLayout().getFragmentStack().size() - 2);
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getCurrentChat().id == messageStatisticActivity.chatId) {
                messageStatisticActivity.finishFragment();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", messageStatisticActivity.chatId);
        bundle.putInt("message_id", messageStatisticActivity.messageId);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        messageStatisticActivity.presentFragment(new ChatActivity(bundle));
    }

    private void setAvatarAndTitle() {
        if (this.messageObject.isStory()) {
            this.avatarContainer.setTitle(LocaleController.getString(R.string.StoryStatistics));
            this.avatarContainer.hideSubtitle();
            ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
            chatAvatarContainer.allowDrawStories = true;
            chatAvatarContainer.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = this.messageObject.photoThumbs;
            if (arrayList != null) {
                this.avatarContainer.getAvatarImageView().setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), this.messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, 50), this.messageObject.photoThumbsObject), "b1", 0, this.messageObject);
                this.avatarContainer.setClipChildren(false);
                this.avatarContainer.getAvatarImageView().setScaleX(0.96f);
                this.avatarContainer.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.avatarContainer.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (chat == null || this.hasThumb) {
            return;
        }
        this.avatarContainer.setChatAvatar(chat);
    }

    private void updateMenu() {
        TLRPC.ChatFull chatFull;
        if (this.needActionbarMenu && (chatFull = this.chat) != null && chatFull.can_view_stats) {
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.clearItems();
            actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other).addSubItem(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public void loadChats(int i) {
        if (this.loading) {
            return;
        }
        this.loading = true;
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (this.messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = i;
            tL_getStoryPublicForwards.id = this.messageObject.storyItem.id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.chatId);
            String str = this.nextOffset;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessageStatisticActivity.$r8$lambda$oxQpIs2s3IZqh0Nqb84qcnoIjwA(this.f$0, tLObject, tL_error);
                }
            }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = i;
        MessageObject messageObject = this.messageObject;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
        } else {
            tL_getMessagePublicForwards.msg_id = messageObject.getId();
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
        }
        String str2 = this.nextOffset;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessageStatisticActivity.$r8$lambda$QgFwHlknXxoBKJIYjPDaoK0hmeM(this.f$0, tLObject, tL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public static void $r8$lambda$oxQpIs2s3IZqh0Nqb84qcnoIjwA(final MessageStatisticActivity messageStatisticActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        messageStatisticActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.m3551$r8$lambda$vA5QRd_JjRfESQWWEfAcjkeE48(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m3551$r8$lambda$vA5QRd_JjRfESQWWEfAcjkeE48(MessageStatisticActivity messageStatisticActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            messageStatisticActivity.getClass();
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                messageStatisticActivity.nextOffset = tL_publicForwards.next_offset;
            } else {
                messageStatisticActivity.nextOffset = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                messageStatisticActivity.publicChats = i;
            } else if (messageStatisticActivity.publicChats == 0) {
                messageStatisticActivity.publicChats = tL_publicForwards.forwards.size();
            }
            messageStatisticActivity.endReached = messageStatisticActivity.nextOffset == null;
            messageStatisticActivity.getMessagesController().putChats(tL_publicForwards.chats, false);
            messageStatisticActivity.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(messageStatisticActivity.currentAccount, tL_publicForwardStory.story);
                    messageObject.generateThumbs(false);
                    messageStatisticActivity.messages.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    messageStatisticActivity.messages.add(new MessageObject(messageStatisticActivity.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = messageStatisticActivity.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        messageStatisticActivity.firstLoaded = true;
        messageStatisticActivity.loading = false;
        messageStatisticActivity.updateRows();
    }

    public static void $r8$lambda$QgFwHlknXxoBKJIYjPDaoK0hmeM(final MessageStatisticActivity messageStatisticActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        messageStatisticActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.m3548$r8$lambda$d34WLKdlBNi78AaMwsVk_MXhWI(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m3548$r8$lambda$d34WLKdlBNi78AaMwsVk_MXhWI(MessageStatisticActivity messageStatisticActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            messageStatisticActivity.getClass();
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                messageStatisticActivity.nextOffset = tL_publicForwards.next_offset;
            } else {
                messageStatisticActivity.nextOffset = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                messageStatisticActivity.publicChats = i;
            } else if (messageStatisticActivity.publicChats == 0) {
                messageStatisticActivity.publicChats = tL_publicForwards.forwards.size();
            }
            messageStatisticActivity.endReached = messageStatisticActivity.nextOffset == null;
            messageStatisticActivity.getMessagesController().putChats(tL_publicForwards.chats, false);
            messageStatisticActivity.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(messageStatisticActivity.currentAccount, tL_publicForwardStory.story);
                    messageObject.generateThumbs(false);
                    messageStatisticActivity.messages.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    messageStatisticActivity.messages.add(new MessageObject(messageStatisticActivity.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = messageStatisticActivity.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        messageStatisticActivity.firstLoaded = true;
        messageStatisticActivity.loading = false;
        messageStatisticActivity.updateRows();
    }

    private void loadStat() {
        TLObject tLObject;
        if (this.messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = this.messageObject.storyItem.id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.chatId);
            tLObject = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats = new TL_stats.TL_getMessageStats();
            MessageObject messageObject = this.messageObject;
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
                tLObject = tL_getMessageStats;
            } else {
                tL_getMessageStats.msg_id = messageObject.getId();
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
                tLObject = tL_getMessageStats;
            }
        }
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MessageStatisticActivity.$r8$lambda$lkQlLR0sMaAz5pekkL9PfBKJVhs(this.f$0, tLObject2, tL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true);
    }

    public static void $r8$lambda$lkQlLR0sMaAz5pekkL9PfBKJVhs(final MessageStatisticActivity messageStatisticActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        messageStatisticActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.$r8$lambda$6oEjSCBzSmNAHd0g_0IDYrNqIi8(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$6oEjSCBzSmNAHd0g_0IDYrNqIi8(final MessageStatisticActivity messageStatisticActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        messageStatisticActivity.statsLoaded = true;
        if (tL_error != null) {
            messageStatisticActivity.updateRows();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        messageStatisticActivity.interactionsViewData = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        messageStatisticActivity.reactionsByEmotionData = StatisticActivity.createViewData(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        StatisticActivity.ChartViewData chartViewData = messageStatisticActivity.interactionsViewData;
        if (chartViewData != null && chartViewData.chartData.x.length <= 5) {
            messageStatisticActivity.statsLoaded = false;
            final TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            StatisticActivity.ChartViewData chartViewData2 = messageStatisticActivity.interactionsViewData;
            tL_loadAsyncGraph.token = chartViewData2.zoomToken;
            long[] jArr = chartViewData2.chartData.x;
            tL_loadAsyncGraph.x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            final String str = messageStatisticActivity.interactionsViewData.zoomToken + "_" + tL_loadAsyncGraph.x;
            ConnectionsManager.getInstance(messageStatisticActivity.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(messageStatisticActivity.currentAccount).sendRequest(tL_loadAsyncGraph, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    MessageStatisticActivity.$r8$lambda$PgOR9mYBzb0GOY1evG4Y42UKxz8(this.f$0, str, tL_loadAsyncGraph, tLObject2, tL_error2);
                }
            }, null, null, 0, messageStatisticActivity.chat.stats_dc, 1, true), messageStatisticActivity.classGuid);
            return;
        }
        messageStatisticActivity.updateRows();
    }

    public static void $r8$lambda$PgOR9mYBzb0GOY1evG4Y42UKxz8(final MessageStatisticActivity messageStatisticActivity, final String str, final TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        ChartData chartDataCreateChartData;
        messageStatisticActivity.getClass();
        if (tLObject instanceof TL_stats.TL_statsGraph) {
            try {
                chartDataCreateChartData = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
            } catch (JSONException e) {
                e.printStackTrace();
                chartDataCreateChartData = null;
            }
            final ChartData chartData = chartDataCreateChartData;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageStatisticActivity.m3550$r8$lambda$uGXucCXyP5yEI1oUWjTuZs0As(this.f$0, tL_error, chartData, str, tL_loadAsyncGraph);
                }
            });
        }
        if (tLObject instanceof TL_stats.TL_statsGraphError) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageStatisticActivity.m3546$r8$lambda$Qk_TwL5II0IDfBEei2zuL9YGqk(this.f$0, tLObject);
                }
            });
        }
        chartDataCreateChartData = null;
        final ChartData chartData2 = chartDataCreateChartData;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.m3550$r8$lambda$uGXucCXyP5yEI1oUWjTuZs0As(this.f$0, tL_error, chartData2, str, tL_loadAsyncGraph);
            }
        });
    }

    public static void m3546$r8$lambda$Qk_TwL5II0IDfBEei2zuL9YGqk(MessageStatisticActivity messageStatisticActivity, TLObject tLObject) {
        if (messageStatisticActivity.getParentActivity() != null) {
            Toast.makeText(messageStatisticActivity.getParentActivity(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
        }
    }

    public static void m3550$r8$lambda$uGXucCXyP5yEI1oUWjTuZs0As(MessageStatisticActivity messageStatisticActivity, TLRPC.TL_error tL_error, ChartData chartData, String str, TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph) {
        messageStatisticActivity.statsLoaded = true;
        if (tL_error != null || chartData == null) {
            messageStatisticActivity.updateRows();
            return;
        }
        messageStatisticActivity.childDataCache.put(str, chartData);
        StatisticActivity.ChartViewData chartViewData = messageStatisticActivity.interactionsViewData;
        chartViewData.childChartData = chartData;
        chartViewData.activeZoom = tL_loadAsyncGraph.x;
        messageStatisticActivity.updateRows();
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                return ((ManageChatUserCell) viewHolder.itemView).getCurrentObject() instanceof TLObject;
            }
            return false;
        }

        @Override
        public int getItemCount() {
            return MessageStatisticActivity.this.rowCount;
        }

        class AnonymousClass1 extends StatisticActivity.BaseChartCell {
            @Override
            protected void loadData(StatisticActivity.ChartViewData chartViewData) {
            }

            AnonymousClass1(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents, Theme.ResourcesProvider resourcesProvider) {
                super(context, i, sharedUiComponents, resourcesProvider);
            }

            @Override
            public void onZoomed() {
                if (this.data.activeZoom > 0) {
                    return;
                }
                performClick();
                BaseChartView baseChartView = this.chartView;
                if (baseChartView.legendSignatureView.canGoZoom) {
                    long selectedDate = baseChartView.getSelectedDate();
                    if (this.chartType == 4) {
                        StatisticActivity.ChartViewData chartViewData = this.data;
                        chartViewData.childChartData = new StackLinearChartData(chartViewData.chartData, selectedDate);
                        zoomChart(false);
                        return;
                    }
                    if (this.data.zoomToken == null) {
                        return;
                    }
                    zoomCanceled();
                    final String str = this.data.zoomToken + "_" + selectedDate;
                    ChartData chartData = (ChartData) MessageStatisticActivity.this.childDataCache.get(str);
                    if (chartData != null) {
                        this.data.childChartData = chartData;
                        zoomChart(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.data.zoomToken;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                    final StatisticActivity.ZoomCancelable zoomCancelable = new StatisticActivity.ZoomCancelable();
                    messageStatisticActivity.lastCancelable = zoomCancelable;
                    zoomCancelable.adapterPosition = MessageStatisticActivity.this.listView.getChildAdapterPosition(this);
                    this.chartView.legendSignatureView.showProgress(true, false);
                    ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).sendRequest(tL_loadAsyncGraph, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            MessageStatisticActivity.ListAdapter.AnonymousClass1.$r8$lambda$fozp6dfENuEa9X8h2_UmPoV3BN4(this.f$0, str, zoomCancelable, tLObject, tL_error);
                        }
                    }, null, null, 0, MessageStatisticActivity.this.chat.stats_dc, 1, true), ((BaseFragment) MessageStatisticActivity.this).classGuid);
                }
            }

            public static void $r8$lambda$fozp6dfENuEa9X8h2_UmPoV3BN4(final AnonymousClass1 anonymousClass1, final String str, final StatisticActivity.ZoomCancelable zoomCancelable, TLObject tLObject, TLRPC.TL_error tL_error) {
                final ChartData chartDataCreateChartData;
                anonymousClass1.getClass();
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        chartDataCreateChartData = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), anonymousClass1.data.graphType, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        chartDataCreateChartData = null;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessageStatisticActivity.ListAdapter.AnonymousClass1.$r8$lambda$tx7tvjodGP7YDOSrvHToyd7Ns9c(this.f$0, chartDataCreateChartData, str, zoomCancelable);
                        }
                    });
                }
                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(anonymousClass1.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                chartDataCreateChartData = null;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessageStatisticActivity.ListAdapter.AnonymousClass1.$r8$lambda$tx7tvjodGP7YDOSrvHToyd7Ns9c(this.f$0, chartDataCreateChartData, str, zoomCancelable);
                    }
                });
            }

            public static void $r8$lambda$tx7tvjodGP7YDOSrvHToyd7Ns9c(AnonymousClass1 anonymousClass1, ChartData chartData, String str, StatisticActivity.ZoomCancelable zoomCancelable) {
                if (chartData != null) {
                    MessageStatisticActivity.this.childDataCache.put(str, chartData);
                }
                if (chartData != null) {
                    anonymousClass1.getClass();
                    if (!zoomCancelable.canceled && zoomCancelable.adapterPosition >= 0) {
                        View viewFindViewByPosition = MessageStatisticActivity.this.layoutManager.findViewByPosition(zoomCancelable.adapterPosition);
                        if (viewFindViewByPosition instanceof StatisticActivity.BaseChartCell) {
                            anonymousClass1.data.childChartData = chartData;
                            StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) viewFindViewByPosition;
                            baseChartCell.chartView.legendSignatureView.showProgress(false, false);
                            baseChartCell.zoomChart(false);
                        }
                    }
                }
                anonymousClass1.zoomCanceled();
            }

            @Override
            public void zoomCanceled() {
                if (MessageStatisticActivity.this.lastCancelable != null) {
                    MessageStatisticActivity.this.lastCancelable.canceled = true;
                }
                int childCount = MessageStatisticActivity.this.listView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = MessageStatisticActivity.this.listView.getChildAt(i);
                    if (childAt instanceof StatisticActivity.BaseChartCell) {
                        ((StatisticActivity.BaseChartCell) childAt).chartView.legendSignatureView.showProgress(false, true);
                    }
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View anonymousClass1;
            int i2;
            View loadingCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, MessageStatisticActivity.this.getResourceProvider());
                manageChatUserCell.setDividerColor(Theme.key_divider);
                view = manageChatUserCell;
            } else {
                if (i == 1) {
                    anonymousClass1 = new ShadowSectionCell(this.mContext, MessageStatisticActivity.this.getResourceProvider());
                } else if (i == 2) {
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlackText, 16, 11, false, MessageStatisticActivity.this.getResourceProvider());
                    headerCell.setHeight(43);
                    view = headerCell;
                } else if (i == 4) {
                    Context context = this.mContext;
                    if (i == 4) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                    anonymousClass1 = new AnonymousClass1(context, i2, messageStatisticActivity.sharedUi = new BaseChartView.SharedUiComponents(messageStatisticActivity.getResourceProvider()), MessageStatisticActivity.this.getResourceProvider());
                } else {
                    if (i == 5) {
                        OverviewCell overviewCell = MessageStatisticActivity.this.new OverviewCell(this.mContext);
                        overviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                        loadingCell = overviewCell;
                    } else if (i == 6) {
                        EmptyCell emptyCell = new EmptyCell(this.mContext, 16);
                        emptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, 16));
                        loadingCell = emptyCell;
                    } else if (i == 7) {
                        Context context2 = this.mContext;
                        if (i == 4) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        MessageStatisticActivity messageStatisticActivity2 = MessageStatisticActivity.this;
                        anonymousClass1 = new AnonymousClass1(context2, i2, messageStatisticActivity2.sharedUi = new BaseChartView.SharedUiComponents(messageStatisticActivity2.getResourceProvider()), MessageStatisticActivity.this.getResourceProvider());
                    } else {
                        loadingCell = new LoadingCell(this.mContext, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                    }
                    anonymousClass1 = loadingCell;
                }
                return new RecyclerListView.Holder(anonymousClass1);
            }
            anonymousClass1 = view;
            return new RecyclerListView.Holder(anonymousClass1);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Object user;
            String pluralString;
            String str;
            int i2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
                if (itemViewType == 2) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == MessageStatisticActivity.this.overviewHeaderRow) {
                        headerCell.setTopMargin(9);
                        headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                        headerCell.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                        return;
                    } else {
                        headerCell.setTopMargin(11);
                        headerCell.setPadding(0, 0, 0, 0);
                        headerCell.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        return;
                    }
                }
                if (itemViewType == 4) {
                    StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) viewHolder.itemView;
                    baseChartCell.updateData(MessageStatisticActivity.this.interactionsViewData, false);
                    baseChartCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    return;
                } else if (itemViewType == 5) {
                    ((OverviewCell) viewHolder.itemView).setData();
                    return;
                } else {
                    if (itemViewType != 7) {
                        return;
                    }
                    StatisticActivity.BaseChartCell baseChartCell2 = (StatisticActivity.BaseChartCell) viewHolder.itemView;
                    baseChartCell2.updateData(MessageStatisticActivity.this.reactionsByEmotionData, false);
                    baseChartCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    return;
                }
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            final MessageObject item = getItem(i);
            long dialogId = MessageObject.getDialogId(item.messageOwner);
            if (item.isStory()) {
                Object user2 = DialogObject.isUserDialog(dialogId) ? MessageStatisticActivity.this.getMessagesController().getUser(Long.valueOf(dialogId)) : MessageStatisticActivity.this.getMessagesController().getChat(Long.valueOf(-dialogId));
                TL_stories.StoryViews storyViews = item.storyItem.views;
                manageChatUserCell.setData(user2, null, (storyViews == null || (i2 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i2, new Object[0]), i != MessageStatisticActivity.this.endRow - 1);
                manageChatUserCell.setStoryItem(item.storyItem, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        MessageStatisticActivity.ListAdapter.$r8$lambda$yiEZahl4KSwjCwJx0riEoZiKRAI(this.f$0, item, view);
                    }
                });
                return;
            }
            manageChatUserCell.setStoryItem(null, null);
            if (DialogObject.isUserDialog(dialogId)) {
                user = MessageStatisticActivity.this.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                TLRPC.Chat chat = MessageStatisticActivity.this.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    pluralString = LocaleController.formatPluralString("Views", item.messageOwner.views, new Object[0]);
                } else {
                    int i3 = chat.participants_count;
                    if (i3 != 0) {
                        pluralString = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i3, new Object[0]), LocaleController.formatPluralString("Views", item.messageOwner.views, new Object[0]));
                    } else {
                        user = chat;
                    }
                }
                str = pluralString;
                user = chat;
                if (user != null) {
                    manageChatUserCell.setData(user, null, str, i != MessageStatisticActivity.this.endRow - 1);
                }
            }
            str = null;
            if (user != null) {
                manageChatUserCell.setData(user, null, str, i != MessageStatisticActivity.this.endRow - 1);
            }
        }

        public static void $r8$lambda$yiEZahl4KSwjCwJx0riEoZiKRAI(ListAdapter listAdapter, MessageObject messageObject, View view) {
            if (MessageStatisticActivity.this.checkIsDeletedStory(messageObject)) {
                return;
            }
            MessageStatisticActivity.this.getOrCreateStoryViewer().open(MessageStatisticActivity.this.getContext(), messageObject.storyItem, StoriesListPlaceProvider.of(MessageStatisticActivity.this.listView));
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (MessageStatisticActivity.this.shadowDivideCells.contains(Integer.valueOf(i))) {
                return 1;
            }
            if (i == MessageStatisticActivity.this.headerRow || i == MessageStatisticActivity.this.overviewHeaderRow) {
                return 2;
            }
            if (i == MessageStatisticActivity.this.loadingRow) {
                return 3;
            }
            if (i == MessageStatisticActivity.this.interactionsChartRow) {
                return 4;
            }
            if (i == MessageStatisticActivity.this.overviewRow) {
                return 5;
            }
            if (i == MessageStatisticActivity.this.emptyRow) {
                return 6;
            }
            return i == MessageStatisticActivity.this.reactionsByEmotionChartRow ? 7 : 0;
        }

        public MessageObject getItem(int i) {
            if (i < MessageStatisticActivity.this.startRow || i >= MessageStatisticActivity.this.endRow) {
                return null;
            }
            return (MessageObject) MessageStatisticActivity.this.messages.get(i - MessageStatisticActivity.this.startRow);
        }
    }

    public class OverviewCell extends LinearLayout {
        TextView[] primary;
        TextView[] title;

        public OverviewCell(Context context) {
            super(context);
            this.primary = new TextView[4];
            this.title = new TextView[4];
            setOrientation(1);
            setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            int i = 0;
            while (i < 2) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i2 = 0; i2 < 2; i2++) {
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    int i3 = (i * 2) + i2;
                    this.primary[i3] = new TextView(context);
                    this.title[i3] = new TextView(context);
                    this.primary[i3].setTypeface(AndroidUtilities.bold());
                    this.primary[i3].setTextSize(1, 17.0f);
                    this.title[i3].setTextSize(1, 13.0f);
                    this.title[i3].setGravity(3);
                    linearLayout3.addView(this.primary[i3]);
                    linearLayout2.addView(linearLayout3);
                    linearLayout2.addView(this.title[i3]);
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
                }
                addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i == 0 ? 16.0f : 0.0f));
                i++;
            }
        }

        public void setData() {
            int views;
            int forwards;
            int reactions;
            if (MessageStatisticActivity.this.recentPostInfo != null) {
                views = MessageStatisticActivity.this.recentPostInfo.getViews();
                forwards = MessageStatisticActivity.this.recentPostInfo.getForwards();
                reactions = MessageStatisticActivity.this.recentPostInfo.getReactions();
            } else {
                views = MessageStatisticActivity.this.messageObject.isStory() ? MessageStatisticActivity.this.messageObject.storyItem.views.views_count : MessageStatisticActivity.this.messageObject.messageOwner.views;
                forwards = MessageStatisticActivity.this.messageObject.isStory() ? MessageStatisticActivity.this.messageObject.storyItem.views.forwards_count : MessageStatisticActivity.this.messageObject.messageOwner.forwards;
                if (MessageStatisticActivity.this.messageObject.isStory()) {
                    reactions = MessageStatisticActivity.this.messageObject.storyItem.views.reactions_count;
                } else if (MessageStatisticActivity.this.messageObject.messageOwner.reactions != null) {
                    reactions = 0;
                    for (int i = 0; i < MessageStatisticActivity.this.messageObject.messageOwner.reactions.results.size(); i++) {
                        reactions += MessageStatisticActivity.this.messageObject.messageOwner.reactions.results.get(i).count;
                    }
                } else {
                    reactions = 0;
                }
            }
            this.primary[0].setText(AndroidUtilities.formatWholeNumber(views, 0));
            this.title[0].setText(LocaleController.getString(R.string.StatisticViews));
            this.primary[1].setText(AndroidUtilities.formatWholeNumber(MessageStatisticActivity.this.publicChats, 0));
            this.title[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            this.primary[2].setText(AndroidUtilities.formatWholeNumber(reactions, 0));
            this.title[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            if (MessageStatisticActivity.this.chat != null && (MessageStatisticActivity.this.chat.available_reactions instanceof TLRPC.TL_chatReactionsNone) && reactions == 0) {
                ((ViewGroup) this.title[2].getParent()).setVisibility(8);
            }
            this.primary[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, forwards - MessageStatisticActivity.this.publicChats), 0));
            this.title[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            updateColors();
        }

        public void updateColors() {
            for (int i = 0; i < 4; i++) {
                this.primary[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, MessageStatisticActivity.this.getResourceProvider()));
                this.title[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, MessageStatisticActivity.this.getResourceProvider()));
            }
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                MessageStatisticActivity.m3552$r8$lambda$wAPJReqcEegg7Lkg1FBut3V8ao(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, ManageChatUserCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer != null ? chatAvatarContainer.getTitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_player_actionBarTitle));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer2 != null ? chatAvatarContainer2.getSubtitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, (Class[]) null, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_player_actionBarSubtitle, (Object) null));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_statisticChartLineEmpty));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        StatisticActivity.putColorFromData(this.interactionsViewData, arrayList, themeDescriptionDelegate);
        StatisticActivity.putColorFromData(this.reactionsByEmotionData, arrayList, themeDescriptionDelegate);
        return arrayList;
    }

    public static void m3552$r8$lambda$wAPJReqcEegg7Lkg1FBut3V8ao(MessageStatisticActivity messageStatisticActivity) {
        RecyclerListView recyclerListView = messageStatisticActivity.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getChildAt(i));
            }
            int hiddenChildCount = messageStatisticActivity.listView.getHiddenChildCount();
            for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getHiddenChildAt(i2));
            }
            int cachedChildCount = messageStatisticActivity.listView.getCachedChildCount();
            for (int i3 = 0; i3 < cachedChildCount; i3++) {
                messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getCachedChildAt(i3));
            }
            int attachedScrapChildCount = messageStatisticActivity.listView.getAttachedScrapChildCount();
            for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
                messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getAttachedScrapChildAt(i4));
            }
            messageStatisticActivity.listView.getRecycledViewPool().clear();
        }
        BaseChartView.SharedUiComponents sharedUiComponents = messageStatisticActivity.sharedUi;
        if (sharedUiComponents != null) {
            sharedUiComponents.invalidate();
        }
        View subtitleTextView = messageStatisticActivity.avatarContainer.getSubtitleTextView();
        if (subtitleTextView instanceof SimpleTextView) {
            ((SimpleTextView) subtitleTextView).setLinkTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, messageStatisticActivity.getResourceProvider()));
        }
    }

    private void recolorRecyclerItem(View view) {
        if (view instanceof ManageChatUserCell) {
            ((ManageChatUserCell) view).update(0);
        } else if (view instanceof StatisticActivity.BaseChartCell) {
            ((StatisticActivity.BaseChartCell) view).recolor();
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        } else if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider())), Theme.getThemedDrawableByKey(ApplicationLoader.applicationContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow), 0, 0);
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
        } else if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            ((OverviewCell) view).updateColors();
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        }
        if (view instanceof EmptyCell) {
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider())) > 0.699999988079071d;
    }
}
