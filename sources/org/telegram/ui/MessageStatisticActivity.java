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
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$PublicForward;
import org.telegram.tgnet.TLRPC$StatsGraph;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_publicForwardMessage;
import org.telegram.tgnet.TLRPC$TL_statsGraph;
import org.telegram.tgnet.TLRPC$TL_statsGraphError;
import org.telegram.tgnet.TLRPC$TL_stats_getMessagePublicForwards;
import org.telegram.tgnet.TLRPC$TL_stats_getMessageStats;
import org.telegram.tgnet.TLRPC$TL_stats_getStoryPublicForwards;
import org.telegram.tgnet.TLRPC$TL_stats_loadAsyncGraph;
import org.telegram.tgnet.TLRPC$TL_stats_messageStats;
import org.telegram.tgnet.TLRPC$TL_stats_publicForwards;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_publicForwardStory;
import org.telegram.tgnet.tl.TL_stories$TL_stats_getStoryStats;
import org.telegram.tgnet.tl.TL_stories$TL_stats_storyStats;
import org.telegram.tgnet.tl.TL_stories$TL_storyItemDeleted;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
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
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
public class MessageStatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatAvatarContainer avatarContainer;
    private TLRPC$ChatFull chat;
    private final long chatId;
    private LruCache<ChartData> childDataCache;
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
    private ArrayList<MessageObject> messages;
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
    ArraySet<Integer> shadowDivideCells;
    private BaseChartView.SharedUiComponents sharedUi;
    private final Runnable showProgressbar;
    private int startRow;
    private boolean statsLoaded;
    ImageReceiver thumbImage;

    public MessageStatisticActivity(MessageObject messageObject) {
        this.childDataCache = new LruCache<>(15);
        this.messages = new ArrayList<>();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet<>();
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
        this.childDataCache = new LruCache<>(15);
        this.messages = new ArrayList<>();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet<>();
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
            int i2 = i + 1;
            this.rowCount = i2;
            this.overviewHeaderRow = i;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.overviewRow = i2;
            ArraySet<Integer> arraySet = this.shadowDivideCells;
            this.rowCount = i3 + 1;
            arraySet.add(Integer.valueOf(i3));
            if (this.interactionsViewData != null) {
                int i4 = this.rowCount;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.interactionsChartRow = i4;
                ArraySet<Integer> arraySet2 = this.shadowDivideCells;
                this.rowCount = i5 + 1;
                arraySet2.add(Integer.valueOf(i5));
            }
            if (this.reactionsByEmotionData != null) {
                int i6 = this.rowCount;
                int i7 = i6 + 1;
                this.rowCount = i7;
                this.reactionsByEmotionChartRow = i6;
                ArraySet<Integer> arraySet3 = this.shadowDivideCells;
                this.rowCount = i7 + 1;
                arraySet3.add(Integer.valueOf(i7));
            }
            if (!this.messages.isEmpty()) {
                int i8 = this.rowCount;
                int i9 = i8 + 1;
                this.rowCount = i9;
                this.headerRow = i8;
                this.startRow = i9;
                int size = i9 + this.messages.size();
                this.rowCount = size;
                this.endRow = size;
                int i10 = size + 1;
                this.rowCount = i10;
                this.emptyRow = size;
                ArraySet<Integer> arraySet4 = this.shadowDivideCells;
                this.rowCount = i10 + 1;
                arraySet4.add(Integer.valueOf(i10));
                if (!this.endReached) {
                    int i11 = this.rowCount;
                    this.rowCount = i11 + 1;
                    this.loadingRow = i11;
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
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (this.chat == null && tLRPC$ChatFull.id == this.chatId) {
                setAvatarAndTitle();
                this.chat = tLRPC$ChatFull;
                loadStat();
                loadChats(100);
                updateMenu();
            }
        }
    }

    public boolean checkIsDeletedStory(MessageObject messageObject) {
        if (messageObject != null && messageObject.isStory() && (messageObject.storyItem instanceof TL_stories$TL_storyItemDeleted)) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString("StoryNotFound", R.string.StoryNotFound)).show();
            return true;
        }
        return false;
    }

    @Override
    public View createView(Context context) {
        CharSequence charSequence;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoResult", R.string.NoResult));
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
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        int i = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i, getResourceProvider()));
        textView.setTag(Integer.valueOf(i));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i2 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i2, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(LocaleController.getString("LoadingStatsDescription", R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        this.progressLayout.addView(this.imageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        this.progressLayout.setAlpha(0.0f);
        frameLayout2.addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, getResourceProvider());
        this.listView = recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        ((SimpleItemAnimator) this.listView.getItemAnimator()).setSupportsChangeAnimations(false);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                MessageStatisticActivity.this.lambda$createView$0(view, i3);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i3) {
                boolean lambda$createView$2;
                lambda$createView$2 = MessageStatisticActivity.this.lambda$createView$2(view, i3);
                return lambda$createView$2;
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                int findFirstVisibleItemPosition = MessageStatisticActivity.this.layoutManager.findFirstVisibleItemPosition();
                int abs = findFirstVisibleItemPosition == -1 ? 0 : Math.abs(MessageStatisticActivity.this.layoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (abs <= 0 || MessageStatisticActivity.this.endReached || MessageStatisticActivity.this.loading || MessageStatisticActivity.this.messages.isEmpty() || findFirstVisibleItemPosition + abs < itemCount - 5 || !MessageStatisticActivity.this.statsLoaded) {
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
        this.avatarContainer = new ChatAvatarContainer(context, null, false) {
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
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageStatisticActivity.this.thumbImage.onAttachedToWindow();
            }

            @Override
            public void onDetachedFromWindow() {
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
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, 50);
                    TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    TLRPC$PhotoSize tLRPC$PhotoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                    if (closestPhotoSizeWithSize != null) {
                        this.hasThumb = true;
                        this.drawPlay = this.messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(tLRPC$PhotoSize);
                        if (this.messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(this.messageObject) || FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            MessageObject messageObject = this.messageObject;
                            this.thumbImage.setImage(ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, this.messageObject.photoThumbsObject), "50_50", (messageObject.type != 1 || tLRPC$PhotoSize == null) ? 0 : tLRPC$PhotoSize.size, null, this.messageObject, 0);
                        } else {
                            this.thumbImage.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, this.messageObject.photoThumbsObject), "50_50", (Drawable) null, this.messageObject, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(this.messageObject.caption)) {
                charSequence = this.messageObject.caption;
            } else if (!TextUtils.isEmpty(this.messageObject.messageOwner.message)) {
                CharSequence charSequence2 = this.messageObject.messageText;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                }
                charSequence = Emoji.replaceEmoji(charSequence2, this.avatarContainer.getSubtitleTextView().getTextPaint().getFontMetricsInt(), AndroidUtilities.dp(17.0f), false);
            } else {
                charSequence = this.messageObject.messageText;
            }
            if (this.messageObject.isVideo() || this.messageObject.isPhoto()) {
                this.avatarContainer.hideSubtitle();
            } else {
                this.avatarContainer.setSubtitle(charSequence);
            }
        }
        if (this.hasThumb || this.messageObject.isStory()) {
            this.avatarContainer.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        } else {
            i3 = 56;
        }
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? i3 : 0.0f, 0.0f, 40.0f, 0.0f));
        setAvatarAndTitle();
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
        this.avatarContainer.setTitleColors(Theme.getColor(i, getResourceProvider()), Theme.getColor(i2, getResourceProvider()));
        this.avatarContainer.getSubtitleTextView().setLinkTextColor(Theme.getColor(i2, getResourceProvider()));
        this.actionBar.setItemsColor(Theme.getColor(i, getResourceProvider()), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector, getResourceProvider()), false);
        this.actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        this.avatarContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MessageStatisticActivity.this.lambda$createView$3(view);
            }
        });
        updateMenu();
        return this.fragmentView;
    }

    public void lambda$createView$0(View view, int i) {
        int i2 = this.startRow;
        if (i < i2 || i >= this.endRow) {
            return;
        }
        MessageObject messageObject = this.messages.get(i - i2);
        if (messageObject.isStory()) {
            if (checkIsDeletedStory(messageObject)) {
                return;
            }
            getOrCreateStoryViewer().open(getContext(), messageObject.storyItem, StoriesListPlaceProvider.of(this.listView));
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
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle));
        }
    }

    public boolean lambda$createView$2(View view, int i) {
        int i2;
        String str;
        if (i >= this.startRow && i < this.endRow) {
            try {
                view.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final MessageObject messageObject = this.messages.get(i - this.startRow);
            final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
            final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), getResourceProvider());
            if (messageObject.isStory()) {
                if (isUserDialog) {
                    i2 = R.string.OpenProfile;
                    str = "OpenProfile";
                } else {
                    i2 = R.string.OpenChannel2;
                    str = "OpenChannel2";
                }
                arrayList.add(LocaleController.getString(str, i2));
                arrayList3.add(Integer.valueOf(isUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
            } else {
                arrayList.add(LocaleController.getString("ViewMessage", R.string.ViewMessage));
                arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
            }
            arrayList2.add(0);
            builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]), AndroidUtilities.toIntArray(arrayList3), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    MessageStatisticActivity.this.lambda$createView$1(messageObject, isUserDialog, dialogId, dialogInterface, i3);
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    public void lambda$createView$1(MessageObject messageObject, boolean z, long j, DialogInterface dialogInterface, int i) {
        if (messageObject.isStory()) {
            presentFragment(z ? ProfileActivity.of(j) : ChatActivity.of(j));
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
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle));
        }
    }

    public void lambda$createView$3(View view) {
        if (this.messageObject.isStory()) {
            return;
        }
        if (getParentLayout().getFragmentStack().size() > 1) {
            BaseFragment baseFragment = getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getCurrentChat().id == this.chatId) {
                finishFragment();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("message_id", this.messageId);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        presentFragment(new ChatActivity(bundle));
    }

    private void setAvatarAndTitle() {
        if (this.messageObject.isStory()) {
            this.avatarContainer.setTitle(LocaleController.getString("StoryStatistics", R.string.StoryStatistics));
            this.avatarContainer.hideSubtitle();
            ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
            chatAvatarContainer.allowDrawStories = true;
            chatAvatarContainer.setStoriesForceState(1);
            ArrayList<TLRPC$PhotoSize> arrayList = this.messageObject.photoThumbs;
            if (arrayList != null) {
                this.avatarContainer.getAvatarImageView().setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), this.messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.messageObject.photoThumbs, 50), this.messageObject.photoThumbsObject), "b1", 0, this.messageObject);
                this.avatarContainer.setClipChildren(false);
                this.avatarContainer.getAvatarImageView().setScaleX(0.96f);
                this.avatarContainer.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.avatarContainer.setTitle(LocaleController.getString("PostStatistics", R.string.PostStatistics));
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (chat == null || this.hasThumb) {
            return;
        }
        this.avatarContainer.setChatAvatar(chat);
    }

    private void updateMenu() {
        TLRPC$ChatFull tLRPC$ChatFull;
        if (this.needActionbarMenu && (tLRPC$ChatFull = this.chat) != null && tLRPC$ChatFull.can_view_stats) {
            ActionBarMenu createMenu = this.actionBar.createMenu();
            createMenu.clearItems();
            createMenu.addItem(0, R.drawable.ic_ab_other).addSubItem(1, R.drawable.msg_stats, LocaleController.getString("ViewChannelStats", R.string.ViewChannelStats));
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
            TLRPC$TL_stats_getStoryPublicForwards tLRPC$TL_stats_getStoryPublicForwards = new TLRPC$TL_stats_getStoryPublicForwards();
            tLRPC$TL_stats_getStoryPublicForwards.limit = i;
            tLRPC$TL_stats_getStoryPublicForwards.id = this.messageObject.storyItem.id;
            tLRPC$TL_stats_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.chatId);
            String str = this.nextOffset;
            tLRPC$TL_stats_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_stats_getStoryPublicForwards, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessageStatisticActivity.this.lambda$loadChats$5(tLObject, tLRPC$TL_error);
                }
            }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
            return;
        }
        TLRPC$TL_stats_getMessagePublicForwards tLRPC$TL_stats_getMessagePublicForwards = new TLRPC$TL_stats_getMessagePublicForwards();
        tLRPC$TL_stats_getMessagePublicForwards.limit = i;
        MessageObject messageObject = this.messageObject;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
        if (tLRPC$MessageFwdHeader != null) {
            tLRPC$TL_stats_getMessagePublicForwards.msg_id = tLRPC$MessageFwdHeader.saved_from_msg_id;
            tLRPC$TL_stats_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
        } else {
            tLRPC$TL_stats_getMessagePublicForwards.msg_id = messageObject.getId();
            tLRPC$TL_stats_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
        }
        String str2 = this.nextOffset;
        tLRPC$TL_stats_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_stats_getMessagePublicForwards, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessageStatisticActivity.this.lambda$loadChats$7(tLObject, tLRPC$TL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public void lambda$loadChats$5(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadChats$4(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadChats$4(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_stats_publicForwards tLRPC$TL_stats_publicForwards = (TLRPC$TL_stats_publicForwards) tLObject;
            if ((tLRPC$TL_stats_publicForwards.flags & 1) != 0) {
                this.nextOffset = tLRPC$TL_stats_publicForwards.next_offset;
            } else {
                this.nextOffset = null;
            }
            int i = tLRPC$TL_stats_publicForwards.count;
            if (i != 0) {
                this.publicChats = i;
            } else if (this.publicChats == 0) {
                this.publicChats = tLRPC$TL_stats_publicForwards.forwards.size();
            }
            this.endReached = this.nextOffset == null;
            getMessagesController().putChats(tLRPC$TL_stats_publicForwards.chats, false);
            getMessagesController().putUsers(tLRPC$TL_stats_publicForwards.users, false);
            Iterator<TLRPC$PublicForward> it = tLRPC$TL_stats_publicForwards.forwards.iterator();
            while (it.hasNext()) {
                TLRPC$PublicForward next = it.next();
                if (next instanceof TL_stories$TL_publicForwardStory) {
                    TL_stories$TL_publicForwardStory tL_stories$TL_publicForwardStory = (TL_stories$TL_publicForwardStory) next;
                    tL_stories$TL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_stories$TL_publicForwardStory.peer);
                    TL_stories$StoryItem tL_stories$StoryItem = tL_stories$TL_publicForwardStory.story;
                    tL_stories$StoryItem.messageId = tL_stories$StoryItem.id;
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_stories$TL_publicForwardStory.story);
                    messageObject.generateThumbs(false);
                    this.messages.add(messageObject);
                } else if (next instanceof TLRPC$TL_publicForwardMessage) {
                    this.messages.add(new MessageObject(this.currentAccount, ((TLRPC$TL_publicForwardMessage) next).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        this.firstLoaded = true;
        this.loading = false;
        updateRows();
    }

    public void lambda$loadChats$7(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadChats$6(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadChats$6(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_stats_publicForwards tLRPC$TL_stats_publicForwards = (TLRPC$TL_stats_publicForwards) tLObject;
            if ((tLRPC$TL_stats_publicForwards.flags & 1) != 0) {
                this.nextOffset = tLRPC$TL_stats_publicForwards.next_offset;
            } else {
                this.nextOffset = null;
            }
            int i = tLRPC$TL_stats_publicForwards.count;
            if (i != 0) {
                this.publicChats = i;
            } else if (this.publicChats == 0) {
                this.publicChats = tLRPC$TL_stats_publicForwards.forwards.size();
            }
            this.endReached = this.nextOffset == null;
            getMessagesController().putChats(tLRPC$TL_stats_publicForwards.chats, false);
            getMessagesController().putUsers(tLRPC$TL_stats_publicForwards.users, false);
            Iterator<TLRPC$PublicForward> it = tLRPC$TL_stats_publicForwards.forwards.iterator();
            while (it.hasNext()) {
                TLRPC$PublicForward next = it.next();
                if (next instanceof TL_stories$TL_publicForwardStory) {
                    TL_stories$TL_publicForwardStory tL_stories$TL_publicForwardStory = (TL_stories$TL_publicForwardStory) next;
                    tL_stories$TL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_stories$TL_publicForwardStory.peer);
                    TL_stories$StoryItem tL_stories$StoryItem = tL_stories$TL_publicForwardStory.story;
                    tL_stories$StoryItem.messageId = tL_stories$StoryItem.id;
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_stories$TL_publicForwardStory.story);
                    messageObject.generateThumbs(false);
                    this.messages.add(messageObject);
                } else if (next instanceof TLRPC$TL_publicForwardMessage) {
                    this.messages.add(new MessageObject(this.currentAccount, ((TLRPC$TL_publicForwardMessage) next).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        this.firstLoaded = true;
        this.loading = false;
        updateRows();
    }

    private void loadStat() {
        TLRPC$TL_stats_getMessageStats tLRPC$TL_stats_getMessageStats;
        if (this.messageObject.isStory()) {
            TL_stories$TL_stats_getStoryStats tL_stories$TL_stats_getStoryStats = new TL_stories$TL_stats_getStoryStats();
            tL_stories$TL_stats_getStoryStats.id = this.messageObject.storyItem.id;
            tL_stories$TL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.chatId);
            tLRPC$TL_stats_getMessageStats = tL_stories$TL_stats_getStoryStats;
        } else {
            TLRPC$TL_stats_getMessageStats tLRPC$TL_stats_getMessageStats2 = new TLRPC$TL_stats_getMessageStats();
            MessageObject messageObject = this.messageObject;
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null) {
                tLRPC$TL_stats_getMessageStats2.msg_id = tLRPC$MessageFwdHeader.saved_from_msg_id;
                tLRPC$TL_stats_getMessageStats2.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
                tLRPC$TL_stats_getMessageStats = tLRPC$TL_stats_getMessageStats2;
            } else {
                tLRPC$TL_stats_getMessageStats2.msg_id = messageObject.getId();
                tLRPC$TL_stats_getMessageStats2.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
                tLRPC$TL_stats_getMessageStats = tLRPC$TL_stats_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_stats_getMessageStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessageStatisticActivity.this.lambda$loadStat$12(tLObject, tLRPC$TL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true);
    }

    public void lambda$loadStat$12(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadStat$11(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadStat$11(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        TLRPC$StatsGraph tLRPC$StatsGraph;
        TLRPC$StatsGraph tLRPC$StatsGraph2;
        this.statsLoaded = true;
        if (tLRPC$TL_error != null) {
            updateRows();
            return;
        }
        if (tLObject instanceof TL_stories$TL_stats_storyStats) {
            TL_stories$TL_stats_storyStats tL_stories$TL_stats_storyStats = (TL_stories$TL_stats_storyStats) tLObject;
            tLRPC$StatsGraph = tL_stories$TL_stats_storyStats.views_graph;
            tLRPC$StatsGraph2 = tL_stories$TL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TLRPC$TL_stats_messageStats tLRPC$TL_stats_messageStats = (TLRPC$TL_stats_messageStats) tLObject;
            tLRPC$StatsGraph = tLRPC$TL_stats_messageStats.views_graph;
            tLRPC$StatsGraph2 = tLRPC$TL_stats_messageStats.reactions_by_emotion_graph;
        }
        this.interactionsViewData = StatisticActivity.createViewData(tLRPC$StatsGraph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false);
        this.reactionsByEmotionData = StatisticActivity.createViewData(tLRPC$StatsGraph2, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false);
        StatisticActivity.ChartViewData chartViewData = this.interactionsViewData;
        if (chartViewData != null && chartViewData.chartData.x.length <= 5) {
            this.statsLoaded = false;
            final TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph = new TLRPC$TL_stats_loadAsyncGraph();
            StatisticActivity.ChartViewData chartViewData2 = this.interactionsViewData;
            tLRPC$TL_stats_loadAsyncGraph.token = chartViewData2.zoomToken;
            long[] jArr = chartViewData2.chartData.x;
            tLRPC$TL_stats_loadAsyncGraph.x = jArr[jArr.length - 1];
            tLRPC$TL_stats_loadAsyncGraph.flags |= 1;
            final String str = this.interactionsViewData.zoomToken + "_" + tLRPC$TL_stats_loadAsyncGraph.x;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    MessageStatisticActivity.this.lambda$loadStat$10(str, tLRPC$TL_stats_loadAsyncGraph, tLObject2, tLRPC$TL_error2);
                }
            }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
            return;
        }
        updateRows();
    }

    public void lambda$loadStat$10(final String str, final TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        ChartData chartData = null;
        if (tLObject instanceof TLRPC$TL_statsGraph) {
            try {
                chartData = StatisticActivity.createChartData(new JSONObject(((TLRPC$TL_statsGraph) tLObject).json.data), 1, false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (tLObject instanceof TLRPC$TL_statsGraphError) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageStatisticActivity.this.lambda$loadStat$8(tLObject);
                }
            });
        }
        final ChartData chartData2 = chartData;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadStat$9(tLRPC$TL_error, chartData2, str, tLRPC$TL_stats_loadAsyncGraph);
            }
        });
    }

    public void lambda$loadStat$8(TLObject tLObject) {
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), ((TLRPC$TL_statsGraphError) tLObject).error, 1).show();
        }
    }

    public void lambda$loadStat$9(TLRPC$TL_error tLRPC$TL_error, ChartData chartData, String str, TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph) {
        this.statsLoaded = true;
        if (tLRPC$TL_error != null || chartData == null) {
            updateRows();
            return;
        }
        this.childDataCache.put(str, chartData);
        StatisticActivity.ChartViewData chartViewData = this.interactionsViewData;
        chartViewData.childChartData = chartData;
        chartViewData.activeZoom = tLRPC$TL_stats_loadAsyncGraph.x;
        updateRows();
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

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
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

        public class AnonymousClass1 extends StatisticActivity.BaseChartCell {
            @Override
            void loadData(StatisticActivity.ChartViewData chartViewData) {
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
                    } else if (this.data.zoomToken == null) {
                    } else {
                        zoomCanceled();
                        final String str = this.data.zoomToken + "_" + selectedDate;
                        ChartData chartData = (ChartData) MessageStatisticActivity.this.childDataCache.get(str);
                        if (chartData != null) {
                            this.data.childChartData = chartData;
                            zoomChart(false);
                            return;
                        }
                        TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph = new TLRPC$TL_stats_loadAsyncGraph();
                        tLRPC$TL_stats_loadAsyncGraph.token = this.data.zoomToken;
                        if (selectedDate != 0) {
                            tLRPC$TL_stats_loadAsyncGraph.x = selectedDate;
                            tLRPC$TL_stats_loadAsyncGraph.flags |= 1;
                        }
                        MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                        final StatisticActivity.ZoomCancelable zoomCancelable = new StatisticActivity.ZoomCancelable();
                        messageStatisticActivity.lastCancelable = zoomCancelable;
                        zoomCancelable.adapterPosition = MessageStatisticActivity.this.listView.getChildAdapterPosition(this);
                        this.chartView.legendSignatureView.showProgress(true, false);
                        ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessageStatisticActivity.ListAdapter.AnonymousClass1.this.lambda$onZoomed$1(str, zoomCancelable, tLObject, tLRPC$TL_error);
                            }
                        }, null, null, 0, MessageStatisticActivity.this.chat.stats_dc, 1, true), ((BaseFragment) MessageStatisticActivity.this).classGuid);
                    }
                }
            }

            public void lambda$onZoomed$1(final String str, final StatisticActivity.ZoomCancelable zoomCancelable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                final ChartData chartData = null;
                if (tLObject instanceof TLRPC$TL_statsGraph) {
                    try {
                        chartData = StatisticActivity.createChartData(new JSONObject(((TLRPC$TL_statsGraph) tLObject).json.data), this.data.graphType, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TLRPC$TL_statsGraphError) {
                    Toast.makeText(getContext(), ((TLRPC$TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessageStatisticActivity.ListAdapter.AnonymousClass1.this.lambda$onZoomed$0(chartData, str, zoomCancelable);
                    }
                });
            }

            public void lambda$onZoomed$0(ChartData chartData, String str, StatisticActivity.ZoomCancelable zoomCancelable) {
                if (chartData != null) {
                    MessageStatisticActivity.this.childDataCache.put(str, chartData);
                }
                if (chartData != null && !zoomCancelable.canceled && zoomCancelable.adapterPosition >= 0) {
                    View findViewByPosition = MessageStatisticActivity.this.layoutManager.findViewByPosition(zoomCancelable.adapterPosition);
                    if (findViewByPosition instanceof StatisticActivity.BaseChartCell) {
                        this.data.childChartData = chartData;
                        StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) findViewByPosition;
                        baseChartCell.chartView.legendSignatureView.showProgress(false, false);
                        baseChartCell.zoomChart(false);
                    }
                }
                zoomCanceled();
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
            HeaderCell headerCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, MessageStatisticActivity.this.getResourceProvider());
                manageChatUserCell.setDividerColor(Theme.key_divider);
                manageChatUserCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MessageStatisticActivity.this.getResourceProvider()));
                headerCell = manageChatUserCell;
            } else if (i == 1) {
                headerCell = new ShadowSectionCell(this.mContext, MessageStatisticActivity.this.getResourceProvider());
            } else if (i == 2) {
                HeaderCell headerCell2 = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlackText, 16, 11, false, MessageStatisticActivity.this.getResourceProvider());
                headerCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MessageStatisticActivity.this.getResourceProvider()));
                headerCell2.setHeight(43);
                headerCell = headerCell2;
            } else {
                if (i != 4) {
                    if (i == 5) {
                        View overviewCell = new OverviewCell(this.mContext);
                        overviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                        overviewCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MessageStatisticActivity.this.getResourceProvider()));
                        headerCell = overviewCell;
                    } else if (i == 6) {
                        View emptyCell = new EmptyCell(this.mContext, 16);
                        emptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, 16));
                        emptyCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MessageStatisticActivity.this.getResourceProvider()));
                        headerCell = emptyCell;
                    } else if (i != 7) {
                        headerCell = new LoadingCell(this.mContext, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                    }
                }
                Context context = this.mContext;
                int i2 = i == 4 ? 1 : 2;
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                View anonymousClass1 = new AnonymousClass1(context, i2, messageStatisticActivity.sharedUi = new BaseChartView.SharedUiComponents(messageStatisticActivity.getResourceProvider()), MessageStatisticActivity.this.getResourceProvider());
                anonymousClass1.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, MessageStatisticActivity.this.getResourceProvider()));
                headerCell = anonymousClass1;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MessageStatisticActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$0(MessageObject messageObject, View view) {
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
                    this.primary[i3].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
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
            int i;
            int i2;
            int i3;
            if (MessageStatisticActivity.this.recentPostInfo != null) {
                i = MessageStatisticActivity.this.recentPostInfo.getViews();
                i2 = MessageStatisticActivity.this.recentPostInfo.getForwards();
                i3 = MessageStatisticActivity.this.recentPostInfo.getReactions();
            } else {
                i = MessageStatisticActivity.this.messageObject.isStory() ? MessageStatisticActivity.this.messageObject.storyItem.views.views_count : MessageStatisticActivity.this.messageObject.messageOwner.views;
                i2 = MessageStatisticActivity.this.messageObject.isStory() ? MessageStatisticActivity.this.messageObject.storyItem.views.forwards_count : MessageStatisticActivity.this.messageObject.messageOwner.forwards;
                if (MessageStatisticActivity.this.messageObject.isStory()) {
                    i3 = MessageStatisticActivity.this.messageObject.storyItem.views.reactions_count;
                } else if (MessageStatisticActivity.this.messageObject.messageOwner.reactions != null) {
                    i3 = 0;
                    for (int i4 = 0; i4 < MessageStatisticActivity.this.messageObject.messageOwner.reactions.results.size(); i4++) {
                        i3 += MessageStatisticActivity.this.messageObject.messageOwner.reactions.results.get(i4).count;
                    }
                } else {
                    i3 = 0;
                }
            }
            this.primary[0].setText(AndroidUtilities.formatWholeNumber(i, 0));
            this.title[0].setText(LocaleController.getString("StatisticViews", R.string.StatisticViews));
            boolean z = true;
            this.primary[1].setText(AndroidUtilities.formatWholeNumber(MessageStatisticActivity.this.publicChats, 0));
            this.title[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            this.primary[2].setText(AndroidUtilities.formatWholeNumber(i3, 0));
            this.title[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            if ((MessageStatisticActivity.this.chat != null && (MessageStatisticActivity.this.chat.available_reactions instanceof TLRPC$TL_chatReactionsNone) && i3 == 0) ? false : false) {
                ((ViewGroup) this.title[2].getParent()).setVisibility(8);
            }
            this.primary[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i2 - MessageStatisticActivity.this.publicChats), 0));
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
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                MessageStatisticActivity.this.lambda$getThemeDescriptions$13();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, ManageChatUserCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
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

    public void lambda$getThemeDescriptions$13() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                recolorRecyclerItem(this.listView.getChildAt(i));
            }
            int hiddenChildCount = this.listView.getHiddenChildCount();
            for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                recolorRecyclerItem(this.listView.getHiddenChildAt(i2));
            }
            int cachedChildCount = this.listView.getCachedChildCount();
            for (int i3 = 0; i3 < cachedChildCount; i3++) {
                recolorRecyclerItem(this.listView.getCachedChildAt(i3));
            }
            int attachedScrapChildCount = this.listView.getAttachedScrapChildCount();
            for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
                recolorRecyclerItem(this.listView.getAttachedScrapChildAt(i4));
            }
            this.listView.getRecycledViewPool().clear();
        }
        BaseChartView.SharedUiComponents sharedUiComponents = this.sharedUi;
        if (sharedUiComponents != null) {
            sharedUiComponents.invalidate();
        }
        this.avatarContainer.getSubtitleTextView().setLinkTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, getResourceProvider()));
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
