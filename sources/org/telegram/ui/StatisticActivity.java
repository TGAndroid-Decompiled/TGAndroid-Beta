package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$StatsGraph;
import org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_getMessages;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipant;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageInteractionCounters;
import org.telegram.tgnet.TLRPC$TL_statsAbsValueAndPrev;
import org.telegram.tgnet.TLRPC$TL_statsDateRangeDays;
import org.telegram.tgnet.TLRPC$TL_statsGraph;
import org.telegram.tgnet.TLRPC$TL_statsGraphAsync;
import org.telegram.tgnet.TLRPC$TL_statsGraphError;
import org.telegram.tgnet.TLRPC$TL_statsGroupTopAdmin;
import org.telegram.tgnet.TLRPC$TL_statsGroupTopInviter;
import org.telegram.tgnet.TLRPC$TL_statsGroupTopPoster;
import org.telegram.tgnet.TLRPC$TL_statsPercentValue;
import org.telegram.tgnet.TLRPC$TL_stats_broadcastStats;
import org.telegram.tgnet.TLRPC$TL_stats_getBroadcastStats;
import org.telegram.tgnet.TLRPC$TL_stats_getMegagroupStats;
import org.telegram.tgnet.TLRPC$TL_stats_loadAsyncGraph;
import org.telegram.tgnet.TLRPC$TL_stats_megagroupStats;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StatisticPostInfoCell;
import org.telegram.ui.Charts.BarChartView;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.Charts.DoubleLinearChartView;
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
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlatCheckBox;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PeopleNearbyActivity;
import org.telegram.ui.StatisticActivity;
public class StatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChartViewData actionsData;
    private Adapter adapter;
    private RecyclerView.ItemAnimator animator;
    ChatAvatarContainer avatarContainer;
    private final TLRPC$ChatFull chat;
    private LruCache<ChartData> childDataCache;
    private DiffUtilsCallback diffUtilsCallback;
    private ChartViewData followersData;
    private ChartViewData groupMembersData;
    private ChartViewData growthData;
    private RLottieImageView imageView;
    private boolean initialLoading;
    private ChartViewData interactionsData;
    private final boolean isMegagroup;
    private ChartViewData ivInteractionsData;
    private ChartViewData languagesData;
    private ZoomCancelable lastCancelable;
    private LinearLayoutManager layoutManager;
    private int loadFromId;
    private long maxDateOverview;
    private ChartViewData membersLanguageData;
    private ChartViewData messagesData;
    private boolean messagesIsLoading;
    private long minDateOverview;
    private ChartViewData newFollowersBySourceData;
    private ChartViewData newMembersBySourceData;
    private ChartViewData notificationsData;
    private OverviewChannelData overviewChannelData;
    private OverviewChatData overviewChatData;
    private AlertDialog[] progressDialog;
    private LinearLayout progressLayout;
    private final SparseIntArray recentPostIdtoIndexMap;
    private final ArrayList<RecentPostInfo> recentPostsAll;
    private final ArrayList<RecentPostInfo> recentPostsLoaded;
    private RecyclerListView recyclerListView;
    private BaseChartView.SharedUiComponents sharedUi;
    private final Runnable showProgressbar;
    private ArrayList<MemberData> topAdmins;
    private ChartViewData topDayOfWeeksData;
    private ChartViewData topHoursData;
    private ArrayList<MemberData> topInviters;
    private ArrayList<MemberData> topMembersAll;
    private ArrayList<MemberData> topMembersVisible;
    private ChartViewData viewsBySourceData;

    public static class RecentPostInfo {
        public TLRPC$TL_messageInteractionCounters counters;
        public MessageObject message;
    }

    public static class ZoomCancelable {
        int adapterPosition;
        boolean canceled;
    }

    public StatisticActivity(Bundle bundle) {
        super(bundle);
        this.topMembersAll = new ArrayList<>();
        this.topMembersVisible = new ArrayList<>();
        this.topInviters = new ArrayList<>();
        this.topAdmins = new ArrayList<>();
        this.childDataCache = new LruCache<>(50);
        this.progressDialog = new AlertDialog[1];
        this.loadFromId = -1;
        this.recentPostIdtoIndexMap = new SparseIntArray();
        this.recentPostsAll = new ArrayList<>();
        this.recentPostsLoaded = new ArrayList<>();
        this.initialLoading = true;
        this.showProgressbar = new Runnable() {
            @Override
            public void run() {
                StatisticActivity.this.progressLayout.animate().alpha(1.0f).setDuration(230L);
            }
        };
        long j = bundle.getLong("chat_id");
        this.isMegagroup = bundle.getBoolean("is_megagroup", false);
        this.chat = getMessagesController().getChatFull(j);
    }

    @Override
    public boolean onFragmentCreate() {
        TLRPC$TL_stats_getBroadcastStats tLRPC$TL_stats_getBroadcastStats;
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        if (this.isMegagroup) {
            TLRPC$TL_stats_getMegagroupStats tLRPC$TL_stats_getMegagroupStats = new TLRPC$TL_stats_getMegagroupStats();
            tLRPC$TL_stats_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chat.id);
            tLRPC$TL_stats_getBroadcastStats = tLRPC$TL_stats_getMegagroupStats;
        } else {
            TLRPC$TL_stats_getBroadcastStats tLRPC$TL_stats_getBroadcastStats2 = new TLRPC$TL_stats_getBroadcastStats();
            tLRPC$TL_stats_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chat.id);
            tLRPC$TL_stats_getBroadcastStats = tLRPC$TL_stats_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_stats_getBroadcastStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StatisticActivity.this.lambda$onFragmentCreate$2(tLObject, tLRPC$TL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
        return super.onFragmentCreate();
    }

    public void lambda$onFragmentCreate$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_stats_broadcastStats) {
            TLRPC$TL_stats_broadcastStats tLRPC$TL_stats_broadcastStats = (TLRPC$TL_stats_broadcastStats) tLObject;
            final ChartViewData[] chartViewDataArr = {createViewData(tLRPC$TL_stats_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1), createViewData(tLRPC$TL_stats_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0), createViewData(tLRPC$TL_stats_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0), createViewData(tLRPC$TL_stats_broadcastStats.interactions_graph, LocaleController.getString("InteractionsChartTitle", R.string.InteractionsChartTitle), 1), createViewData(tLRPC$TL_stats_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0), createViewData(tLRPC$TL_stats_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2), createViewData(tLRPC$TL_stats_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2), createViewData(tLRPC$TL_stats_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), createViewData(tLRPC$TL_stats_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0)};
            if (chartViewDataArr[2] != null) {
                chartViewDataArr[2].useHourFormat = true;
            }
            this.overviewChannelData = new OverviewChannelData(tLRPC$TL_stats_broadcastStats);
            TLRPC$TL_statsDateRangeDays tLRPC$TL_statsDateRangeDays = tLRPC$TL_stats_broadcastStats.period;
            this.maxDateOverview = tLRPC$TL_statsDateRangeDays.max_date * 1000;
            this.minDateOverview = tLRPC$TL_statsDateRangeDays.min_date * 1000;
            this.recentPostsAll.clear();
            for (int i = 0; i < tLRPC$TL_stats_broadcastStats.recent_message_interactions.size(); i++) {
                RecentPostInfo recentPostInfo = new RecentPostInfo();
                recentPostInfo.counters = tLRPC$TL_stats_broadcastStats.recent_message_interactions.get(i);
                this.recentPostsAll.add(recentPostInfo);
                this.recentPostIdtoIndexMap.put(recentPostInfo.counters.msg_id, i);
            }
            if (this.recentPostsAll.size() > 0) {
                getMessagesStorage().getMessages(-this.chat.id, 0L, false, this.recentPostsAll.size(), this.recentPostsAll.get(0).counters.msg_id, 0, 0, this.classGuid, 0, false, 0, 0, true, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StatisticActivity.this.lambda$onFragmentCreate$0(chartViewDataArr);
                }
            });
        }
        if (tLObject instanceof TLRPC$TL_stats_megagroupStats) {
            TLRPC$TL_stats_megagroupStats tLRPC$TL_stats_megagroupStats = (TLRPC$TL_stats_megagroupStats) tLObject;
            final ChartViewData[] chartViewDataArr2 = {createViewData(tLRPC$TL_stats_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0), createViewData(tLRPC$TL_stats_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0), createViewData(tLRPC$TL_stats_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2), createViewData(tLRPC$TL_stats_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), createViewData(tLRPC$TL_stats_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2), createViewData(tLRPC$TL_stats_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1), createViewData(tLRPC$TL_stats_megagroupStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0), createViewData(tLRPC$TL_stats_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4)};
            if (chartViewDataArr2[6] != null) {
                chartViewDataArr2[6].useHourFormat = true;
            }
            if (chartViewDataArr2[7] != null) {
                chartViewDataArr2[7].useWeekFormat = true;
            }
            this.overviewChatData = new OverviewChatData(tLRPC$TL_stats_megagroupStats);
            TLRPC$TL_statsDateRangeDays tLRPC$TL_statsDateRangeDays2 = tLRPC$TL_stats_megagroupStats.period;
            this.maxDateOverview = tLRPC$TL_statsDateRangeDays2.max_date * 1000;
            this.minDateOverview = tLRPC$TL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TLRPC$TL_statsGroupTopPoster> arrayList = tLRPC$TL_stats_megagroupStats.top_posters;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i2 = 0; i2 < tLRPC$TL_stats_megagroupStats.top_posters.size(); i2++) {
                    MemberData from = MemberData.from(tLRPC$TL_stats_megagroupStats.top_posters.get(i2), tLRPC$TL_stats_megagroupStats.users);
                    if (this.topMembersVisible.size() < 10) {
                        this.topMembersVisible.add(from);
                    }
                    this.topMembersAll.add(from);
                }
                if (this.topMembersAll.size() - this.topMembersVisible.size() < 2) {
                    this.topMembersVisible.clear();
                    this.topMembersVisible.addAll(this.topMembersAll);
                }
            }
            ArrayList<TLRPC$TL_statsGroupTopAdmin> arrayList2 = tLRPC$TL_stats_megagroupStats.top_admins;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int i3 = 0; i3 < tLRPC$TL_stats_megagroupStats.top_admins.size(); i3++) {
                    this.topAdmins.add(MemberData.from(tLRPC$TL_stats_megagroupStats.top_admins.get(i3), tLRPC$TL_stats_megagroupStats.users));
                }
            }
            ArrayList<TLRPC$TL_statsGroupTopInviter> arrayList3 = tLRPC$TL_stats_megagroupStats.top_inviters;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i4 = 0; i4 < tLRPC$TL_stats_megagroupStats.top_inviters.size(); i4++) {
                    this.topInviters.add(MemberData.from(tLRPC$TL_stats_megagroupStats.top_inviters.get(i4), tLRPC$TL_stats_megagroupStats.users));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StatisticActivity.this.lambda$onFragmentCreate$1(chartViewDataArr2);
                }
            });
        }
    }

    public void lambda$onFragmentCreate$0(ChartViewData[] chartViewDataArr) {
        this.ivInteractionsData = chartViewDataArr[0];
        this.followersData = chartViewDataArr[1];
        this.topHoursData = chartViewDataArr[2];
        this.interactionsData = chartViewDataArr[3];
        this.growthData = chartViewDataArr[4];
        this.viewsBySourceData = chartViewDataArr[5];
        this.newFollowersBySourceData = chartViewDataArr[6];
        this.languagesData = chartViewDataArr[7];
        this.notificationsData = chartViewDataArr[8];
        dataLoaded(chartViewDataArr);
    }

    public void lambda$onFragmentCreate$1(ChartViewData[] chartViewDataArr) {
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
                chartViewData.load(this.currentAccount, this.classGuid, this.chat.stats_dc, this.recyclerListView, this.adapter, this.diffUtilsCallback);
            }
        }
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        AlertDialog[] alertDialogArr = this.progressDialog;
        if (alertDialogArr[0] != null) {
            alertDialogArr[0].dismiss();
            this.progressDialog[0] = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.messagesDidLoad && ((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList = (ArrayList) objArr[2];
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i4);
                int i5 = this.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
                if (i5 >= 0 && this.recentPostsAll.get(i5).counters.msg_id == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList2.add(this.recentPostsAll.get(i5));
                    } else {
                        this.recentPostsAll.get(i5).message = messageObject;
                    }
                }
            }
            this.recentPostsAll.removeAll(arrayList2);
            this.recentPostsLoaded.clear();
            int size2 = this.recentPostsAll.size();
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                RecentPostInfo recentPostInfo = this.recentPostsAll.get(i3);
                if (recentPostInfo.message == null) {
                    this.loadFromId = recentPostInfo.counters.msg_id;
                    break;
                } else {
                    this.recentPostsLoaded.add(recentPostInfo);
                    i3++;
                }
            }
            if (this.recentPostsLoaded.size() < 20) {
                loadMessages();
            }
            if (this.adapter != null) {
                this.recyclerListView.setItemAnimator(null);
                this.diffUtilsCallback.update();
            }
        }
    }

    @Override
    public View createView(Context context) {
        this.sharedUi = new BaseChartView.SharedUiComponents();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.recyclerListView = new RecyclerListView(context) {
            int lastH;

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (this.lastH != getMeasuredHeight() && StatisticActivity.this.adapter != null) {
                    StatisticActivity.this.adapter.notifyDataSetChanged();
                }
                this.lastH = getMeasuredHeight();
            }
        };
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
        textView.setTextColor(Theme.getColor("player_actionBarTitle"));
        textView.setTag("player_actionBarTitle");
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(Theme.getColor("player_actionBarSubtitle"));
        textView2.setTag("player_actionBarSubtitle");
        textView2.setText(LocaleController.getString("LoadingStatsDescription", R.string.LoadingStatsDescription));
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
        this.animator = new DefaultItemAnimator(this) {
            @Override
            protected long getAddAnimationDelay(long j, long j2, long j3) {
                return j;
            }
        };
        this.recyclerListView.setItemAnimator(null);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (StatisticActivity.this.recentPostsAll.size() == StatisticActivity.this.recentPostsLoaded.size() || StatisticActivity.this.messagesIsLoading || StatisticActivity.this.layoutManager.findLastVisibleItemPosition() <= StatisticActivity.this.adapter.getItemCount() - 20) {
                    return;
                }
                StatisticActivity.this.loadMessages();
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                StatisticActivity.this.lambda$createView$3(view, i);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$createView$5;
                lambda$createView$5 = StatisticActivity.this.lambda$createView$5(view, i);
                return lambda$createView$5;
            }
        });
        frameLayout.addView(this.recyclerListView);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chat.id));
        this.avatarContainer.setChatAvatar(chat);
        this.avatarContainer.setTitle(chat.title);
        this.avatarContainer.setSubtitle(LocaleController.getString("Statistics", R.string.Statistics));
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    StatisticActivity.this.finishFragment();
                }
            }
        });
        this.avatarContainer.setTitleColors(Theme.getColor("player_actionBarTitle"), Theme.getColor("player_actionBarSubtitle"));
        this.actionBar.setItemsColor(Theme.getColor("windowBackgroundWhiteGrayText2"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarActionModeDefaultSelector"), false);
        this.actionBar.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
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
        this.diffUtilsCallback = new DiffUtilsCallback(this.adapter, this.layoutManager);
        return this.fragmentView;
    }

    public void lambda$createView$3(View view, int i) {
        Adapter adapter = this.adapter;
        int i2 = adapter.recentPostsStartRow;
        if (i >= i2 && i <= adapter.recentPostsEndRow) {
            presentFragment(new MessageStatisticActivity(this.recentPostsLoaded.get(i - i2).message));
            return;
        }
        int i3 = adapter.topAdminsStartRow;
        if (i >= i3 && i <= adapter.topAdminsEndRow) {
            this.topAdmins.get(i - i3).onClick(this);
            return;
        }
        int i4 = adapter.topMembersStartRow;
        if (i >= i4 && i <= adapter.topMembersEndRow) {
            this.topMembersVisible.get(i - i4).onClick(this);
            return;
        }
        int i5 = adapter.topInviterStartRow;
        if (i >= i5 && i <= adapter.topInviterEndRow) {
            this.topInviters.get(i - i5).onClick(this);
        } else if (i == adapter.expandTopMembersRow) {
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

    public boolean lambda$createView$5(View view, int i) {
        Adapter adapter = this.adapter;
        int i2 = adapter.recentPostsStartRow;
        if (i >= i2 && i <= adapter.recentPostsEndRow) {
            final MessageObject messageObject = this.recentPostsLoaded.get(i - i2).message;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString("ViewMessageStatistic", R.string.ViewMessageStatistic));
            arrayList2.add(0);
            arrayList3.add(Integer.valueOf(R.drawable.msg_stats));
            arrayList.add(LocaleController.getString("ViewMessage", R.string.ViewMessage));
            arrayList2.add(1);
            arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setItems((CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]), AndroidUtilities.toIntArray(arrayList3), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    StatisticActivity.this.lambda$createView$4(messageObject, dialogInterface, i3);
                }
            });
            showDialog(builder.create());
        } else {
            int i3 = adapter.topAdminsStartRow;
            if (i >= i3 && i <= adapter.topAdminsEndRow) {
                this.topAdmins.get(i - i3).onLongClick(this.chat, this, this.progressDialog);
                return true;
            }
            int i4 = adapter.topMembersStartRow;
            if (i >= i4 && i <= adapter.topMembersEndRow) {
                this.topMembersVisible.get(i - i4).onLongClick(this.chat, this, this.progressDialog);
                return true;
            }
            int i5 = adapter.topInviterStartRow;
            if (i >= i5 && i <= adapter.topInviterEndRow) {
                this.topInviters.get(i - i5).onLongClick(this.chat, this, this.progressDialog);
                return true;
            }
        }
        return false;
    }

    public void lambda$createView$4(MessageObject messageObject, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            presentFragment(new MessageStatisticActivity(messageObject));
        } else if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.chat.id);
            bundle.putInt("message_id", messageObject.getId());
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            presentFragment(new ChatActivity(bundle), false);
        }
    }

    public static ChartViewData createViewData(TLRPC$StatsGraph tLRPC$StatsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (tLRPC$StatsGraph == null || (tLRPC$StatsGraph instanceof TLRPC$TL_statsGraphError)) {
            return null;
        }
        ChartViewData chartViewData = new ChartViewData(str, i);
        chartViewData.isLanguages = z;
        if (tLRPC$StatsGraph instanceof TLRPC$TL_statsGraph) {
            try {
                ChartData createChartData = createChartData(new JSONObject(((TLRPC$TL_statsGraph) tLRPC$StatsGraph).json.data), i, z);
                chartViewData.chartData = createChartData;
                chartViewData.zoomToken = ((TLRPC$TL_statsGraph) tLRPC$StatsGraph).zoom_token;
                if (createChartData == null || (jArr2 = createChartData.x) == null || jArr2.length < 2) {
                    chartViewData.isEmpty = true;
                }
                if (i == 4 && createChartData != null && (jArr = createChartData.x) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    chartViewData.childChartData = new StackLinearChartData(createChartData, j);
                    chartViewData.activeZoom = j;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (tLRPC$StatsGraph instanceof TLRPC$TL_statsGraphAsync) {
            chartViewData.token = ((TLRPC$TL_statsGraphAsync) tLRPC$StatsGraph).token;
        }
        return chartViewData;
    }

    private static ChartViewData createViewData(TLRPC$StatsGraph tLRPC$StatsGraph, String str, int i) {
        return createViewData(tLRPC$StatsGraph, str, i, false);
    }

    public static ChartData createChartData(JSONObject jSONObject, int i, boolean z) throws JSONException {
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

    public class Adapter extends RecyclerListView.SelectionAdapter {
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
        ArraySet<Integer> shadowDivideCells = new ArraySet<>();
        ArraySet<Integer> emptyCells = new ArraySet<>();

        Adapter() {
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.growCell || i == this.folowersCell || i == this.topHourseCell || i == this.notificationsCell || i == this.actionsCell || i == this.groupMembersCell) {
                return 0;
            }
            if (i == this.interactionsCell || i == this.ivInteractionsCell) {
                return 1;
            }
            if (i == this.viewsBySourceCell || i == this.newFollowersBySourceCell || i == this.newMembersBySourceCell || i == this.messagesCell) {
                return 2;
            }
            if (i == this.languagesCell || i == this.membersLanguageCell || i == this.topDayOfWeeksCell) {
                return 4;
            }
            if (i < this.recentPostsStartRow || i > this.recentPostsEndRow) {
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
            return 9;
        }

        @Override
        public long getItemId(int i) {
            if (i >= this.recentPostsStartRow && i < this.recentPostsEndRow) {
                return ((RecentPostInfo) StatisticActivity.this.recentPostsLoaded.get(i - this.recentPostsStartRow)).counters.msg_id;
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
            return super.getItemId(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatTextCell shadowSectionCell;
            if (i >= 0 && i <= 4) {
                View view = new ChartCell(this, viewGroup.getContext(), i, StatisticActivity.this.sharedUi) {
                    {
                        StatisticActivity statisticActivity = StatisticActivity.this;
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
                        }
                        super.onDraw(canvas);
                    }
                };
                view.setWillNotDraw(false);
                shadowSectionCell = view;
            } else if (i == 9) {
                View view2 = new StatisticPostInfoCell(this, viewGroup.getContext(), StatisticActivity.this.chat) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
                        }
                        super.onDraw(canvas);
                    }
                };
                view2.setWillNotDraw(false);
                shadowSectionCell = view2;
            } else if (i == 11) {
                View loadingCell = new LoadingCell(viewGroup.getContext());
                loadingCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                shadowSectionCell = loadingCell;
            } else if (i == 12) {
                shadowSectionCell = new EmptyCell(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
            } else if (i == 13) {
                ChartHeaderView chartHeaderView = new ChartHeaderView(this, viewGroup.getContext()) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (getTranslationY() != 0.0f) {
                            canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
                        }
                        super.onDraw(canvas);
                    }
                };
                chartHeaderView.setWillNotDraw(false);
                chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(16.0f));
                shadowSectionCell = chartHeaderView;
            } else if (i == 14) {
                shadowSectionCell = new OverviewCell(viewGroup.getContext());
            } else if (i == 15) {
                ManageChatTextCell manageChatTextCell = new ManageChatTextCell(viewGroup.getContext());
                manageChatTextCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                manageChatTextCell.setColors("windowBackgroundWhiteBlueIcon", "windowBackgroundWhiteBlueButton");
                shadowSectionCell = manageChatTextCell;
            } else {
                shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), 12, Theme.getColor("windowBackgroundGray"));
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ChartViewData chartViewData;
            int itemViewType = getItemViewType(i);
            if (itemViewType >= 0 && itemViewType <= 4) {
                if (this.growCell == i) {
                    chartViewData = StatisticActivity.this.growthData;
                } else {
                    chartViewData = this.folowersCell == i ? StatisticActivity.this.followersData : this.interactionsCell == i ? StatisticActivity.this.interactionsData : this.viewsBySourceCell == i ? StatisticActivity.this.viewsBySourceData : this.newFollowersBySourceCell == i ? StatisticActivity.this.newFollowersBySourceData : this.ivInteractionsCell == i ? StatisticActivity.this.ivInteractionsData : this.topHourseCell == i ? StatisticActivity.this.topHoursData : this.notificationsCell == i ? StatisticActivity.this.notificationsData : this.groupMembersCell == i ? StatisticActivity.this.groupMembersData : this.newMembersBySourceCell == i ? StatisticActivity.this.newMembersBySourceData : this.membersLanguageCell == i ? StatisticActivity.this.membersLanguageData : this.messagesCell == i ? StatisticActivity.this.messagesData : this.actionsCell == i ? StatisticActivity.this.actionsData : this.topDayOfWeeksCell == i ? StatisticActivity.this.topDayOfWeeksData : StatisticActivity.this.languagesData;
                }
                ((ChartCell) viewHolder.itemView).updateData(chartViewData, false);
            } else if (itemViewType == 9) {
                if (!StatisticActivity.this.isMegagroup) {
                    ((StatisticPostInfoCell) viewHolder.itemView).setData((RecentPostInfo) StatisticActivity.this.recentPostsLoaded.get(i - this.recentPostsStartRow));
                    return;
                }
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
            } else if (itemViewType != 13) {
                if (itemViewType != 14) {
                    if (itemViewType == 15) {
                        ((ManageChatTextCell) viewHolder.itemView).setText(LocaleController.formatPluralString("ShowVotes", StatisticActivity.this.topMembersAll.size() - StatisticActivity.this.topMembersVisible.size(), new Object[0]), null, R.drawable.arrow_more, false);
                        return;
                    }
                    return;
                }
                OverviewCell overviewCell = (OverviewCell) viewHolder.itemView;
                if (StatisticActivity.this.isMegagroup) {
                    overviewCell.setData(StatisticActivity.this.overviewChatData);
                } else {
                    overviewCell.setData(StatisticActivity.this.overviewChannelData);
                }
            } else {
                ChartHeaderView chartHeaderView = (ChartHeaderView) viewHolder.itemView;
                chartHeaderView.setDates(StatisticActivity.this.minDateOverview, StatisticActivity.this.maxDateOverview);
                if (i == this.overviewHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                } else if (i == this.topAdminsHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                } else if (i == this.topInviterHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                } else if (i == this.topMembersHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopMembers", R.string.TopMembers));
                } else {
                    chartHeaderView.setTitle(LocaleController.getString("RecentPosts", R.string.RecentPosts));
                }
            }
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
                    int i2 = i + 1;
                    this.count = i2;
                    this.overviewHeaderCell = i;
                    this.count = i2 + 1;
                    this.overviewCell = i2;
                }
                if (StatisticActivity.this.growthData != null && !StatisticActivity.this.growthData.isEmpty) {
                    int i3 = this.count;
                    if (i3 > 0) {
                        ArraySet<Integer> arraySet = this.shadowDivideCells;
                        this.count = i3 + 1;
                        arraySet.add(Integer.valueOf(i3));
                    }
                    int i4 = this.count;
                    this.count = i4 + 1;
                    this.growCell = i4;
                }
                if (StatisticActivity.this.groupMembersData != null && !StatisticActivity.this.groupMembersData.isEmpty) {
                    int i5 = this.count;
                    if (i5 > 0) {
                        ArraySet<Integer> arraySet2 = this.shadowDivideCells;
                        this.count = i5 + 1;
                        arraySet2.add(Integer.valueOf(i5));
                    }
                    int i6 = this.count;
                    this.count = i6 + 1;
                    this.groupMembersCell = i6;
                }
                if (StatisticActivity.this.newMembersBySourceData != null && !StatisticActivity.this.newMembersBySourceData.isEmpty && !StatisticActivity.this.newMembersBySourceData.isError) {
                    int i7 = this.count;
                    if (i7 > 0) {
                        ArraySet<Integer> arraySet3 = this.shadowDivideCells;
                        this.count = i7 + 1;
                        arraySet3.add(Integer.valueOf(i7));
                    }
                    int i8 = this.count;
                    this.count = i8 + 1;
                    this.newMembersBySourceCell = i8;
                }
                if (StatisticActivity.this.membersLanguageData != null && !StatisticActivity.this.membersLanguageData.isEmpty && !StatisticActivity.this.membersLanguageData.isError) {
                    int i9 = this.count;
                    if (i9 > 0) {
                        ArraySet<Integer> arraySet4 = this.shadowDivideCells;
                        this.count = i9 + 1;
                        arraySet4.add(Integer.valueOf(i9));
                    }
                    int i10 = this.count;
                    this.count = i10 + 1;
                    this.membersLanguageCell = i10;
                }
                if (StatisticActivity.this.messagesData != null && !StatisticActivity.this.messagesData.isEmpty && !StatisticActivity.this.messagesData.isError) {
                    int i11 = this.count;
                    if (i11 > 0) {
                        ArraySet<Integer> arraySet5 = this.shadowDivideCells;
                        this.count = i11 + 1;
                        arraySet5.add(Integer.valueOf(i11));
                    }
                    int i12 = this.count;
                    this.count = i12 + 1;
                    this.messagesCell = i12;
                }
                if (StatisticActivity.this.actionsData != null && !StatisticActivity.this.actionsData.isEmpty && !StatisticActivity.this.actionsData.isError) {
                    int i13 = this.count;
                    if (i13 > 0) {
                        ArraySet<Integer> arraySet6 = this.shadowDivideCells;
                        this.count = i13 + 1;
                        arraySet6.add(Integer.valueOf(i13));
                    }
                    int i14 = this.count;
                    this.count = i14 + 1;
                    this.actionsCell = i14;
                }
                if (StatisticActivity.this.topHoursData != null && !StatisticActivity.this.topHoursData.isEmpty && !StatisticActivity.this.topHoursData.isError) {
                    int i15 = this.count;
                    if (i15 > 0) {
                        ArraySet<Integer> arraySet7 = this.shadowDivideCells;
                        this.count = i15 + 1;
                        arraySet7.add(Integer.valueOf(i15));
                    }
                    int i16 = this.count;
                    this.count = i16 + 1;
                    this.topHourseCell = i16;
                }
                if (StatisticActivity.this.topDayOfWeeksData != null && !StatisticActivity.this.topDayOfWeeksData.isEmpty && !StatisticActivity.this.topDayOfWeeksData.isError) {
                    int i17 = this.count;
                    if (i17 > 0) {
                        ArraySet<Integer> arraySet8 = this.shadowDivideCells;
                        this.count = i17 + 1;
                        arraySet8.add(Integer.valueOf(i17));
                    }
                    int i18 = this.count;
                    this.count = i18 + 1;
                    this.topDayOfWeeksCell = i18;
                }
                if (StatisticActivity.this.topMembersVisible.size() > 0) {
                    int i19 = this.count;
                    if (i19 > 0) {
                        ArraySet<Integer> arraySet9 = this.shadowDivideCells;
                        this.count = i19 + 1;
                        arraySet9.add(Integer.valueOf(i19));
                    }
                    int i20 = this.count;
                    int i21 = i20 + 1;
                    this.count = i21;
                    this.topMembersHeaderCell = i20;
                    this.count = i21 + 1;
                    this.topMembersStartRow = i21;
                    int size = (i21 + StatisticActivity.this.topMembersVisible.size()) - 1;
                    this.topMembersEndRow = size;
                    this.count = size;
                    this.count = size + 1;
                    if (StatisticActivity.this.topMembersVisible.size() != StatisticActivity.this.topMembersAll.size()) {
                        int i22 = this.count;
                        this.count = i22 + 1;
                        this.expandTopMembersRow = i22;
                    } else {
                        ArraySet<Integer> arraySet10 = this.emptyCells;
                        int i23 = this.count;
                        this.count = i23 + 1;
                        arraySet10.add(Integer.valueOf(i23));
                    }
                }
                if (StatisticActivity.this.topAdmins.size() > 0) {
                    int i24 = this.count;
                    if (i24 > 0) {
                        ArraySet<Integer> arraySet11 = this.shadowDivideCells;
                        this.count = i24 + 1;
                        arraySet11.add(Integer.valueOf(i24));
                    }
                    int i25 = this.count;
                    int i26 = i25 + 1;
                    this.count = i26;
                    this.topAdminsHeaderCell = i25;
                    this.count = i26 + 1;
                    this.topAdminsStartRow = i26;
                    int size2 = (i26 + StatisticActivity.this.topAdmins.size()) - 1;
                    this.topAdminsEndRow = size2;
                    this.count = size2;
                    int i27 = size2 + 1;
                    this.count = i27;
                    ArraySet<Integer> arraySet12 = this.emptyCells;
                    this.count = i27 + 1;
                    arraySet12.add(Integer.valueOf(i27));
                }
                if (StatisticActivity.this.topInviters.size() > 0) {
                    int i28 = this.count;
                    if (i28 > 0) {
                        ArraySet<Integer> arraySet13 = this.shadowDivideCells;
                        this.count = i28 + 1;
                        arraySet13.add(Integer.valueOf(i28));
                    }
                    int i29 = this.count;
                    int i30 = i29 + 1;
                    this.count = i30;
                    this.topInviterHeaderCell = i29;
                    this.count = i30 + 1;
                    this.topInviterStartRow = i30;
                    int size3 = (i30 + StatisticActivity.this.topInviters.size()) - 1;
                    this.topInviterEndRow = size3;
                    this.count = size3;
                    this.count = size3 + 1;
                }
                int i31 = this.count;
                if (i31 > 0) {
                    ArraySet<Integer> arraySet14 = this.emptyCells;
                    this.count = i31 + 1;
                    arraySet14.add(Integer.valueOf(i31));
                    ArraySet<Integer> arraySet15 = this.shadowDivideCells;
                    int i32 = this.count;
                    this.count = i32 + 1;
                    arraySet15.add(Integer.valueOf(i32));
                    return;
                }
                return;
            }
            if (StatisticActivity.this.overviewChannelData != null) {
                int i33 = this.count;
                int i34 = i33 + 1;
                this.count = i34;
                this.overviewHeaderCell = i33;
                this.count = i34 + 1;
                this.overviewCell = i34;
            }
            if (StatisticActivity.this.growthData != null && !StatisticActivity.this.growthData.isEmpty) {
                int i35 = this.count;
                if (i35 > 0) {
                    ArraySet<Integer> arraySet16 = this.shadowDivideCells;
                    this.count = i35 + 1;
                    arraySet16.add(Integer.valueOf(i35));
                }
                int i36 = this.count;
                this.count = i36 + 1;
                this.growCell = i36;
            }
            if (StatisticActivity.this.followersData != null && !StatisticActivity.this.followersData.isEmpty) {
                int i37 = this.count;
                if (i37 > 0) {
                    ArraySet<Integer> arraySet17 = this.shadowDivideCells;
                    this.count = i37 + 1;
                    arraySet17.add(Integer.valueOf(i37));
                }
                int i38 = this.count;
                this.count = i38 + 1;
                this.folowersCell = i38;
            }
            if (StatisticActivity.this.notificationsData != null && !StatisticActivity.this.notificationsData.isEmpty) {
                int i39 = this.count;
                if (i39 > 0) {
                    ArraySet<Integer> arraySet18 = this.shadowDivideCells;
                    this.count = i39 + 1;
                    arraySet18.add(Integer.valueOf(i39));
                }
                int i40 = this.count;
                this.count = i40 + 1;
                this.notificationsCell = i40;
            }
            if (StatisticActivity.this.topHoursData != null && !StatisticActivity.this.topHoursData.isEmpty) {
                int i41 = this.count;
                if (i41 > 0) {
                    ArraySet<Integer> arraySet19 = this.shadowDivideCells;
                    this.count = i41 + 1;
                    arraySet19.add(Integer.valueOf(i41));
                }
                int i42 = this.count;
                this.count = i42 + 1;
                this.topHourseCell = i42;
            }
            if (StatisticActivity.this.viewsBySourceData != null && !StatisticActivity.this.viewsBySourceData.isEmpty) {
                int i43 = this.count;
                if (i43 > 0) {
                    ArraySet<Integer> arraySet20 = this.shadowDivideCells;
                    this.count = i43 + 1;
                    arraySet20.add(Integer.valueOf(i43));
                }
                int i44 = this.count;
                this.count = i44 + 1;
                this.viewsBySourceCell = i44;
            }
            if (StatisticActivity.this.newFollowersBySourceData != null && !StatisticActivity.this.newFollowersBySourceData.isEmpty) {
                int i45 = this.count;
                if (i45 > 0) {
                    ArraySet<Integer> arraySet21 = this.shadowDivideCells;
                    this.count = i45 + 1;
                    arraySet21.add(Integer.valueOf(i45));
                }
                int i46 = this.count;
                this.count = i46 + 1;
                this.newFollowersBySourceCell = i46;
            }
            if (StatisticActivity.this.languagesData != null && !StatisticActivity.this.languagesData.isEmpty) {
                int i47 = this.count;
                if (i47 > 0) {
                    ArraySet<Integer> arraySet22 = this.shadowDivideCells;
                    this.count = i47 + 1;
                    arraySet22.add(Integer.valueOf(i47));
                }
                int i48 = this.count;
                this.count = i48 + 1;
                this.languagesCell = i48;
            }
            if (StatisticActivity.this.interactionsData != null && !StatisticActivity.this.interactionsData.isEmpty) {
                int i49 = this.count;
                if (i49 > 0) {
                    ArraySet<Integer> arraySet23 = this.shadowDivideCells;
                    this.count = i49 + 1;
                    arraySet23.add(Integer.valueOf(i49));
                }
                int i50 = this.count;
                this.count = i50 + 1;
                this.interactionsCell = i50;
            }
            if (StatisticActivity.this.ivInteractionsData != null && !StatisticActivity.this.ivInteractionsData.loading && !StatisticActivity.this.ivInteractionsData.isError) {
                int i51 = this.count;
                if (i51 > 0) {
                    ArraySet<Integer> arraySet24 = this.shadowDivideCells;
                    this.count = i51 + 1;
                    arraySet24.add(Integer.valueOf(i51));
                }
                int i52 = this.count;
                this.count = i52 + 1;
                this.ivInteractionsCell = i52;
            }
            ArraySet<Integer> arraySet25 = this.shadowDivideCells;
            int i53 = this.count;
            this.count = i53 + 1;
            arraySet25.add(Integer.valueOf(i53));
            if (StatisticActivity.this.recentPostsAll.size() > 0) {
                int i54 = this.count;
                int i55 = i54 + 1;
                this.count = i55;
                this.recentPostsHeaderCell = i54;
                this.count = i55 + 1;
                this.recentPostsStartRow = i55;
                int size4 = (i55 + StatisticActivity.this.recentPostsLoaded.size()) - 1;
                this.recentPostsEndRow = size4;
                this.count = size4;
                this.count = size4 + 1;
                if (StatisticActivity.this.recentPostsLoaded.size() != StatisticActivity.this.recentPostsAll.size()) {
                    int i56 = this.count;
                    this.count = i56 + 1;
                    this.progressCell = i56;
                } else {
                    ArraySet<Integer> arraySet26 = this.emptyCells;
                    int i57 = this.count;
                    this.count = i57 + 1;
                    arraySet26.add(Integer.valueOf(i57));
                }
                ArraySet<Integer> arraySet27 = this.shadowDivideCells;
                int i58 = this.count;
                this.count = i58 + 1;
                arraySet27.add(Integer.valueOf(i58));
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 9 || viewHolder.getItemViewType() == 15;
        }
    }

    public class ChartCell extends BaseChartCell {
        public ChartCell(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents) {
            super(context, i, sharedUiComponents);
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
                } else if (this.data.zoomToken == null) {
                } else {
                    StatisticActivity.this.cancelZoom();
                    final String str = this.data.zoomToken + "_" + selectedDate;
                    ChartData chartData = (ChartData) StatisticActivity.this.childDataCache.get(str);
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
                    StatisticActivity statisticActivity = StatisticActivity.this;
                    final ZoomCancelable zoomCancelable = new ZoomCancelable();
                    statisticActivity.lastCancelable = zoomCancelable;
                    zoomCancelable.adapterPosition = StatisticActivity.this.recyclerListView.getChildAdapterPosition(this);
                    this.chartView.legendSignatureView.showProgress(true, false);
                    ConnectionsManager.getInstance(((BaseFragment) StatisticActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) StatisticActivity.this).currentAccount).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            StatisticActivity.ChartCell.this.lambda$onZoomed$1(str, zoomCancelable, tLObject, tLRPC$TL_error);
                        }
                    }, null, null, 0, StatisticActivity.this.chat.stats_dc, 1, true), ((BaseFragment) StatisticActivity.this).classGuid);
                }
            }
        }

        public void lambda$onZoomed$1(final String str, final ZoomCancelable zoomCancelable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            boolean z = true;
            final ChartData chartData = null;
            if (tLObject instanceof TLRPC$TL_statsGraph) {
                try {
                    JSONObject jSONObject = new JSONObject(((TLRPC$TL_statsGraph) tLObject).json.data);
                    ChartViewData chartViewData = this.data;
                    int i = chartViewData.graphType;
                    if (chartViewData != StatisticActivity.this.languagesData) {
                        z = false;
                    }
                    chartData = StatisticActivity.createChartData(jSONObject, i, z);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (tLObject instanceof TLRPC$TL_statsGraphError) {
                Toast.makeText(getContext(), ((TLRPC$TL_statsGraphError) tLObject).error, 1).show();
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StatisticActivity.ChartCell.this.lambda$onZoomed$0(chartData, str, zoomCancelable);
                }
            });
        }

        public void lambda$onZoomed$0(ChartData chartData, String str, ZoomCancelable zoomCancelable) {
            if (chartData != null) {
                StatisticActivity.this.childDataCache.put(str, chartData);
            }
            if (chartData != null && !zoomCancelable.canceled && zoomCancelable.adapterPosition >= 0) {
                View findViewByPosition = StatisticActivity.this.layoutManager.findViewByPosition(zoomCancelable.adapterPosition);
                if (findViewByPosition instanceof ChartCell) {
                    this.data.childChartData = chartData;
                    ChartCell chartCell = (ChartCell) findViewByPosition;
                    chartCell.chartView.legendSignatureView.showProgress(false, false);
                    chartCell.zoomChart(false);
                }
            }
            StatisticActivity.this.cancelZoom();
        }

        @Override
        public void loadData(ChartViewData chartViewData) {
            chartViewData.load(((BaseFragment) StatisticActivity.this).currentAccount, ((BaseFragment) StatisticActivity.this).classGuid, StatisticActivity.this.chat.stats_dc, StatisticActivity.this.recyclerListView, StatisticActivity.this.adapter, StatisticActivity.this.diffUtilsCallback);
        }
    }

    public static abstract class BaseChartCell extends FrameLayout {
        ChartHeaderView chartHeaderView;
        int chartType;
        BaseChartView chartView;
        ArrayList<CheckBoxHolder> checkBoxes;
        ViewGroup checkboxContainer;
        ChartViewData data;
        TextView errorTextView;
        RadialProgressView progressView;
        BaseChartView zoomedChartView;

        abstract void loadData(ChartViewData chartViewData);

        public abstract void onZoomed();

        public abstract void zoomCanceled();

        @SuppressLint({"ClickableViewAccessibility"})
        public BaseChartCell(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents) {
            super(context);
            this.checkBoxes = new ArrayList<>();
            setWillNotDraw(false);
            this.chartType = i;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.checkboxContainer = new FrameLayout(this, context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    int childCount = getChildCount();
                    int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        if (getChildAt(i6).getMeasuredWidth() + i5 > getMeasuredWidth()) {
                            i4 += getChildAt(i6).getMeasuredHeight();
                            i5 = 0;
                        }
                        i5 += getChildAt(i6).getMeasuredWidth();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight + i4 + AndroidUtilities.dp(16.0f));
                }

                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    int childCount = getChildCount();
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        if (getChildAt(i8).getMeasuredWidth() + i6 > getMeasuredWidth()) {
                            i7 += getChildAt(i8).getMeasuredHeight();
                            i6 = 0;
                        }
                        getChildAt(i8).layout(i6, i7, getChildAt(i8).getMeasuredWidth() + i6, getChildAt(i8).getMeasuredHeight() + i7);
                        i6 += getChildAt(i8).getMeasuredWidth();
                    }
                }
            };
            ChartHeaderView chartHeaderView = new ChartHeaderView(getContext());
            this.chartHeaderView = chartHeaderView;
            chartHeaderView.back.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            this.chartHeaderView.back.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StatisticActivity.BaseChartCell.this.lambda$new$0(view);
                }
            });
            if (i == 1) {
                this.chartView = new DoubleLinearChartView(getContext());
                DoubleLinearChartView doubleLinearChartView = new DoubleLinearChartView(getContext());
                this.zoomedChartView = doubleLinearChartView;
                doubleLinearChartView.legendSignatureView.useHour = true;
            } else if (i == 2) {
                this.chartView = new StackBarChartView(getContext());
                StackBarChartView stackBarChartView = new StackBarChartView(getContext());
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
            this.errorTextView.setTextColor(Theme.getColor("dialogTextGray4"));
            this.chartView.setDateSelectionListener(new BaseChartView.DateSelectionListener() {
                @Override
                public final void onDateSelected(long j) {
                    StatisticActivity.BaseChartCell.this.lambda$new$1(j);
                }
            });
            this.chartView.legendSignatureView.showProgress(false, false);
            this.chartView.legendSignatureView.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            this.chartView.legendSignatureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StatisticActivity.BaseChartCell.this.lambda$new$2(view);
                }
            });
            this.zoomedChartView.legendSignatureView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StatisticActivity.BaseChartCell.this.lambda$new$3(view);
                }
            });
            this.chartView.setVisibility(0);
            this.zoomedChartView.setVisibility(4);
            this.chartView.setHeader(this.chartHeaderView);
            linearLayout.addView(this.chartHeaderView, LayoutHelper.createFrame(-1, 52.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
            linearLayout.addView(this.checkboxContainer, LayoutHelper.createFrame(-1, -2.0f, 0, 16.0f, 0.0f, 16.0f, 0.0f));
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
                        } else if (chartData.lines.get(i3).id.equals(this.data.chartData.lines.get(i2).id)) {
                            boolean z3 = this.checkBoxes.get(i2).checkBox.checked;
                            ((LineViewData) this.zoomedChartView.lines.get(i3)).enabled = z3;
                            ((LineViewData) this.zoomedChartView.lines.get(i3)).alpha = z3 ? 1.0f : 0.0f;
                            this.checkBoxes.get(i2).checkBox.enabled = true;
                            this.checkBoxes.get(i2).checkBox.animate().alpha(1.0f).start();
                            if (z3) {
                                i++;
                            }
                            z2 = true;
                        } else {
                            i3++;
                        }
                    }
                    if (!z2) {
                        this.checkBoxes.get(i2).checkBox.enabled = false;
                        this.checkBoxes.get(i2).checkBox.animate().alpha(0.0f).start();
                    }
                }
                if (i == 0) {
                    for (int i4 = 0; i4 < this.data.chartData.lines.size(); i4++) {
                        this.checkBoxes.get(i4).checkBox.enabled = true;
                        this.checkBoxes.get(i4).checkBox.animate().alpha(1.0f).start();
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
            ValueAnimator createTransitionAnimator = createTransitionAnimator(selectedDate, true);
            createTransitionAnimator.addListener(new AnimatorListenerAdapter() {
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
                    ((Activity) baseChartCell.getContext()).getWindow().clearFlags(16);
                }
            });
            createTransitionAnimator.start();
        }

        private void zoomOut(boolean z) {
            if (this.data.chartData.x == null) {
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
                ((Activity) getContext()).getWindow().clearFlags(16);
                Iterator<CheckBoxHolder> it = this.checkBoxes.iterator();
                while (it.hasNext()) {
                    CheckBoxHolder next = it.next();
                    next.checkBox.setAlpha(1.0f);
                    next.checkBox.enabled = true;
                }
                return;
            }
            ValueAnimator createTransitionAnimator = createTransitionAnimator(selectedDate, false);
            createTransitionAnimator.addListener(new AnimatorListenerAdapter() {
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
                    ((Activity) BaseChartCell.this.getContext()).getWindow().clearFlags(16);
                }
            });
            Iterator<CheckBoxHolder> it2 = this.checkBoxes.iterator();
            while (it2.hasNext()) {
                CheckBoxHolder next2 = it2.next();
                next2.checkBox.animate().alpha(1.0f).start();
                next2.checkBox.enabled = true;
            }
            createTransitionAnimator.start();
        }

        private ValueAnimator createTransitionAnimator(long j, boolean z) {
            ((Activity) getContext()).getWindow().setFlags(16, 16);
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
            int binarySearch = Arrays.binarySearch(this.data.chartData.x, j);
            if (binarySearch < 0) {
                binarySearch = this.data.chartData.x.length - 1;
            }
            transitionParams.xPercentage = this.data.chartData.xPercentage[binarySearch];
            this.zoomedChartView.setVisibility(0);
            this.zoomedChartView.transitionParams = transitionParams;
            this.chartView.transitionParams = transitionParams;
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = 0;
            for (int i3 = 0; i3 < this.data.chartData.lines.size(); i3++) {
                if (this.data.chartData.lines.get(i3).y[binarySearch] > i2) {
                    i2 = this.data.chartData.lines.get(i3).y[binarySearch];
                }
                if (this.data.chartData.lines.get(i3).y[binarySearch] < i) {
                    i = this.data.chartData.lines.get(i3).y[binarySearch];
                }
            }
            float f = i + (i2 - i);
            BaseChartView baseChartView3 = this.chartView;
            float f2 = baseChartView3.currentMinHeight;
            final float f3 = (f - f2) / (baseChartView3.currentMaxHeight - f2);
            baseChartView3.fillTransitionParams(transitionParams);
            this.zoomedChartView.fillTransitionParams(transitionParams);
            float[] fArr = new float[2];
            fArr[0] = z ? 0.0f : 1.0f;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatisticActivity.BaseChartCell.this.lambda$createTransitionAnimator$4(transitionParams, f3, valueAnimator);
                }
            });
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(new FastOutSlowInInterpolator());
            return ofFloat;
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
            this.chartView.setData(chartViewData.chartData);
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.chartView.transitionParams = new TransitionParams();
                this.chartView.transitionParams.progress = 0.0f;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        StatisticActivity.BaseChartCell.this.lambda$updateData$5(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        BaseChartCell baseChartCell = BaseChartCell.this;
                        baseChartCell.chartView.transitionMode = 0;
                        baseChartCell.progressView.setVisibility(8);
                    }
                });
                ofFloat.start();
            }
        }

        public void lambda$updateData$5(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.progressView.setAlpha(1.0f - floatValue);
            this.chartView.transitionParams.progress = floatValue;
            this.zoomedChartView.invalidate();
            this.chartView.invalidate();
        }

        public void recolor() {
            ChartData chartData;
            ArrayList<ChartData.Line> arrayList;
            int i;
            this.chartView.updateColors();
            this.chartView.invalidate();
            this.zoomedChartView.updateColors();
            this.zoomedChartView.invalidate();
            this.chartHeaderView.recolor();
            this.chartHeaderView.invalidate();
            ChartViewData chartViewData = this.data;
            if (chartViewData != null && (chartData = chartViewData.chartData) != null && (arrayList = chartData.lines) != null && arrayList.size() > 1) {
                for (int i2 = 0; i2 < this.data.chartData.lines.size(); i2++) {
                    if (this.data.chartData.lines.get(i2).colorKey != null && Theme.hasThemeKey(this.data.chartData.lines.get(i2).colorKey)) {
                        i = Theme.getColor(this.data.chartData.lines.get(i2).colorKey);
                    } else if (ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite")) < 0.5d) {
                        i = this.data.chartData.lines.get(i2).colorDark;
                    } else {
                        i = this.data.chartData.lines.get(i2).color;
                    }
                    if (i2 < this.checkBoxes.size()) {
                        this.checkBoxes.get(i2).recolor(i);
                    }
                }
            }
            this.progressView.setProgressColor(Theme.getColor("progressCircle"));
            this.errorTextView.setTextColor(Theme.getColor("dialogTextGray4"));
        }

        public class CheckBoxHolder {
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
                        StatisticActivity.BaseChartCell.CheckBoxHolder.this.lambda$setData$0(lineViewData, view);
                    }
                });
                this.checkBox.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean lambda$setData$1;
                        lambda$setData$1 = StatisticActivity.BaseChartCell.CheckBoxHolder.this.lambda$setData$1(lineViewData, view);
                        return lambda$setData$1;
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
                        } else if (i != this.position && BaseChartCell.this.checkBoxes.get(i).checkBox.enabled && BaseChartCell.this.checkBoxes.get(i).checkBox.checked) {
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
                if (this.checkBox.enabled) {
                    BaseChartCell.this.zoomCanceled();
                    int size = BaseChartCell.this.checkBoxes.size();
                    for (int i = 0; i < size; i++) {
                        BaseChartCell.this.checkBoxes.get(i).checkBox.setChecked(false);
                        BaseChartCell.this.checkBoxes.get(i).line.enabled = false;
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
                return false;
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
        ChartData chartData;
        ChartData childChartData;
        public String errorMessage;
        final int graphType;
        boolean isEmpty;
        public boolean isError;
        boolean isLanguages;
        boolean loading;
        final String title;
        String token;
        boolean useHourFormat;
        boolean useWeekFormat;
        String zoomToken;

        public ChartViewData(String str, int i) {
            this.title = str;
            this.graphType = i;
        }

        public void load(int i, int i2, int i3, final RecyclerListView recyclerListView, Adapter adapter, final DiffUtilsCallback diffUtilsCallback) {
            if (this.loading) {
                return;
            }
            this.loading = true;
            TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph = new TLRPC$TL_stats_loadAsyncGraph();
            tLRPC$TL_stats_loadAsyncGraph.token = this.token;
            ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StatisticActivity.ChartViewData.this.lambda$load$1(recyclerListView, diffUtilsCallback, tLObject, tLRPC$TL_error);
                }
            }, null, null, 0, i3, 1, true), i2);
        }

        public void lambda$load$1(final org.telegram.ui.Components.RecyclerListView r9, final org.telegram.ui.StatisticActivity.DiffUtilsCallback r10, org.telegram.tgnet.TLObject r11, org.telegram.tgnet.TLRPC$TL_error r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.StatisticActivity.ChartViewData.lambda$load$1(org.telegram.ui.Components.RecyclerListView, org.telegram.ui.StatisticActivity$DiffUtilsCallback, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
        }

        public void lambda$load$0(ChartData chartData, String str, RecyclerListView recyclerListView, DiffUtilsCallback diffUtilsCallback) {
            boolean z = false;
            this.loading = false;
            this.chartData = chartData;
            this.zoomToken = str;
            int childCount = recyclerListView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = recyclerListView.getChildAt(i);
                if (childAt instanceof ChartCell) {
                    ChartCell chartCell = (ChartCell) childAt;
                    if (chartCell.data == this) {
                        chartCell.updateData(this, true);
                        z = true;
                        break;
                    }
                }
                i++;
            }
            if (z) {
                return;
            }
            recyclerListView.setItemAnimator(null);
            diffUtilsCallback.update();
        }
    }

    public void loadMessages() {
        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
        tLRPC$TL_channels_getMessages.id = new ArrayList<>();
        int size = this.recentPostsAll.size();
        int i = 0;
        for (int i2 = this.recentPostIdtoIndexMap.get(this.loadFromId); i2 < size; i2++) {
            if (this.recentPostsAll.get(i2).message == null) {
                tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(this.recentPostsAll.get(i2).counters.msg_id));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tLRPC$TL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chat.id);
        this.messagesIsLoading = true;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StatisticActivity.this.lambda$loadMessages$7(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessages$7(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC$messages_Messages) {
            ArrayList<TLRPC$Message> arrayList2 = ((TLRPC$messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new MessageObject(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().putMessages(arrayList2, false, true, true, 0, false, 0);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StatisticActivity.this.lambda$loadMessages$6(arrayList);
            }
        });
    }

    public void lambda$loadMessages$6(ArrayList arrayList) {
        int i = 0;
        this.messagesIsLoading = false;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            int i3 = this.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
            if (i3 >= 0 && this.recentPostsAll.get(i3).counters.msg_id == messageObject.getId()) {
                this.recentPostsAll.get(i3).message = messageObject;
            }
        }
        this.recentPostsLoaded.clear();
        int size2 = this.recentPostsAll.size();
        while (true) {
            if (i >= size2) {
                break;
            }
            RecentPostInfo recentPostInfo = this.recentPostsAll.get(i);
            if (recentPostInfo.message == null) {
                this.loadFromId = recentPostInfo.counters.msg_id;
                break;
            } else {
                this.recentPostsLoaded.add(recentPostInfo);
                i++;
            }
        }
        this.recyclerListView.setItemAnimator(null);
        this.diffUtilsCallback.update();
    }

    private void recolorRecyclerItem(View view) {
        if (view instanceof ChartCell) {
            ((ChartCell) view).recolor();
        } else if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(ApplicationLoader.applicationContext, R.drawable.greydivider, "windowBackgroundGrayShadow"), 0, 0);
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
        } else if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            ((OverviewCell) view).updateColors();
        }
    }

    public static class DiffUtilsCallback extends DiffUtil.Callback {
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
        int startPosts;
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
            } else if (i == this.growCell && i2 == this.adapter.growCell) {
                return true;
            } else {
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
                return i == this.topDayOfWeeksCell && i2 == this.adapter.topDayOfWeeksCell;
            }
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return this.positionToTypeMap.get(i) == this.adapter.getItemViewType(i2);
        }

        public void update() {
            int i;
            long j;
            int i2;
            View findViewByPosition;
            saveOldState();
            this.adapter.update();
            int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            while (true) {
                i = 0;
                if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                    j = -1;
                    i2 = 0;
                    break;
                } else if (this.adapter.getItemId(findFirstVisibleItemPosition) != -1 && (findViewByPosition = this.layoutManager.findViewByPosition(findFirstVisibleItemPosition)) != null) {
                    j = this.adapter.getItemId(findFirstVisibleItemPosition);
                    i2 = findViewByPosition.getTop();
                    break;
                } else {
                    findFirstVisibleItemPosition++;
                }
            }
            DiffUtil.calculateDiff(this).dispatchUpdatesTo(this.adapter);
            if (j != -1) {
                int i3 = -1;
                while (true) {
                    if (i >= this.adapter.getItemCount()) {
                        break;
                    } else if (this.adapter.getItemId(i) == j) {
                        i3 = i;
                        break;
                    } else {
                        i++;
                    }
                }
                if (i3 > 0) {
                    this.layoutManager.scrollToPositionWithOffset(i3, i2);
                }
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ChartViewData chartViewData;
        ChartViewData chartViewData2;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                StatisticActivity.this.lambda$getThemeDescriptions$8();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"message"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"views"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"shares"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"date"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{ChartHeaderView.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "dialogTextBlack"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartSignature"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartSignatureAlpha"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartHintLine"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartActiveLine"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartInactivePickerChart"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "statisticChartActivePickerChart"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "dialogBackground"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, "actionBarActionModeDefaultSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundWhiteGreenText2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer != null ? chatAvatarContainer.getTitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "player_actionBarTitle"));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer2 != null ? chatAvatarContainer2.getSubtitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, (Class[]) null, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "player_actionBarSubtitle", (Object) null));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "statisticChartLineEmpty"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueButton"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueIcon"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CHECKTAG, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText5"));
        arrayList.add(new ThemeDescription(this.recyclerListView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class, HeaderCell.class, TextView.class, PeopleNearbyActivity.HintInnerCell.class}, null, null, null, "windowBackgroundWhite"));
        if (this.isMegagroup) {
            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    chartViewData2 = this.growthData;
                } else if (i == 1) {
                    chartViewData2 = this.groupMembersData;
                } else if (i == 2) {
                    chartViewData2 = this.newMembersBySourceData;
                } else if (i == 3) {
                    chartViewData2 = this.membersLanguageData;
                } else if (i == 4) {
                    chartViewData2 = this.messagesData;
                } else {
                    chartViewData2 = this.actionsData;
                }
                putColorFromData(chartViewData2, arrayList, themeDescriptionDelegate);
            }
        } else {
            for (int i2 = 0; i2 < 9; i2++) {
                if (i2 == 0) {
                    chartViewData = this.growthData;
                } else if (i2 == 1) {
                    chartViewData = this.followersData;
                } else if (i2 == 2) {
                    chartViewData = this.interactionsData;
                } else if (i2 == 3) {
                    chartViewData = this.ivInteractionsData;
                } else if (i2 == 4) {
                    chartViewData = this.viewsBySourceData;
                } else if (i2 == 5) {
                    chartViewData = this.newFollowersBySourceData;
                } else if (i2 == 6) {
                    chartViewData = this.notificationsData;
                } else if (i2 == 7) {
                    chartViewData = this.topHoursData;
                } else {
                    chartViewData = this.languagesData;
                }
                putColorFromData(chartViewData, arrayList, themeDescriptionDelegate);
            }
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$8() {
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

    public static void putColorFromData(ChartViewData chartViewData, ArrayList<ThemeDescription> arrayList, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        ChartData chartData;
        if (chartViewData == null || (chartData = chartViewData.chartData) == null) {
            return;
        }
        Iterator<ChartData.Line> it = chartData.lines.iterator();
        while (it.hasNext()) {
            ChartData.Line next = it.next();
            String str = next.colorKey;
            if (str != null) {
                if (!Theme.hasThemeKey(str)) {
                    Theme.setColor(next.colorKey, Theme.isCurrentThemeNight() ? next.colorDark : next.color, false);
                    Theme.setDefaultColor(next.colorKey, next.color);
                }
                arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, next.colorKey));
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
        String sharesPrimary;
        String sharesSecondary;
        String sharesTitle;
        boolean sharesUp;
        String viewsPrimary;
        String viewsSecondary;
        String viewsTitle;
        boolean viewsUp;

        public OverviewChannelData(TLRPC$TL_stats_broadcastStats tLRPC$TL_stats_broadcastStats) {
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev = tLRPC$TL_stats_broadcastStats.followers;
            double d = tLRPC$TL_statsAbsValueAndPrev.current;
            double d2 = tLRPC$TL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.followersTitle = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            this.followersPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_broadcastStats.followers.current, 0);
            if (i == 0 || abs == 0.0f) {
                this.followersSecondary = "";
            } else {
                int i2 = (int) abs;
                if (abs == i2) {
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    objArr[0] = sb.toString();
                    objArr[1] = Integer.valueOf(i2);
                    objArr[2] = "%";
                    this.followersSecondary = String.format(locale, "%s (%d%s)", objArr);
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    Object[] objArr2 = new Object[3];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    objArr2[0] = sb2.toString();
                    objArr2[1] = Float.valueOf(abs);
                    objArr2[2] = "%";
                    this.followersSecondary = String.format(locale2, "%s (%.1f%s)", objArr2);
                }
            }
            this.followersUp = i >= 0;
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev2 = tLRPC$TL_stats_broadcastStats.shares_per_post;
            double d3 = tLRPC$TL_statsAbsValueAndPrev2.current;
            double d4 = tLRPC$TL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float abs2 = d4 == 0.0d ? 0.0f : Math.abs((i3 / ((float) d4)) * 100.0f);
            this.sharesTitle = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            this.sharesPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_broadcastStats.shares_per_post.current, 0);
            if (i3 == 0 || abs2 == 0.0f) {
                this.sharesSecondary = "";
            } else {
                int i4 = (int) abs2;
                if (abs2 == i4) {
                    Locale locale3 = Locale.ENGLISH;
                    Object[] objArr3 = new Object[3];
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i3 > 0 ? "+" : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    objArr3[0] = sb3.toString();
                    objArr3[1] = Integer.valueOf(i4);
                    objArr3[2] = "%";
                    this.sharesSecondary = String.format(locale3, "%s (%d%s)", objArr3);
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    Object[] objArr4 = new Object[3];
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i3 > 0 ? "+" : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    objArr4[0] = sb4.toString();
                    objArr4[1] = Float.valueOf(abs2);
                    objArr4[2] = "%";
                    this.sharesSecondary = String.format(locale4, "%s (%.1f%s)", objArr4);
                }
            }
            this.sharesUp = i3 >= 0;
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev3 = tLRPC$TL_stats_broadcastStats.views_per_post;
            double d5 = tLRPC$TL_statsAbsValueAndPrev3.current;
            double d6 = tLRPC$TL_statsAbsValueAndPrev3.previous;
            int i5 = (int) (d5 - d6);
            float abs3 = d6 == 0.0d ? 0.0f : Math.abs((i5 / ((float) d6)) * 100.0f);
            this.viewsTitle = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            this.viewsPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_broadcastStats.views_per_post.current, 0);
            if (i5 == 0 || abs3 == 0.0f) {
                this.viewsSecondary = "";
            } else {
                int i6 = (int) abs3;
                if (abs3 == i6) {
                    Locale locale5 = Locale.ENGLISH;
                    Object[] objArr5 = new Object[3];
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i5 <= 0 ? "" : "+");
                    sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    objArr5[0] = sb5.toString();
                    objArr5[1] = Integer.valueOf(i6);
                    objArr5[2] = "%";
                    this.viewsSecondary = String.format(locale5, "%s (%d%s)", objArr5);
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    Object[] objArr6 = new Object[3];
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i5 <= 0 ? "" : "+");
                    sb6.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    objArr6[0] = sb6.toString();
                    objArr6[1] = Float.valueOf(abs3);
                    objArr6[2] = "%";
                    this.viewsSecondary = String.format(locale6, "%s (%.1f%s)", objArr6);
                }
            }
            this.viewsUp = i5 >= 0;
            TLRPC$TL_statsPercentValue tLRPC$TL_statsPercentValue = tLRPC$TL_stats_broadcastStats.enabled_notifications;
            float f = (float) ((tLRPC$TL_statsPercentValue.part / tLRPC$TL_statsPercentValue.total) * 100.0d);
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

        public OverviewChatData(TLRPC$TL_stats_megagroupStats tLRPC$TL_stats_megagroupStats) {
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev = tLRPC$TL_stats_megagroupStats.members;
            double d = tLRPC$TL_statsAbsValueAndPrev.current;
            double d2 = tLRPC$TL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float abs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.membersTitle = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            this.membersPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_megagroupStats.members.current, 0);
            if (i == 0 || abs == 0.0f) {
                this.membersSecondary = "";
            } else {
                int i2 = (int) abs;
                if (abs == i2) {
                    Locale locale = Locale.ENGLISH;
                    Object[] objArr = new Object[3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    objArr[0] = sb.toString();
                    objArr[1] = Integer.valueOf(i2);
                    objArr[2] = "%";
                    this.membersSecondary = String.format(locale, "%s (%d%s)", objArr);
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    Object[] objArr2 = new Object[3];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    objArr2[0] = sb2.toString();
                    objArr2[1] = Float.valueOf(abs);
                    objArr2[2] = "%";
                    this.membersSecondary = String.format(locale2, "%s (%.1f%s)", objArr2);
                }
            }
            this.membersUp = i >= 0;
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev2 = tLRPC$TL_stats_megagroupStats.viewers;
            double d3 = tLRPC$TL_statsAbsValueAndPrev2.current;
            double d4 = tLRPC$TL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float abs2 = d4 == 0.0d ? 0.0f : Math.abs((i3 / ((float) d4)) * 100.0f);
            this.viewingMembersTitle = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            this.viewingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_megagroupStats.viewers.current, 0);
            if (i3 == 0 || abs2 == 0.0f) {
                this.viewingMembersSecondary = "";
            } else {
                Locale locale3 = Locale.ENGLISH;
                Object[] objArr3 = new Object[1];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i3 > 0 ? "+" : "");
                sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                objArr3[0] = sb3.toString();
                this.viewingMembersSecondary = String.format(locale3, "%s", objArr3);
            }
            this.viewingMembersUp = i3 >= 0;
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev3 = tLRPC$TL_stats_megagroupStats.posters;
            double d5 = tLRPC$TL_statsAbsValueAndPrev3.current;
            double d6 = tLRPC$TL_statsAbsValueAndPrev3.previous;
            int i4 = (int) (d5 - d6);
            float abs3 = d6 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d6)) * 100.0f);
            this.postingMembersTitle = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            this.postingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_megagroupStats.posters.current, 0);
            if (i4 == 0 || abs3 == 0.0f) {
                this.postingMembersSecondary = "";
            } else {
                Locale locale4 = Locale.ENGLISH;
                Object[] objArr4 = new Object[1];
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i4 > 0 ? "+" : "");
                sb4.append(AndroidUtilities.formatWholeNumber(i4, 0));
                objArr4[0] = sb4.toString();
                this.postingMembersSecondary = String.format(locale4, "%s", objArr4);
            }
            this.postingMembersUp = i4 >= 0;
            TLRPC$TL_statsAbsValueAndPrev tLRPC$TL_statsAbsValueAndPrev4 = tLRPC$TL_stats_megagroupStats.messages;
            double d7 = tLRPC$TL_statsAbsValueAndPrev4.current;
            double d8 = tLRPC$TL_statsAbsValueAndPrev4.previous;
            int i5 = (int) (d7 - d8);
            float abs4 = d8 == 0.0d ? 0.0f : Math.abs((i5 / ((float) d8)) * 100.0f);
            this.messagesTitle = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            this.messagesPrimary = AndroidUtilities.formatWholeNumber((int) tLRPC$TL_stats_megagroupStats.messages.current, 0);
            if (i5 == 0 || abs4 == 0.0f) {
                this.messagesSecondary = "";
            } else {
                Locale locale5 = Locale.ENGLISH;
                Object[] objArr5 = new Object[1];
                StringBuilder sb5 = new StringBuilder();
                sb5.append(i5 <= 0 ? "" : "+");
                sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                objArr5[0] = sb5.toString();
                this.messagesSecondary = String.format(locale5, "%s", objArr5);
            }
            this.messagesUp = i5 >= 0;
        }
    }

    public static class OverviewCell extends LinearLayout {
        TextView[] primary;
        TextView[] secondary;
        TextView[] title;

        public OverviewCell(Context context) {
            super(context);
            this.primary = new TextView[4];
            this.secondary = new TextView[4];
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
                    this.secondary[i3] = new TextView(context);
                    this.title[i3] = new TextView(context);
                    this.primary[i3].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    this.primary[i3].setTextSize(1, 17.0f);
                    this.title[i3].setTextSize(1, 13.0f);
                    this.secondary[i3].setTextSize(1, 13.0f);
                    this.secondary[i3].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                    linearLayout3.addView(this.primary[i3]);
                    linearLayout3.addView(this.secondary[i3]);
                    linearLayout2.addView(linearLayout3);
                    linearLayout2.addView(this.title[i3]);
                    linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
                }
                addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i == 0 ? 16.0f : 0.0f));
                i++;
            }
        }

        public void setData(OverviewChannelData overviewChannelData) {
            this.primary[0].setText(overviewChannelData.followersPrimary);
            this.primary[1].setText(overviewChannelData.notificationsPrimary);
            this.primary[2].setText(overviewChannelData.viewsPrimary);
            this.primary[3].setText(overviewChannelData.sharesPrimary);
            this.secondary[0].setText(overviewChannelData.followersSecondary);
            this.secondary[0].setTag(overviewChannelData.followersUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.secondary[1].setText("");
            this.secondary[2].setText(overviewChannelData.viewsSecondary);
            this.secondary[2].setTag(overviewChannelData.viewsUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.secondary[3].setText(overviewChannelData.sharesSecondary);
            this.secondary[3].setTag(overviewChannelData.sharesUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.title[0].setText(overviewChannelData.followersTitle);
            this.title[1].setText(overviewChannelData.notificationsTitle);
            this.title[2].setText(overviewChannelData.viewsTitle);
            this.title[3].setText(overviewChannelData.sharesTitle);
            updateColors();
        }

        public void setData(OverviewChatData overviewChatData) {
            this.primary[0].setText(overviewChatData.membersPrimary);
            this.primary[1].setText(overviewChatData.messagesPrimary);
            this.primary[2].setText(overviewChatData.viewingMembersPrimary);
            this.primary[3].setText(overviewChatData.postingMembersPrimary);
            this.secondary[0].setText(overviewChatData.membersSecondary);
            this.secondary[0].setTag(overviewChatData.membersUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.secondary[1].setText(overviewChatData.messagesSecondary);
            this.secondary[1].setTag(overviewChatData.messagesUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.secondary[2].setText(overviewChatData.viewingMembersSecondary);
            this.secondary[2].setTag(overviewChatData.viewingMembersUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.secondary[3].setText(overviewChatData.postingMembersSecondary);
            this.secondary[3].setTag(overviewChatData.postingMembersUp ? "windowBackgroundWhiteGreenText2" : "windowBackgroundWhiteRedText5");
            this.title[0].setText(overviewChatData.membersTitle);
            this.title[1].setText(overviewChatData.messagesTitle);
            this.title[2].setText(overviewChatData.viewingMembersTitle);
            this.title[3].setText(overviewChatData.postingMembersTitle);
            updateColors();
        }

        public void updateColors() {
            for (int i = 0; i < 4; i++) {
                this.primary[i].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.title[i].setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
                String str = (String) this.secondary[i].getTag();
                if (str != null) {
                    this.secondary[i].setTextColor(Theme.getColor(str));
                }
            }
        }
    }

    public static class MemberData {
        public String description;
        public TLRPC$User user;
        long user_id;

        public static MemberData from(TLRPC$TL_statsGroupTopPoster tLRPC$TL_statsGroupTopPoster, ArrayList<TLRPC$User> arrayList) {
            MemberData memberData = new MemberData();
            long j = tLRPC$TL_statsGroupTopPoster.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            StringBuilder sb = new StringBuilder();
            int i = tLRPC$TL_statsGroupTopPoster.messages;
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("messages", i, new Object[0]));
            }
            if (tLRPC$TL_statsGroupTopPoster.avg_chars > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tLRPC$TL_statsGroupTopPoster.avg_chars, new Object[0])));
            }
            memberData.description = sb.toString();
            return memberData;
        }

        public static MemberData from(TLRPC$TL_statsGroupTopAdmin tLRPC$TL_statsGroupTopAdmin, ArrayList<TLRPC$User> arrayList) {
            MemberData memberData = new MemberData();
            long j = tLRPC$TL_statsGroupTopAdmin.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            StringBuilder sb = new StringBuilder();
            int i = tLRPC$TL_statsGroupTopAdmin.deleted;
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("Deletions", i, new Object[0]));
            }
            if (tLRPC$TL_statsGroupTopAdmin.banned > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Bans", tLRPC$TL_statsGroupTopAdmin.banned, new Object[0]));
            }
            if (tLRPC$TL_statsGroupTopAdmin.kicked > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Restrictions", tLRPC$TL_statsGroupTopAdmin.kicked, new Object[0]));
            }
            memberData.description = sb.toString();
            return memberData;
        }

        public static MemberData from(TLRPC$TL_statsGroupTopInviter tLRPC$TL_statsGroupTopInviter, ArrayList<TLRPC$User> arrayList) {
            MemberData memberData = new MemberData();
            long j = tLRPC$TL_statsGroupTopInviter.user_id;
            memberData.user_id = j;
            memberData.user = find(j, arrayList);
            int i = tLRPC$TL_statsGroupTopInviter.invitations;
            if (i > 0) {
                memberData.description = LocaleController.formatPluralString("Invitations", i, new Object[0]);
            } else {
                memberData.description = "";
            }
            return memberData;
        }

        public static TLRPC$User find(long j, ArrayList<TLRPC$User> arrayList) {
            Iterator<TLRPC$User> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC$User next = it.next();
                if (next.id == j) {
                    return next;
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

        public void onLongClick(TLRPC$ChatFull tLRPC$ChatFull, StatisticActivity statisticActivity, AlertDialog[] alertDialogArr) {
            onLongClick(tLRPC$ChatFull, statisticActivity, alertDialogArr, true);
        }

        private void onLongClick(final TLRPC$ChatFull tLRPC$ChatFull, final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, boolean z) {
            ArrayList arrayList;
            final TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant;
            TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant2;
            final boolean z2;
            int i;
            String str;
            ArrayList<TLRPC$ChatParticipant> arrayList2;
            MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.user, false);
            ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (!z || (arrayList2 = tLRPC$ChatFull.participants.participants) == null) {
                arrayList = arrayList5;
                tLRPC$TL_chatChannelParticipant = null;
                tLRPC$TL_chatChannelParticipant2 = null;
            } else {
                int size = arrayList2.size();
                int i2 = 0;
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant3 = null;
                tLRPC$TL_chatChannelParticipant2 = null;
                while (i2 < size) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = tLRPC$ChatFull.participants.participants.get(i2);
                    long j = tLRPC$ChatParticipant.user_id;
                    ArrayList arrayList6 = arrayList5;
                    if (j == this.user.id && (tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant)) {
                        tLRPC$TL_chatChannelParticipant3 = (TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant;
                    }
                    if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant)) {
                        tLRPC$TL_chatChannelParticipant2 = (TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant;
                    }
                    i2++;
                    arrayList5 = arrayList6;
                }
                arrayList = arrayList5;
                tLRPC$TL_chatChannelParticipant = tLRPC$TL_chatChannelParticipant3;
            }
            arrayList3.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
            ArrayList arrayList7 = arrayList;
            arrayList7.add(Integer.valueOf(R.drawable.msg_openprofile));
            arrayList4.add(2);
            arrayList3.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
            arrayList7.add(Integer.valueOf(R.drawable.msg_msgbubble3));
            arrayList4.add(1);
            if (z && tLRPC$TL_chatChannelParticipant == null) {
                if (alertDialogArr[0] == null) {
                    alertDialogArr[0] = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3);
                    alertDialogArr[0].showDelayed(300L);
                }
                TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
                tLRPC$TL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(tLRPC$ChatFull.id);
                tLRPC$TL_channels_getParticipant.participant = MessagesController.getInputPeer(this.user);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StatisticActivity.MemberData.this.lambda$onLongClick$1(statisticActivity, alertDialogArr, tLRPC$ChatFull, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (z && tLRPC$TL_chatChannelParticipant2 == null) {
                if (alertDialogArr[0] == null) {
                    alertDialogArr[0] = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3);
                    alertDialogArr[0].showDelayed(300L);
                }
                TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant2 = new TLRPC$TL_channels_getParticipant();
                tLRPC$TL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(tLRPC$ChatFull.id);
                tLRPC$TL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_channels_getParticipant2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StatisticActivity.MemberData.this.lambda$onLongClick$3(statisticActivity, alertDialogArr, tLRPC$ChatFull, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                if (alertDialogArr[0] != null) {
                    alertDialogArr[0].dismiss();
                    alertDialogArr[0] = null;
                }
                if (tLRPC$TL_chatChannelParticipant2 != null && tLRPC$TL_chatChannelParticipant != null && tLRPC$TL_chatChannelParticipant2.user_id != tLRPC$TL_chatChannelParticipant.user_id) {
                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_chatChannelParticipant.channelParticipant;
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$TL_chatChannelParticipant2.channelParticipant.admin_rights;
                    boolean z3 = tLRPC$TL_chatAdminRights != null && tLRPC$TL_chatAdminRights.add_admins;
                    if (z3 && ((tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantCreator) || ((tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) && !tLRPC$ChannelParticipant.can_edit))) {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = tLRPC$ChannelParticipant.admin_rights == null;
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(statisticActivity.getParentActivity());
                        builder.setItems((CharSequence[]) arrayList3.toArray(new CharSequence[arrayList4.size()]), AndroidUtilities.toIntArray(arrayList7), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                StatisticActivity.MemberData.this.lambda$onLongClick$4(arrayList4, tLRPC$ChatFull, tLRPC$TL_chatChannelParticipant, z2, statisticActivity, dialogInterface, i3);
                            }
                        });
                        statisticActivity.showDialog(builder.create());
                    }
                }
                z2 = false;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(statisticActivity.getParentActivity());
                builder2.setItems((CharSequence[]) arrayList3.toArray(new CharSequence[arrayList4.size()]), AndroidUtilities.toIntArray(arrayList7), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        StatisticActivity.MemberData.this.lambda$onLongClick$4(arrayList4, tLRPC$ChatFull, tLRPC$TL_chatChannelParticipant, z2, statisticActivity, dialogInterface, i3);
                    }
                });
                statisticActivity.showDialog(builder2.create());
            }
        }

        public void lambda$onLongClick$1(final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, final TLRPC$ChatFull tLRPC$ChatFull, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StatisticActivity.MemberData.this.lambda$onLongClick$0(statisticActivity, alertDialogArr, tLRPC$TL_error, tLObject, tLRPC$ChatFull);
                }
            });
        }

        public void lambda$onLongClick$0(StatisticActivity statisticActivity, AlertDialog[] alertDialogArr, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$ChatFull tLRPC$ChatFull) {
            if (statisticActivity.isFinishing() || statisticActivity.getFragmentView() == null || alertDialogArr[0] == null) {
                return;
            }
            if (tLRPC$TL_error == null) {
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = new TLRPC$TL_chatChannelParticipant();
                tLRPC$TL_chatChannelParticipant.channelParticipant = ((TLRPC$TL_channels_channelParticipant) tLObject).participant;
                tLRPC$TL_chatChannelParticipant.user_id = this.user.id;
                tLRPC$ChatFull.participants.participants.add(0, tLRPC$TL_chatChannelParticipant);
                onLongClick(tLRPC$ChatFull, statisticActivity, alertDialogArr);
                return;
            }
            onLongClick(tLRPC$ChatFull, statisticActivity, alertDialogArr, false);
        }

        public void lambda$onLongClick$3(final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, final TLRPC$ChatFull tLRPC$ChatFull, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StatisticActivity.MemberData.this.lambda$onLongClick$2(statisticActivity, alertDialogArr, tLRPC$TL_error, tLObject, tLRPC$ChatFull);
                }
            });
        }

        public void lambda$onLongClick$2(StatisticActivity statisticActivity, AlertDialog[] alertDialogArr, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$ChatFull tLRPC$ChatFull) {
            if (statisticActivity.isFinishing() || statisticActivity.getFragmentView() == null || alertDialogArr[0] == null) {
                return;
            }
            if (tLRPC$TL_error == null) {
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = new TLRPC$TL_chatChannelParticipant();
                tLRPC$TL_chatChannelParticipant.channelParticipant = ((TLRPC$TL_channels_channelParticipant) tLObject).participant;
                tLRPC$TL_chatChannelParticipant.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                tLRPC$ChatFull.participants.participants.add(0, tLRPC$TL_chatChannelParticipant);
                onLongClick(tLRPC$ChatFull, statisticActivity, alertDialogArr);
                return;
            }
            onLongClick(tLRPC$ChatFull, statisticActivity, alertDialogArr, false);
        }

        public void lambda$onLongClick$4(ArrayList arrayList, TLRPC$ChatFull tLRPC$ChatFull, final TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant, final boolean z, final StatisticActivity statisticActivity, DialogInterface dialogInterface, int i) {
            if (((Integer) arrayList.get(i)).intValue() == 0) {
                final boolean[] zArr = new boolean[1];
                long j = this.user.id;
                long j2 = tLRPC$ChatFull.id;
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_chatChannelParticipant.channelParticipant;
                ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, j2, tLRPC$ChannelParticipant.admin_rights, null, tLRPC$ChannelParticipant.banned_rights, tLRPC$ChannelParticipant.rank, 0, true, z, null) {
                    @Override
                    public void onTransitionAnimationEnd(boolean z2, boolean z3) {
                        if (!z2 && z3 && zArr[0] && BulletinFactory.canShowBulletin(statisticActivity)) {
                            BulletinFactory.createPromoteToAdminBulletin(statisticActivity, MemberData.this.user.first_name).show();
                        }
                    }
                };
                chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate(this) {
                    @Override
                    public void didChangeOwner(TLRPC$User tLRPC$User) {
                    }

                    @Override
                    public void didSetRights(int i2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str) {
                        if (i2 == 0) {
                            TLRPC$ChannelParticipant tLRPC$ChannelParticipant2 = tLRPC$TL_chatChannelParticipant.channelParticipant;
                            tLRPC$ChannelParticipant2.admin_rights = null;
                            tLRPC$ChannelParticipant2.rank = "";
                            return;
                        }
                        TLRPC$ChannelParticipant tLRPC$ChannelParticipant3 = tLRPC$TL_chatChannelParticipant.channelParticipant;
                        tLRPC$ChannelParticipant3.admin_rights = tLRPC$TL_chatAdminRights;
                        tLRPC$ChannelParticipant3.rank = str;
                        if (z) {
                            zArr[0] = true;
                        }
                    }
                });
                statisticActivity.presentFragment(chatRightsEditActivity);
            } else if (((Integer) arrayList.get(i)).intValue() == 2) {
                onClick(statisticActivity);
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tLRPC$ChatFull.id);
                bundle.putLong("search_from_user_id", this.user.id);
                statisticActivity.presentFragment(new ChatActivity(bundle));
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite")) > 0.699999988079071d;
    }
}
