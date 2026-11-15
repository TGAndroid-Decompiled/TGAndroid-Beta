package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class jd implements RequestDelegate {
    public final int f48307a;
    public final xd f48308b;

    public jd(xd xdVar, int i7) {
        this.f48307a = i7;
        this.f48308b = xdVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48307a) {
            case 0:
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new fq0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    xd xdVar = this.f48308b;
                    org.telegram.messenger.g0.h3(new cd(xdVar, 3));
                    org.telegram.messenger.np.s1(xdVar.f53193p0).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final xd xdVar2 = this.f48308b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        xd xdVar3 = xdVar2;
                        switch (i7) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar3.f53189m1 = z41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.hd.M0(2131748402, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar3.n1 = z41.i0(statsGraph, org.telegram.messenger.hd.M0(2131748401, null), 2, false);
                                    l41 l41Var = xdVar3.f53189m1;
                                    if (l41Var != null) {
                                        l41Var.f48841n = true;
                                    }
                                    xdVar3.f53185h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar3.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar3.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new cd(xdVar3, 5)).start();
                                    xdVar3.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    xdVar3.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    xdVar3.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final xd xdVar3 = this.f48308b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        xd xdVar32 = xdVar3;
                        switch (i7) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar32.f53189m1 = z41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.hd.M0(2131748402, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar32.n1 = z41.i0(statsGraph, org.telegram.messenger.hd.M0(2131748401, null), 2, false);
                                    l41 l41Var = xdVar32.f53189m1;
                                    if (l41Var != null) {
                                        l41Var.f48841n = true;
                                    }
                                    xdVar32.f53185h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar32.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar32.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new cd(xdVar32, 5)).start();
                                    xdVar32.E();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    xdVar32.D((TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                    return;
                                } else {
                                    xdVar32.getClass();
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
