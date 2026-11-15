package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class k41 extends j41 {
    public final int f48583w;
    public final z41 f48584x;

    public k41(z41 z41Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f48584x = z41Var;
        this.f48583w = i7;
    }

    @Override
    public final void b(l41 l41Var) {
        int i7;
        z41 z41Var = this.f48584x;
        i7 = ((org.telegram.ui.ActionBar.e2) z41Var).classGuid;
        l41Var.a(this.f48583w, i7, z41Var.f53842a.stats_dc, new eh(2, z41Var, this.f48221r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f48221r.f48832c <= 0) {
            performClick();
            lg.g gVar = this.f48216b;
            if (gVar.f19456u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f48222s == 4) {
                    l41 l41Var = this.f48221r;
                    l41Var.f48833e = new mg.e(l41Var.d, selectedDate);
                    g(false);
                } else if (this.f48221r.f48835g == null) {
                } else {
                    z41 z41Var = this.f48584x;
                    z41.c0(z41Var);
                    String str = this.f48221r.f48835g + "_" + selectedDate;
                    mg.b bVar = (mg.b) z41Var.V.f(str);
                    if (bVar != null) {
                        this.f48221r.f48833e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f48221r.f48835g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28284x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    z41Var.Z = obj;
                    z41Var.T.getClass();
                    obj.f53411a = RecyclerView.R(this);
                    gVar.f19456u0.d(true, false);
                    int i10 = this.f48583w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new jo0(this, str, obj, 10), null, null, 0, z41Var.f53842a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.e2) z41Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        z41.c0(this.f48584x);
    }
}
