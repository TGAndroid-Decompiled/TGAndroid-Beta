package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda29 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda29(ChannelMonetizationLayout channelMonetizationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ChannelMonetizationLayout channelMonetizationLayout = this.f$0;
                channelMonetizationLayout.getClass();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(tL_error, 8));
                } else if (tLObject instanceof TLRPC.Updates) {
                    AndroidUtilities.runOnUIThread(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(channelMonetizationLayout, 4));
                    MessagesController.getInstance(channelMonetizationLayout.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 1:
                final ChannelMonetizationLayout channelMonetizationLayout2 = this.f$0;
                channelMonetizationLayout2.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                ChannelMonetizationLayout channelMonetizationLayout3 = channelMonetizationLayout2;
                                channelMonetizationLayout3.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    channelMonetizationLayout3.impressionsChart = StatisticActivity.createViewData(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    channelMonetizationLayout3.revenueChart = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    StatisticActivity.ChartViewData chartViewData = channelMonetizationLayout3.impressionsChart;
                                    if (chartViewData != null) {
                                        chartViewData.useHourFormat = true;
                                    }
                                    channelMonetizationLayout3.ton_rate = tL_payments_starsRevenueStats.usd_rate;
                                    channelMonetizationLayout3.setupBalances(true, tL_payments_starsRevenueStats.status);
                                    channelMonetizationLayout3.progress.animate().alpha(0.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(channelMonetizationLayout3, 6)).start();
                                    channelMonetizationLayout3.checkLearnSheet();
                                }
                                break;
                            default:
                                ChannelMonetizationLayout channelMonetizationLayout4 = channelMonetizationLayout2;
                                channelMonetizationLayout4.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    channelMonetizationLayout4.applyStarsStats((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final ChannelMonetizationLayout channelMonetizationLayout3 = this.f$0;
                channelMonetizationLayout3.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ChannelMonetizationLayout channelMonetizationLayout4 = channelMonetizationLayout3;
                                channelMonetizationLayout4.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    channelMonetizationLayout4.impressionsChart = StatisticActivity.createViewData(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    channelMonetizationLayout4.revenueChart = StatisticActivity.createViewData(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    StatisticActivity.ChartViewData chartViewData = channelMonetizationLayout4.impressionsChart;
                                    if (chartViewData != null) {
                                        chartViewData.useHourFormat = true;
                                    }
                                    channelMonetizationLayout4.ton_rate = tL_payments_starsRevenueStats.usd_rate;
                                    channelMonetizationLayout4.setupBalances(true, tL_payments_starsRevenueStats.status);
                                    channelMonetizationLayout4.progress.animate().alpha(0.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(channelMonetizationLayout4, 6)).start();
                                    channelMonetizationLayout4.checkLearnSheet();
                                }
                                break;
                            default:
                                ChannelMonetizationLayout channelMonetizationLayout5 = channelMonetizationLayout3;
                                channelMonetizationLayout5.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    channelMonetizationLayout5.applyStarsStats((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
