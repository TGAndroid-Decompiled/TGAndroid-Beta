package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ij0 extends ka1 {
    public final jj0 v;

    public ij0(jj0 jj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = jj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        lj0 lj0Var = this.v.d;
        if (this.f35183r.f35748c <= 0) {
            performClick();
            ig.g gVar = this.f35179b;
            if (gVar.f11165t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35184s == 4) {
                    ma1 ma1Var = this.f35183r;
                    ma1Var.e = new jg.e(ma1Var.d, selectedDate);
                    g(false);
                } else if (this.f35183r.f35750g == null) {
                } else {
                    f();
                    String str = this.f35183r.f35750g + "_" + selectedDate;
                    jg.b bVar = (jg.b) lj0Var.v.get(str);
                    if (bVar != null) {
                        this.f35183r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35183r.f35750g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18350x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    lj0Var.f35578w = obj;
                    lj0Var.f35574f.getClass();
                    obj.f40200a = RecyclerView.S(this);
                    gVar.f11165t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.o2) lj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, lj0Var.f35566a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.o2) lj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.o2) lj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        jj0 jj0Var = this.v;
        lj0 lj0Var = jj0Var.d;
        za1 za1Var = lj0Var.f35578w;
        if (za1Var != null) {
            za1Var.f40201b = true;
        }
        int childCount = lj0Var.f35574f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jj0Var.d.f35574f.getChildAt(i10);
            if (childAt instanceof ka1) {
                ((ka1) childAt).f35179b.f11165t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ma1 ma1Var) {
    }
}
