package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ea1 extends da1 {
    public final int v;
    public final ta1 f35995w;

    public ea1(ta1 ta1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f35995w = ta1Var;
        this.v = i10;
    }

    @Override
    public final void b(fa1 fa1Var) {
        int i10;
        ta1 ta1Var = this.f35995w;
        i10 = ((org.telegram.ui.ActionBar.n2) ta1Var).classGuid;
        fa1Var.a(this.v, i10, ta1Var.f40802a.stats_dc, new org.telegram.ui.Components.s61(1, ta1Var, this.f35738r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f35738r.f36246c <= 0) {
            performClick();
            ig.g gVar = this.f35733b;
            if (gVar.f12145t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35739s == 4) {
                    fa1 fa1Var = this.f35738r;
                    fa1Var.f36247e = new jg.e(fa1Var.d, selectedDate);
                    g(false);
                } else if (this.f35738r.f36249g == null) {
                } else {
                    ta1 ta1Var = this.f35995w;
                    ta1.W(ta1Var);
                    String str = this.f35738r.f36249g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ta1Var.U.get(str);
                    if (bVar != null) {
                        this.f35738r.f36247e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35738r.f36249g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20278x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ta1Var.Y = obj;
                    ta1Var.S.getClass();
                    obj.f40425a = RecyclerView.R(this);
                    gVar.f12145t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new is0(this, str, obj, 10), null, null, 0, ta1Var.f40802a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) ta1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ta1.W(this.f35995w);
    }
}
