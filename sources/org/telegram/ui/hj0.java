package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class hj0 extends ka1 {
    public final ij0 v;

    public hj0(ij0 ij0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ij0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        kj0 kj0Var = this.v.d;
        if (this.f39288r.f39917c <= 0) {
            performClick();
            ig.g gVar = this.f39283b;
            if (gVar.f12191t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39289s == 4) {
                    ma1 ma1Var = this.f39288r;
                    ma1Var.f39918e = new jg.e(ma1Var.d, selectedDate);
                    g(false);
                } else if (this.f39288r.f39920g == null) {
                } else {
                    f();
                    String str = this.f39288r.f39920g + "_" + selectedDate;
                    jg.b bVar = (jg.b) kj0Var.v.get(str);
                    if (bVar != null) {
                        this.f39288r.f39918e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39288r.f39920g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20299x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    kj0Var.f39396w = obj;
                    kj0Var.f39392f.getClass();
                    obj.f44661a = RecyclerView.R(this);
                    gVar.f12191t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) kj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, kj0Var.f39383a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) kj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) kj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ij0 ij0Var = this.v;
        kj0 kj0Var = ij0Var.d;
        za1 za1Var = kj0Var.f39396w;
        if (za1Var != null) {
            za1Var.f44662b = true;
        }
        int childCount = kj0Var.f39392f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ij0Var.d.f39392f.getChildAt(i10);
            if (childAt instanceof ka1) {
                ((ka1) childAt).f39283b.f12191t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ma1 ma1Var) {
    }
}
