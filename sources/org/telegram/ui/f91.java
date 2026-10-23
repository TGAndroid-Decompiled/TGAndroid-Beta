package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class f91 extends e91 {
    public final int v;
    public final u91 f37260w;

    public f91(u91 u91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f37260w = u91Var;
        this.v = i10;
    }

    @Override
    public final void b(g91 g91Var) {
        int i10;
        u91 u91Var = this.f37260w;
        i10 = ((org.telegram.ui.ActionBar.o2) u91Var).classGuid;
        g91Var.a(this.v, i10, u91Var.f42310a.stats_dc, new oh(2, u91Var, this.f36883r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f36883r.f37533c <= 0) {
            performClick();
            jg.g gVar = this.f36879b;
            if (gVar.f14525t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36884s == 4) {
                    g91 g91Var = this.f36883r;
                    g91Var.e = new kg.e(g91Var.d, selectedDate);
                    g(false);
                } else if (this.f36883r.f37535g == null) {
                } else {
                    u91 u91Var = this.f37260w;
                    u91.Z(u91Var);
                    String str = this.f36883r.f37535g + "_" + selectedDate;
                    kg.b bVar = (kg.b) u91Var.V.get(str);
                    if (bVar != null) {
                        this.f36883r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36883r.f37535g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20571x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    u91Var.Z = obj;
                    u91Var.S.getClass();
                    obj.f41930a = RecyclerView.R(this);
                    gVar.f14525t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new wr0(this, str, obj, 10), null, null, 0, u91Var.f42310a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.o2) u91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        u91.Z(this.f37260w);
    }
}
