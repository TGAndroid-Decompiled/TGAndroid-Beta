package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class n41 extends m41 {
    public final int f50088w;
    public final c51 f50089x;

    public n41(c51 c51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f50089x = c51Var;
        this.f50088w = i7;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        c51 c51Var = this.f50089x;
        i7 = ((org.telegram.ui.ActionBar.g2) c51Var).classGuid;
        o41Var.a(this.f50088w, i7, c51Var.f46431a.stats_dc, new fh(2, c51Var, this.f49764r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f49764r.f50474c <= 0) {
            performClick();
            lg.g gVar = this.f49759b;
            if (gVar.f19851u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49765s == 4) {
                    o41 o41Var = this.f49764r;
                    o41Var.f50475e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f49764r.f50477g == null) {
                } else {
                    c51 c51Var = this.f50089x;
                    c51.c0(c51Var);
                    String str = this.f49764r.f50477g + "_" + selectedDate;
                    mg.b bVar = (mg.b) c51Var.V.f(str);
                    if (bVar != null) {
                        this.f49764r.f50475e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49764r.f50477g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28667x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    c51Var.Z = obj;
                    c51Var.T.getClass();
                    obj.f45791a = RecyclerView.R(this);
                    gVar.f19851u0.d(true, false);
                    int i10 = this.f50088w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new mo0(this, str, obj, 10), null, null, 0, c51Var.f46431a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.g2) c51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        c51.c0(this.f50089x);
    }
}
