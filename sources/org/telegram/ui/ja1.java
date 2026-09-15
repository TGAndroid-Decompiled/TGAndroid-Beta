package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ja1 extends ia1 {
    public final int v;
    public final ya1 f34846w;

    public ja1(ya1 ya1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f34846w = ya1Var;
        this.v = i10;
    }

    @Override
    public final void b(ka1 ka1Var) {
        int i10;
        ya1 ya1Var = this.f34846w;
        i10 = ((org.telegram.ui.ActionBar.n2) ya1Var).classGuid;
        ka1Var.a(this.v, i10, ya1Var.f39795a.stats_dc, new org.telegram.ui.Components.s51(1, ya1Var, this.f34576r));
    }

    @Override
    public final void c() {
        int i10;
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
                    ya1 ya1Var = this.f34846w;
                    ya1.Z(ya1Var);
                    String str = this.f34576r.f35097g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ya1Var.V.get(str);
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
                    ya1Var.Z = obj;
                    ya1Var.S.getClass();
                    obj.f39563a = RecyclerView.R(this);
                    gVar.f11162t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ns0(this, str, obj, 10), null, null, 0, ya1Var.f39795a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) ya1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ya1.Z(this.f34846w);
    }
}
