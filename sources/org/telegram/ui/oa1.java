package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class oa1 extends na1 {
    public final int v;
    public final db1 f40638w;

    public oa1(db1 db1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f40638w = db1Var;
        this.v = i10;
    }

    @Override
    public final void b(pa1 pa1Var) {
        int i10;
        db1 db1Var = this.f40638w;
        i10 = ((org.telegram.ui.ActionBar.m2) db1Var).classGuid;
        pa1Var.a(this.v, i10, db1Var.f36722a.stats_dc, new bi(2, db1Var, this.f40342r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f40342r.f40892c <= 0) {
            performClick();
            ig.g gVar = this.f40337b;
            if (gVar.f12190t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f40343s == 4) {
                    pa1 pa1Var = this.f40342r;
                    pa1Var.f40893e = new jg.e(pa1Var.d, selectedDate);
                    g(false);
                } else if (this.f40342r.f40895g == null) {
                } else {
                    db1 db1Var = this.f40638w;
                    db1.Z(db1Var);
                    String str = this.f40342r.f40895g + "_" + selectedDate;
                    jg.b bVar = (jg.b) db1Var.V.get(str);
                    if (bVar != null) {
                        this.f40342r.f40893e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40342r.f40895g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20035x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    db1Var.Z = obj;
                    db1Var.S.getClass();
                    obj.f36388a = RecyclerView.R(this);
                    gVar.f12190t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ps0(this, str, obj, 10), null, null, 0, db1Var.f36722a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.m2) db1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        db1.Z(this.f40638w);
    }
}
