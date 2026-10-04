package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ga1 extends fa1 {
    public final int v;
    public final va1 f36546w;

    public ga1(va1 va1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f36546w = va1Var;
        this.v = i10;
    }

    @Override
    public final void b(ha1 ha1Var) {
        int i10;
        va1 va1Var = this.f36546w;
        i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
        ha1Var.a(this.v, i10, va1Var.f41638a.stats_dc, new org.telegram.ui.Components.q61(1, va1Var, this.f36236r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f36236r.f37018c <= 0) {
            performClick();
            ig.g gVar = this.f36231b;
            if (gVar.f12144t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36237s == 4) {
                    ha1 ha1Var = this.f36236r;
                    ha1Var.f37019e = new jg.e(ha1Var.d, selectedDate);
                    g(false);
                } else if (this.f36236r.f37021g == null) {
                } else {
                    va1 va1Var = this.f36546w;
                    va1.W(va1Var);
                    String str = this.f36236r.f37021g + "_" + selectedDate;
                    jg.b bVar = (jg.b) va1Var.U.get(str);
                    if (bVar != null) {
                        this.f36236r.f37019e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36236r.f37021g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20269x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    va1Var.Y = obj;
                    va1Var.S.getClass();
                    obj.f41138a = RecyclerView.R(this);
                    gVar.f12144t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new is0(this, str, obj, 10), null, null, 0, va1Var.f41638a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        va1.W(this.f36546w);
    }
}
