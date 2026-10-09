package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ij0 extends la1 {
    public final jj0 v;

    public ij0(jj0 jj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = jj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        lj0 lj0Var = this.v.d;
        if (this.f39494r.f40150c <= 0) {
            performClick();
            ig.g gVar = this.f39489b;
            if (gVar.f12192t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39495s == 4) {
                    na1 na1Var = this.f39494r;
                    na1Var.f40151e = new jg.e(na1Var.d, selectedDate);
                    g(false);
                } else if (this.f39494r.f40153g == null) {
                } else {
                    f();
                    String str = this.f39494r.f40153g + "_" + selectedDate;
                    jg.b bVar = (jg.b) lj0Var.v.get(str);
                    if (bVar != null) {
                        this.f39494r.f40151e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39494r.f40153g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20269x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    lj0Var.f39608w = obj;
                    lj0Var.f39604f.getClass();
                    obj.f35899a = RecyclerView.R(this);
                    gVar.f12192t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) lj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, (Object) obj, 25), null, null, 0, lj0Var.f39595a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) lj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) lj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        jj0 jj0Var = this.v;
        lj0 lj0Var = jj0Var.d;
        ab1 ab1Var = lj0Var.f39608w;
        if (ab1Var != null) {
            ab1Var.f35900b = true;
        }
        int childCount = lj0Var.f39604f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jj0Var.d.f39604f.getChildAt(i10);
            if (childAt instanceof la1) {
                ((la1) childAt).f39489b.f12192t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(na1 na1Var) {
    }
}
