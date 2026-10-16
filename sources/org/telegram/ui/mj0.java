package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class mj0 extends ra1 {
    public final nj0 v;

    public mj0(nj0 nj0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = nj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        pj0 pj0Var = this.v.d;
        if (this.f39442r.f40051c <= 0) {
            performClick();
            jg.g gVar = this.f39438b;
            if (gVar.f13068t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39443s == 4) {
                    ta1 ta1Var = this.f39442r;
                    ta1Var.e = new kg.e(ta1Var.d, selectedDate);
                    g(false);
                } else if (this.f39442r.f40053g == null) {
                } else {
                    f();
                    String str = this.f39442r.f40053g + "_" + selectedDate;
                    kg.b bVar = (kg.b) pj0Var.v.get(str);
                    if (bVar != null) {
                        this.f39442r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39442r.f40053g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f19145x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    pj0Var.f38958w = obj;
                    pj0Var.f38954f.getClass();
                    obj.f36129a = RecyclerView.R(this);
                    gVar.f13068t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) pj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new fa(this, str, (Object) obj, 25), null, null, 0, pj0Var.f38946a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) pj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) pj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        nj0 nj0Var = this.v;
        pj0 pj0Var = nj0Var.d;
        gb1 gb1Var = pj0Var.f38958w;
        if (gb1Var != null) {
            gb1Var.f36130b = true;
        }
        int childCount = pj0Var.f38954f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = nj0Var.d.f38954f.getChildAt(i10);
            if (childAt instanceof ra1) {
                ((ra1) childAt).f39438b.f13068t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ta1 ta1Var) {
    }
}
