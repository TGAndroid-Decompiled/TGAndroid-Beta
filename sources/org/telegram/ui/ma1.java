package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ma1 extends la1 {
    public final int v;
    public final bb1 f35639w;

    public ma1(bb1 bb1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f35639w = bb1Var;
        this.v = i10;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        bb1 bb1Var = this.f35639w;
        i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
        na1Var.a(this.v, i10, bb1Var.f32313a.stats_dc, new org.telegram.ui.Components.g61(1, bb1Var, this.f35394r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f35394r.f35950c <= 0) {
            performClick();
            ig.g gVar = this.f35390b;
            if (gVar.f11166t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35395s == 4) {
                    na1 na1Var = this.f35394r;
                    na1Var.e = new jg.e(na1Var.d, selectedDate);
                    g(false);
                } else if (this.f35394r.f35952g == null) {
                } else {
                    bb1 bb1Var = this.f35639w;
                    bb1.Z(bb1Var);
                    String str = this.f35394r.f35952g + "_" + selectedDate;
                    jg.b bVar = (jg.b) bb1Var.V.get(str);
                    if (bVar != null) {
                        this.f35394r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35394r.f35952g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18557x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    bb1Var.Z = obj;
                    bb1Var.S.getClass();
                    obj.f32027a = RecyclerView.S(this);
                    gVar.f11166t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ns0(this, str, obj, 10), null, null, 0, bb1Var.f32313a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        bb1.Z(this.f35639w);
    }
}
