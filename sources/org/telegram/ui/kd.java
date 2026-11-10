package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class kd implements RequestDelegate {
    public final int f47275a;
    public final zd f47276b;

    public kd(zd zdVar, int i7) {
        this.f47275a = i7;
        this.f47276b = zdVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47275a) {
            case 0:
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new jq0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    zd zdVar = this.f47276b;
                    org.telegram.messenger.g0.h3(new dd(zdVar, 3));
                    org.telegram.messenger.qp.s1(zdVar.f52424o0).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final zd zdVar2 = this.f47276b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        zd zdVar3 = zdVar2;
                        switch (i7) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zdVar3.l1 = e51.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.id.M0(2131748402, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zdVar3.f52422m1 = e51.i0(statsGraph, org.telegram.messenger.id.M0(2131748401, null), 2, false);
                                    q41 q41Var = zdVar3.l1;
                                    if (q41Var != null) {
                                        q41Var.f48959n = true;
                                    }
                                    zdVar3.f52417g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zdVar3.L(true, tL_payments_starsRevenueStats.status);
                                    zdVar3.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wq.h).withEndAction(new dd(zdVar3, 5)).start();
                                    zdVar3.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    zdVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    zdVar3.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final zd zdVar3 = this.f47276b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        zd zdVar32 = zdVar3;
                        switch (i7) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    zdVar32.l1 = e51.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.id.M0(2131748402, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    zdVar32.f52422m1 = e51.i0(statsGraph, org.telegram.messenger.id.M0(2131748401, null), 2, false);
                                    q41 q41Var = zdVar32.l1;
                                    if (q41Var != null) {
                                        q41Var.f48959n = true;
                                    }
                                    zdVar32.f52417g1 = tL_payments_starsRevenueStats.usd_rate;
                                    zdVar32.L(true, tL_payments_starsRevenueStats.status);
                                    zdVar32.Y0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.wq.h).withEndAction(new dd(zdVar32, 5)).start();
                                    zdVar32.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    zdVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    zdVar32.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
