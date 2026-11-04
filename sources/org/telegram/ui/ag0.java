package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ag0 extends b41 {
    public final bg0 f43775w;

    public ag0(bg0 bg0Var, Context context, int i3, mg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, fVar, e6Var);
        this.f43775w = bg0Var;
    }

    @Override
    public final void c() {
        int i3;
        int i10;
        int i11;
        dg0 dg0Var = this.f43775w.d;
        if (this.f43923r.f44540c <= 0) {
            performClick();
            mg.g gVar = this.f43918b;
            if (gVar.f19362u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f43924s == 4) {
                    d41 d41Var = this.f43923r;
                    d41Var.f44541e = new ng.e(d41Var.d, selectedDate);
                    g(false);
                } else if (this.f43923r.f44543g == null) {
                } else {
                    f();
                    String str = this.f43923r.f44543g + "_" + selectedDate;
                    ng.b bVar = (ng.b) dg0Var.f44705w.f(str);
                    if (bVar != null) {
                        this.f43923r.f44541e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f43923r.f44543g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27234x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    dg0Var.f44706x = obj;
                    dg0Var.f44700f.getClass();
                    obj.f48750a = RecyclerView.R(this);
                    gVar.f19362u0.d(true, false);
                    i3 = ((org.telegram.ui.ActionBar.d2) dg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i3).sendRequest(tL_loadAsyncGraph, new y9(this, str, (Object) obj, 25), null, null, 0, dg0Var.f44691a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.d2) dg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.d2) dg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        bg0 bg0Var = this.f43775w;
        dg0 dg0Var = bg0Var.d;
        q41 q41Var = dg0Var.f44706x;
        if (q41Var != null) {
            q41Var.f48751b = true;
        }
        int childCount = dg0Var.f44700f.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = bg0Var.d.f44700f.getChildAt(i3);
            if (childAt instanceof b41) {
                ((b41) childAt).f43918b.f19362u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(d41 d41Var) {
    }
}
