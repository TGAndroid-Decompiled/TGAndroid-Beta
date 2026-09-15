package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gj0 extends ia1 {
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
        if (this.f34576r.f35095c <= 0) {
            performClick();
            ig.g gVar = this.f34572b;
            if (gVar.f11162t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f34577s == 4) {
                    ka1 ka1Var = this.f34576r;
                    ka1Var.e = new jg.e(ka1Var.d, selectedDate);
                    g(false);
                } else if (this.f34576r.f35097g == null) {
                } else {
                    f();
                    String str = this.f34576r.f35097g + "_" + selectedDate;
                    jg.b bVar = (jg.b) jj0Var.v.get(str);
                    if (bVar != null) {
                        this.f34576r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f34576r.f35097g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18342x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jj0Var.f34927w = obj;
                    jj0Var.f34923f.getClass();
                    obj.f39563a = RecyclerView.R(this);
                    gVar.f11162t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) jj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, jj0Var.f34915a.stats_dc, 1, true);
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
        xa1 xa1Var = jj0Var.f34927w;
        if (xa1Var != null) {
            xa1Var.f39564b = true;
        }
        int childCount = jj0Var.f34923f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hj0Var.d.f34923f.getChildAt(i10);
            if (childAt instanceof ia1) {
                ((ia1) childAt).f34572b.f11162t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ka1 ka1Var) {
    }
}
