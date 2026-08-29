package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class pd implements RequestDelegate {
    public final int f41369a;
    public final de f41370b;

    public pd(de deVar, int i10) {
        this.f41369a = i10;
        this.f41370b = deVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41369a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new it0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    de deVar = this.f41370b;
                    AndroidUtilities.runOnUIThread(new jd(deVar, 4));
                    MessagesController.getInstance(deVar.f37524u0).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final de deVar2 = this.f41370b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    f91 f02 = t91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    de deVar3 = deVar2;
                                    deVar3.f37514k1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    deVar3.l1 = t91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    f91 f91Var = deVar3.f37514k1;
                                    if (f91Var != null) {
                                        f91Var.f38080n = true;
                                    }
                                    deVar3.f37509f1 = tL_payments_starsRevenueStats.usd_rate;
                                    deVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    deVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.jr.h).withEndAction(new jd(deVar3, 6)).start();
                                    deVar3.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                de deVar4 = deVar2;
                                if (z10) {
                                    deVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    deVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final de deVar3 = this.f41370b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    f91 f02 = t91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    de deVar32 = deVar3;
                                    deVar32.f37514k1 = f02;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    deVar32.l1 = t91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    f91 f91Var = deVar32.f37514k1;
                                    if (f91Var != null) {
                                        f91Var.f38080n = true;
                                    }
                                    deVar32.f37509f1 = tL_payments_starsRevenueStats.usd_rate;
                                    deVar32.g0(true, tL_payments_starsRevenueStats.status);
                                    deVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.jr.h).withEndAction(new jd(deVar32, 6)).start();
                                    deVar32.a0();
                                    return;
                                }
                                return;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                de deVar4 = deVar3;
                                if (z10) {
                                    deVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                    return;
                                } else {
                                    deVar4.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
