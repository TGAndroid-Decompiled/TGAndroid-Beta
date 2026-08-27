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

    public final int f41635a;

    public final fe f41636b;

    public qd(fe feVar, int i10) {
        this.f41635a = i10;
        this.f41636b = feVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41635a) {
            case 0:
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new lt0(tL_error, 22));
                } else if (tLObject instanceof TLRPC.Updates) {
                    fe feVar = this.f41636b;
                    AndroidUtilities.runOnUIThread(new kd(feVar, 4));
                    MessagesController.getInstance(feVar.f38100u0).processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 1:
                final int i10 = 0;
                final fe feVar2 = this.f41636b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    c91 c91VarF0 = q91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar3 = feVar2;
                                    feVar3.f38090k1 = c91VarF0;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar3.l1 = q91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    c91 c91Var = feVar3.f38090k1;
                                    if (c91Var != null) {
                                        c91Var.f37032n = true;
                                    }
                                    feVar3.f38085f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar3.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new kd(feVar3, 6)).start();
                                    feVar3.a0();
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar4 = feVar2;
                                if (!z10) {
                                    feVar4.getClass();
                                } else {
                                    feVar4.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final fe feVar3 = this.f41636b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    c91 c91VarF0 = q91.f0(tL_payments_starsRevenueStats.top_hours_graph, LocaleController.getString(R.string.MonetizationGraphImpressions), 0, false);
                                    fe feVar4 = feVar3;
                                    feVar4.f38090k1 = c91VarF0;
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    feVar4.l1 = q91.f0(statsGraph, LocaleController.getString(R.string.MonetizationGraphRevenue), 2, false);
                                    c91 c91Var = feVar4.f38090k1;
                                    if (c91Var != null) {
                                        c91Var.f37032n = true;
                                    }
                                    feVar4.f38085f1 = tL_payments_starsRevenueStats.usd_rate;
                                    feVar4.g0(true, tL_payments_starsRevenueStats.status);
                                    feVar4.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new kd(feVar4, 6)).start();
                                    feVar4.a0();
                                }
                                break;
                            default:
                                TLObject tLObject3 = tLObject;
                                boolean z10 = tLObject3 instanceof TLRPC.TL_payments_starsRevenueStats;
                                fe feVar5 = feVar3;
                                if (!z10) {
                                    feVar5.getClass();
                                } else {
                                    feVar5.Z((TLRPC.TL_payments_starsRevenueStats) tLObject3);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
