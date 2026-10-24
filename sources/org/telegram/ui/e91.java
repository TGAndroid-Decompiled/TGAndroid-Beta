package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class e91 extends d91 {
    public final int v;
    public final t91 f36862w;

    public e91(t91 t91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f36862w = t91Var;
        this.v = i10;
    }

    @Override
    public final void b(f91 f91Var) {
        int i10;
        t91 t91Var = this.f36862w;
        i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
        f91Var.a(this.v, i10, t91Var.f41941a.stats_dc, new oh(2, t91Var, this.f36544r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f36544r.f37245c <= 0) {
            performClick();
            jg.g gVar = this.f36540b;
            if (gVar.f14525t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36545s == 4) {
                    f91 f91Var = this.f36544r;
                    f91Var.e = new kg.e(f91Var.d, selectedDate);
                    g(false);
                } else if (this.f36544r.f37247g == null) {
                } else {
                    t91 t91Var = this.f36862w;
                    t91.Z(t91Var);
                    String str = this.f36544r.f37247g + "_" + selectedDate;
                    kg.b bVar = (kg.b) t91Var.V.get(str);
                    if (bVar != null) {
                        this.f36544r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36544r.f37247g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20572x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    t91Var.Z = obj;
                    t91Var.S.getClass();
                    obj.f41324a = RecyclerView.R(this);
                    gVar.f14525t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new vr0(this, str, obj, 10), null, null, 0, t91Var.f41941a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        t91.Z(this.f36862w);
    }
}
