package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class da1 extends ca1 {
    public final int v;
    public final sa1 f33069w;

    public da1(sa1 sa1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f33069w = sa1Var;
        this.v = i10;
    }

    @Override
    public final void b(ea1 ea1Var) {
        int i10;
        sa1 sa1Var = this.f33069w;
        i10 = ((org.telegram.ui.ActionBar.m2) sa1Var).classGuid;
        ea1Var.a(this.v, i10, sa1Var.f37666a.stats_dc, new org.telegram.ui.Components.g61(1, sa1Var, this.f32616r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f32616r.f33345c <= 0) {
            performClick();
            ig.g gVar = this.f32612b;
            if (gVar.f11152t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f32617s == 4) {
                    ea1 ea1Var = this.f32616r;
                    ea1Var.e = new jg.e(ea1Var.d, selectedDate);
                    g(false);
                } else if (this.f32616r.f33347g == null) {
                } else {
                    sa1 sa1Var = this.f33069w;
                    sa1.Z(sa1Var);
                    String str = this.f32616r.f33347g + "_" + selectedDate;
                    jg.b bVar = (jg.b) sa1Var.V.get(str);
                    if (bVar != null) {
                        this.f32616r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f32616r.f33347g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18564x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    sa1Var.Z = obj;
                    sa1Var.S.getClass();
                    obj.f37277a = RecyclerView.R(this);
                    gVar.f11152t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new fs0(this, str, obj, 10), null, null, 0, sa1Var.f37666a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.m2) sa1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        sa1.Z(this.f33069w);
    }
}
