package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArraySet;
import androidx.core.graphics.ColorUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.ToLongFunction;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StatisticPostInfoCell;
import org.telegram.ui.Charts.BarChartView;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.Charts.DoubleLinearChartView;
import org.telegram.ui.Charts.LinearBarChartView;
import org.telegram.ui.Charts.LinearChartView;
import org.telegram.ui.Charts.PieChartView;
import org.telegram.ui.Charts.StackBarChartView;
import org.telegram.ui.Charts.StackLinearChartView;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.DoubleLinearChartData;
import org.telegram.ui.Charts.data.StackBarChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.FlatCheckBox;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public class StatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private ChartViewData actionsData;
    private Adapter adapter;
    private RecyclerView.ItemAnimator animator;
    ChatAvatarContainer avatarContainer;
    private ChannelBoostLayout boostLayout;
    private TLRPC.ChatFull chat;
    private final long chatId;
    private final LruCache childDataCache;
    private DiffUtilsCallback diffUtilsCallback;
    private ChartViewData followersData;
    private ChartViewData groupMembersData;
    private ChartViewData growthData;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private RLottieImageView imageView;
    private boolean initialLoading;
    private ChartViewData interactionsData;
    private final boolean isMegagroup;
    private ChartViewData ivInteractionsData;
    private ChartViewData languagesData;
    private ZoomCancelable lastCancelable;
    private LinearLayoutManager layoutManager;
    private IBlur3Capture listBlur3Capture;
    private int loadFromId;
    private long maxDateOverview;
    private ChartViewData membersLanguageData;
    private ChartViewData messagesData;
    private boolean messagesIsLoading;
    private long minDateOverview;
    private ChannelMonetizationLayout monetizationLayout;
    private ChartViewData newFollowersBySourceData;
    private ChartViewData newMembersBySourceData;
    private ChartViewData notificationsData;
    private final boolean onlyBoostsStat;
    private OverviewChannelData overviewChannelData;
    private OverviewChatData overviewChatData;
    private final AlertDialog[] progressDialog;
    private LinearLayout progressLayout;
    private ChartViewData reactionsByEmotionData;
    private final ArrayList recentAllSortedDataLoaded;
    private final SparseIntArray recentPostIdtoIndexMap;
    private final ArrayList recentPostsAll;
    private final ArrayList recentPostsLoaded;
    private final ArrayList recentStoriesAll;
    private final SparseIntArray recentStoriesIdtoIndexMap;
    private final ArrayList recentStoriesLoaded;
    private RecyclerListView recyclerListView;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private BaseChartView.SharedUiComponents sharedUi;
    private final Runnable showProgressbar;
    private boolean showTabs;
    private final boolean startFromBoosts;
    private final boolean startFromMonetization;
    private StoriesController.StoriesList storiesList;
    private int storiesListId;
    private ChartViewData storyInteractionsData;
    private ChartViewData storyReactionsByEmotionData;
    private GlassTabView[] tabs;
    private MainTabsLayout tabsView;
    private final ArrayList topAdmins;
    private ChartViewData topDayOfWeeksData;
    private ChartViewData topHoursData;
    private final ArrayList topInviters;
    private final ArrayList topMembersAll;
    private final ArrayList topMembersVisible;
    private ViewPagerFixed viewPagerFixed;
    private ChartViewData viewsBySourceData;

    public static class ZoomCancelable {
        int adapterPosition;
        boolean canceled;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public static BaseFragment create(TLRPC.Chat chat) {
        return create(chat, true);
    }

    public static BaseFragment create(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull == null || (!chatFull.can_view_stats && !chatFull.can_view_stars_revenue)) {
            return new BoostsActivity(-chat.id);
        }
        return new StatisticActivity(bundle);
    }

    public StatisticActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        this.topMembersAll = new ArrayList();
        this.topMembersVisible = new ArrayList();
        this.topInviters = new ArrayList();
        this.topAdmins = new ArrayList();
        this.childDataCache = new LruCache(50);
        this.progressDialog = new AlertDialog[1];
        this.loadFromId = -1;
        this.recentPostIdtoIndexMap = new SparseIntArray();
        this.recentStoriesIdtoIndexMap = new SparseIntArray();
        this.recentPostsAll = new ArrayList();
        this.recentPostsLoaded = new ArrayList();
        this.recentStoriesAll = new ArrayList();
        this.recentStoriesLoaded = new ArrayList();
        this.recentAllSortedDataLoaded = new ArrayList();
        this.initialLoading = true;
        this.showProgressbar = new Runnable() {
            @Override
            public void run() {
                StatisticActivity.this.progressLayout.animate().alpha(1.0f).setDuration(230L);
            }
        };
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j = bundle.getLong("chat_id");
        this.chatId = j;
        this.isMegagroup = bundle.getBoolean("is_megagroup", false);
        this.startFromBoosts = bundle.getBoolean("start_from_boosts", false);
        this.startFromMonetization = bundle.getBoolean("start_from_monetization", false);
        this.onlyBoostsStat = bundle.getBoolean("only_boosts", false);
        this.chat = getMessagesController().getChatFull(j);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            return;
        }
        this.scrollableViewNoiseSuppressor = null;
        this.iBlur3SourceGlassFrosted = null;
        this.iBlur3SourceGlass = null;
        this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        StoriesController.StoriesList storiesList = getMessagesController().getStoriesController().getStoriesList(-this.chatId, 2);
        this.storiesList = storiesList;
        if (storiesList != null) {
            this.storiesListId = storiesList.link();
        }
        if (this.chat != null) {
            loadStatistic();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.chatId, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    private void sortAllLoadedData() {
        this.recentAllSortedDataLoaded.clear();
        this.recentAllSortedDataLoaded.addAll(this.recentPostsLoaded);
        this.recentAllSortedDataLoaded.addAll(this.recentStoriesLoaded);
        Collections.sort(this.recentAllSortedDataLoaded, Collections.reverseOrder(Comparator$CC.comparingLong(new ToLongFunction() {
            @Override
            public final long applyAsLong(Object obj) {
                return ((StatisticActivity.RecentPostInfo) obj).getDate();
            }
        })));
    }

    private void loadStatistic() {
        TLObject tLObject;
        if (this.onlyBoostsStat) {
            return;
        }
        if (this.isMegagroup) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
            tLObject = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
            tLObject = tL_getBroadcastStats;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadStatistic$3(tLObject2, tL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public void lambda$loadStatistic$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            final ChartViewData[] chartViewDataArr = {createViewData(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1), createViewData(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0), createViewData(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0), createViewData(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1), createViewData(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0), createViewData(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2), createViewData(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2), createViewData(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), createViewData(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0), createViewData(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2), createViewData(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1), createViewData(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2)};
            ChartViewData chartViewData = chartViewDataArr[2];
            if (chartViewData != null) {
                chartViewData.useHourFormat = true;
            }
            this.overviewChannelData = new OverviewChannelData(tL_broadcastStats);
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            this.maxDateOverview = ((long) tL_statsDateRangeDays.max_date) * 1000;
            this.minDateOverview = ((long) tL_statsDateRangeDays.min_date) * 1000;
            this.recentPostsAll.clear();
            final ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (TL_stats.PostInteractionCounters postInteractionCounters : tL_broadcastStats.recent_posts_interactions) {
                RecentPostInfo recentPostInfo = new RecentPostInfo();
                recentPostInfo.counters = postInteractionCounters;
                if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                    this.recentPostsAll.add(recentPostInfo);
                    this.recentPostIdtoIndexMap.put(recentPostInfo.getId(), i);
                    i++;
                }
                if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList.add(Integer.valueOf(recentPostInfo.getId()));
                    this.recentStoriesAll.add(recentPostInfo);
                    this.recentStoriesIdtoIndexMap.put(recentPostInfo.getId(), i2);
                    i2++;
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadStatistic$0(arrayList);
                }
            });
            if (this.recentPostsAll.size() > 0) {
                getMessagesStorage().getMessages(-this.chatId, 0L, false, this.recentPostsAll.size(), ((RecentPostInfo) this.recentPostsAll.get(0)).getId(), 0, 0, this.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadStatistic$1(chartViewDataArr);
                }
            });
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final ChartViewData[] chartViewDataArr2 = {createViewData(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0), createViewData(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0), createViewData(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2), createViewData(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), createViewData(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2), createViewData(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1), createViewData(tL_megagroupStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0), createViewData(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4)};
            ChartViewData chartViewData2 = chartViewDataArr2[6];
            if (chartViewData2 != null) {
                chartViewData2.useHourFormat = true;
            }
            ChartViewData chartViewData3 = chartViewDataArr2[7];
            if (chartViewData3 != null) {
                chartViewData3.useWeekFormat = true;
            }
            this.overviewChatData = new OverviewChatData(tL_megagroupStats);
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            this.maxDateOverview = ((long) tL_statsDateRangeDays2.max_date) * 1000;
            this.minDateOverview = ((long) tL_statsDateRangeDays2.min_date) * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList2 = tL_megagroupStats.top_posters;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int i3 = 0; i3 < tL_megagroupStats.top_posters.size(); i3++) {
                    MemberData memberDataFrom = MemberData.from(tL_megagroupStats.top_posters.get(i3), tL_megagroupStats.users);
                    if (this.topMembersVisible.size() < 10) {
                        this.topMembersVisible.add(memberDataFrom);
                    }
                    this.topMembersAll.add(memberDataFrom);
                }
                if (this.topMembersAll.size() - this.topMembersVisible.size() < 2) {
                    this.topMembersVisible.clear();
                    this.topMembersVisible.addAll(this.topMembersAll);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList3 = tL_megagroupStats.top_admins;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i4 = 0; i4 < tL_megagroupStats.top_admins.size(); i4++) {
                    this.topAdmins.add(MemberData.from(tL_megagroupStats.top_admins.get(i4), tL_megagroupStats.users));
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList4 = tL_megagroupStats.top_inviters;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                for (int i5 = 0; i5 < tL_megagroupStats.top_inviters.size(); i5++) {
                    this.topInviters.add(MemberData.from(tL_megagroupStats.top_inviters.get(i5), tL_megagroupStats.users));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadStatistic$2(chartViewDataArr2);
                }
            });
        }
    }

    public void lambda$loadStatistic$0(List list) {
        if (this.storiesList.load(list)) {
            return;
        }
        prepareStoriesLoadedItems();
        sortAllLoadedData();
    }

    public void lambda$loadStatistic$1(ChartViewData[] chartViewDataArr) {
        this.ivInteractionsData = chartViewDataArr[0];
        this.followersData = chartViewDataArr[1];
        this.topHoursData = chartViewDataArr[2];
        this.interactionsData = chartViewDataArr[3];
        this.growthData = chartViewDataArr[4];
        this.viewsBySourceData = chartViewDataArr[5];
        this.newFollowersBySourceData = chartViewDataArr[6];
        this.languagesData = chartViewDataArr[7];
        this.notificationsData = chartViewDataArr[8];
        this.reactionsByEmotionData = chartViewDataArr[9];
        this.storyInteractionsData = chartViewDataArr[10];
        this.storyReactionsByEmotionData = chartViewDataArr[11];
        dataLoaded(chartViewDataArr);
    }

    public void lambda$loadStatistic$2(ChartViewData[] chartViewDataArr) {
        this.growthData = chartViewDataArr[0];
        this.groupMembersData = chartViewDataArr[1];
        this.newMembersBySourceData = chartViewDataArr[2];
        this.membersLanguageData = chartViewDataArr[3];
        this.messagesData = chartViewDataArr[4];
        this.actionsData = chartViewDataArr[5];
        this.topHoursData = chartViewDataArr[6];
        this.topDayOfWeeksData = chartViewDataArr[7];
        dataLoaded(chartViewDataArr);
    }

    private void dataLoaded(ChartViewData[] chartViewDataArr) {
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.update();
            this.recyclerListView.setItemAnimator(null);
            this.adapter.notifyDataSetChanged();
        }
        this.initialLoading = false;
        LinearLayout linearLayout = this.progressLayout;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showProgressbar);
        this.progressLayout.animate().alpha(0.0f).setDuration(230L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StatisticActivity.this.progressLayout.setVisibility(8);
            }
        });
        this.recyclerListView.setVisibility(0);
        this.recyclerListView.setAlpha(0.0f);
        this.recyclerListView.animate().alpha(1.0f).setDuration(230L).start();
        for (ChartViewData chartViewData : chartViewDataArr) {
            if (chartViewData != null && chartViewData.chartData == null && chartViewData.token != null) {
                chartViewData.load(this.currentAccount, this.classGuid, this.chat.stats_dc, getFindChartCell(chartViewData));
            }
        }
    }

    public Utilities.Callback0Return getFindChartCell(final ChartViewData chartViewData) {
        return new Utilities.Callback0Return() {
            @Override
            public final Object run() {
                return this.f$0.lambda$getFindChartCell$4(chartViewData);
            }
        };
    }

    public BaseChartCell lambda$getFindChartCell$4(ChartViewData chartViewData) {
        int childCount = this.recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof ChartCell) {
                ChartCell chartCell = (ChartCell) childAt;
                if (chartCell.data == chartViewData) {
                    return chartCell;
                }
            }
        }
        this.recyclerListView.setItemAnimator(null);
        this.diffUtilsCallback.update();
        return null;
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        AlertDialog alertDialog = this.progressDialog[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.progressDialog[0] = null;
        }
        StoriesController.StoriesList storiesList = this.storiesList;
        if (storiesList != null) {
            storiesList.unlink(this.storiesListId);
        }
        super.onFragmentDestroy();
    }

    private void prepareStoriesLoadedItems() {
        this.recentStoriesLoaded.clear();
        for (RecentPostInfo recentPostInfo : this.recentStoriesAll) {
            MessageObject messageObjectFindMessageObject = this.storiesList.findMessageObject(recentPostInfo.getId());
            if (messageObjectFindMessageObject != null) {
                recentPostInfo.message = messageObjectFindMessageObject;
                this.recentStoriesLoaded.add(recentPostInfo);
            }
        }
        this.recentStoriesIdtoIndexMap.clear();
        this.recentStoriesAll.clear();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesListUpdated) {
            if (((StoriesController.StoriesList) objArr[0]) == this.storiesList) {
                prepareStoriesLoadedItems();
                sortAllLoadedData();
                if (this.adapter != null) {
                    this.recyclerListView.setItemAnimator(null);
                    this.diffUtilsCallback.update();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            BaseFragment baseFragment = fragmentStack.size() >= 2 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 2) : null;
            if (baseFragment instanceof ChatEditActivity) {
                getParentLayout().removeFragmentFromStack(baseFragment);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            BaseFragment baseFragment2 = fragmentStack2.size() >= 2 ? (BaseFragment) fragmentStack2.get(fragmentStack2.size() - 2) : null;
            if (zBooleanValue) {
                BaseFragment baseFragment3 = fragmentStack2.size() >= 3 ? (BaseFragment) fragmentStack2.get(fragmentStack2.size() - 3) : null;
                if (baseFragment2 instanceof ProfileActivity) {
                    getParentLayout().removeFragmentFromStack(baseFragment2);
                }
                finishFragment();
                if (baseFragment3 instanceof ChatActivity) {
                    BoostDialogs.showBulletin(baseFragment3, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if (baseFragment2 instanceof ProfileActivity) {
                BoostDialogs.showBulletin(baseFragment2, chat, false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList = (ArrayList) objArr[2];
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i3);
                    int i4 = this.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
                    if (i4 >= 0 && ((RecentPostInfo) this.recentPostsAll.get(i4)).getId() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList2.add((RecentPostInfo) this.recentPostsAll.get(i4));
                        } else {
                            ((RecentPostInfo) this.recentPostsAll.get(i4)).message = messageObject;
                        }
                    }
                }
                this.recentPostsAll.removeAll(arrayList2);
                this.recentPostsLoaded.clear();
                int size2 = this.recentPostsAll.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    RecentPostInfo recentPostInfo = (RecentPostInfo) this.recentPostsAll.get(i5);
                    if (recentPostInfo.message == null) {
                        this.loadFromId = recentPostInfo.getId();
                        break;
                    }
                    this.recentPostsLoaded.add(recentPostInfo);
                }
                if (this.recentPostsLoaded.size() < 20) {
                    loadMessages();
                }
                sortAllLoadedData();
                if (this.adapter != null) {
                    this.recyclerListView.setItemAnimator(null);
                    this.diffUtilsCallback.update();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId && this.chat == null) {
                this.chat = chatFull;
                loadStatistic();
            }
        }
    }

    @Override
    public View createView(Context context) {
        this.sharedUi = new BaseChartView.SharedUiComponents();
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
        int i = (chatFull == null || !chatFull.can_view_stats) ? 0 : 1;
        final boolean zIsBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (i != 0) {
            arrayList.add(GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.POLL, R.string.Statistics));
        }
        arrayList.add(GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.BOOSTS, R.string.Boosts));
        if (z) {
            arrayList.add(GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.MONETIZATION, R.string.Monetization));
        }
        this.tabs = (GlassTabView[]) arrayList.toArray(new GlassTabView[0]);
        MainTabsLayout mainTabsLayout = new MainTabsLayout(context, this.resourceProvider);
        this.tabsView = mainTabsLayout;
        mainTabsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        final int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                break;
            }
            GlassTabView glassTabView = glassTabViewArr[i2];
            glassTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$5(i2, view);
                }
            });
            this.tabsView.addView(this.tabs[i2]);
            this.tabsView.setViewVisible(glassTabView, true, false);
            i2++;
        }
        this.viewPagerFixed = new ViewPagerFixed(getContext()) {
            @Override
            public void onTabAnimationUpdate(boolean z2) {
                float positionAnimated = StatisticActivity.this.viewPagerFixed.getPositionAnimated();
                StatisticActivity.this.setGestureSelectedOverride(positionAnimated, !z2);
                if (!z2) {
                    StatisticActivity.this.selectTab(Math.round(positionAnimated), true);
                }
                StatisticActivity.this.blur3_InvalidateBlur();
                StatisticActivity.this.checkUi_actionBar();
            }

            @Override
            protected void onScrollEnd() {
                super.onScrollEnd();
                StatisticActivity statisticActivity = StatisticActivity.this;
                statisticActivity.selectTab(statisticActivity.viewPagerFixed.getCurrentPosition(), true);
                StatisticActivity.this.setGestureSelectedOverride(0.0f, false);
                StatisticActivity.this.blur3_InvalidateBlur();
            }

            @Override
            protected void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                super.onLayout(z2, i3, i4, i5, i6);
                StatisticActivity.this.checkUi_actionBar();
            }
        };
        final FrameLayout frameLayout = new FrameLayout(context);
        if (zIsBoostSupported) {
            this.boostLayout = new ChannelBoostLayout(this, -this.chatId, getResourceProvider());
        }
        if (z) {
            ChannelMonetizationLayout channelMonetizationLayout = new ChannelMonetizationLayout(getContext(), this, this.currentAccount, -this.chatId, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            this.monetizationLayout = channelMonetizationLayout;
            channelMonetizationLayout.setActionBar(this.actionBar);
        }
        final boolean z2 = i;
        final boolean z3 = z;
        this.viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public void bindView(View view, int i3, int i4) {
            }

            @Override
            public int getItemViewType(int i3) {
                return i3;
            }

            @Override
            public int getItemCount() {
                if (StatisticActivity.this.onlyBoostsStat) {
                    return 1;
                }
                return (z2 ? 1 : 0) + (zIsBoostSupported ? 1 : 0) + (z3 ? 1 : 0);
            }

            @Override
            public View createView(int i3) {
                if (StatisticActivity.this.onlyBoostsStat) {
                    return StatisticActivity.this.boostLayout;
                }
                if (z2) {
                    if (i3 == 0) {
                        return frameLayout;
                    }
                    i3--;
                }
                if (zIsBoostSupported) {
                    if (i3 == 0) {
                        return StatisticActivity.this.boostLayout;
                    }
                    i3--;
                }
                if (z3 && i3 == 0) {
                    return StatisticActivity.this.monetizationLayout;
                }
                return frameLayout;
            }
        });
        boolean z4 = zIsBoostSupported && !this.onlyBoostsStat;
        this.showTabs = z4;
        if (z4 && this.startFromBoosts) {
            this.viewPagerFixed.setPosition(i);
        } else if (z4 && this.startFromMonetization) {
            this.viewPagerFixed.setPosition(i + ((this.onlyBoostsStat || !zIsBoostSupported) ? 0 : 1));
        }
        selectTab(this.viewPagerFixed.getCurrentPosition(), false);
        final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(getContext()) {
            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z5) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || StatisticActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                StatisticActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && StatisticActivity.this.scrollableViewNoiseSuppressor != null) {
                    StatisticActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (StatisticActivity.this.iBlur3SourceGlassFrosted != null && !StatisticActivity.this.iBlur3SourceGlassFrosted.inRecording()) {
                        RecordingCanvas recordingCanvasBeginRecording = StatisticActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording.drawColor(StatisticActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            StatisticActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        StatisticActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (StatisticActivity.this.iBlur3SourceGlass != null && !StatisticActivity.this.iBlur3SourceGlass.inRecording()) {
                        RecordingCanvas recordingCanvasBeginRecording2 = StatisticActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(StatisticActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            StatisticActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        StatisticActivity.this.iBlur3SourceGlass.endRecording();
                    }
                }
                super.dispatchDraw(canvas);
            }
        };
        this.actionBar.setDrawBlurBackground(sizeNotifierFrameLayout);
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(sizeNotifierFrameLayout), sizeNotifierFrameLayout);
        sizeNotifierFrameLayout.addView(this.viewPagerFixed, LayoutHelper.createFrameMatchParent());
        sizeNotifierFrameLayout.addView(this.actionBar);
        if (this.showTabs) {
            sizeNotifierFrameLayout.addView(this.tabsView, LayoutHelper.createFrame(344, 72, 81));
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                @Override
                public boolean allowLayoutChanges() {
                    return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                }

                @Override
                public boolean bottomOffsetAnimated() {
                    return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                }

                @Override
                public boolean clipWithGradient(int i3) {
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
                }

                @Override
                public int getTopOffset(int i3) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }

                @Override
                public int getBottomOffset(int i3) {
                    return AndroidUtilities.dp(64.0f);
                }
            });
        }
        this.fragmentView = sizeNotifierFrameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            int lastH;

            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                if (this.lastH != getMeasuredHeight() && StatisticActivity.this.adapter != null) {
                    StatisticActivity.this.adapter.notifyDataSetChanged();
                }
                this.lastH = getMeasuredHeight();
            }
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setSections(true);
        this.recyclerListView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        Objects.requireNonNull(recyclerListView2);
        this.listBlur3Capture = new ViewGroupPartRenderer(recyclerListView2, sizeNotifierFrameLayout, new EmojiView$$ExternalSyntheticLambda15(recyclerListView2));
        ChannelBoostLayout channelBoostLayout = this.boostLayout;
        if (channelBoostLayout != null) {
            RecyclerListView recyclerListView3 = channelBoostLayout.listView;
            Objects.requireNonNull(recyclerListView3);
            channelBoostLayout.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView3, sizeNotifierFrameLayout, new EmojiView$$ExternalSyntheticLambda15(recyclerListView3));
            this.boostLayout.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (Build.VERSION.SDK_INT < 31 || StatisticActivity.this.scrollableViewNoiseSuppressor == null) {
                        return;
                    }
                    StatisticActivity.this.scrollableViewNoiseSuppressor.onScrolled(i3, i4);
                    StatisticActivity.this.blur3_InvalidateBlur();
                }
            });
        }
        ChannelMonetizationLayout channelMonetizationLayout2 = this.monetizationLayout;
        if (channelMonetizationLayout2 != null) {
            UniversalRecyclerView universalRecyclerView = channelMonetizationLayout2.listView;
            Objects.requireNonNull(universalRecyclerView);
            channelMonetizationLayout2.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView, sizeNotifierFrameLayout, new CallLogActivity$$ExternalSyntheticLambda6(universalRecyclerView));
            this.monetizationLayout.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (Build.VERSION.SDK_INT < 31 || StatisticActivity.this.scrollableViewNoiseSuppressor == null) {
                        return;
                    }
                    StatisticActivity.this.scrollableViewNoiseSuppressor.onScrolled(i3, i4);
                    StatisticActivity.this.blur3_InvalidateBlur();
                }
            });
        }
        this.iBlur3Capture = new IBlur3Capture() {
            final RectF fragmentPosition = new RectF();

            @Override
            public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                iBlur3Hash.unsupported();
            }

            @Override
            public void capture(Canvas canvas, RectF rectF) {
                IBlur3Capture iBlur3Capture;
                View view;
                StatisticActivity.this.fragmentView.getMeasuredWidth();
                StatisticActivity.this.fragmentView.getMeasuredHeight();
                canvas.drawColor(StatisticActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == 0) {
                        iBlur3Capture = StatisticActivity.this.listBlur3Capture;
                        view = StatisticActivity.this.recyclerListView;
                    } else if (i3 != 1 || StatisticActivity.this.boostLayout == null) {
                        if (StatisticActivity.this.monetizationLayout != null) {
                            iBlur3Capture = StatisticActivity.this.monetizationLayout.iBlur3Capture;
                            view = StatisticActivity.this.monetizationLayout;
                        } else {
                            iBlur3Capture = null;
                            view = null;
                        }
                    } else {
                        iBlur3Capture = StatisticActivity.this.boostLayout.iBlur3Capture;
                        view = StatisticActivity.this.boostLayout;
                    }
                    if (iBlur3Capture != null && view != null) {
                        ViewPositionWatcher.computeRectInParent(view, sizeNotifierFrameLayout, this.fragmentPosition);
                        if (this.fragmentPosition.right > 0.0f) {
                            StatisticActivity.this.fragmentView.getMeasuredWidth();
                        }
                        canvas.save();
                        iBlur3Capture.capture(canvas, rectF);
                        canvas.restore();
                    }
                }
            }
        };
        this.recyclerListView.setSections();
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
        int i3 = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(i3));
        textView.setTag(Integer.valueOf(i3));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(i4));
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(LocaleController.getString(R.string.LoadingStatsDescription));
        textView2.setGravity(1);
        this.progressLayout.addView(this.imageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        this.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        this.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        frameLayout.addView(this.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (this.adapter == null) {
            this.adapter = new Adapter();
        }
        this.recyclerListView.setAdapter(this.adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        this.recyclerListView.setLayoutManager(linearLayoutManager);
        this.animator = new DefaultItemAnimator() {
            @Override
            protected long getAddAnimationDelay(long j, long j2, long j3) {
                return j;
            }
        };
        this.recyclerListView.setItemAnimator(null);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (StatisticActivity.this.recentPostsAll.size() != StatisticActivity.this.recentPostsLoaded.size() && !StatisticActivity.this.messagesIsLoading && StatisticActivity.this.layoutManager.findLastVisibleItemPosition() > StatisticActivity.this.adapter.getItemCount() - 20) {
                    StatisticActivity.this.loadMessages();
                }
                if (Build.VERSION.SDK_INT < 31 || StatisticActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                StatisticActivity.this.scrollableViewNoiseSuppressor.onScrolled(i5, i6);
                StatisticActivity.this.blur3_InvalidateBlur();
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                this.f$0.lambda$createView$6(view, i5);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i5) {
                return this.f$0.lambda$createView$9(view, i5);
            }
        });
        frameLayout.addView(this.recyclerListView);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.avatarContainer.getAvatarImageView().setScaleX(0.9f);
        this.avatarContainer.getAvatarImageView().setScaleY(0.9f);
        this.avatarContainer.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.avatarContainer.setChatAvatar(chat2);
        this.avatarContainer.setTitle(chat2 == null ? "" : chat2.title);
        this.avatarContainer.hideSubtitle();
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    StatisticActivity.this.finishFragment();
                }
            }
        });
        this.avatarContainer.setTitleColors(Theme.getColor(i3), Theme.getColor(i4));
        this.actionBar.setItemsColor(Theme.getColor(i3), false);
        this.actionBar.setItemsColor(Theme.getColor(i3), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        if (this.initialLoading) {
            this.progressLayout.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(this.showProgressbar, 500L);
            this.progressLayout.setVisibility(0);
            this.recyclerListView.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.showProgressbar);
            this.progressLayout.setVisibility(8);
            this.recyclerListView.setVisibility(0);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.tabsView, BlurredBackgroundProviderImpl.mainTabs(this.resourceProvider));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.666f));
        this.tabsView.setBackground(blurredBackgroundDrawableCreate);
        checkUi_listPaddings();
        this.diffUtilsCallback = new DiffUtilsCallback(this.adapter, this.layoutManager);
        return this.fragmentView;
    }

    public void lambda$createView$5(int i, View view) {
        this.viewPagerFixed.scrollToPosition(i);
        selectTab(i, true);
    }

    public void lambda$createView$6(View view, int i) {
        Adapter adapter = this.adapter;
        int i2 = adapter.recentPostsStartRow;
        if (i >= i2 && i <= adapter.recentPostsEndRow) {
            presentFragment(new MessageStatisticActivity((RecentPostInfo) this.recentAllSortedDataLoaded.get(i - i2), this.chatId, true));
            return;
        }
        int i3 = adapter.topAdminsStartRow;
        if (i >= i3 && i <= adapter.topAdminsEndRow) {
            ((MemberData) this.topAdmins.get(i - i3)).onClick(this);
            return;
        }
        int i4 = adapter.topMembersStartRow;
        if (i >= i4 && i <= adapter.topMembersEndRow) {
            ((MemberData) this.topMembersVisible.get(i - i4)).onClick(this);
            return;
        }
        int i5 = adapter.topInviterStartRow;
        if (i >= i5 && i <= adapter.topInviterEndRow) {
            ((MemberData) this.topInviters.get(i - i5)).onClick(this);
            return;
        }
        if (i == adapter.expandTopMembersRow) {
            int size = this.topMembersAll.size() - this.topMembersVisible.size();
            int i6 = this.adapter.expandTopMembersRow;
            this.topMembersVisible.clear();
            this.topMembersVisible.addAll(this.topMembersAll);
            Adapter adapter2 = this.adapter;
            if (adapter2 != null) {
                adapter2.update();
                this.recyclerListView.setItemAnimator(this.animator);
                this.adapter.notifyItemRangeInserted(i6 + 1, size);
                this.adapter.notifyItemRemoved(i6);
            }
        }
    }

    public boolean lambda$createView$9(View view, int i) {
        Adapter adapter = this.adapter;
        int i2 = adapter.recentPostsStartRow;
        if (i >= i2 && i <= adapter.recentPostsEndRow) {
            final MessageObject messageObject = ((RecentPostInfo) this.recentAllSortedDataLoaded.get(i - i2)).message;
            if (messageObject.isStory()) {
                return false;
            }
            ItemOptions.makeOptions(this, view).add(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$7(messageObject);
                }
            }).add(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$8(messageObject);
                }
            }).setScrimViewBackground(this.recyclerListView.getClipBackground(view)).show();
            return true;
        }
        int i3 = adapter.topAdminsStartRow;
        if (i >= i3 && i <= adapter.topAdminsEndRow) {
            ((MemberData) this.topAdmins.get(i - i3)).onLongClick(this.chat, this, this.progressDialog);
            return true;
        }
        int i4 = adapter.topMembersStartRow;
        if (i >= i4 && i <= adapter.topMembersEndRow) {
            ((MemberData) this.topMembersVisible.get(i - i4)).onLongClick(this.chat, this, this.progressDialog);
            return true;
        }
        int i5 = adapter.topInviterStartRow;
        if (i < i5 || i > adapter.topInviterEndRow) {
            return false;
        }
        ((MemberData) this.topInviters.get(i - i5)).onLongClick(this.chat, this, this.progressDialog);
        return true;
    }

    public void lambda$createView$7(MessageObject messageObject) {
        presentFragment(new MessageStatisticActivity(messageObject));
    }

    public void lambda$createView$8(MessageObject messageObject) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("message_id", messageObject.getId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        presentFragment(new ChatActivity(bundle), false);
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    public static ChartViewData createViewData(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        ChartViewData chartViewData = new ChartViewData(str, i);
        chartViewData.isLanguages = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                ChartData chartDataCreateChartData = createChartData(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                chartViewData.chartData = chartDataCreateChartData;
                if (chartDataCreateChartData != null) {
                    chartDataCreateChartData.yRate = statsGraph.rate;
                }
                chartViewData.zoomToken = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (chartDataCreateChartData == null || (jArr2 = chartDataCreateChartData.x) == null || jArr2.length < 2) {
                    chartViewData.isEmpty = true;
                }
                if (i == 4 && chartDataCreateChartData != null && (jArr = chartDataCreateChartData.x) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    chartViewData.childChartData = new StackLinearChartData(chartDataCreateChartData, j);
                    chartViewData.activeZoom = j;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            chartViewData.token = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return chartViewData;
    }

    public static ChartViewData createViewData(TL_stats.StatsGraph statsGraph, String str, int i) {
        return createViewData(statsGraph, str, i, false);
    }

    public static ChartData createChartData(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new ChartData(jSONObject);
        }
        if (i == 1) {
            return new DoubleLinearChartData(jSONObject);
        }
        if (i == 2) {
            return new StackBarChartData(jSONObject);
        }
        if (i == 4) {
            return new StackLinearChartData(jSONObject, z);
        }
        return null;
    }

    class Adapter extends RecyclerListView.SelectionAdapter {
        int count;
        int overviewCell;
        int overviewHeaderCell = -1;
        int growCell = -1;
        int progressCell = -1;
        int folowersCell = -1;
        int topHourseCell = -1;
        int interactionsCell = -1;
        int ivInteractionsCell = -1;
        int viewsBySourceCell = -1;
        int newFollowersBySourceCell = -1;
        int languagesCell = -1;
        int notificationsCell = -1;
        int reactionsByEmotionCell = -1;
        int storyInteractionsCell = -1;
        int storyReactionsByEmotionCell = -1;
        int recentPostsHeaderCell = -1;
        int recentPostsStartRow = -1;
        int recentPostsEndRow = -1;
        int groupMembersCell = -1;
        int newMembersBySourceCell = -1;
        int membersLanguageCell = -1;
        int messagesCell = -1;
        int actionsCell = -1;
        int topDayOfWeeksCell = -1;
        int topMembersHeaderCell = -1;
        int topMembersStartRow = -1;
        int topMembersEndRow = -1;
        int topAdminsHeaderCell = -1;
        int topAdminsStartRow = -1;
        int topAdminsEndRow = -1;
        int topInviterHeaderCell = -1;
        int topInviterStartRow = -1;
        int topInviterEndRow = -1;
        int expandTopMembersRow = -1;
        ArraySet shadowDivideCells = new ArraySet();
        ArraySet emptyCells = new ArraySet();

        Adapter() {
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.growCell || i == this.folowersCell || i == this.topHourseCell || i == this.notificationsCell || i == this.actionsCell || i == this.groupMembersCell) {
                return 0;
            }
            if (i == this.interactionsCell || i == this.ivInteractionsCell || i == this.storyInteractionsCell) {
                return 1;
            }
            if (i == this.viewsBySourceCell || i == this.newFollowersBySourceCell || i == this.newMembersBySourceCell || i == this.messagesCell || i == this.reactionsByEmotionCell || i == this.storyReactionsByEmotionCell) {
                return 2;
            }
            if (i == this.languagesCell || i == this.membersLanguageCell || i == this.topDayOfWeeksCell) {
                return 4;
            }
            if (i >= this.recentPostsStartRow && i <= this.recentPostsEndRow) {
                return 9;
            }
            if (i == this.progressCell) {
                return 11;
            }
            if (this.emptyCells.contains(Integer.valueOf(i))) {
                return 12;
            }
            if (i == this.recentPostsHeaderCell || i == this.overviewHeaderCell || i == this.topAdminsHeaderCell || i == this.topMembersHeaderCell || i == this.topInviterHeaderCell) {
                return 13;
            }
            if (i == this.overviewCell) {
                return 14;
            }
            if ((i < this.topAdminsStartRow || i > this.topAdminsEndRow) && ((i < this.topMembersStartRow || i > this.topMembersEndRow) && (i < this.topInviterStartRow || i > this.topInviterEndRow))) {
                return i == this.expandTopMembersRow ? 15 : 10;
            }
            return 9;
        }

        @Override
        public long getItemId(int i) {
            if (i >= this.recentPostsStartRow && i < this.recentPostsEndRow) {
                return ((RecentPostInfo) StatisticActivity.this.recentAllSortedDataLoaded.get(i - this.recentPostsStartRow)).getId();
            }
            if (i == this.growCell) {
                return 1L;
            }
            if (i == this.folowersCell) {
                return 2L;
            }
            if (i == this.topHourseCell) {
                return 3L;
            }
            if (i == this.interactionsCell) {
                return 4L;
            }
            if (i == this.notificationsCell) {
                return 5L;
            }
            if (i == this.ivInteractionsCell) {
                return 6L;
            }
            if (i == this.viewsBySourceCell) {
                return 7L;
            }
            if (i == this.newFollowersBySourceCell) {
                return 8L;
            }
            if (i == this.languagesCell) {
                return 9L;
            }
            if (i == this.groupMembersCell) {
                return 10L;
            }
            if (i == this.newMembersBySourceCell) {
                return 11L;
            }
            if (i == this.membersLanguageCell) {
                return 12L;
            }
            if (i == this.messagesCell) {
                return 13L;
            }
            if (i == this.actionsCell) {
                return 14L;
            }
            if (i == this.topDayOfWeeksCell) {
                return 15L;
            }
            if (i == this.reactionsByEmotionCell) {
                return 16L;
            }
            if (i == this.storyInteractionsCell) {
                return 17L;
            }
            if (i == this.storyReactionsByEmotionCell) {
                return 18L;
            }
            return super.getItemId(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View overviewCell;
            if (i >= 0 && i <= 4) {
                ChartCell chartCell = new ChartCell(viewGroup.getContext(), ((BaseFragment) StatisticActivity.this).currentAccount, i, StatisticActivity.this.sharedUi) {
                    {
                        StatisticActivity statisticActivity = StatisticActivity.this;
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                        }
                        super.onDraw(canvas);
                    }
                };
                chartCell.setWillNotDraw(false);
                overviewCell = chartCell;
            } else if (i == 9) {
                StatisticPostInfoCell statisticPostInfoCell = new StatisticPostInfoCell(viewGroup.getContext(), StatisticActivity.this.chat, StatisticActivity.this.getResourceProvider()) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                        }
                        super.onDraw(canvas);
                    }
                };
                statisticPostInfoCell.setWillNotDraw(false);
                overviewCell = statisticPostInfoCell;
            } else if (i == 11) {
                overviewCell = new LoadingCell(viewGroup.getContext());
            } else if (i == 12) {
                overviewCell = new EmptyCell(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
            } else if (i == 13) {
                ChartHeaderView chartHeaderView = new ChartHeaderView(viewGroup.getContext()) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                        }
                        super.onDraw(canvas);
                    }
                };
                chartHeaderView.setWillNotDraw(false);
                chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(16.0f));
                overviewCell = chartHeaderView;
            } else if (i == 14) {
                overviewCell = new OverviewCell(viewGroup.getContext(), StatisticActivity.this.isMegagroup ? 2 : 4);
            } else if (i == 15) {
                ManageChatTextCell manageChatTextCell = new ManageChatTextCell(viewGroup.getContext());
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                overviewCell = manageChatTextCell;
            } else {
                overviewCell = new ShadowSectionCell(viewGroup.getContext(), 12, 0);
            }
            overviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(overviewCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ChartViewData chartViewData;
            int itemViewType = getItemViewType(i);
            if (itemViewType >= 0 && itemViewType <= 4) {
                if (this.growCell == i) {
                    chartViewData = StatisticActivity.this.growthData;
                } else if (this.folowersCell == i) {
                    chartViewData = StatisticActivity.this.followersData;
                } else if (this.interactionsCell == i) {
                    chartViewData = StatisticActivity.this.interactionsData;
                } else if (this.viewsBySourceCell == i) {
                    chartViewData = StatisticActivity.this.viewsBySourceData;
                } else if (this.newFollowersBySourceCell == i) {
                    chartViewData = StatisticActivity.this.newFollowersBySourceData;
                } else if (this.ivInteractionsCell == i) {
                    chartViewData = StatisticActivity.this.ivInteractionsData;
                } else if (this.topHourseCell == i) {
                    chartViewData = StatisticActivity.this.topHoursData;
                } else if (this.notificationsCell == i) {
                    chartViewData = StatisticActivity.this.notificationsData;
                } else if (this.reactionsByEmotionCell == i) {
                    chartViewData = StatisticActivity.this.reactionsByEmotionData;
                } else if (this.storyInteractionsCell == i) {
                    chartViewData = StatisticActivity.this.storyInteractionsData;
                } else if (this.storyReactionsByEmotionCell == i) {
                    chartViewData = StatisticActivity.this.storyReactionsByEmotionData;
                } else if (this.groupMembersCell == i) {
                    chartViewData = StatisticActivity.this.groupMembersData;
                } else if (this.newMembersBySourceCell == i) {
                    chartViewData = StatisticActivity.this.newMembersBySourceData;
                } else if (this.membersLanguageCell == i) {
                    chartViewData = StatisticActivity.this.membersLanguageData;
                } else if (this.messagesCell == i) {
                    chartViewData = StatisticActivity.this.messagesData;
                } else if (this.actionsCell == i) {
                    chartViewData = StatisticActivity.this.actionsData;
                } else {
                    chartViewData = this.topDayOfWeeksCell == i ? StatisticActivity.this.topDayOfWeeksData : StatisticActivity.this.languagesData;
                }
                ((ChartCell) viewHolder.itemView).updateData(chartViewData, false);
                return;
            }
            if (itemViewType == 9) {
                if (StatisticActivity.this.isMegagroup) {
                    int i2 = this.topAdminsStartRow;
                    if (i >= i2 && i <= this.topAdminsEndRow) {
                        ((StatisticPostInfoCell) viewHolder.itemView).setData((MemberData) StatisticActivity.this.topAdmins.get(i - i2));
                        return;
                    }
                    int i3 = this.topMembersStartRow;
                    if (i >= i3 && i <= this.topMembersEndRow) {
                        ((StatisticPostInfoCell) viewHolder.itemView).setData((MemberData) StatisticActivity.this.topMembersVisible.get(i - i3));
                        return;
                    }
                    int i4 = this.topInviterStartRow;
                    if (i < i4 || i > this.topInviterEndRow) {
                        return;
                    }
                    ((StatisticPostInfoCell) viewHolder.itemView).setData((MemberData) StatisticActivity.this.topInviters.get(i - i4));
                    return;
                }
                int i5 = i - this.recentPostsStartRow;
                final RecentPostInfo recentPostInfo = (RecentPostInfo) StatisticActivity.this.recentAllSortedDataLoaded.get(i5);
                StatisticPostInfoCell statisticPostInfoCell = (StatisticPostInfoCell) viewHolder.itemView;
                statisticPostInfoCell.setData(recentPostInfo, i5 == StatisticActivity.this.recentAllSortedDataLoaded.size() - 1);
                if (recentPostInfo.isStory()) {
                    statisticPostInfoCell.setImageViewAction(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onBindViewHolder$0(recentPostInfo, view);
                        }
                    });
                    return;
                } else {
                    statisticPostInfoCell.setImageViewAction(null);
                    return;
                }
            }
            if (itemViewType != 13) {
                if (itemViewType != 14) {
                    if (itemViewType == 15) {
                        ((ManageChatTextCell) viewHolder.itemView).setText(LocaleController.formatPluralString("ShowVotes", StatisticActivity.this.topMembersAll.size() - StatisticActivity.this.topMembersVisible.size(), new Object[0]), null, R.drawable.arrow_more, false);
                        return;
                    }
                    return;
                } else {
                    OverviewCell overviewCell = (OverviewCell) viewHolder.itemView;
                    if (StatisticActivity.this.isMegagroup) {
                        overviewCell.setData(StatisticActivity.this.overviewChatData);
                        return;
                    } else {
                        overviewCell.setData(StatisticActivity.this.overviewChannelData, StatisticActivity.this.chat);
                        return;
                    }
                }
            }
            ChartHeaderView chartHeaderView = (ChartHeaderView) viewHolder.itemView;
            chartHeaderView.showDate(true);
            chartHeaderView.setDates(StatisticActivity.this.minDateOverview, StatisticActivity.this.maxDateOverview);
            chartHeaderView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            if (i == this.overviewHeaderCell) {
                chartHeaderView.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                return;
            }
            if (i == this.topAdminsHeaderCell) {
                chartHeaderView.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                return;
            }
            if (i == this.topInviterHeaderCell) {
                chartHeaderView.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
            } else {
                if (i == this.topMembersHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopMembers", R.string.TopMembers));
                    return;
                }
                chartHeaderView.showDate(false);
                chartHeaderView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f));
                chartHeaderView.setTitle(LocaleController.getString("RecentPostsCapitalize", R.string.RecentPostsCapitalize));
            }
        }

        public void lambda$onBindViewHolder$0(RecentPostInfo recentPostInfo, View view) {
            StatisticActivity.this.getOrCreateStoryViewer().open(StatisticActivity.this.getContext(), recentPostInfo.getId(), StatisticActivity.this.storiesList, StoriesListPlaceProvider.of(StatisticActivity.this.recyclerListView));
        }

        @Override
        public int getItemCount() {
            return this.count;
        }

        public void update() {
            this.growCell = -1;
            this.folowersCell = -1;
            this.interactionsCell = -1;
            this.viewsBySourceCell = -1;
            this.newFollowersBySourceCell = -1;
            this.languagesCell = -1;
            this.recentPostsStartRow = -1;
            this.recentPostsEndRow = -1;
            this.progressCell = -1;
            this.recentPostsHeaderCell = -1;
            this.ivInteractionsCell = -1;
            this.topHourseCell = -1;
            this.notificationsCell = -1;
            this.storyReactionsByEmotionCell = -1;
            this.storyInteractionsCell = -1;
            this.reactionsByEmotionCell = -1;
            this.groupMembersCell = -1;
            this.newMembersBySourceCell = -1;
            this.membersLanguageCell = -1;
            this.messagesCell = -1;
            this.actionsCell = -1;
            this.topDayOfWeeksCell = -1;
            this.topMembersHeaderCell = -1;
            this.topMembersStartRow = -1;
            this.topMembersEndRow = -1;
            this.topAdminsHeaderCell = -1;
            this.topAdminsStartRow = -1;
            this.topAdminsEndRow = -1;
            this.topInviterHeaderCell = -1;
            this.topInviterStartRow = -1;
            this.topInviterEndRow = -1;
            this.expandTopMembersRow = -1;
            this.count = 0;
            this.emptyCells.clear();
            this.shadowDivideCells.clear();
            if (StatisticActivity.this.isMegagroup) {
                if (StatisticActivity.this.overviewChatData != null) {
                    int i = this.count;
                    this.overviewHeaderCell = i;
                    this.count = i + 2;
                    this.overviewCell = i + 1;
                }
                if (StatisticActivity.this.growthData != null && !StatisticActivity.this.growthData.isEmpty) {
                    int i2 = this.count;
                    if (i2 > 0) {
                        ArraySet arraySet = this.shadowDivideCells;
                        this.count = i2 + 1;
                        arraySet.add(Integer.valueOf(i2));
                    }
                    int i3 = this.count;
                    this.count = i3 + 1;
                    this.growCell = i3;
                }
                if (StatisticActivity.this.groupMembersData != null && !StatisticActivity.this.groupMembersData.isEmpty) {
                    int i4 = this.count;
                    if (i4 > 0) {
                        ArraySet arraySet2 = this.shadowDivideCells;
                        this.count = i4 + 1;
                        arraySet2.add(Integer.valueOf(i4));
                    }
                    int i5 = this.count;
                    this.count = i5 + 1;
                    this.groupMembersCell = i5;
                }
                if (StatisticActivity.this.newMembersBySourceData != null && !StatisticActivity.this.newMembersBySourceData.isEmpty && !StatisticActivity.this.newMembersBySourceData.isError) {
                    int i6 = this.count;
                    if (i6 > 0) {
                        ArraySet arraySet3 = this.shadowDivideCells;
                        this.count = i6 + 1;
                        arraySet3.add(Integer.valueOf(i6));
                    }
                    int i7 = this.count;
                    this.count = i7 + 1;
                    this.newMembersBySourceCell = i7;
                }
                if (StatisticActivity.this.membersLanguageData != null && !StatisticActivity.this.membersLanguageData.isEmpty && !StatisticActivity.this.membersLanguageData.isError) {
                    int i8 = this.count;
                    if (i8 > 0) {
                        ArraySet arraySet4 = this.shadowDivideCells;
                        this.count = i8 + 1;
                        arraySet4.add(Integer.valueOf(i8));
                    }
                    int i9 = this.count;
                    this.count = i9 + 1;
                    this.membersLanguageCell = i9;
                }
                if (StatisticActivity.this.messagesData != null && !StatisticActivity.this.messagesData.isEmpty && !StatisticActivity.this.messagesData.isError) {
                    int i10 = this.count;
                    if (i10 > 0) {
                        ArraySet arraySet5 = this.shadowDivideCells;
                        this.count = i10 + 1;
                        arraySet5.add(Integer.valueOf(i10));
                    }
                    int i11 = this.count;
                    this.count = i11 + 1;
                    this.messagesCell = i11;
                }
                if (StatisticActivity.this.actionsData != null && !StatisticActivity.this.actionsData.isEmpty && !StatisticActivity.this.actionsData.isError) {
                    int i12 = this.count;
                    if (i12 > 0) {
                        ArraySet arraySet6 = this.shadowDivideCells;
                        this.count = i12 + 1;
                        arraySet6.add(Integer.valueOf(i12));
                    }
                    int i13 = this.count;
                    this.count = i13 + 1;
                    this.actionsCell = i13;
                }
                if (StatisticActivity.this.topHoursData != null && !StatisticActivity.this.topHoursData.isEmpty && !StatisticActivity.this.topHoursData.isError) {
                    int i14 = this.count;
                    if (i14 > 0) {
                        ArraySet arraySet7 = this.shadowDivideCells;
                        this.count = i14 + 1;
                        arraySet7.add(Integer.valueOf(i14));
                    }
                    int i15 = this.count;
                    this.count = i15 + 1;
                    this.topHourseCell = i15;
                }
                if (StatisticActivity.this.topDayOfWeeksData != null && !StatisticActivity.this.topDayOfWeeksData.isEmpty && !StatisticActivity.this.topDayOfWeeksData.isError) {
                    int i16 = this.count;
                    if (i16 > 0) {
                        ArraySet arraySet8 = this.shadowDivideCells;
                        this.count = i16 + 1;
                        arraySet8.add(Integer.valueOf(i16));
                    }
                    int i17 = this.count;
                    this.count = i17 + 1;
                    this.topDayOfWeeksCell = i17;
                }
                if (StatisticActivity.this.topMembersVisible.size() > 0) {
                    int i18 = this.count;
                    if (i18 > 0) {
                        ArraySet arraySet9 = this.shadowDivideCells;
                        this.count = i18 + 1;
                        arraySet9.add(Integer.valueOf(i18));
                    }
                    int i19 = this.count;
                    int i20 = i19 + 1;
                    this.topMembersHeaderCell = i19;
                    this.count = i19 + 2;
                    this.topMembersStartRow = i20;
                    int size = i20 + StatisticActivity.this.topMembersVisible.size();
                    this.topMembersEndRow = size - 1;
                    this.count = size;
                    if (StatisticActivity.this.topMembersVisible.size() != StatisticActivity.this.topMembersAll.size()) {
                        int i21 = this.count;
                        this.count = i21 + 1;
                        this.expandTopMembersRow = i21;
                    } else {
                        ArraySet arraySet10 = this.emptyCells;
                        int i22 = this.count;
                        this.count = i22 + 1;
                        arraySet10.add(Integer.valueOf(i22));
                    }
                }
                if (StatisticActivity.this.topAdmins.size() > 0) {
                    int i23 = this.count;
                    if (i23 > 0) {
                        ArraySet arraySet11 = this.shadowDivideCells;
                        this.count = i23 + 1;
                        arraySet11.add(Integer.valueOf(i23));
                    }
                    int i24 = this.count;
                    int i25 = i24 + 1;
                    this.topAdminsHeaderCell = i24;
                    this.count = i24 + 2;
                    this.topAdminsStartRow = i25;
                    int size2 = i25 + StatisticActivity.this.topAdmins.size();
                    this.topAdminsEndRow = size2 - 1;
                    ArraySet arraySet12 = this.emptyCells;
                    this.count = size2 + 1;
                    arraySet12.add(Integer.valueOf(size2));
                }
                if (StatisticActivity.this.topInviters.size() > 0) {
                    int i26 = this.count;
                    if (i26 > 0) {
                        ArraySet arraySet13 = this.shadowDivideCells;
                        this.count = i26 + 1;
                        arraySet13.add(Integer.valueOf(i26));
                    }
                    int i27 = this.count;
                    int i28 = i27 + 1;
                    this.topInviterHeaderCell = i27;
                    this.count = i27 + 2;
                    this.topInviterStartRow = i28;
                    int size3 = i28 + StatisticActivity.this.topInviters.size();
                    this.topInviterEndRow = size3 - 1;
                    this.count = size3;
                }
                int i29 = this.count;
                if (i29 > 0) {
                    ArraySet arraySet14 = this.emptyCells;
                    this.count = i29 + 1;
                    arraySet14.add(Integer.valueOf(i29));
                    ArraySet arraySet15 = this.shadowDivideCells;
                    int i30 = this.count;
                    this.count = i30 + 1;
                    arraySet15.add(Integer.valueOf(i30));
                    return;
                }
                return;
            }
            if (StatisticActivity.this.overviewChannelData != null) {
                int i31 = this.count;
                this.overviewHeaderCell = i31;
                this.count = i31 + 2;
                this.overviewCell = i31 + 1;
            }
            if (StatisticActivity.this.growthData != null && !StatisticActivity.this.growthData.isEmpty) {
                int i32 = this.count;
                if (i32 > 0) {
                    ArraySet arraySet16 = this.shadowDivideCells;
                    this.count = i32 + 1;
                    arraySet16.add(Integer.valueOf(i32));
                }
                int i33 = this.count;
                this.count = i33 + 1;
                this.growCell = i33;
            }
            if (StatisticActivity.this.followersData != null && !StatisticActivity.this.followersData.isEmpty) {
                int i34 = this.count;
                if (i34 > 0) {
                    ArraySet arraySet17 = this.shadowDivideCells;
                    this.count = i34 + 1;
                    arraySet17.add(Integer.valueOf(i34));
                }
                int i35 = this.count;
                this.count = i35 + 1;
                this.folowersCell = i35;
            }
            if (StatisticActivity.this.notificationsData != null && !StatisticActivity.this.notificationsData.isEmpty) {
                int i36 = this.count;
                if (i36 > 0) {
                    ArraySet arraySet18 = this.shadowDivideCells;
                    this.count = i36 + 1;
                    arraySet18.add(Integer.valueOf(i36));
                }
                int i37 = this.count;
                this.count = i37 + 1;
                this.notificationsCell = i37;
            }
            if (StatisticActivity.this.topHoursData != null && !StatisticActivity.this.topHoursData.isEmpty) {
                int i38 = this.count;
                if (i38 > 0) {
                    ArraySet arraySet19 = this.shadowDivideCells;
                    this.count = i38 + 1;
                    arraySet19.add(Integer.valueOf(i38));
                }
                int i39 = this.count;
                this.count = i39 + 1;
                this.topHourseCell = i39;
            }
            if (StatisticActivity.this.viewsBySourceData != null && !StatisticActivity.this.viewsBySourceData.isEmpty) {
                int i40 = this.count;
                if (i40 > 0) {
                    ArraySet arraySet20 = this.shadowDivideCells;
                    this.count = i40 + 1;
                    arraySet20.add(Integer.valueOf(i40));
                }
                int i41 = this.count;
                this.count = i41 + 1;
                this.viewsBySourceCell = i41;
            }
            if (StatisticActivity.this.newFollowersBySourceData != null && !StatisticActivity.this.newFollowersBySourceData.isEmpty) {
                int i42 = this.count;
                if (i42 > 0) {
                    ArraySet arraySet21 = this.shadowDivideCells;
                    this.count = i42 + 1;
                    arraySet21.add(Integer.valueOf(i42));
                }
                int i43 = this.count;
                this.count = i43 + 1;
                this.newFollowersBySourceCell = i43;
            }
            if (StatisticActivity.this.languagesData != null && !StatisticActivity.this.languagesData.isEmpty) {
                int i44 = this.count;
                if (i44 > 0) {
                    ArraySet arraySet22 = this.shadowDivideCells;
                    this.count = i44 + 1;
                    arraySet22.add(Integer.valueOf(i44));
                }
                int i45 = this.count;
                this.count = i45 + 1;
                this.languagesCell = i45;
            }
            if (StatisticActivity.this.interactionsData != null && !StatisticActivity.this.interactionsData.isEmpty) {
                int i46 = this.count;
                if (i46 > 0) {
                    ArraySet arraySet23 = this.shadowDivideCells;
                    this.count = i46 + 1;
                    arraySet23.add(Integer.valueOf(i46));
                }
                int i47 = this.count;
                this.count = i47 + 1;
                this.interactionsCell = i47;
            }
            if (StatisticActivity.this.ivInteractionsData != null && !StatisticActivity.this.ivInteractionsData.loading && !StatisticActivity.this.ivInteractionsData.isError) {
                int i48 = this.count;
                if (i48 > 0) {
                    ArraySet arraySet24 = this.shadowDivideCells;
                    this.count = i48 + 1;
                    arraySet24.add(Integer.valueOf(i48));
                }
                int i49 = this.count;
                this.count = i49 + 1;
                this.ivInteractionsCell = i49;
            }
            if (StatisticActivity.this.reactionsByEmotionData != null && !StatisticActivity.this.reactionsByEmotionData.isEmpty && !StatisticActivity.this.reactionsByEmotionData.isError) {
                int i50 = this.count;
                if (i50 > 0) {
                    ArraySet arraySet25 = this.shadowDivideCells;
                    this.count = i50 + 1;
                    arraySet25.add(Integer.valueOf(i50));
                }
                int i51 = this.count;
                this.count = i51 + 1;
                this.reactionsByEmotionCell = i51;
            }
            if (StatisticActivity.this.storyInteractionsData != null && !StatisticActivity.this.storyInteractionsData.isEmpty && !StatisticActivity.this.storyInteractionsData.isError) {
                int i52 = this.count;
                if (i52 > 0) {
                    ArraySet arraySet26 = this.shadowDivideCells;
                    this.count = i52 + 1;
                    arraySet26.add(Integer.valueOf(i52));
                }
                int i53 = this.count;
                this.count = i53 + 1;
                this.storyInteractionsCell = i53;
            }
            if (StatisticActivity.this.storyReactionsByEmotionData != null && !StatisticActivity.this.storyReactionsByEmotionData.isEmpty && !StatisticActivity.this.storyReactionsByEmotionData.isError) {
                int i54 = this.count;
                if (i54 > 0) {
                    ArraySet arraySet27 = this.shadowDivideCells;
                    this.count = i54 + 1;
                    arraySet27.add(Integer.valueOf(i54));
                }
                int i55 = this.count;
                this.count = i55 + 1;
                this.storyReactionsByEmotionCell = i55;
            }
            ArraySet arraySet28 = this.shadowDivideCells;
            int i56 = this.count;
            this.count = i56 + 1;
            arraySet28.add(Integer.valueOf(i56));
            if (StatisticActivity.this.recentAllSortedDataLoaded.size() > 0) {
                int i57 = this.count;
                int i58 = i57 + 1;
                this.recentPostsHeaderCell = i57;
                this.count = i57 + 2;
                this.recentPostsStartRow = i58;
                int size4 = i58 + StatisticActivity.this.recentAllSortedDataLoaded.size();
                this.recentPostsEndRow = size4 - 1;
                this.count = size4;
                if (StatisticActivity.this.recentPostsLoaded.size() != StatisticActivity.this.recentPostsAll.size()) {
                    int i59 = this.count;
                    this.count = i59 + 1;
                    this.progressCell = i59;
                } else {
                    ArraySet arraySet29 = this.emptyCells;
                    int i60 = this.count;
                    this.count = i60 + 1;
                    arraySet29.add(Integer.valueOf(i60));
                }
                ArraySet arraySet30 = this.shadowDivideCells;
                int i61 = this.count;
                this.count = i61 + 1;
                arraySet30.add(Integer.valueOf(i61));
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 9 || viewHolder.getItemViewType() == 15;
        }
    }

    public static class UniversalChartCell extends BaseChartCell {
        private final int classGuid;
        private final int currentAccount;
        private Utilities.Callback0Return findCell;
        private int stats_dc;

        @Override
        public void onZoomed() {
        }

        @Override
        public void zoomCanceled() {
        }

        public UniversalChartCell(Context context, int i, int i2, BaseChartView.SharedUiComponents sharedUiComponents, int i3) {
            super(context, i2, sharedUiComponents);
            this.currentAccount = i;
            this.classGuid = i3;
        }

        public void set(int i, ChartViewData chartViewData, Utilities.Callback0Return callback0Return) {
            this.stats_dc = i;
            this.findCell = callback0Return;
            updateData(chartViewData, false);
        }

        @Override
        public void loadData(ChartViewData chartViewData) {
            int i;
            if (chartViewData == null || (i = this.stats_dc) < 0) {
                return;
            }
            chartViewData.load(this.currentAccount, this.classGuid, i, this.findCell);
        }
    }

    public class ChartCell extends BaseChartCell {
        private final int currentAccount;

        public ChartCell(Context context, int i, int i2, BaseChartView.SharedUiComponents sharedUiComponents) {
            super(context, i2, sharedUiComponents);
            this.currentAccount = i;
        }

        @Override
        public void zoomCanceled() {
            StatisticActivity.this.cancelZoom();
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
                    ChartViewData chartViewData = this.data;
                    chartViewData.childChartData = new StackLinearChartData(chartViewData.chartData, selectedDate);
                    zoomChart(false);
                    return;
                }
                if (this.data.zoomToken == null) {
                    return;
                }
                StatisticActivity.this.cancelZoom();
                final String str = this.data.zoomToken + "_" + selectedDate;
                ChartData chartData = (ChartData) StatisticActivity.this.childDataCache.get(str);
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
                StatisticActivity statisticActivity = StatisticActivity.this;
                final ZoomCancelable zoomCancelable = new ZoomCancelable();
                statisticActivity.lastCancelable = zoomCancelable;
                zoomCancelable.adapterPosition = StatisticActivity.this.recyclerListView.getChildAdapterPosition(this);
                this.chartView.legendSignatureView.showProgress(true, false);
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_loadAsyncGraph, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onZoomed$1(str, zoomCancelable, tLObject, tL_error);
                    }
                }, null, null, 0, StatisticActivity.this.chat.stats_dc, 1, true), ((BaseFragment) StatisticActivity.this).classGuid);
            }
        }

        public void lambda$onZoomed$1(final String str, final ZoomCancelable zoomCancelable, TLObject tLObject, TLRPC.TL_error tL_error) {
            final ChartData chartDataCreateChartData;
            boolean z = true;
            if (tLObject instanceof TL_stats.TL_statsGraph) {
                try {
                    JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                    ChartViewData chartViewData = this.data;
                    int i = chartViewData.graphType;
                    if (chartViewData != StatisticActivity.this.languagesData) {
                        z = false;
                    }
                    chartDataCreateChartData = StatisticActivity.createChartData(jSONObject, i, z);
                } catch (JSONException e) {
                    e.printStackTrace();
                    chartDataCreateChartData = null;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onZoomed$0(chartDataCreateChartData, str, zoomCancelable);
                    }
                });
            }
            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                Toast.makeText(getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
            }
            chartDataCreateChartData = null;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onZoomed$0(chartDataCreateChartData, str, zoomCancelable);
                }
            });
        }

        public void lambda$onZoomed$0(ChartData chartData, String str, ZoomCancelable zoomCancelable) {
            if (chartData != null) {
                StatisticActivity.this.childDataCache.put(str, chartData);
            }
            if (chartData != null && !zoomCancelable.canceled && zoomCancelable.adapterPosition >= 0) {
                View viewFindViewByPosition = StatisticActivity.this.layoutManager.findViewByPosition(zoomCancelable.adapterPosition);
                if (viewFindViewByPosition instanceof ChartCell) {
                    this.data.childChartData = chartData;
                    ChartCell chartCell = (ChartCell) viewFindViewByPosition;
                    chartCell.chartView.legendSignatureView.showProgress(false, false);
                    chartCell.zoomChart(false);
                }
            }
            StatisticActivity.this.cancelZoom();
        }

        @Override
        public void loadData(ChartViewData chartViewData) {
            chartViewData.load(this.currentAccount, ((BaseFragment) StatisticActivity.this).classGuid, StatisticActivity.this.chat.stats_dc, StatisticActivity.this.getFindChartCell(this.data));
        }
    }

    public static abstract class BaseChartCell extends FrameLayout {
        ChartHeaderView chartHeaderView;
        int chartType;
        BaseChartView chartView;
        ArrayList checkBoxes;
        ViewGroup checkboxContainer;
        ChartViewData data;
        TextView errorTextView;
        RadialProgressView progressView;
        final Window window;
        BaseChartView zoomedChartView;

        protected abstract void loadData(ChartViewData chartViewData);

        public abstract void onZoomed();

        public abstract void zoomCanceled();

        public BaseChartCell(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents) {
            this(context, i, sharedUiComponents, null);
        }

        public BaseChartCell(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.checkBoxes = new ArrayList();
            setWillNotDraw(false);
            if (context instanceof Activity) {
                this.window = ((Activity) context).getWindow();
            } else {
                this.window = null;
            }
            this.chartType = i;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.checkboxContainer = new FrameLayout(context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    int size = View.MeasureSpec.getSize(i2);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i3);
                    int childCount = getChildCount();
                    int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                    int measuredWidth = 0;
                    int measuredHeight2 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        if (getChildAt(i4).getMeasuredWidth() + measuredWidth > size) {
                            measuredHeight2 += getChildAt(i4).getMeasuredHeight();
                            measuredWidth = 0;
                        }
                        measuredWidth += getChildAt(i4).getMeasuredWidth();
                    }
                    setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? measuredHeight + measuredHeight2 + AndroidUtilities.dp(16.0f) : 0);
                }

                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    int childCount = getChildCount();
                    int measuredWidth = 0;
                    int measuredHeight = 0;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        if (getChildAt(i6).getMeasuredWidth() + measuredWidth > getMeasuredWidth()) {
                            measuredHeight += getChildAt(i6).getMeasuredHeight();
                            measuredWidth = 0;
                        }
                        getChildAt(i6).layout(measuredWidth, measuredHeight, getChildAt(i6).getMeasuredWidth() + measuredWidth, getChildAt(i6).getMeasuredHeight() + measuredHeight);
                        measuredWidth += getChildAt(i6).getMeasuredWidth();
                    }
                }
            };
            ChartHeaderView chartHeaderView = new ChartHeaderView(getContext(), resourcesProvider);
            this.chartHeaderView = chartHeaderView;
            chartHeaderView.back.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            this.chartHeaderView.back.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            if (i == 1) {
                this.chartView = new DoubleLinearChartView(getContext(), resourcesProvider);
                DoubleLinearChartView doubleLinearChartView = new DoubleLinearChartView(getContext(), resourcesProvider);
                this.zoomedChartView = doubleLinearChartView;
                doubleLinearChartView.legendSignatureView.useHour = true;
            } else if (i == 2) {
                this.chartView = new StackBarChartView(getContext(), resourcesProvider);
                StackBarChartView stackBarChartView = new StackBarChartView(getContext(), resourcesProvider);
                this.zoomedChartView = stackBarChartView;
                stackBarChartView.legendSignatureView.useHour = true;
            } else if (i == 3) {
                this.chartView = new BarChartView(getContext());
                LinearChartView linearChartView = new LinearChartView(getContext());
                this.zoomedChartView = linearChartView;
                linearChartView.legendSignatureView.useHour = true;
            } else if (i == 4) {
                StackLinearChartView stackLinearChartView = new StackLinearChartView(getContext());
                this.chartView = stackLinearChartView;
                stackLinearChartView.legendSignatureView.showPercentage = true;
                this.zoomedChartView = new PieChartView(getContext());
            } else if (i == 5) {
                this.chartView = new LinearBarChartView(getContext());
                LinearBarChartView linearBarChartView = new LinearBarChartView(getContext());
                this.zoomedChartView = linearBarChartView;
                linearBarChartView.legendSignatureView.useHour = true;
            } else {
                this.chartView = new LinearChartView(getContext());
                LinearChartView linearChartView2 = new LinearChartView(getContext());
                this.zoomedChartView = linearChartView2;
                linearChartView2.legendSignatureView.useHour = true;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            this.chartView.sharedUiComponents = sharedUiComponents;
            this.zoomedChartView.sharedUiComponents = sharedUiComponents;
            this.progressView = new RadialProgressView(context);
            frameLayout.addView(this.chartView);
            frameLayout.addView(this.chartView.legendSignatureView, -2, -2);
            frameLayout.addView(this.zoomedChartView);
            frameLayout.addView(this.zoomedChartView.legendSignatureView, -2, -2);
            frameLayout.addView(this.progressView, LayoutHelper.createFrame(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
            TextView textView = new TextView(context);
            this.errorTextView = textView;
            textView.setTextSize(1, 15.0f);
            frameLayout.addView(this.errorTextView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.progressView.setVisibility(8);
            this.errorTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray4, resourcesProvider));
            this.chartView.setDateSelectionListener(new BaseChartView.DateSelectionListener() {
                @Override
                public final void onDateSelected(long j) {
                    this.f$0.lambda$new$1(j);
                }
            });
            this.chartView.legendSignatureView.showProgress(false, false);
            this.chartView.legendSignatureView.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            this.chartView.legendSignatureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            this.zoomedChartView.legendSignatureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(view);
                }
            });
            this.chartView.setVisibility(0);
            this.zoomedChartView.setVisibility(4);
            this.chartView.setHeader(this.chartHeaderView);
            linearLayout.addView(this.chartHeaderView, LayoutHelper.createFrame(-1, 52.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
            linearLayout.addView(this.checkboxContainer, LayoutHelper.createFrame(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
            if (this.chartType == 4) {
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setClipToPadding(false);
            }
            addView(linearLayout);
        }

        public void lambda$new$0(View view) {
            zoomOut(true);
        }

        public void lambda$new$1(long j) {
            zoomCanceled();
            this.chartView.legendSignatureView.showProgress(false, false);
        }

        public void lambda$new$2(View view) {
            onZoomed();
        }

        public void lambda$new$3(View view) {
            this.zoomedChartView.animateLegend(false);
        }

        public void zoomChart(boolean z) {
            boolean z2;
            long selectedDate = this.chartView.getSelectedDate();
            ChartData chartData = this.data.childChartData;
            if (!z || this.zoomedChartView.getVisibility() != 0) {
                this.zoomedChartView.updatePicker(chartData, selectedDate);
            }
            this.zoomedChartView.setData(chartData);
            if (this.data.chartData.lines.size() > 1) {
                int i = 0;
                for (int i2 = 0; i2 < this.data.chartData.lines.size(); i2++) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= chartData.lines.size()) {
                            z2 = false;
                            break;
                        }
                        if (((ChartData.Line) chartData.lines.get(i3)).id.equals(((ChartData.Line) this.data.chartData.lines.get(i2)).id)) {
                            boolean z3 = ((CheckBoxHolder) this.checkBoxes.get(i2)).checkBox.checked;
                            ((LineViewData) this.zoomedChartView.lines.get(i3)).enabled = z3;
                            ((LineViewData) this.zoomedChartView.lines.get(i3)).alpha = z3 ? 1.0f : 0.0f;
                            ((CheckBoxHolder) this.checkBoxes.get(i2)).checkBox.enabled = true;
                            ((CheckBoxHolder) this.checkBoxes.get(i2)).checkBox.animate().alpha(1.0f).start();
                            if (z3) {
                                i++;
                            }
                            z2 = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z2) {
                        ((CheckBoxHolder) this.checkBoxes.get(i2)).checkBox.enabled = false;
                        ((CheckBoxHolder) this.checkBoxes.get(i2)).checkBox.animate().alpha(0.0f).start();
                    }
                }
                if (i == 0) {
                    for (int i4 = 0; i4 < this.data.chartData.lines.size(); i4++) {
                        ((CheckBoxHolder) this.checkBoxes.get(i4)).checkBox.enabled = true;
                        ((CheckBoxHolder) this.checkBoxes.get(i4)).checkBox.animate().alpha(1.0f).start();
                    }
                    return;
                }
            }
            this.data.activeZoom = selectedDate;
            this.chartView.legendSignatureView.setAlpha(0.0f);
            BaseChartView baseChartView = this.chartView;
            baseChartView.selectionA = 0.0f;
            baseChartView.legendShowing = false;
            baseChartView.animateLegentTo = false;
            this.zoomedChartView.updateColors();
            if (!z) {
                this.zoomedChartView.clearSelection();
                this.chartHeaderView.zoomTo(this.zoomedChartView, selectedDate, true);
            }
            this.zoomedChartView.setHeader(this.chartHeaderView);
            this.chartView.setHeader(null);
            if (z) {
                this.chartView.setVisibility(4);
                this.zoomedChartView.setVisibility(0);
                BaseChartView baseChartView2 = this.chartView;
                baseChartView2.transitionMode = 0;
                BaseChartView baseChartView3 = this.zoomedChartView;
                baseChartView3.transitionMode = 0;
                baseChartView2.enabled = false;
                baseChartView3.enabled = true;
                this.chartHeaderView.zoomTo(baseChartView3, selectedDate, false);
                return;
            }
            ValueAnimator valueAnimatorCreateTransitionAnimator = createTransitionAnimator(selectedDate, true);
            valueAnimatorCreateTransitionAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BaseChartCell.this.chartView.setVisibility(4);
                    BaseChartCell baseChartCell = BaseChartCell.this;
                    BaseChartView baseChartView4 = baseChartCell.chartView;
                    baseChartView4.enabled = false;
                    BaseChartView baseChartView5 = baseChartCell.zoomedChartView;
                    baseChartView5.enabled = true;
                    baseChartView4.transitionMode = 0;
                    baseChartView5.transitionMode = 0;
                    Window window = baseChartCell.window;
                    if (window != null) {
                        window.clearFlags(16);
                    }
                }
            });
            valueAnimatorCreateTransitionAnimator.start();
        }

        private void zoomOut(boolean z) {
            ChartData chartData;
            ChartViewData chartViewData = this.data;
            if (chartViewData == null || (chartData = chartViewData.chartData) == null || chartData.x == null) {
                return;
            }
            this.chartHeaderView.zoomOut(this.chartView, z);
            this.chartView.legendSignatureView.chevron.setAlpha(1.0f);
            this.zoomedChartView.setHeader(null);
            long selectedDate = this.chartView.getSelectedDate();
            this.data.activeZoom = 0L;
            this.chartView.setVisibility(0);
            this.zoomedChartView.clearSelection();
            this.zoomedChartView.setHeader(null);
            this.chartView.setHeader(this.chartHeaderView);
            if (!z) {
                this.zoomedChartView.setVisibility(4);
                BaseChartView baseChartView = this.chartView;
                baseChartView.enabled = true;
                this.zoomedChartView.enabled = false;
                baseChartView.invalidate();
                Window window = this.window;
                if (window != null) {
                    window.clearFlags(16);
                }
                for (CheckBoxHolder checkBoxHolder : this.checkBoxes) {
                    checkBoxHolder.checkBox.setAlpha(1.0f);
                    checkBoxHolder.checkBox.enabled = true;
                }
                return;
            }
            ValueAnimator valueAnimatorCreateTransitionAnimator = createTransitionAnimator(selectedDate, false);
            valueAnimatorCreateTransitionAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BaseChartCell.this.zoomedChartView.setVisibility(4);
                    BaseChartCell baseChartCell = BaseChartCell.this;
                    BaseChartView baseChartView2 = baseChartCell.chartView;
                    baseChartView2.transitionMode = 0;
                    BaseChartView baseChartView3 = baseChartCell.zoomedChartView;
                    baseChartView3.transitionMode = 0;
                    baseChartView2.enabled = true;
                    baseChartView3.enabled = false;
                    if (!(baseChartView2 instanceof StackLinearChartView)) {
                        baseChartView2.legendShowing = true;
                        baseChartView2.moveLegend();
                        BaseChartCell.this.chartView.animateLegend(true);
                        BaseChartCell.this.chartView.invalidate();
                    } else {
                        baseChartView2.legendShowing = false;
                        baseChartView2.clearSelection();
                    }
                    Window window2 = BaseChartCell.this.window;
                    if (window2 != null) {
                        window2.clearFlags(16);
                    }
                }
            });
            for (CheckBoxHolder checkBoxHolder2 : this.checkBoxes) {
                checkBoxHolder2.checkBox.animate().alpha(1.0f).start();
                checkBoxHolder2.checkBox.enabled = true;
            }
            valueAnimatorCreateTransitionAnimator.start();
        }

        private ValueAnimator createTransitionAnimator(long j, boolean z) {
            Window window = this.window;
            if (window != null) {
                window.setFlags(16, 16);
            }
            BaseChartView baseChartView = this.chartView;
            baseChartView.enabled = false;
            BaseChartView baseChartView2 = this.zoomedChartView;
            baseChartView2.enabled = false;
            baseChartView.transitionMode = 2;
            baseChartView2.transitionMode = 1;
            final TransitionParams transitionParams = new TransitionParams();
            ChartPickerDelegate chartPickerDelegate = this.chartView.pickerDelegate;
            transitionParams.pickerEndOut = chartPickerDelegate.pickerEnd;
            transitionParams.pickerStartOut = chartPickerDelegate.pickerStart;
            transitionParams.date = j;
            int iBinarySearch = Arrays.binarySearch(this.data.chartData.x, j);
            if (iBinarySearch < 0) {
                iBinarySearch = this.data.chartData.x.length - 1;
            }
            transitionParams.xPercentage = this.data.chartData.xPercentage[iBinarySearch];
            this.zoomedChartView.setVisibility(0);
            this.zoomedChartView.transitionParams = transitionParams;
            this.chartView.transitionParams = transitionParams;
            long j2 = 0;
            long j3 = 2147483647L;
            for (int i = 0; i < this.data.chartData.lines.size(); i++) {
                if (((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch] > j2) {
                    j2 = ((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch];
                }
                if (((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch] < j3) {
                    j3 = ((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch];
                }
            }
            float f = j3 + (j2 - j3);
            BaseChartView baseChartView3 = this.chartView;
            float f2 = baseChartView3.currentMinHeight;
            final float f3 = (f - f2) / (baseChartView3.currentMaxHeight - f2);
            baseChartView3.fillTransitionParams(transitionParams);
            this.zoomedChartView.fillTransitionParams(transitionParams);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$createTransitionAnimator$4(transitionParams, f3, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
            return valueAnimatorOfFloat;
        }

        public void lambda$createTransitionAnimator$4(TransitionParams transitionParams, float f, ValueAnimator valueAnimator) {
            BaseChartView baseChartView = this.chartView;
            float f2 = baseChartView.chartWidth;
            ChartPickerDelegate chartPickerDelegate = baseChartView.pickerDelegate;
            float f3 = chartPickerDelegate.pickerEnd;
            float f4 = chartPickerDelegate.pickerStart;
            float f5 = ((f2 / (f3 - f4)) * f4) - BaseChartView.HORIZONTAL_PADDING;
            RectF rectF = baseChartView.chartArea;
            transitionParams.pY = rectF.top + ((1.0f - f) * rectF.height());
            transitionParams.pX = (this.chartView.chartFullWidth * transitionParams.xPercentage) - f5;
            transitionParams.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.zoomedChartView.invalidate();
            this.zoomedChartView.fillTransitionParams(transitionParams);
            this.chartView.invalidate();
        }

        public void updateData(ChartViewData chartViewData, boolean z) {
            if (chartViewData == null) {
                return;
            }
            this.chartHeaderView.setTitle(chartViewData.title);
            boolean z2 = getContext().getResources().getConfiguration().orientation == 2;
            this.chartView.setLandscape(z2);
            chartViewData.viewShowed = true;
            this.zoomedChartView.setLandscape(z2);
            this.data = chartViewData;
            if (chartViewData.isEmpty || chartViewData.isError) {
                this.progressView.setVisibility(8);
                String str = chartViewData.errorMessage;
                if (str != null) {
                    this.errorTextView.setText(str);
                    if (this.errorTextView.getVisibility() == 8) {
                        this.errorTextView.setAlpha(0.0f);
                        this.errorTextView.animate().alpha(1.0f);
                    }
                    this.errorTextView.setVisibility(0);
                }
                this.checkboxContainer.removeAllViews();
                this.checkBoxes.clear();
                this.chartView.setData(null);
                return;
            }
            this.errorTextView.setVisibility(8);
            LegendSignatureView legendSignatureView = this.chartView.legendSignatureView;
            boolean z3 = chartViewData.useHourFormat;
            legendSignatureView.isTopHourChart = z3;
            this.chartHeaderView.showDate(!z3);
            if (chartViewData.chartData == null && chartViewData.token != null) {
                this.progressView.setAlpha(1.0f);
                this.progressView.setVisibility(0);
                loadData(chartViewData);
                this.chartView.setData(null);
                return;
            }
            if (!z) {
                this.progressView.setVisibility(8);
            }
            if (this.chartView.setData(chartViewData.chartData) && chartViewData.showAll) {
                this.chartView.pickerDelegate.set(0.0f, 1.0f);
            }
            this.chartHeaderView.setUseWeekInterval(chartViewData.useWeekFormat);
            this.chartView.legendSignatureView.setUseWeek(chartViewData.useWeekFormat);
            LegendSignatureView legendSignatureView2 = this.chartView.legendSignatureView;
            legendSignatureView2.zoomEnabled = this.data.zoomToken != null || this.chartType == 4;
            this.zoomedChartView.legendSignatureView.zoomEnabled = false;
            legendSignatureView2.setEnabled(legendSignatureView2.zoomEnabled);
            LegendSignatureView legendSignatureView3 = this.zoomedChartView.legendSignatureView;
            legendSignatureView3.setEnabled(legendSignatureView3.zoomEnabled);
            int size = this.chartView.lines.size();
            this.checkboxContainer.removeAllViews();
            this.checkBoxes.clear();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    new CheckBoxHolder(i).setData((LineViewData) this.chartView.lines.get(i));
                }
            }
            long j = this.data.activeZoom;
            if (j > 0) {
                this.chartView.selectDate(j);
                zoomChart(true);
            } else {
                zoomOut(false);
                this.chartView.invalidate();
            }
            recolor();
            if (z) {
                this.chartView.transitionMode = 3;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.chartView.transitionParams = new TransitionParams();
                this.chartView.transitionParams.progress = 0.0f;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$updateData$5(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        BaseChartCell baseChartCell = BaseChartCell.this;
                        baseChartCell.chartView.transitionMode = 0;
                        baseChartCell.progressView.setVisibility(8);
                    }
                });
                valueAnimatorOfFloat.start();
            }
        }

        public void lambda$updateData$5(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.progressView.setAlpha(1.0f - fFloatValue);
            this.chartView.transitionParams.progress = fFloatValue;
            this.zoomedChartView.invalidate();
            this.chartView.invalidate();
        }

        public void recolor() {
            ChartData chartData;
            ArrayList arrayList;
            int color;
            this.chartView.updateColors();
            this.chartView.invalidate();
            this.zoomedChartView.updateColors();
            this.zoomedChartView.invalidate();
            this.chartHeaderView.recolor();
            this.chartHeaderView.invalidate();
            ChartViewData chartViewData = this.data;
            if (chartViewData != null && (chartData = chartViewData.chartData) != null && (arrayList = chartData.lines) != null && arrayList.size() > 1) {
                for (int i = 0; i < this.data.chartData.lines.size(); i++) {
                    if (((ChartData.Line) this.data.chartData.lines.get(i)).colorKey >= 0 && Theme.hasThemeKey(((ChartData.Line) this.data.chartData.lines.get(i)).colorKey)) {
                        color = Theme.getColor(((ChartData.Line) this.data.chartData.lines.get(i)).colorKey);
                    } else if (ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite)) < 0.5d) {
                        color = ((ChartData.Line) this.data.chartData.lines.get(i)).colorDark;
                    } else {
                        color = ((ChartData.Line) this.data.chartData.lines.get(i)).color;
                    }
                    if (i < this.checkBoxes.size()) {
                        ((CheckBoxHolder) this.checkBoxes.get(i)).recolor(color);
                    }
                }
            }
            this.progressView.setProgressColor(Theme.getColor(Theme.key_progressCircle));
            this.errorTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray4));
        }

        class CheckBoxHolder {
            final FlatCheckBox checkBox;
            LineViewData line;
            final int position;

            CheckBoxHolder(int i) {
                this.position = i;
                FlatCheckBox flatCheckBox = new FlatCheckBox(BaseChartCell.this.getContext());
                this.checkBox = flatCheckBox;
                flatCheckBox.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                BaseChartCell.this.checkboxContainer.addView(flatCheckBox);
                BaseChartCell.this.checkBoxes.add(this);
            }

            public void setData(final LineViewData lineViewData) {
                this.line = lineViewData;
                this.checkBox.setText(lineViewData.line.name);
                this.checkBox.setChecked(lineViewData.enabled, false);
                this.checkBox.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
                this.checkBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setData$0(lineViewData, view);
                    }
                });
                this.checkBox.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return this.f$0.lambda$setData$1(lineViewData, view);
                    }
                });
            }

            public void lambda$setData$0(LineViewData lineViewData, View view) {
                if (this.checkBox.enabled) {
                    int size = BaseChartCell.this.checkBoxes.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        } else if (i != this.position && ((CheckBoxHolder) BaseChartCell.this.checkBoxes.get(i)).checkBox.enabled && ((CheckBoxHolder) BaseChartCell.this.checkBoxes.get(i)).checkBox.checked) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    BaseChartCell.this.zoomCanceled();
                    if (z) {
                        this.checkBox.denied();
                        return;
                    }
                    FlatCheckBox flatCheckBox = this.checkBox;
                    flatCheckBox.setChecked(!flatCheckBox.checked);
                    lineViewData.enabled = this.checkBox.checked;
                    BaseChartCell.this.chartView.onCheckChanged();
                    BaseChartCell baseChartCell = BaseChartCell.this;
                    if (baseChartCell.data.activeZoom <= 0 || this.position >= baseChartCell.zoomedChartView.lines.size()) {
                        return;
                    }
                    ((LineViewData) BaseChartCell.this.zoomedChartView.lines.get(this.position)).enabled = this.checkBox.checked;
                    BaseChartCell.this.zoomedChartView.onCheckChanged();
                }
            }

            public boolean lambda$setData$1(LineViewData lineViewData, View view) {
                if (!this.checkBox.enabled) {
                    return false;
                }
                BaseChartCell.this.zoomCanceled();
                int size = BaseChartCell.this.checkBoxes.size();
                for (int i = 0; i < size; i++) {
                    ((CheckBoxHolder) BaseChartCell.this.checkBoxes.get(i)).checkBox.setChecked(false);
                    ((CheckBoxHolder) BaseChartCell.this.checkBoxes.get(i)).line.enabled = false;
                    BaseChartCell baseChartCell = BaseChartCell.this;
                    if (baseChartCell.data.activeZoom > 0 && i < baseChartCell.zoomedChartView.lines.size()) {
                        ((LineViewData) BaseChartCell.this.zoomedChartView.lines.get(i)).enabled = false;
                    }
                }
                this.checkBox.setChecked(true);
                lineViewData.enabled = true;
                BaseChartCell.this.chartView.onCheckChanged();
                BaseChartCell baseChartCell2 = BaseChartCell.this;
                if (baseChartCell2.data.activeZoom > 0) {
                    ((LineViewData) baseChartCell2.zoomedChartView.lines.get(this.position)).enabled = true;
                    BaseChartCell.this.zoomedChartView.onCheckChanged();
                }
                return true;
            }

            public void recolor(int i) {
                this.checkBox.recolor(i);
            }
        }
    }

    public void cancelZoom() {
        ZoomCancelable zoomCancelable = this.lastCancelable;
        if (zoomCancelable != null) {
            zoomCancelable.canceled = true;
        }
        int childCount = this.recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof ChartCell) {
                ((ChartCell) childAt).chartView.legendSignatureView.showProgress(false, true);
            }
        }
    }

    public static class ChartViewData {
        public long activeZoom;
        public ChartData chartData;
        ChartData childChartData;
        public String errorMessage;
        final int graphType;
        public boolean isEmpty;
        public boolean isError;
        public boolean isLanguages;
        public boolean loading;
        public boolean showAll;
        final String title;
        String token;
        public boolean useHourFormat;
        public boolean useWeekFormat;
        public boolean viewShowed;
        String zoomToken;

        public ChartViewData(String str, int i) {
            this.title = str;
            this.graphType = i;
        }

        public void load(int i, int i2, int i3, final Utilities.Callback0Return callback0Return) {
            if (this.loading) {
                return;
            }
            this.loading = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.token;
            ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$1(callback0Return, tLObject, tL_error);
                }
            }, null, null, 0, i3, 1, true), i2);
        }

        public void lambda$load$1(final Utilities.Callback0Return callback0Return, TLObject tLObject, TLRPC.TL_error tL_error) {
            final String str;
            long[] jArr;
            final ChartData chartData = null;
            String str2 = null;
            chartData = null;
            chartData = null;
            if (tL_error == null) {
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        ChartData chartDataCreateChartData = StatisticActivity.createChartData(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), this.graphType, this.isLanguages);
                        try {
                            str2 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (this.graphType == 4 && (jArr = chartDataCreateChartData.x) != null && jArr.length > 0) {
                                long j = jArr[jArr.length - 1];
                                this.childChartData = new StackLinearChartData(chartDataCreateChartData, j);
                                this.activeZoom = j;
                            }
                            chartData = chartDataCreateChartData;
                            str = str2;
                        } catch (JSONException e) {
                            e = e;
                            String str3 = str2;
                            chartData = chartDataCreateChartData;
                            str = str3;
                            e.printStackTrace();
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    this.isEmpty = false;
                    this.isError = true;
                    this.errorMessage = ((TL_stats.TL_statsGraphError) tLObject).error;
                }
            } else {
                str = null;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(chartData, str, callback0Return);
                }
            });
        }

        public void lambda$load$0(ChartData chartData, String str, Utilities.Callback0Return callback0Return) {
            this.loading = false;
            this.chartData = chartData;
            this.zoomToken = str;
            BaseChartCell baseChartCell = (BaseChartCell) callback0Return.run();
            if (baseChartCell != null) {
                baseChartCell.updateData(this, true);
            }
        }
    }

    public static class RecentPostInfo {
        public TL_stats.PostInteractionCounters counters;
        public MessageObject message;

        public long getDate() {
            MessageObject messageObject = this.message;
            if (messageObject == null) {
                return 0L;
            }
            return messageObject.messageOwner.date;
        }

        public boolean isStory() {
            return this.counters instanceof TL_stats.TL_postInteractionCountersStory;
        }

        public int getViews() {
            TL_stats.PostInteractionCounters postInteractionCounters = this.counters;
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views;
            }
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views;
            }
            return 0;
        }

        public int getReactions() {
            TL_stats.PostInteractionCounters postInteractionCounters = this.counters;
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).reactions;
            }
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).reactions;
            }
            return 0;
        }

        public int getForwards() {
            TL_stats.PostInteractionCounters postInteractionCounters = this.counters;
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).forwards;
            }
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).forwards;
            }
            return 0;
        }

        public int getId() {
            TL_stats.PostInteractionCounters postInteractionCounters = this.counters;
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).msg_id;
            }
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).story_id;
            }
            return 0;
        }
    }

    public void loadMessages() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        int size = this.recentPostsAll.size();
        int i = 0;
        for (int i2 = this.recentPostIdtoIndexMap.get(this.loadFromId); i2 < size; i2++) {
            if (((RecentPostInfo) this.recentPostsAll.get(i2)).message == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((RecentPostInfo) this.recentPostsAll.get(i2)).getId()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
        this.messagesIsLoading = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadMessages$11(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadMessages$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new MessageObject(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadMessages$10(arrayList);
            }
        });
    }

    public void lambda$loadMessages$10(ArrayList arrayList) {
        this.messagesIsLoading = false;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            int i2 = this.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
            if (i2 >= 0 && ((RecentPostInfo) this.recentPostsAll.get(i2)).getId() == messageObject.getId()) {
                ((RecentPostInfo) this.recentPostsAll.get(i2)).message = messageObject;
            }
        }
        this.recentPostsLoaded.clear();
        int size2 = this.recentPostsAll.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecentPostInfo recentPostInfo = (RecentPostInfo) this.recentPostsAll.get(i3);
            if (recentPostInfo.message == null) {
                this.loadFromId = recentPostInfo.getId();
                break;
            }
            this.recentPostsLoaded.add(recentPostInfo);
        }
        sortAllLoadedData();
        this.recyclerListView.setItemAnimator(null);
        this.diffUtilsCallback.update();
    }

    private void recolorRecyclerItem(View view) {
        if (view instanceof ChartCell) {
            ((ChartCell) view).recolor();
            return;
        }
        if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(ApplicationLoader.applicationContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow), 0, 0);
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
            return;
        }
        if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            ((OverviewCell) view).updateColors();
        }
    }

    private static class DiffUtilsCallback extends DiffUtil.Callback {
        int actionsCell;
        private final Adapter adapter;
        int count;
        int endPosts;
        int folowersCell;
        int groupMembersCell;
        int growCell;
        int interactionsCell;
        int ivInteractionsCell;
        int languagesCell;
        private final LinearLayoutManager layoutManager;
        int membersLanguageCell;
        int messagesCell;
        int newFollowersBySourceCell;
        int newMembersBySourceCell;
        int notificationsCell;
        SparseIntArray positionToTypeMap;
        int reactionsByEmotionCell;
        int startPosts;
        int storyInteractionsCell;
        int storyReactionsByEmotionCell;
        int topDayOfWeeksCell;
        int topHourseCell;
        int viewsBySourceCell;

        private DiffUtilsCallback(Adapter adapter, LinearLayoutManager linearLayoutManager) {
            this.positionToTypeMap = new SparseIntArray();
            this.growCell = -1;
            this.folowersCell = -1;
            this.interactionsCell = -1;
            this.ivInteractionsCell = -1;
            this.viewsBySourceCell = -1;
            this.newFollowersBySourceCell = -1;
            this.languagesCell = -1;
            this.topHourseCell = -1;
            this.notificationsCell = -1;
            this.reactionsByEmotionCell = -1;
            this.storyInteractionsCell = -1;
            this.storyReactionsByEmotionCell = -1;
            this.groupMembersCell = -1;
            this.newMembersBySourceCell = -1;
            this.membersLanguageCell = -1;
            this.messagesCell = -1;
            this.actionsCell = -1;
            this.topDayOfWeeksCell = -1;
            this.startPosts = -1;
            this.endPosts = -1;
            this.adapter = adapter;
            this.layoutManager = linearLayoutManager;
        }

        public void saveOldState() {
            this.positionToTypeMap.clear();
            this.count = this.adapter.getItemCount();
            for (int i = 0; i < this.count; i++) {
                this.positionToTypeMap.put(i, this.adapter.getItemViewType(i));
            }
            Adapter adapter = this.adapter;
            this.growCell = adapter.growCell;
            this.folowersCell = adapter.folowersCell;
            this.interactionsCell = adapter.interactionsCell;
            this.ivInteractionsCell = adapter.ivInteractionsCell;
            this.viewsBySourceCell = adapter.viewsBySourceCell;
            this.newFollowersBySourceCell = adapter.newFollowersBySourceCell;
            this.languagesCell = adapter.languagesCell;
            this.topHourseCell = adapter.topHourseCell;
            this.notificationsCell = adapter.notificationsCell;
            this.startPosts = adapter.recentPostsStartRow;
            this.endPosts = adapter.recentPostsEndRow;
            this.reactionsByEmotionCell = adapter.reactionsByEmotionCell;
            this.storyInteractionsCell = adapter.storyInteractionsCell;
            this.storyReactionsByEmotionCell = adapter.storyReactionsByEmotionCell;
            this.groupMembersCell = adapter.groupMembersCell;
            this.newMembersBySourceCell = adapter.newMembersBySourceCell;
            this.membersLanguageCell = adapter.membersLanguageCell;
            this.messagesCell = adapter.messagesCell;
            this.actionsCell = adapter.actionsCell;
            this.topDayOfWeeksCell = adapter.topDayOfWeeksCell;
        }

        @Override
        public int getOldListSize() {
            return this.count;
        }

        @Override
        public int getNewListSize() {
            return this.adapter.count;
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            if (this.positionToTypeMap.get(i) == 13 && this.adapter.getItemViewType(i2) == 13) {
                return true;
            }
            if (this.positionToTypeMap.get(i) == 10 && this.adapter.getItemViewType(i2) == 10) {
                return true;
            }
            int i3 = this.startPosts;
            if (i >= i3 && i <= this.endPosts) {
                return i - i3 == i2 - this.adapter.recentPostsStartRow;
            }
            if (i == this.growCell && i2 == this.adapter.growCell) {
                return true;
            }
            if (i == this.folowersCell && i2 == this.adapter.folowersCell) {
                return true;
            }
            if (i == this.interactionsCell && i2 == this.adapter.interactionsCell) {
                return true;
            }
            if (i == this.ivInteractionsCell && i2 == this.adapter.ivInteractionsCell) {
                return true;
            }
            if (i == this.viewsBySourceCell && i2 == this.adapter.viewsBySourceCell) {
                return true;
            }
            if (i == this.newFollowersBySourceCell && i2 == this.adapter.newFollowersBySourceCell) {
                return true;
            }
            if (i == this.languagesCell && i2 == this.adapter.languagesCell) {
                return true;
            }
            if (i == this.topHourseCell && i2 == this.adapter.topHourseCell) {
                return true;
            }
            if (i == this.notificationsCell && i2 == this.adapter.notificationsCell) {
                return true;
            }
            if (i == this.groupMembersCell && i2 == this.adapter.groupMembersCell) {
                return true;
            }
            if (i == this.newMembersBySourceCell && i2 == this.adapter.newMembersBySourceCell) {
                return true;
            }
            if (i == this.membersLanguageCell && i2 == this.adapter.membersLanguageCell) {
                return true;
            }
            if (i == this.messagesCell && i2 == this.adapter.messagesCell) {
                return true;
            }
            if (i == this.actionsCell && i2 == this.adapter.actionsCell) {
                return true;
            }
            if (i == this.topDayOfWeeksCell && i2 == this.adapter.topDayOfWeeksCell) {
                return true;
            }
            if (i == this.reactionsByEmotionCell && i2 == this.adapter.reactionsByEmotionCell) {
                return true;
            }
            if (i == this.storyInteractionsCell && i2 == this.adapter.storyInteractionsCell) {
                return true;
            }
            return i == this.storyReactionsByEmotionCell && i2 == this.adapter.storyReactionsByEmotionCell;
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return this.positionToTypeMap.get(i) == this.adapter.getItemViewType(i2);
        }

        public void update() {
            int i;
            long itemId;
            int top;
            View viewFindViewByPosition;
            saveOldState();
            this.adapter.update();
            int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            while (true) {
                i = 0;
                if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    itemId = -1;
                    top = 0;
                    break;
                } else {
                    if (this.adapter.getItemId(iFindFirstVisibleItemPosition) != -1 && (viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                        itemId = this.adapter.getItemId(iFindFirstVisibleItemPosition);
                        top = viewFindViewByPosition.getTop();
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                }
            }
            DiffUtil.calculateDiff(this).dispatchUpdatesTo(this.adapter);
            if (itemId != -1) {
                while (true) {
                    if (i >= this.adapter.getItemCount()) {
                        i = -1;
                        break;
                    } else if (this.adapter.getItemId(i) == itemId) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i > 0) {
                    this.layoutManager.scrollToPositionWithOffset(i, top);
                }
            }
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ChartViewData chartViewData;
        ChartViewData chartViewData2;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$12();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        int i3 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"message"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"views"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"shares"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"likes"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"date"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{ChartHeaderView.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i3));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartSignature));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartSignatureAlpha));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartHintLine));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartActiveLine));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartInactivePickerChart));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_statisticChartActivePickerChart));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGreenText2));
        int i5 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i5));
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer != null ? chatAvatarContainer.getTitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_player_actionBarTitle));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer2 != null ? chatAvatarContainer2.getSubtitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, (Class[]) null, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_player_actionBarSubtitle, (Object) null));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_statisticChartLineEmpty));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        if (this.isMegagroup) {
            for (int i6 = 0; i6 < 6; i6++) {
                if (i6 == 0) {
                    chartViewData2 = this.growthData;
                } else if (i6 == 1) {
                    chartViewData2 = this.groupMembersData;
                } else if (i6 == 2) {
                    chartViewData2 = this.newMembersBySourceData;
                } else if (i6 == 3) {
                    chartViewData2 = this.membersLanguageData;
                } else if (i6 == 4) {
                    chartViewData2 = this.messagesData;
                } else {
                    chartViewData2 = this.actionsData;
                }
                putColorFromData(chartViewData2, arrayList, themeDescriptionDelegate);
            }
        } else {
            for (int i7 = 0; i7 < 12; i7++) {
                if (i7 == 0) {
                    chartViewData = this.growthData;
                } else if (i7 == 1) {
                    chartViewData = this.followersData;
                } else if (i7 == 2) {
                    chartViewData = this.interactionsData;
                } else if (i7 == 3) {
                    chartViewData = this.ivInteractionsData;
                } else if (i7 == 4) {
                    chartViewData = this.viewsBySourceData;
                } else if (i7 == 5) {
                    chartViewData = this.newFollowersBySourceData;
                } else if (i7 == 6) {
                    chartViewData = this.notificationsData;
                } else if (i7 == 7) {
                    chartViewData = this.topHoursData;
                } else if (i7 == 8) {
                    chartViewData = this.languagesData;
                } else if (i7 == 9) {
                    chartViewData = this.reactionsByEmotionData;
                } else if (i7 == 10) {
                    chartViewData = this.storyInteractionsData;
                } else {
                    chartViewData = this.storyReactionsByEmotionData;
                }
                putColorFromData(chartViewData, arrayList, themeDescriptionDelegate);
            }
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$12() {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                recolorRecyclerItem(this.recyclerListView.getChildAt(i));
            }
            int hiddenChildCount = this.recyclerListView.getHiddenChildCount();
            for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                recolorRecyclerItem(this.recyclerListView.getHiddenChildAt(i2));
            }
            int cachedChildCount = this.recyclerListView.getCachedChildCount();
            for (int i3 = 0; i3 < cachedChildCount; i3++) {
                recolorRecyclerItem(this.recyclerListView.getCachedChildAt(i3));
            }
            int attachedScrapChildCount = this.recyclerListView.getAttachedScrapChildCount();
            for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
                recolorRecyclerItem(this.recyclerListView.getAttachedScrapChildAt(i4));
            }
            this.recyclerListView.getRecycledViewPool().clear();
        }
        BaseChartView.SharedUiComponents sharedUiComponents = this.sharedUi;
        if (sharedUiComponents != null) {
            sharedUiComponents.invalidate();
        }
    }

    public static void putColorFromData(ChartViewData chartViewData, ArrayList arrayList, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        ChartData chartData;
        if (chartViewData == null || (chartData = chartViewData.chartData) == null) {
            return;
        }
        for (ChartData.Line line : chartData.lines) {
            int i = line.colorKey;
            if (i >= 0) {
                if (!Theme.hasThemeKey(i)) {
                    Theme.setColor(line.colorKey, Theme.isCurrentThemeNight() ? line.colorDark : line.color, false);
                    Theme.setDefaultColor(line.colorKey, line.color);
                }
                arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, line.colorKey));
            }
        }
    }

    public static class OverviewChannelData {
        String followersPrimary;
        String followersSecondary;
        String followersTitle;
        boolean followersUp;
        String notificationsPrimary;
        String notificationsTitle;
        String reactionsPerPostPrimary;
        String reactionsPerPostSecondary;
        String reactionsPerPostTitle;
        boolean reactionsPerPostUp;
        boolean reactionsPerPostVisible;
        String reactionsPerStoryPrimary;
        String reactionsPerStorySecondary;
        String reactionsPerStoryTitle;
        boolean reactionsPerStoryUp;
        boolean reactionsPerStoryVisible;
        String sharesPerStoryPrimary;
        String sharesPerStorySecondary;
        String sharesPerStoryTitle;
        boolean sharesPerStoryUp;
        boolean sharesPerStoryVisible;
        String sharesPrimary;
        String sharesSecondary;
        String sharesTitle;
        boolean sharesUp;
        String viewsPerStoryPrimary;
        String viewsPerStorySecondary;
        String viewsPerStoryTitle;
        boolean viewsPerStoryUp;
        boolean viewsPerStoryVisible;
        String viewsPrimary;
        String viewsSecondary;
        String viewsTitle;
        boolean viewsUp;

        public static class Quadruple {
            public Object fist;
            public Object fourth;
            public Object second;
            public Object third;

            public Quadruple(Object obj, Object obj2, Object obj3, Object obj4) {
                this.fist = obj;
                this.second = obj2;
                this.third = obj3;
                this.fourth = obj4;
            }
        }

        private Quadruple prepare(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
            boolean z = true;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            String wholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
            String str = "";
            if (i != 0 && fAbs != 0.0f) {
                int i2 = (int) fAbs;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    str = String.format(locale, "%s (%d%s)", sb.toString(), Integer.valueOf(i2), "%");
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    str = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            boolean z2 = i >= 0;
            if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
                z = false;
            }
            return new Quadruple(wholeNumber, str, Boolean.valueOf(z2), Boolean.valueOf(z));
        }

        public OverviewChannelData(TL_stats.TL_broadcastStats tL_broadcastStats) {
            Quadruple quadruplePrepare = prepare(tL_broadcastStats.reactions_per_post);
            this.reactionsPerPostTitle = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            this.reactionsPerPostPrimary = (String) quadruplePrepare.fist;
            this.reactionsPerPostSecondary = (String) quadruplePrepare.second;
            this.reactionsPerPostUp = ((Boolean) quadruplePrepare.third).booleanValue();
            this.reactionsPerPostVisible = ((Boolean) quadruplePrepare.fourth).booleanValue();
            Quadruple quadruplePrepare2 = prepare(tL_broadcastStats.reactions_per_story);
            this.reactionsPerStoryTitle = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            this.reactionsPerStoryPrimary = (String) quadruplePrepare2.fist;
            this.reactionsPerStorySecondary = (String) quadruplePrepare2.second;
            this.reactionsPerStoryUp = ((Boolean) quadruplePrepare2.third).booleanValue();
            this.reactionsPerStoryVisible = ((Boolean) quadruplePrepare2.fourth).booleanValue();
            Quadruple quadruplePrepare3 = prepare(tL_broadcastStats.views_per_story);
            this.viewsPerStoryTitle = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            this.viewsPerStoryPrimary = (String) quadruplePrepare3.fist;
            this.viewsPerStorySecondary = (String) quadruplePrepare3.second;
            this.viewsPerStoryUp = ((Boolean) quadruplePrepare3.third).booleanValue();
            this.viewsPerStoryVisible = ((Boolean) quadruplePrepare3.fourth).booleanValue();
            Quadruple quadruplePrepare4 = prepare(tL_broadcastStats.shares_per_story);
            this.sharesPerStoryTitle = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            this.sharesPerStoryPrimary = (String) quadruplePrepare4.fist;
            this.sharesPerStorySecondary = (String) quadruplePrepare4.second;
            this.sharesPerStoryUp = ((Boolean) quadruplePrepare4.third).booleanValue();
            this.sharesPerStoryVisible = ((Boolean) quadruplePrepare4.fourth).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.followersTitle = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            this.followersPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i == 0 || fAbs == 0.0f) {
                this.followersSecondary = "";
            } else {
                int i2 = (int) fAbs;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.followersSecondary = String.format(locale, "%s (%d%s)", sb.toString(), Integer.valueOf(i2), "%");
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.followersSecondary = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            this.followersUp = i >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float fAbs2 = d4 == 0.0d ? 0.0f : Math.abs((i3 / ((float) d4)) * 100.0f);
            this.sharesTitle = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            this.sharesPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i3 == 0 || fAbs2 == 0.0f) {
                this.sharesSecondary = "";
            } else {
                int i4 = (int) fAbs2;
                if (fAbs2 == i4) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i3 > 0 ? "+" : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    this.sharesSecondary = String.format(locale3, "%s (%d%s)", sb3.toString(), Integer.valueOf(i4), "%");
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i3 > 0 ? "+" : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    this.sharesSecondary = String.format(locale4, "%s (%.1f%s)", sb4.toString(), Float.valueOf(fAbs2), "%");
                }
            }
            this.sharesUp = i3 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i5 = (int) (d5 - d6);
            float fAbs3 = d6 == 0.0d ? 0.0f : Math.abs((i5 / ((float) d6)) * 100.0f);
            this.viewsTitle = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            this.viewsPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i5 == 0 || fAbs3 == 0.0f) {
                this.viewsSecondary = "";
            } else {
                int i6 = (int) fAbs3;
                if (fAbs3 == i6) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i5 <= 0 ? "" : "+");
                    sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    this.viewsSecondary = String.format(locale5, "%s (%d%s)", sb5.toString(), Integer.valueOf(i6), "%");
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i5 <= 0 ? "" : "+");
                    sb6.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    this.viewsSecondary = String.format(locale6, "%s (%.1f%s)", sb6.toString(), Float.valueOf(fAbs3), "%");
                }
            }
            this.viewsUp = i5 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            this.notificationsTitle = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i7 = (int) f;
            if (f == i7) {
                this.notificationsPrimary = String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(i7), "%");
            } else {
                this.notificationsPrimary = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f), "%");
            }
        }
    }

    public static class OverviewChatData {
        String membersPrimary;
        String membersSecondary;
        String membersTitle;
        boolean membersUp;
        String messagesPrimary;
        String messagesSecondary;
        String messagesTitle;
        boolean messagesUp;
        String postingMembersPrimary;
        String postingMembersSecondary;
        String postingMembersTitle;
        boolean postingMembersUp;
        String viewingMembersPrimary;
        String viewingMembersSecondary;
        String viewingMembersTitle;
        boolean viewingMembersUp;

        public OverviewChatData(TL_stats.TL_megagroupStats tL_megagroupStats) {
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_megagroupStats.members;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.membersTitle = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            this.membersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i == 0 || fAbs == 0.0f) {
                this.membersSecondary = "";
            } else {
                int i2 = (int) fAbs;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.membersSecondary = String.format(locale, "%s (%d%s)", sb.toString(), Integer.valueOf(i2), "%");
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.membersSecondary = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            this.membersUp = i >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_megagroupStats.viewers;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float fAbs2 = d4 == 0.0d ? 0.0f : Math.abs((i3 / ((float) d4)) * 100.0f);
            this.viewingMembersTitle = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            this.viewingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i3 == 0 || fAbs2 == 0.0f) {
                this.viewingMembersSecondary = "";
            } else {
                Locale locale3 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i3 > 0 ? "+" : "");
                sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                this.viewingMembersSecondary = String.format(locale3, "%s", sb3.toString());
            }
            this.viewingMembersUp = i3 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_megagroupStats.posters;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i4 = (int) (d5 - d6);
            float fAbs3 = d6 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d6)) * 100.0f);
            this.postingMembersTitle = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            this.postingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i4 == 0 || fAbs3 == 0.0f) {
                this.postingMembersSecondary = "";
            } else {
                Locale locale4 = Locale.ENGLISH;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i4 > 0 ? "+" : "");
                sb4.append(AndroidUtilities.formatWholeNumber(i4, 0));
                this.postingMembersSecondary = String.format(locale4, "%s", sb4.toString());
            }
            this.postingMembersUp = i4 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.messages;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i5 = (int) (d7 - d8);
            float fAbs4 = d8 == 0.0d ? 0.0f : Math.abs((i5 / ((float) d8)) * 100.0f);
            this.messagesTitle = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            this.messagesPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i5 == 0 || fAbs4 == 0.0f) {
                this.messagesSecondary = "";
            } else {
                Locale locale5 = Locale.ENGLISH;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(i5 <= 0 ? "" : "+");
                sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                this.messagesSecondary = String.format(locale5, "%s", sb5.toString());
            }
            this.messagesUp = i5 >= 0;
        }
    }

    public static class OverviewCell extends LinearLayout {
        TextView[] primary;
        TextView[] secondary;
        TextView[] title;

        public OverviewCell(Context context) {
            this(context, 2);
        }

        public OverviewCell(Context context, int i) {
            super(context);
            int i2 = i * 2;
            this.primary = new TextView[i2];
            this.secondary = new TextView[i2];
            this.title = new TextView[i2];
            setOrientation(1);
            setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            for (int i3 = 0; i3 < i; i3++) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i4 = 0; i4 < 2; i4++) {
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    int i5 = (i3 * 2) + i4;
                    this.primary[i5] = new TextView(context);
                    this.secondary[i5] = new TextView(context);
                    this.title[i5] = new TextView(context);
                    this.primary[i5].setTypeface(AndroidUtilities.bold());
                    this.primary[i5].setTextSize(1, 17.0f);
                    this.title[i5].setTextSize(1, 13.0f);
                    this.title[i5].setGravity(3);
                    this.secondary[i5].setTextSize(1, 13.0f);
                    this.secondary[i5].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                    linearLayout3.addView(this.primary[i5]);
                    linearLayout3.addView(this.secondary[i5]);
                    linearLayout2.addView(linearLayout3);
                    linearLayout2.addView(this.title[i5]);
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
                }
                addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
            }
        }

        public void setData(OverviewChannelData overviewChannelData, TLRPC.ChatFull chatFull) {
            int i = 0;
            int i2 = 0;
            while (true) {
                TextView[] textViewArr = this.primary;
                if (i < textViewArr.length) {
                    switch (i) {
                        case 0:
                            textViewArr[i2].setText(overviewChannelData.followersPrimary);
                            this.secondary[i2].setText(overviewChannelData.followersSecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.followersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.followersTitle);
                            break;
                        case 1:
                            textViewArr[i2].setText(overviewChannelData.notificationsPrimary);
                            this.secondary[i2].setText("");
                            this.title[i2].setText(overviewChannelData.notificationsTitle);
                            break;
                        case 2:
                            textViewArr[i2].setText(overviewChannelData.viewsPrimary);
                            this.secondary[i2].setText(overviewChannelData.viewsSecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.viewsUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.viewsTitle);
                            break;
                        case 3:
                            textViewArr[i2].setText(overviewChannelData.viewsPerStoryPrimary);
                            this.secondary[i2].setText(overviewChannelData.viewsPerStorySecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.viewsPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.viewsPerStoryTitle);
                            if (overviewChannelData.viewsPerStoryVisible) {
                            }
                            i++;
                            break;
                        case 4:
                            textViewArr[i2].setText(overviewChannelData.sharesPrimary);
                            this.secondary[i2].setText(overviewChannelData.sharesSecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.sharesUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.sharesTitle);
                            break;
                        case 5:
                            textViewArr[i2].setText(overviewChannelData.sharesPerStoryPrimary);
                            this.secondary[i2].setText(overviewChannelData.sharesPerStorySecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.sharesPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.sharesPerStoryTitle);
                            if (overviewChannelData.sharesPerStoryVisible) {
                            }
                            i++;
                            break;
                        case 6:
                            textViewArr[i2].setText(overviewChannelData.reactionsPerPostPrimary);
                            this.secondary[i2].setText(overviewChannelData.reactionsPerPostSecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.reactionsPerPostUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.reactionsPerPostTitle);
                            if (overviewChannelData.reactionsPerPostVisible) {
                            }
                            i++;
                            break;
                        case 7:
                            textViewArr[i2].setText(overviewChannelData.reactionsPerStoryPrimary);
                            this.secondary[i2].setText(overviewChannelData.reactionsPerStorySecondary);
                            this.secondary[i2].setTag(Integer.valueOf(overviewChannelData.reactionsPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                            this.title[i2].setText(overviewChannelData.reactionsPerStoryTitle);
                            if (overviewChannelData.reactionsPerStoryVisible) {
                            }
                            i++;
                            break;
                        default:
                            continue;
                            i++;
                            break;
                    }
                    i2++;
                    i++;
                } else {
                    while (i2 < this.primary.length) {
                        ((ViewGroup) this.title[i2].getParent()).setVisibility(8);
                        i2++;
                    }
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        ViewGroup viewGroup = (ViewGroup) getChildAt(i3);
                        if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                            viewGroup.setVisibility(8);
                        }
                    }
                    updateColors();
                    return;
                }
            }
        }

        public void setData(OverviewChatData overviewChatData) {
            this.primary[0].setText(overviewChatData.membersPrimary);
            this.primary[1].setText(overviewChatData.messagesPrimary);
            this.primary[2].setText(overviewChatData.viewingMembersPrimary);
            this.primary[3].setText(overviewChatData.postingMembersPrimary);
            this.secondary[0].setText(overviewChatData.membersSecondary);
            this.secondary[0].setTag(Integer.valueOf(overviewChatData.membersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            this.secondary[1].setText(overviewChatData.messagesSecondary);
            this.secondary[1].setTag(Integer.valueOf(overviewChatData.messagesUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            this.secondary[2].setText(overviewChatData.viewingMembersSecondary);
            this.secondary[2].setTag(Integer.valueOf(overviewChatData.viewingMembersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            this.secondary[3].setText(overviewChatData.postingMembersSecondary);
            this.secondary[3].setTag(Integer.valueOf(overviewChatData.postingMembersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            this.title[0].setText(overviewChatData.membersTitle);
            this.title[1].setText(overviewChatData.messagesTitle);
            this.title[2].setText(overviewChatData.viewingMembersTitle);
            this.title[3].setText(overviewChatData.postingMembersTitle);
            updateColors();
        }

        public void setData(int i, String str, String str2, String str3) {
            this.primary[i].setText(str);
            this.secondary[i].setText(str2);
            this.title[i].setText(str3);
            updateColors();
        }

        public void updateColors() {
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.primary;
                if (i >= textViewArr.length) {
                    return;
                }
                TextView textView = textViewArr[i];
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textView.setTextColor(Theme.getColor(i2));
                this.title[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
                Integer num = (Integer) this.secondary[i].getTag();
                if (num != null) {
                    this.secondary[i].setTextColor(Theme.getColor(num.intValue()));
                } else {
                    this.secondary[i].setTextColor(Theme.getColor(i2));
                }
                i++;
            }
        }
    }

    public static class MemberData {
        public String description;
        public TLRPC.User user;
        long user_id;

        public static MemberData from(TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster, ArrayList arrayList) {
            MemberData memberData = new MemberData();
            long j = tL_statsGroupTopPoster.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            StringBuilder sb = new StringBuilder();
            int i = tL_statsGroupTopPoster.messages;
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("messages", i, new Object[0]));
            }
            if (tL_statsGroupTopPoster.avg_chars > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
            }
            memberData.description = sb.toString();
            return memberData;
        }

        public static MemberData from(TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin, ArrayList arrayList) {
            MemberData memberData = new MemberData();
            long j = tL_statsGroupTopAdmin.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            StringBuilder sb = new StringBuilder();
            int i = tL_statsGroupTopAdmin.deleted;
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("Deletions", i, new Object[0]));
            }
            if (tL_statsGroupTopAdmin.banned > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
            }
            if (tL_statsGroupTopAdmin.kicked > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
            }
            memberData.description = sb.toString();
            return memberData;
        }

        public static MemberData from(TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter, ArrayList arrayList) {
            MemberData memberData = new MemberData();
            long j = tL_statsGroupTopInviter.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            int i = tL_statsGroupTopInviter.invitations;
            if (i > 0) {
                memberData.description = LocaleController.formatPluralString("Invitations", i, new Object[0]);
            } else {
                memberData.description = "";
            }
            return memberData;
        }

        public static TLRPC.User find(long j, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.User user = (TLRPC.User) it.next();
                if (user.id == j) {
                    return user;
                }
            }
            return null;
        }

        public void onClick(BaseFragment baseFragment) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.user.id);
            MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.user, false);
            baseFragment.presentFragment(new ProfileActivity(bundle));
        }

        public void onLongClick(TLRPC.ChatFull chatFull, StatisticActivity statisticActivity, AlertDialog[] alertDialogArr) {
            onLongClick(chatFull, statisticActivity, alertDialogArr, true);
        }

        private void onLongClick(final TLRPC.ChatFull chatFull, final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, boolean z) {
            ArrayList arrayList;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
            final boolean z2;
            int i;
            String str;
            ArrayList<TLRPC.ChatParticipant> arrayList2;
            MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.user, false);
            ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!z || (arrayList2 = chatFull.participants.participants) == null) {
                arrayList = arrayList5;
                tL_chatChannelParticipant = null;
                tL_chatChannelParticipant2 = null;
            } else {
                int size = arrayList2.size();
                int i2 = 0;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = null;
                tL_chatChannelParticipant2 = null;
                while (i2 < size) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i2);
                    long j = chatParticipant.user_id;
                    ArrayList arrayList6 = arrayList5;
                    if (j == this.user.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                        tL_chatChannelParticipant3 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                    }
                    if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                        tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                    }
                    i2++;
                    arrayList5 = arrayList6;
                }
                arrayList = arrayList5;
                tL_chatChannelParticipant = tL_chatChannelParticipant3;
            }
            arrayList3.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
            ArrayList arrayList7 = arrayList;
            arrayList7.add(Integer.valueOf(R.drawable.msg_openprofile));
            arrayList4.add(2);
            arrayList3.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
            arrayList7.add(Integer.valueOf(R.drawable.msg_msgbubble3));
            arrayList4.add(1);
            if (z && tL_chatChannelParticipant == null) {
                if (alertDialogArr[0] == null) {
                    AlertDialog alertDialog = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3);
                    alertDialogArr[0] = alertDialog;
                    alertDialog.showDelayed(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
                tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.user);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onLongClick$1(statisticActivity, alertDialogArr, chatFull, tLObject, tL_error);
                    }
                });
                return;
            }
            if (z && tL_chatChannelParticipant2 == null) {
                if (alertDialogArr[0] == null) {
                    AlertDialog alertDialog2 = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3);
                    alertDialogArr[0] = alertDialog2;
                    alertDialog2.showDelayed(300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
                tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onLongClick$3(statisticActivity, alertDialogArr, chatFull, tLObject, tL_error);
                    }
                });
                return;
            }
            AlertDialog alertDialog3 = alertDialogArr[0];
            if (alertDialog3 != null) {
                alertDialog3.dismiss();
                alertDialogArr[0] = null;
            }
            if (tL_chatChannelParticipant2 == null || tL_chatChannelParticipant == null || tL_chatChannelParticipant2.user_id == tL_chatChannelParticipant.user_id) {
                z2 = false;
            } else {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                boolean z3 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
                if (z3 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z3 = false;
                }
                if (z3) {
                    z2 = channelParticipant.admin_rights == null;
                    if (z2) {
                        i = R.string.SetAsAdmin;
                        str = "SetAsAdmin";
                    } else {
                        i = R.string.EditAdminRights;
                        str = "EditAdminRights";
                    }
                    arrayList3.add(LocaleController.getString(str, i));
                    arrayList7.add(Integer.valueOf(z2 ? R.drawable.msg_admins : R.drawable.msg_permissions));
                    arrayList4.add(0);
                } else {
                    z2 = false;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(statisticActivity.getParentActivity());
            builder.setItems((CharSequence[]) arrayList3.toArray(new CharSequence[arrayList4.size()]), AndroidUtilities.toIntArray(arrayList7), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f$0.lambda$onLongClick$4(arrayList4, chatFull, tL_chatChannelParticipant, z2, statisticActivity, dialogInterface, i3);
                }
            });
            statisticActivity.showDialog(builder.create());
        }

        public void lambda$onLongClick$1(final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, final TLRPC.ChatFull chatFull, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onLongClick$0(statisticActivity, alertDialogArr, tL_error, tLObject, chatFull);
                }
            });
        }

        public void lambda$onLongClick$0(StatisticActivity statisticActivity, AlertDialog[] alertDialogArr, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.ChatFull chatFull) {
            if (statisticActivity.isFinishing() || statisticActivity.getFragmentView() == null || alertDialogArr[0] == null) {
                return;
            }
            if (tL_error == null) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                tL_chatChannelParticipant.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                tL_chatChannelParticipant.user_id = this.user.id;
                chatFull.participants.participants.add(0, tL_chatChannelParticipant);
                onLongClick(chatFull, statisticActivity, alertDialogArr);
                return;
            }
            onLongClick(chatFull, statisticActivity, alertDialogArr, false);
        }

        public void lambda$onLongClick$3(final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, final TLRPC.ChatFull chatFull, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onLongClick$2(statisticActivity, alertDialogArr, tL_error, tLObject, chatFull);
                }
            });
        }

        public void lambda$onLongClick$2(StatisticActivity statisticActivity, AlertDialog[] alertDialogArr, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.ChatFull chatFull) {
            if (statisticActivity.isFinishing() || statisticActivity.getFragmentView() == null || alertDialogArr[0] == null) {
                return;
            }
            if (tL_error == null) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                tL_chatChannelParticipant.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                tL_chatChannelParticipant.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                chatFull.participants.participants.add(0, tL_chatChannelParticipant);
                onLongClick(chatFull, statisticActivity, alertDialogArr);
                return;
            }
            onLongClick(chatFull, statisticActivity, alertDialogArr, false);
        }

        public void lambda$onLongClick$4(ArrayList arrayList, TLRPC.ChatFull chatFull, final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, final boolean z, final StatisticActivity statisticActivity, DialogInterface dialogInterface, int i) {
            if (((Integer) arrayList.get(i)).intValue() == 0) {
                final boolean[] zArr = new boolean[1];
                long j = this.user.id;
                long j2 = chatFull.id;
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, j2, channelParticipant.admin_rights, null, channelParticipant.banned_rights, channelParticipant.rank, 0, true, z, null) {
                    @Override
                    public void onTransitionAnimationEnd(boolean z2, boolean z3) {
                        if (!z2 && z3 && zArr[0] && BulletinFactory.canShowBulletin(statisticActivity)) {
                            BulletinFactory.createPromoteToAdminBulletin(statisticActivity, MemberData.this.user.first_name).show();
                        }
                    }
                };
                chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                    @Override
                    public void didChangeOwner(TLRPC.User user) {
                    }

                    @Override
                    public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
                        if (i2 == 0) {
                            TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant2.admin_rights = null;
                            channelParticipant2.rank = "";
                        } else {
                            TLRPC.ChannelParticipant channelParticipant3 = tL_chatChannelParticipant.channelParticipant;
                            channelParticipant3.admin_rights = tL_chatAdminRights;
                            channelParticipant3.rank = str;
                            if (z) {
                                zArr[0] = true;
                            }
                        }
                    }
                });
                statisticActivity.presentFragment(chatRightsEditActivity);
                return;
            }
            if (((Integer) arrayList.get(i)).intValue() == 2) {
                onClick(statisticActivity);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chatFull.id);
            bundle.putLong("search_from_user_id", this.user.id);
            statisticActivity.presentFragment(new ChatActivity(bundle));
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite)) > 0.699999988079071d;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ViewPagerFixed viewPagerFixed = this.viewPagerFixed;
        if (viewPagerFixed == null || (viewPagerFixed.currentPosition == 0 && viewPagerFixed.currentProgress == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        checkUi_listPaddings();
    }

    private void checkUi_listPaddings() {
        int i = AndroidUtilities.navigationBarHeight;
        int i2 = AndroidUtilities.statusBarHeight;
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.setTranslationY(-i);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i2;
        int iDp = (this.showTabs ? AndroidUtilities.dp(72.0f) : 0) + i;
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView != null) {
            recyclerListView.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        ChannelBoostLayout channelBoostLayout = this.boostLayout;
        if (channelBoostLayout != null) {
            channelBoostLayout.listView.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        ChannelMonetizationLayout channelMonetizationLayout = this.monetizationLayout;
        if (channelMonetizationLayout != null) {
            channelMonetizationLayout.listView.setPadding(0, currentActionBarHeight, 0, iDp);
        }
    }

    public void checkUi_actionBar() {
        View currentView = this.viewPagerFixed.getCurrentView();
        ChannelBoostLayout channelBoostLayout = this.boostLayout;
        if (currentView == channelBoostLayout) {
            this.actionBar.setAdaptiveBackground(channelBoostLayout.listView);
            return;
        }
        ChannelMonetizationLayout channelMonetizationLayout = this.monetizationLayout;
        if (currentView == channelMonetizationLayout) {
            this.actionBar.setAdaptiveBackground(channelMonetizationLayout.listView);
        } else {
            this.actionBar.setAdaptiveBackground(this.recyclerListView);
        }
    }

    public void selectTab(int i, boolean z) {
        int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                return;
            }
            glassTabViewArr[i2].setSelected(i2 == i, z);
            i2++;
        }
    }

    public void setGestureSelectedOverride(float f, boolean z) {
        for (int i = 0; i < this.tabs.length; i++) {
            this.tabs[i].setGestureSelectedOverride(Math.max(0.0f, 1.0f - Math.abs(i - f)), z);
        }
        this.tabsView.invalidate();
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null || this.fragmentView == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        this.iBlur3PositionMainTabs.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, 2);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }
}
