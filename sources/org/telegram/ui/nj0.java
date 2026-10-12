package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class nj0 extends ra1 {
    public final oj0 v;

    public nj0(oj0 oj0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = oj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        qj0 qj0Var = this.v.d;
        if (this.f39723r.f40336c <= 0) {
            performClick();
            jg.g gVar = this.f39719b;
            if (gVar.f13064t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39724s == 4) {
                    ta1 ta1Var = this.f39723r;
                    ta1Var.e = new kg.e(ta1Var.d, selectedDate);
                    g(false);
                } else if (this.f39723r.f40338g == null) {
                } else {
                    f();
                    String str = this.f39723r.f40338g + "_" + selectedDate;
                    kg.b bVar = (kg.b) qj0Var.v.get(str);
                    if (bVar != null) {
                        this.f39723r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39723r.f40338g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f19445x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    qj0Var.f39481w = obj;
                    qj0Var.f39477f.getClass();
                    obj.f36370a = RecyclerView.R(this);
                    gVar.f13064t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) qj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new fa(this, str, (Object) obj, 25), null, null, 0, qj0Var.f39469a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) qj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) qj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        oj0 oj0Var = this.v;
        qj0 qj0Var = oj0Var.d;
        gb1 gb1Var = qj0Var.f39481w;
        if (gb1Var != null) {
            gb1Var.f36371b = true;
        }
        int childCount = qj0Var.f39477f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = oj0Var.d.f39477f.getChildAt(i10);
            if (childAt instanceof ra1) {
                ((ra1) childAt).f39719b.f13064t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ta1 ta1Var) {
    }
}
