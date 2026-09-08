package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ma1 extends la1 {
    public final int v;
    public final bb1 f38632w;

    public ma1(bb1 bb1Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f38632w = bb1Var;
        this.v = i10;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        bb1 bb1Var = this.f38632w;
        i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
        na1Var.a(this.v, i10, bb1Var.f34717a.stats_dc, new org.telegram.ui.Components.r51(1, bb1Var, this.f38284r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f38284r.f38923c <= 0) {
            performClick();
            jg.g gVar = this.f38279b;
            if (gVar.f13716t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f38285s == 4) {
                    na1 na1Var = this.f38284r;
                    na1Var.f38924e = new kg.e(na1Var.d, selectedDate);
                    g(false);
                } else if (this.f38284r.f38926g == null) {
                } else {
                    bb1 bb1Var = this.f38632w;
                    bb1.Z(bb1Var);
                    String str = this.f38284r.f38926g + "_" + selectedDate;
                    kg.b bVar = (kg.b) bb1Var.V.get(str);
                    if (bVar != null) {
                        this.f38284r.f38924e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f38284r.f38926g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20128x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    bb1Var.Z = obj;
                    bb1Var.S.getClass();
                    obj.f34403a = RecyclerView.R(this);
                    gVar.f13716t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ms0(this, str, obj, 10), null, null, 0, bb1Var.f34717a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        bb1.Z(this.f38632w);
    }
}
