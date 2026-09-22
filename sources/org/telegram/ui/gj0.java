package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gj0 extends ja1 {
    public final hj0 v;

    public gj0(hj0 hj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = hj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        jj0 jj0Var = this.v.d;
        if (this.f34834r.f35369c <= 0) {
            performClick();
            ig.g gVar = this.f34830b;
            if (gVar.f11164t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f34835s == 4) {
                    la1 la1Var = this.f34834r;
                    la1Var.e = new jg.e(la1Var.d, selectedDate);
                    g(false);
                } else if (this.f34834r.f35371g == null) {
                } else {
                    f();
                    String str = this.f34834r.f35371g + "_" + selectedDate;
                    jg.b bVar = (jg.b) jj0Var.v.get(str);
                    if (bVar != null) {
                        this.f34834r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f34834r.f35371g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18338x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jj0Var.f34934w = obj;
                    jj0Var.f34930f.getClass();
                    obj.f39795a = RecyclerView.R(this);
                    gVar.f11164t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) jj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, jj0Var.f34922a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) jj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) jj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        hj0 hj0Var = this.v;
        jj0 jj0Var = hj0Var.d;
        ya1 ya1Var = jj0Var.f34934w;
        if (ya1Var != null) {
            ya1Var.f39796b = true;
        }
        int childCount = jj0Var.f34930f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hj0Var.d.f34930f.getChildAt(i10);
            if (childAt instanceof ja1) {
                ((ja1) childAt).f34830b.f11164t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(la1 la1Var) {
    }
}
