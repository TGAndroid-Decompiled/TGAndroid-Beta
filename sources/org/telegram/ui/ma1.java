package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ma1 extends la1 {
    public final int v;
    public final bb1 f39819w;

    public ma1(bb1 bb1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f39819w = bb1Var;
        this.v = i10;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        bb1 bb1Var = this.f39819w;
        i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
        na1Var.a(this.v, i10, bb1Var.f36202a.stats_dc, new xh(2, bb1Var, this.f39492r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f39492r.f40148c <= 0) {
            performClick();
            ig.g gVar = this.f39487b;
            if (gVar.f12192t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39493s == 4) {
                    na1 na1Var = this.f39492r;
                    na1Var.f40149e = new jg.e(na1Var.d, selectedDate);
                    g(false);
                } else if (this.f39492r.f40151g == null) {
                } else {
                    bb1 bb1Var = this.f39819w;
                    bb1.Z(bb1Var);
                    String str = this.f39492r.f40151g + "_" + selectedDate;
                    jg.b bVar = (jg.b) bb1Var.V.get(str);
                    if (bVar != null) {
                        this.f39492r.f40149e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39492r.f40151g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20269x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    bb1Var.Z = obj;
                    bb1Var.S.getClass();
                    obj.f35897a = RecyclerView.R(this);
                    gVar.f12192t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ns0(this, str, obj, 10), null, null, 0, bb1Var.f36202a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        bb1.Z(this.f39819w);
    }
}
