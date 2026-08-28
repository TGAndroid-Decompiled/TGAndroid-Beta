package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class d91 extends c91 {
    public final int v;
    public final s91 f37484w;

    public d91(s91 s91Var, Context context, int i9, int i10, qf.f fVar) {
        super(context, i10, fVar, null);
        this.f37484w = s91Var;
        this.v = i9;
    }

    @Override
    public final void b(e91 e91Var) {
        int i9;
        s91 s91Var = this.f37484w;
        i9 = ((org.telegram.ui.ActionBar.o2) s91Var).classGuid;
        e91Var.a(this.v, i9, s91Var.f42606a.stats_dc, new org.telegram.ui.Components.v41(1, s91Var, this.f37133r));
    }

    @Override
    public final void c() {
        int i9;
        if (this.f37133r.f37871c <= 0) {
            performClick();
            qf.g gVar = this.f37128b;
            if (gVar.f46219p0.C) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f37134s == 4) {
                    e91 e91Var = this.f37133r;
                    e91Var.f37872e = new rf.e(e91Var.d, selectedDate);
                    g(false);
                } else if (this.f37133r.f37874g == null) {
                } else {
                    s91 s91Var = this.f37484w;
                    s91.Y(s91Var);
                    String str = this.f37133r.f37874g + "_" + selectedDate;
                    rf.b bVar = (rf.b) s91Var.R.get(str);
                    if (bVar != null) {
                        this.f37133r.f37872e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f37133r.f37874g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22611x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    s91Var.V = obj;
                    s91Var.O.getClass();
                    obj.f42334a = RecyclerView.R(this);
                    gVar.f46219p0.d(true, false);
                    int i10 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new kr0(this, str, obj, 10), null, null, 0, s91Var.f42606a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i9 = ((org.telegram.ui.ActionBar.o2) s91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i9);
                }
            }
        }
    }

    @Override
    public final void f() {
        s91.Y(this.f37484w);
    }
}
