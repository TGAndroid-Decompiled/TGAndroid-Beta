package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class m41 extends l41 {
    public final int f47662w;
    public final c51 f47663x;

    public m41(c51 c51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f47663x = c51Var;
        this.f47662w = i7;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        c51 c51Var = this.f47663x;
        i7 = ((org.telegram.ui.ActionBar.f2) c51Var).classGuid;
        o41Var.a(this.f47662w, i7, c51Var.f44663a.stats_dc, new eh(2, c51Var, this.f47414r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f47414r.f48255c <= 0) {
            performClick();
            lg.g gVar = this.f47409b;
            if (gVar.f18319t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f47415s == 4) {
                    o41 o41Var = this.f47414r;
                    o41Var.f48256e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f47414r.f48258g == null) {
                } else {
                    c51 c51Var = this.f47663x;
                    c51.c0(c51Var);
                    String str = this.f47414r.f48258g + "_" + selectedDate;
                    mg.b bVar = (mg.b) c51Var.U.f(str);
                    if (bVar != null) {
                        this.f47414r.f48256e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f47414r.f48258g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27186x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    c51Var.Y = obj;
                    c51Var.S.getClass();
                    obj.f44196a = RecyclerView.R(this);
                    gVar.f18319t0.d(true, false);
                    int i10 = this.f47662w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new lo0(this, str, obj, 10), null, null, 0, c51Var.f44663a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.f2) c51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        c51.c0(this.f47663x);
    }
}
