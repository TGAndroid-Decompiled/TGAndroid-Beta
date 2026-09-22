package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ka1 extends ja1 {
    public final int v;
    public final za1 f35116w;

    public ka1(za1 za1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f35116w = za1Var;
        this.v = i10;
    }

    @Override
    public final void b(la1 la1Var) {
        int i10;
        za1 za1Var = this.f35116w;
        i10 = ((org.telegram.ui.ActionBar.n2) za1Var).classGuid;
        la1Var.a(this.v, i10, za1Var.f40108a.stats_dc, new org.telegram.ui.Components.s51(1, za1Var, this.f34834r));
    }

    @Override
    public final void c() {
        int i10;
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
                    za1 za1Var = this.f35116w;
                    za1.Z(za1Var);
                    String str = this.f34834r.f35371g + "_" + selectedDate;
                    jg.b bVar = (jg.b) za1Var.V.get(str);
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
                    za1Var.Z = obj;
                    za1Var.S.getClass();
                    obj.f39795a = RecyclerView.R(this);
                    gVar.f11164t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ns0(this, str, obj, 10), null, null, 0, za1Var.f40108a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) za1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        za1.Z(this.f35116w);
    }
}
