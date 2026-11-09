package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class n41 extends m41 {
    public final int f48093w;
    public final d51 f48094x;

    public n41(d51 d51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f48094x = d51Var;
        this.f48093w = i7;
    }

    @Override
    public final void b(p41 p41Var) {
        int i7;
        d51 d51Var = this.f48094x;
        i7 = ((org.telegram.ui.ActionBar.f2) d51Var).classGuid;
        p41Var.a(this.f48093w, i7, d51Var.f44825a.stats_dc, new gh(2, d51Var, this.f47749r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f47749r.f48622c <= 0) {
            performClick();
            lg.g gVar = this.f47744b;
            if (gVar.f18322t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f47750s == 4) {
                    p41 p41Var = this.f47749r;
                    p41Var.f48623e = new mg.e(p41Var.d, selectedDate);
                    g(false);
                } else if (this.f47749r.f48625g == null) {
                } else {
                    d51 d51Var = this.f48094x;
                    d51.c0(d51Var);
                    String str = this.f47749r.f48625g + "_" + selectedDate;
                    mg.b bVar = (mg.b) d51Var.U.f(str);
                    if (bVar != null) {
                        this.f47749r.f48623e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f47749r.f48625g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27189x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    d51Var.Y = obj;
                    d51Var.S.getClass();
                    obj.f44225a = RecyclerView.R(this);
                    gVar.f18322t0.d(true, false);
                    int i10 = this.f48093w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new no0(this, str, obj, 10), null, null, 0, d51Var.f44825a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.f2) d51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        d51.c0(this.f48094x);
    }
}
