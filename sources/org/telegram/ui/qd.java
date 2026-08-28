package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class qd implements RequestDelegate {
    public final int f41761a;
    public final fe f41762b;

    public qd(fe feVar, int i9) {
        this.f41761a = i9;
        this.f41762b = feVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41761a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new kt0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    fe feVar = this.f41762b;
                    AndroidUtilities.runOnUIThread(new kd(feVar, 4));
                    MessagesController.getInstance(feVar.f38238u0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final fe feVar2 = this.f41762b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    e91 e02 = s91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar3 = feVar2;
                                    feVar3.f38228k1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar3.l1 = s91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    e91 e91Var = feVar3.f38228k1;
                                    if (e91Var != null) {
                                        e91Var.f37880n = true;
                                    }
                                    feVar3.f38223f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new kd(feVar3, 6)).start();
                                    feVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar4 = feVar2;
                                if (z10) {
                                    feVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    feVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final fe feVar3 = this.f41762b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    e91 e02 = s91.e0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar32 = feVar3;
                                    feVar32.f38228k1 = e02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar32.l1 = s91.e0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    e91 e91Var = feVar32.f38228k1;
                                    if (e91Var != null) {
                                        e91Var.f37880n = true;
                                    }
                                    feVar32.f38223f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new kd(feVar32, 6)).start();
                                    feVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar4 = feVar3;
                                if (z10) {
                                    feVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    feVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
