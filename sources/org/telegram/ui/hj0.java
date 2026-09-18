package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class hj0 extends ja1 {
    public final ij0 v;

    public hj0(ij0 ij0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = ij0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        kj0 kj0Var = this.v.d;
        if (this.f34775r.f35324c <= 0) {
            performClick();
            ig.g gVar = this.f34771b;
            if (gVar.f11165t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f34776s == 4) {
                    la1 la1Var = this.f34775r;
                    la1Var.e = new jg.e(la1Var.d, selectedDate);
                    g(false);
                } else if (this.f34775r.f35326g == null) {
                } else {
                    f();
                    String str = this.f34775r.f35326g + "_" + selectedDate;
                    jg.b bVar = (jg.b) kj0Var.v.get(str);
                    if (bVar != null) {
                        this.f34775r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f34775r.f35326g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18525x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    kj0Var.f35131w = obj;
                    kj0Var.f35127f.getClass();
                    obj.f39767a = RecyclerView.S(this);
                    gVar.f11165t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) kj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, (Object) obj, 25), null, null, 0, kj0Var.f35119a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) kj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) kj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ij0 ij0Var = this.v;
        kj0 kj0Var = ij0Var.d;
        ya1 ya1Var = kj0Var.f35131w;
        if (ya1Var != null) {
            ya1Var.f39768b = true;
        }
        int childCount = kj0Var.f35127f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ij0Var.d.f35127f.getChildAt(i10);
            if (childAt instanceof ja1) {
                ((ja1) childAt).f34771b.f11165t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(la1 la1Var) {
    }
}
