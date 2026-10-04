package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ga1 extends fa1 {
    public final int v;
    public final va1 f36551w;

    public ga1(va1 va1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f36551w = va1Var;
        this.v = i10;
    }

    @Override
    public final void b(ha1 ha1Var) {
        int i10;
        va1 va1Var = this.f36551w;
        i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
        ha1Var.a(this.v, i10, va1Var.f41645a.stats_dc, new org.telegram.ui.Components.q61(1, va1Var, this.f36241r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f36241r.f37023c <= 0) {
            performClick();
            ig.g gVar = this.f36236b;
            if (gVar.f12145t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36242s == 4) {
                    ha1 ha1Var = this.f36241r;
                    ha1Var.f37024e = new jg.e(ha1Var.d, selectedDate);
                    g(false);
                } else if (this.f36241r.f37026g == null) {
                } else {
                    va1 va1Var = this.f36551w;
                    va1.W(va1Var);
                    String str = this.f36241r.f37026g + "_" + selectedDate;
                    jg.b bVar = (jg.b) va1Var.U.get(str);
                    if (bVar != null) {
                        this.f36241r.f37024e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36241r.f37026g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20273x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    va1Var.Y = obj;
                    va1Var.S.getClass();
                    obj.f41144a = RecyclerView.R(this);
                    gVar.f12145t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new is0(this, str, obj, 10), null, null, 0, va1Var.f41645a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        va1.W(this.f36551w);
    }
}
