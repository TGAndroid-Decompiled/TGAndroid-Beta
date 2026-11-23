package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class m41 extends l41 {
    public final int f49953w;
    public final b51 f49954x;

    public m41(b51 b51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.f49954x = b51Var;
        this.f49953w = i7;
    }

    @Override
    public final void b(n41 n41Var) {
        int i7;
        b51 b51Var = this.f49954x;
        i7 = ((org.telegram.ui.ActionBar.g2) b51Var).classGuid;
        n41Var.a(this.f49953w, i7, b51Var.f45924a.stats_dc, new fh(2, b51Var, this.f49590r));
    }

    @Override
    public final void c() {
        int i7;
        if (this.f49590r.f50210c <= 0) {
            performClick();
            lg.g gVar = this.f49585b;
            if (gVar.f19917u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49591s == 4) {
                    n41 n41Var = this.f49590r;
                    n41Var.f50211e = new mg.e(n41Var.d, selectedDate);
                    g(false);
                } else if (this.f49590r.f50213g == null) {
                } else {
                    b51 b51Var = this.f49954x;
                    b51.c0(b51Var);
                    String str = this.f49590r.f50213g + "_" + selectedDate;
                    mg.b bVar = (mg.b) b51Var.V.f(str);
                    if (bVar != null) {
                        this.f49590r.f50211e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49590r.f50213g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28725x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    b51Var.Z = obj;
                    b51Var.T.getClass();
                    obj.f45591a = RecyclerView.R(this);
                    gVar.f19917u0.d(true, false);
                    int i10 = this.f49953w;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new mo0(this, str, obj, 10), null, null, 0, b51Var.f45924a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i7 = ((org.telegram.ui.ActionBar.g2) b51Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i7);
                }
            }
        }
    }

    @Override
    public final void f() {
        b51.c0(this.f49954x);
    }
}
