package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class n41 extends m41 {
    public final int f50055w;
    public final c51 f50056x;

    public n41(c51 c51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f50056x = c51Var;
        this.f50055w = i7;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        c51 c51Var = this.f50056x;
        i7 = ((org.telegram.ui.ActionBar.h2) c51Var).classGuid;
        o41Var.a(this.f50055w, i7, c51Var.f46396a.stats_dc, new eh(2, c51Var, this.f49712r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f49712r.f50449c <= 0) {
            performClick();
            lg.g gVar = this.f49707b;
            if (gVar.f19820u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49713s == 4) {
                    o41 o41Var = this.f49712r;
                    o41Var.f50450e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f49712r.f50452g == null) {
                } else {
                    c51 c51Var = this.f50056x;
                    c51.c0(c51Var);
                    String str = this.f49712r.f50452g + "_" + selectedDate;
                    mg.b bVar = (mg.b) c51Var.V.f(str);
                    if (bVar != null) {
                        this.f49712r.f50450e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49712r.f50452g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28636x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    c51Var.Z = obj;
                    c51Var.T.getClass();
                    obj.f45758a = RecyclerView.R(this);
                    gVar.f19820u0.d(true, false);
                    int i10 = this.f50055w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new mo0(this, str, obj, 10), null, null, 0, c51Var.f46396a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.h2) c51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        c51.c0(this.f50056x);
    }
}
