package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
public final class jd implements RequestDelegate {
    public final int f46601a;
    public final xd f46602b;

    public jd(xd xdVar, int i3) {
        this.f46601a = i3;
        this.f46602b = xdVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46601a) {
            case 0:
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new xp0(tL_error, 22));
                    return;
                } else if (tLObject instanceof TLRPC.Updates) {
                    xd xdVar = this.f46602b;
                    org.telegram.messenger.g0.h3(new cd(xdVar, 3));
                    org.telegram.messenger.hp.s1(xdVar.f51929p0).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    return;
                }
            case 1:
                final xd xdVar2 = this.f46602b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        xd xdVar3 = xdVar2;
                        switch (i3) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar3.m1 = r41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.bd.M0(2131748410, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar3.f51926n1 = r41.i0(statsGraph, org.telegram.messenger.bd.M0(2131748409, null), 2, false);
                                    d41 d41Var = xdVar3.m1;
                                    if (d41Var != null) {
                                        d41Var.f44549n = true;
                                    }
                                    xdVar3.f51921h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar3.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar3.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(xdVar3, 5)).start();
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
                final xd xdVar3 = this.f46602b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        xd xdVar32 = xdVar3;
                        switch (i3) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) tLObject2;
                                    xdVar32.m1 = r41.i0(tL_payments_starsRevenueStats.top_hours_graph, org.telegram.messenger.bd.M0(2131748410, null), 0, false);
                                    TL_stats.StatsGraph statsGraph = tL_payments_starsRevenueStats.revenue_graph;
                                    if (statsGraph != null) {
                                        statsGraph.rate = (float) (1.0E7d / tL_payments_starsRevenueStats.usd_rate);
                                    }
                                    xdVar32.f51926n1 = r41.i0(statsGraph, org.telegram.messenger.bd.M0(2131748409, null), 2, false);
                                    d41 d41Var = xdVar32.m1;
                                    if (d41Var != null) {
                                        d41Var.f44549n = true;
                                    }
                                    xdVar32.f51921h1 = tL_payments_starsRevenueStats.usd_rate;
                                    xdVar32.L(true, tL_payments_starsRevenueStats.status);
                                    xdVar32.Z0.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.xq.h).withEndAction(new cd(xdVar32, 5)).start();
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
