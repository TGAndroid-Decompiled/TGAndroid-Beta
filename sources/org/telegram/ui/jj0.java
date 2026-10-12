package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class jj0 extends na1 {
    public final kj0 v;

    public jj0(kj0 kj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = kj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        mj0 mj0Var = this.v.d;
        if (this.f40342r.f40892c <= 0) {
            performClick();
            ig.g gVar = this.f40337b;
            if (gVar.f12190t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f40343s == 4) {
                    pa1 pa1Var = this.f40342r;
                    pa1Var.f40893e = new jg.e(pa1Var.d, selectedDate);
                    g(false);
                } else if (this.f40342r.f40895g == null) {
                } else {
                    f();
                    String str = this.f40342r.f40895g + "_" + selectedDate;
                    jg.b bVar = (jg.b) mj0Var.v.get(str);
                    if (bVar != null) {
                        this.f40342r.f40893e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40342r.f40895g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20035x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    mj0Var.f40071w = obj;
                    mj0Var.f40067f.getClass();
                    obj.f36388a = RecyclerView.R(this);
                    gVar.f12190t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) mj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ea(this, str, (Object) obj, 25), null, null, 0, mj0Var.f40058a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) mj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) mj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        kj0 kj0Var = this.v;
        mj0 mj0Var = kj0Var.d;
        cb1 cb1Var = mj0Var.f40071w;
        if (cb1Var != null) {
            cb1Var.f36389b = true;
        }
        int childCount = mj0Var.f40067f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kj0Var.d.f40067f.getChildAt(i10);
            if (childAt instanceof na1) {
                ((na1) childAt).f40337b.f12190t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(pa1 pa1Var) {
    }
}
