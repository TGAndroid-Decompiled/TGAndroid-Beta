package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class c41 extends b41 {
    public final int f44234w;
    public final r41 f44235x;

    public c41(r41 r41Var, Context context, int i3, int i10, mg.f fVar) {
        super(context, i10, fVar, null);
        this.f44235x = r41Var;
        this.f44234w = i3;
    }

    @Override
    public final void b(d41 d41Var) {
        int i3;
        r41 r41Var = this.f44235x;
        i3 = ((org.telegram.ui.ActionBar.d2) r41Var).classGuid;
        d41Var.a(this.f44234w, i3, r41Var.f49063a.stats_dc, new ah(2, r41Var, this.f43923r));
    }

    @Override
    public final void c() {
        int i3;
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
                    r41 r41Var = this.f44235x;
                    r41.c0(r41Var);
                    String str = this.f43923r.f44543g + "_" + selectedDate;
                    ng.b bVar = (ng.b) r41Var.V.f(str);
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
                    r41Var.Z = obj;
                    r41Var.T.getClass();
                    obj.f48750a = RecyclerView.R(this);
                    gVar.f19362u0.d(true, false);
                    int i10 = this.f44234w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new co0(this, str, obj, 10), null, null, 0, r41Var.f49063a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i3 = ((org.telegram.ui.ActionBar.d2) r41Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i3);
                }
            }
        }
    }

    @Override
    public final void f() {
        r41.c0(this.f44235x);
    }
}
