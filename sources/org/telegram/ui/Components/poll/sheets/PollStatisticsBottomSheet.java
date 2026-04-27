package org.telegram.ui.Components.poll.sheets;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.StatisticActivity;

public class PollStatisticsBottomSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final StatisticActivity.ChartViewData chartViewData;

    public PollStatisticsBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, TL_stats.TL_statsPollStats tL_statsPollStats) {
        super(context, null, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.chartViewData = StatisticActivity.createViewData(tL_statsPollStats.votes_graph, LocaleController.getString(R.string.PollV2StatsVoteTimeline), 2);
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

    public static int loadStatistics(int i, long j, int i2, final Utilities.Callback callback) {
        TL_stats.TL_statsGetPollStats tL_statsGetPollStats = new TL_stats.TL_statsGetPollStats();
        tL_statsGetPollStats.peer = MessagesController.getInstance(i).getInputPeer(j);
        tL_statsGetPollStats.msg_id = i2;
        return ConnectionsManager.getInstance(i).sendRequestTyped(tL_statsGetPollStats, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                callback.run((TL_stats.TL_statsPollStats) obj);
            }
        });
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.PollV2StatsPollStats);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.chartViewData != null) {
            arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
            arrayList.add(UItem.asChart(0, 0, this.chartViewData));
        }
    }
}
