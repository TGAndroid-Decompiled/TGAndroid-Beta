package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class ae implements RequestDelegate {
    public final int f34189a;
    public final qe f34190b;

    public ae(qe qeVar, int i10) {
        this.f34189a = i10;
        this.f34190b = qeVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f34189a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new tu0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    qe qeVar = this.f34190b;
                    AndroidUtilities.runOnUIThread(new ud(qeVar, 4));
                    MessagesController.getInstance(qeVar.f39419y0).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final qe qeVar2 = this.f34190b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ta1 f02 = hb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    qe qeVar3 = qeVar2;
                                    qeVar3.f39408o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    qeVar3.f39409p1 = hb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ta1 ta1Var = qeVar3.f39408o1;
                                    if (ta1Var != null) {
                                        ta1Var.f40344n = true;
                                    }
                                    qeVar3.f39404j1 = tL_payments_starsRevenueStats.usd_rate;
                                    qeVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    qeVar3.f39397c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new ud(qeVar3, 6)).start();
                                    qeVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                qe qeVar4 = qeVar2;
                                if (z10) {
                                    qeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    qeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final qe qeVar3 = this.f34190b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    ta1 f02 = hb1.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    qe qeVar32 = qeVar3;
                                    qeVar32.f39408o1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    qeVar32.f39409p1 = hb1.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    ta1 ta1Var = qeVar32.f39408o1;
                                    if (ta1Var != null) {
                                        ta1Var.f40344n = true;
                                    }
                                    qeVar32.f39404j1 = tL_payments_starsRevenueStats.usd_rate;
                                    qeVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    qeVar32.f39397c1.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new ud(qeVar32, 6)).start();
                                    qeVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                qe qeVar4 = qeVar3;
                                if (z10) {
                                    qeVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    qeVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
