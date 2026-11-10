package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class o41 extends n41 {
    public final int f48428w;
    public final e51 f48429x;

    public o41(e51 e51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f48429x = e51Var;
        this.f48428w = i7;
    }

    @Override
    public final void b(q41 q41Var) {
        int i7;
        e51 e51Var = this.f48429x;
        i7 = ((org.telegram.ui.ActionBar.f2) e51Var).classGuid;
        q41Var.a(this.f48428w, i7, e51Var.f45138a.stats_dc, new gh(2, e51Var, this.f48119r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f48119r.f48950c <= 0) {
            performClick();
            lg.g gVar = this.f48114b;
            if (gVar.f18325t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f48120s == 4) {
                    q41 q41Var = this.f48119r;
                    q41Var.f48951e = new mg.e(q41Var.d, selectedDate);
                    g(false);
                } else if (this.f48119r.f48953g == null) {
                } else {
                    e51 e51Var = this.f48429x;
                    e51.c0(e51Var);
                    String str = this.f48119r.f48953g + "_" + selectedDate;
                    mg.b bVar = (mg.b) e51Var.U.f(str);
                    if (bVar != null) {
                        this.f48119r.f48951e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f48119r.f48953g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27193x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    e51Var.Y = obj;
                    e51Var.S.getClass();
                    obj.f44901a = RecyclerView.R(this);
                    gVar.f18325t0.d(true, false);
                    int i10 = this.f48428w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new oo0(this, str, obj, 10), null, null, 0, e51Var.f45138a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.f2) e51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        e51.c0(this.f48429x);
    }
}
