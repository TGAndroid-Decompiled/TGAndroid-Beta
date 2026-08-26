package org.telegram.ui.Components.poll.sheets;

import android.app.Activity;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.StatisticActivity;

public final class PollStatisticsBottomSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final StatisticActivity.ChartViewData chartViewData;

    public PollStatisticsBottomSheet(Activity activity, Theme.ResourcesProvider resourcesProvider, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(activity, null, true, false, false, false, false, 2, resourcesProvider);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.chartViewData = StatisticActivity.createViewData(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2, false);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections(true);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        actionBarMenuCreateMenu.addItem(-1, R.drawable.ic_close_white);
        actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(5.0f));
        this.adapter.update(false);
    }

    public static int loadStatistics(int i, long j, int i2, ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i).getInputPeer(j);
        tL_statsGetPollStats.msg_id = i2;
        return ConnectionsManager.getInstance(i).sendRequestTyped(tL_statsGetPollStats, new AiTonesController$$ExternalSyntheticLambda0(), new GiftSheet$$ExternalSyntheticLambda8(articleViewer$$ExternalSyntheticLambda21, 14));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 13), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }
}
