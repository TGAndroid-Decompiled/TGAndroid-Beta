package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArraySet;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import java.util.ArrayList;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;

public class MessageStatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass4 avatarContainer;
    public TLRPC.ChatFull chat;
    public final long chatId;
    public final LruCache childDataCache;
    public boolean drawPlay;
    public int emptyRow;
    public EmptyTextProgressView emptyView;
    public boolean endReached;
    public int endRow;
    public boolean firstLoaded;
    public boolean hasThumb;
    public int headerRow;
    public RLottieImageView imageView;
    public int interactionsChartRow;
    public StatisticActivity.ChartViewData interactionsViewData;
    public StatisticActivity.ZoomCancelable lastCancelable;
    public LinearLayoutManager layoutManager;
    public FrameLayout listContainer;
    public RecyclerListView listView;
    public ListAdapter listViewAdapter;
    public boolean loading;
    public int loadingRow;
    public final int messageId;
    public final MessageObject messageObject;
    public final ArrayList messages;
    public final boolean needActionbarMenu;
    public String nextOffset;
    public int overviewHeaderRow;
    public int overviewRow;
    public LinearLayout progressLayout;
    public int publicChats;
    public int reactionsByEmotionChartRow;
    public StatisticActivity.ChartViewData reactionsByEmotionData;
    public StatisticActivity.RecentPostInfo recentPostInfo;
    public int rowCount;
    public final ArraySet shadowDivideCells;
    public BaseChartView.SharedUiComponents sharedUi;
    public final LaunchActivity.AnonymousClass18 showProgressbar;
    public int startRow;
    public boolean statsLoaded;
    public ImageReceiver thumbImage;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public final class AnonymousClass1 extends StatisticActivity.BaseChartCell {
            public AnonymousClass1(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents, Theme.ResourcesProvider resourcesProvider) {
                super(context, i, sharedUiComponents, resourcesProvider);
            }

            @Override
            public final void loadData(StatisticActivity.ChartViewData chartViewData) {
            }

            @Override
            public final void onZoomed() {
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
                    String str = this.data.zoomToken + "_" + selectedDate;
                    MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                    ChartData chartData = (ChartData) messageStatisticActivity.childDataCache.get(str);
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
                    StatisticActivity.ZoomCancelable zoomCancelable = new StatisticActivity.ZoomCancelable();
                    messageStatisticActivity.lastCancelable = zoomCancelable;
                    messageStatisticActivity.listView.getClass();
                    zoomCancelable.adapterPosition = RecyclerView.getChildAdapterPosition(this);
                    baseChartView.legendSignatureView.showProgress(true, false);
                    ConnectionsManager.getInstance(((BaseFragment) messageStatisticActivity).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) messageStatisticActivity).currentAccount).sendRequest(tL_loadAsyncGraph, new LinkManager$$ExternalSyntheticLambda0((Object) this, str, (Object) zoomCancelable, 14), null, null, 0, messageStatisticActivity.chat.stats_dc, 1, true), ((BaseFragment) messageStatisticActivity).classGuid);
                }
            }

            @Override
            public final void zoomCanceled() {
                ListAdapter listAdapter = ListAdapter.this;
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                StatisticActivity.ZoomCancelable zoomCancelable = messageStatisticActivity.lastCancelable;
                if (zoomCancelable != null) {
                    zoomCancelable.canceled = true;
                }
                int childCount = messageStatisticActivity.listView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = MessageStatisticActivity.this.listView.getChildAt(i);
                    if (childAt instanceof StatisticActivity.BaseChartCell) {
                        ((StatisticActivity.BaseChartCell) childAt).chartView.legendSignatureView.showProgress(false, true);
                    }
                }
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return MessageStatisticActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
            if (messageStatisticActivity.shadowDivideCells.contains(Integer.valueOf(i))) {
                return 1;
            }
            if (i == messageStatisticActivity.headerRow || i == messageStatisticActivity.overviewHeaderRow) {
                return 2;
            }
            if (i == messageStatisticActivity.loadingRow) {
                return 3;
            }
            if (i == messageStatisticActivity.interactionsChartRow) {
                return 4;
            }
            if (i == messageStatisticActivity.overviewRow) {
                return 5;
            }
            if (i == messageStatisticActivity.emptyRow) {
                return 6;
            }
            return i == messageStatisticActivity.reactionsByEmotionChartRow ? 7 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 0) {
                return ((ManageChatUserCell) viewHolder.itemView).getCurrentObject() instanceof TLObject;
            }
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            String pluralString;
            TLRPC.User user;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = viewHolder.mItemViewType;
            MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
            View view = viewHolder.itemView;
            if (i6 == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                int i7 = messageStatisticActivity.startRow;
                MessageObject messageObject = (i < i7 || i >= messageStatisticActivity.endRow) ? null : (MessageObject) messageStatisticActivity.messages.get(i - i7);
                long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                if (messageObject.isStory()) {
                    TLObject user2 = DialogObject.isUserDialog(dialogId) ? messageStatisticActivity.getMessagesController().getUser(Long.valueOf(dialogId)) : messageStatisticActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                    TL_stories.StoryViews storyViews = messageObject.storyItem.views;
                    manageChatUserCell.setData(user2, null, (storyViews == null || (i2 = storyViews.views_count) == 0) ? LocaleController.getString(R.string.NoViews) : LocaleController.formatPluralString("Views", i2, new Object[0]), i != messageStatisticActivity.endRow - 1);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    IntroActivity$$ExternalSyntheticLambda1 introActivity$$ExternalSyntheticLambda1 = new IntroActivity$$ExternalSyntheticLambda1(28, this, messageObject);
                    manageChatUserCell.storyItem = storyItem;
                    manageChatUserCell.avatarImageView.setOnClickListener(introActivity$$ExternalSyntheticLambda1);
                    return;
                }
                manageChatUserCell.storyItem = null;
                manageChatUserCell.avatarImageView.setOnClickListener(null);
                if (DialogObject.isUserDialog(dialogId)) {
                    user = messageStatisticActivity.getMessagesController().getUser(Long.valueOf(dialogId));
                    str = null;
                } else {
                    TLRPC.Chat chat = messageStatisticActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i8 = chat.participants_count;
                        if (i8 != 0) {
                            pluralString = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i8, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                        } else {
                            str = null;
                        }
                        user = chat;
                    } else {
                        pluralString = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
                    }
                    str = pluralString;
                    user = chat;
                }
                if (user != null) {
                    manageChatUserCell.setData(user, null, str, i != messageStatisticActivity.endRow - 1);
                    return;
                }
                return;
            }
            if (i6 == 1) {
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                return;
            }
            if (i6 == 2) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == messageStatisticActivity.overviewHeaderRow) {
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
            if (i6 == 4) {
                StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) view;
                baseChartCell.updateData(messageStatisticActivity.interactionsViewData, false);
                baseChartCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return;
            }
            if (i6 != 5) {
                if (i6 != 7) {
                    return;
                }
                StatisticActivity.BaseChartCell baseChartCell2 = (StatisticActivity.BaseChartCell) view;
                baseChartCell2.updateData(messageStatisticActivity.reactionsByEmotionData, false);
                baseChartCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return;
            }
            OverviewCell overviewCell = (OverviewCell) view;
            MessageStatisticActivity messageStatisticActivity2 = MessageStatisticActivity.this;
            StatisticActivity.RecentPostInfo recentPostInfo = messageStatisticActivity2.recentPostInfo;
            if (recentPostInfo != null) {
                TL_stats.PostInteractionCounters postInteractionCounters = recentPostInfo.counters;
                boolean z = postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage;
                i3 = z ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views : postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views : 0;
                i4 = z ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).forwards : postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).forwards : 0;
                if (z) {
                    i5 = ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).reactions;
                } else if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                    i5 = ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).reactions;
                } else {
                    i5 = 0;
                }
            } else {
                boolean zIsStory = messageStatisticActivity2.messageObject.isStory();
                MessageObject messageObject2 = messageStatisticActivity2.messageObject;
                i3 = zIsStory ? messageObject2.storyItem.views.views_count : messageObject2.messageOwner.views;
                i4 = messageObject2.isStory() ? messageObject2.storyItem.views.forwards_count : messageObject2.messageOwner.forwards;
                if (messageObject2.isStory()) {
                    i5 = messageObject2.storyItem.views.reactions_count;
                } else if (messageObject2.messageOwner.reactions != null) {
                    i5 = 0;
                    for (int i9 = 0; i9 < messageObject2.messageOwner.reactions.results.size(); i9++) {
                        i5 += messageObject2.messageOwner.reactions.results.get(i9).count;
                    }
                } else {
                    i5 = 0;
                }
            }
            TextView[] textViewArr = overviewCell.primary;
            textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i3, 0));
            TextView[] textViewArr2 = overviewCell.title;
            textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
            textViewArr[1].setText(AndroidUtilities.formatWholeNumber(messageStatisticActivity2.publicChats, 0));
            textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
            textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i5, 0));
            textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
            TLRPC.ChatFull chatFull = messageStatisticActivity2.chat;
            if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i5 == 0) {
                ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
            }
            textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i4 - messageStatisticActivity2.publicChats), 0));
            textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
            for (int i10 = 0; i10 < 4; i10++) {
                textViewArr[i10].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, messageStatisticActivity2.getResourceProvider()));
                textViewArr2[i10].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, messageStatisticActivity2.getResourceProvider()));
            }
        }

        @Override
        public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public final class OverviewCell extends LinearLayout {
        public static final int $r8$clinit = 0;
        public final TextView[] primary;
        public final TextView[] title;

        public OverviewCell(Context context) {
            super(context);
            this.primary = new TextView[4];
            this.title = new TextView[4];
            setOrientation(1);
            setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            int i = 0;
            while (i < 2) {
                LinearLayout linearLayoutM = zzkf.m(context, 0);
                for (int i2 = 0; i2 < 2; i2++) {
                    LinearLayout linearLayoutM2 = zzkf.m(context, 1);
                    LinearLayout linearLayoutM3 = zzkf.m(context, 0);
                    int i3 = (i * 2) + i2;
                    this.primary[i3] = new TextView(context);
                    this.title[i3] = new TextView(context);
                    this.primary[i3].setTypeface(AndroidUtilities.bold());
                    this.primary[i3].setTextSize(1, 17.0f);
                    this.title[i3].setTextSize(1, 13.0f);
                    this.title[i3].setGravity(3);
                    linearLayoutM3.addView(this.primary[i3]);
                    linearLayoutM2.addView(linearLayoutM3);
                    linearLayoutM2.addView(this.title[i3]);
                    linearLayoutM.addView(linearLayoutM2, LayoutHelper.createLinear(1.0f, -1, -2));
                }
                addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i == 0 ? 16.0f : 0.0f));
                i++;
            }
        }
    }

    public MessageStatisticActivity(MessageObject messageObject) {
        super(null);
        this.childDataCache = new LruCache(15);
        this.messages = new ArrayList();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet(0);
        this.showProgressbar = new LaunchActivity.AnonymousClass18(this, 15);
        this.messageObject = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.chatId = messageObject.getChatId();
            this.messageId = messageObject.getId();
        } else {
            this.chatId = -messageObject.getFromChatId();
            this.messageId = messageObject.messageOwner.fwd_msg_id;
        }
        this.chat = getMessagesController().getChatFull(this.chatId);
    }

    @Override
    public final View createView(Context context) {
        int i;
        TLRPC.ChatFull chatFull;
        CharSequence charSequenceReplaceEmoji;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(true);
        this.imageView.setAnimation(R.raw.statistic_preload, 120, 120, null);
        this.imageView.playAnimation();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i2, getResourceProvider()));
        textView.setTag(Integer.valueOf(i2));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i3, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i3));
        zzkg.m(R.string.LoadingStatsDescription, textView2, 1);
        this.progressLayout.addView(this.imageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        this.progressLayout.setAlpha(0.0f);
        frameLayout2.addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, getResourceProvider());
        this.listView = recyclerListView;
        recyclerListView.setSections();
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        ((SimpleItemAnimator) this.listView.getItemAnimator()).mSupportsChangeAnimations = false;
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 21));
        this.listView.setOnItemLongClickListener(new PhotoViewer$$ExternalSyntheticLambda115(this, 10));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 28));
        this.emptyView.showTextView();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.listContainer = frameLayout3;
        frameLayout3.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listContainer.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        this.listContainer.setVisibility(8);
        frameLayout2.addView(this.listContainer, LayoutHelper.createFrame(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.showProgressbar, 300L);
        updateRows$9();
        this.listView.setEmptyView(this.emptyView);
        this.avatarContainer = new ChatAvatarContainer(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                messageStatisticActivity.thumbImage.setImageCoords(messageStatisticActivity.avatarContainer.getAvatarImageView().getX(), messageStatisticActivity.avatarContainer.getAvatarImageView().getY(), messageStatisticActivity.avatarContainer.getAvatarImageView().getWidth(), messageStatisticActivity.avatarContainer.getAvatarImageView().getHeight());
                if (messageStatisticActivity.hasThumb) {
                    canvas.save();
                    canvas.scale(0.9f, 0.9f, messageStatisticActivity.thumbImage.getCenterX(), messageStatisticActivity.thumbImage.getCenterY());
                    messageStatisticActivity.thumbImage.draw(canvas);
                    canvas.restore();
                }
                if (messageStatisticActivity.drawPlay) {
                    int centerX = (int) (messageStatisticActivity.thumbImage.getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2));
                    int centerY = (int) (messageStatisticActivity.thumbImage.getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2));
                    Drawable drawable = Theme.dialogs_playDrawable;
                    drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, Theme.dialogs_playDrawable.getIntrinsicHeight() + centerY);
                    Theme.dialogs_playDrawable.draw(canvas);
                }
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageStatisticActivity.this.thumbImage.onAttachedToWindow();
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                MessageStatisticActivity.this.thumbImage.onDetachedFromWindow();
            }
        };
        ImageReceiver imageReceiver = new ImageReceiver();
        this.thumbImage = imageReceiver;
        imageReceiver.setParentView(this.avatarContainer);
        this.thumbImage.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.hasThumb = false;
        MessageObject messageObject = this.messageObject;
        if (!messageObject.isStory()) {
            if (!messageObject.needDrawBluredPreview() && (messageObject.isPhoto() || messageObject.isNewGif() || messageObject.isVideo())) {
                String str = messageObject.isWebpage() ? messageObject.messageOwner.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                    if (closestPhotoSizeWithSize != null) {
                        this.hasThumb = true;
                        this.drawPlay = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) || FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.thumbImage.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size, null, this.messageObject, 0);
                        } else {
                            this.thumbImage.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.messageObject, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequenceReplaceEmoji = messageObject.caption;
            } else if (TextUtils.isEmpty(messageObject.messageOwner.message)) {
                charSequenceReplaceEmoji = messageObject.messageText;
            } else {
                CharSequence charSequenceSubSequence = messageObject.messageText;
                if (charSequenceSubSequence.length() > 150) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, 150);
                }
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceSubSequence, getSubtitlePaint().getFontMetricsInt(), false);
            }
            if (messageObject.isVideo() || messageObject.isPhoto()) {
                AnonymousClass4 anonymousClass4 = this.avatarContainer;
                if (anonymousClass4.getSubtitleTextView() != null) {
                    anonymousClass4.getSubtitleTextView().setVisibility(8);
                }
            } else {
                setSubtitle(charSequenceReplaceEmoji);
            }
        }
        if (this.hasThumb || messageObject.isStory()) {
            setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i = 50;
        } else {
            i = 56;
        }
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? i : 0.0f, 0.0f, 40.0f, 0.0f));
        setAvatarAndTitle();
        AnonymousClass4 anonymousClass5 = this.avatarContainer;
        int color = Theme.getColor(i2, getResourceProvider());
        int color2 = Theme.getColor(i3, getResourceProvider());
        anonymousClass5.titleTextView.setTextColor(color);
        ChatAvatarContainer.SimpleTextConnectedView simpleTextConnectedView = anonymousClass5.subtitleTextView;
        simpleTextConnectedView.setTextColor(color2);
        simpleTextConnectedView.setTag(Integer.valueOf(color2));
        View subtitleTextView = getSubtitleTextView();
        if (subtitleTextView instanceof SimpleTextView) {
            ((SimpleTextView) subtitleTextView).setLinkTextColor(Theme.getColor(i3, getResourceProvider()));
        }
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, getResourceProvider()), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector, getResourceProvider()), false);
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 3));
        setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 10));
        if (this.needActionbarMenu && (chatFull = this.chat) != null && chatFull.can_view_stats) {
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            ArrayList arrayList = actionBarMenuCreateMenu.ids;
            if (arrayList != null) {
                arrayList.clear();
            }
            actionBarMenuCreateMenu.removeAllViews();
            actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other).addSubItem(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            if (this.chat == null && chatFull2.id == this.chatId) {
                setAvatarAndTitle();
                this.chat = chatFull2;
                loadStat();
                loadChats$1();
                if (this.needActionbarMenu && (chatFull = this.chat) != null && chatFull.can_view_stats) {
                    ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
                    ArrayList arrayList = actionBarMenuCreateMenu.ids;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    actionBarMenuCreateMenu.removeAllViews();
                    actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other).addSubItem(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(8, this);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, ManageChatUserCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        AnonymousClass4 anonymousClass4 = this.avatarContainer;
        arrayList.add(new ThemeDescription(anonymousClass4 != null ? anonymousClass4.getTitleTextView() : null, 4, null, null, null, null, Theme.key_player_actionBarTitle));
        AnonymousClass4 anonymousClass5 = this.avatarContainer;
        arrayList.add(new ThemeDescription(anonymousClass5 != null ? anonymousClass5.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, Theme.key_player_actionBarSubtitle));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartLineEmpty));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        StatisticActivity.putColorFromData(this.interactionsViewData, arrayList, qrActivity$$ExternalSyntheticLambda9);
        StatisticActivity.putColorFromData(this.reactionsByEmotionData, arrayList, qrActivity$$ExternalSyntheticLambda9);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider())) > 0.699999988079071d;
    }

    public final void lambda$loadChats$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.nextOffset = tL_publicForwards.next_offset;
            } else {
                this.nextOffset = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.publicChats = i;
            } else if (this.publicChats == 0) {
                this.publicChats = tL_publicForwards.forwards.size();
            }
            this.endReached = this.nextOffset == null;
            getMessagesController().putChats(tL_publicForwards.chats, false);
            getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.messages;
                if (z) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(this.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList2.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new MessageObject(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        this.firstLoaded = true;
        this.loading = false;
        updateRows$9();
    }

    public final void lambda$loadChats$6(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.nextOffset = tL_publicForwards.next_offset;
            } else {
                this.nextOffset = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.publicChats = i;
            } else if (this.publicChats == 0) {
                this.publicChats = tL_publicForwards.forwards.size();
            }
            this.endReached = this.nextOffset == null;
            getMessagesController().putChats(tL_publicForwards.chats, false);
            getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.messages;
                if (z) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(this.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList2.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new MessageObject(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        this.firstLoaded = true;
        this.loading = false;
        updateRows$9();
    }

    public final void lambda$loadStat$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        this.statsLoaded = true;
        if (tL_error != null) {
            updateRows$9();
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
        this.interactionsViewData = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        this.reactionsByEmotionData = StatisticActivity.createViewData(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        StatisticActivity.ChartViewData chartViewData = this.interactionsViewData;
        if (chartViewData == null || chartViewData.chartData.x.length > 5) {
            updateRows$9();
            return;
        }
        this.statsLoaded = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        StatisticActivity.ChartViewData chartViewData2 = this.interactionsViewData;
        tL_loadAsyncGraph.token = chartViewData2.zoomToken;
        long[] jArr = chartViewData2.chartData.x;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_loadAsyncGraph, new LinkManager$$ExternalSyntheticLambda0((Object) this, this.interactionsViewData.zoomToken + "_" + tL_loadAsyncGraph.x, (Object) tL_loadAsyncGraph, 13), null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public final void loadChats$1() {
        if (this.loading) {
            return;
        }
        this.loading = true;
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = messageObject.storyItem.id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.chatId);
            String str = this.nextOffset;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new MessageStatisticActivity$$ExternalSyntheticLambda4(this, 1), null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
        } else {
            tL_getMessagePublicForwards.msg_id = messageObject.getId();
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
        }
        String str2 = this.nextOffset;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new MessageStatisticActivity$$ExternalSyntheticLambda4(this, 2), null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public final void loadStat() {
        TLObject tLObject;
        MessageObject messageObject = this.messageObject;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = messageObject.storyItem.id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.chatId);
            tLObject = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
                tLObject = tL_getMessageStats;
            } else {
                tL_getMessageStats.msg_id = messageObject.getId();
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
                tLObject = tL_getMessageStats;
            }
        }
        getConnectionsManager().sendRequest(tLObject, new MessageStatisticActivity$$ExternalSyntheticLambda4(this, 0), null, null, 0, this.chat.stats_dc, 1, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.chat != null) {
            loadStat();
            loadChats$1();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.chatId, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void recolorRecyclerItem(View view) {
        if (view instanceof ManageChatUserCell) {
            ((ManageChatUserCell) view).update(0);
        } else if (view instanceof StatisticActivity.BaseChartCell) {
            ((StatisticActivity.BaseChartCell) view).recolor();
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        } else if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider())), Theme.getThemedDrawableByKey(ApplicationLoader.applicationContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow), 0, 0);
            combinedDrawable.fullSize = true;
            view.setBackground(combinedDrawable);
        } else if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            OverviewCell overviewCell = (OverviewCell) view;
            int i = OverviewCell.$r8$clinit;
            for (int i2 = 0; i2 < 4; i2++) {
                overviewCell.primary[i2].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, MessageStatisticActivity.this.getResourceProvider()));
                overviewCell.title[i2].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, MessageStatisticActivity.this.getResourceProvider()));
            }
            overviewCell.getClass();
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        }
        if (view instanceof EmptyCell) {
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, getResourceProvider()));
        }
    }

    public final void setAvatarAndTitle() {
        MessageObject messageObject = this.messageObject;
        if (!messageObject.isStory()) {
            setTitle(LocaleController.getString(R.string.PostStatistics));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            if (chat == null || this.hasThumb) {
                return;
            }
            setChatAvatar(chat);
            return;
        }
        setTitle(LocaleController.getString(R.string.StoryStatistics));
        AnonymousClass4 anonymousClass4 = this.avatarContainer;
        if (anonymousClass4.getSubtitleTextView() != null) {
            anonymousClass4.getSubtitleTextView().setVisibility(8);
        }
        AnonymousClass4 anonymousClass5 = this.avatarContainer;
        anonymousClass5.allowDrawStories = true;
        anonymousClass5.setStoriesForceState(1);
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            getAvatarImageView().setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", null, null, 0, this.messageObject);
            setClipChildren(false);
            getAvatarImageView().setScaleX(0.96f);
            getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void updateRows$9() {
        ArraySet arraySet = this.shadowDivideCells;
        arraySet.clear();
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
                this.progressLayout.animate().alpha(0.0f).setListener(new PhotoViewer$41$1(this, 19));
                this.listContainer.setVisibility(0);
                this.listContainer.setAlpha(0.0f);
                this.listContainer.animate().alpha(1.0f).start();
            }
            int i = this.rowCount;
            this.overviewHeaderRow = i;
            this.overviewRow = i + 1;
            this.rowCount = i + 3;
            arraySet.add(Integer.valueOf(i + 2));
            if (this.interactionsViewData != null) {
                int i2 = this.rowCount;
                this.interactionsChartRow = i2;
                this.rowCount = i2 + 2;
                arraySet.add(Integer.valueOf(i2 + 1));
            }
            if (this.reactionsByEmotionData != null) {
                int i3 = this.rowCount;
                this.reactionsByEmotionChartRow = i3;
                this.rowCount = i3 + 2;
                arraySet.add(Integer.valueOf(i3 + 1));
            }
            ArrayList arrayList = this.messages;
            if (!arrayList.isEmpty()) {
                int i4 = this.rowCount;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.headerRow = i4;
                this.startRow = i5;
                int size = arrayList.size() + i5;
                this.endRow = size;
                this.emptyRow = size;
                this.rowCount = size + 2;
                arraySet.add(Integer.valueOf(size + 1));
                if (!this.endReached) {
                    int i6 = this.rowCount;
                    this.rowCount = i6 + 1;
                    this.loadingRow = i6;
                }
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public MessageStatisticActivity(MessageObject messageObject, boolean z, long j) {
        super(null);
        this.childDataCache = new LruCache(15);
        this.messages = new ArrayList();
        this.nextOffset = null;
        this.shadowDivideCells = new ArraySet(0);
        this.showProgressbar = new LaunchActivity.AnonymousClass18(this, 15);
        this.messageObject = messageObject;
        this.messageId = 0;
        this.chatId = j;
        this.chat = getMessagesController().getChatFull(j);
        this.needActionbarMenu = z;
    }
}
