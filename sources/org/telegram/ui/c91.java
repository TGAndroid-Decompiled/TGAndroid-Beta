package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class c91 extends b91 {
    public final int v;
    public final r91 f35856w;

    public c91(r91 r91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f35856w = r91Var;
        this.v = i10;
    }

    @Override
    public final void b(d91 d91Var) {
        int i10;
        r91 r91Var = this.f35856w;
        i10 = ((org.telegram.ui.ActionBar.n2) r91Var).classGuid;
        d91Var.a(this.v, i10, r91Var.f40628a.stats_dc, new qh(2, r91Var, this.f35593r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f35593r.f36100c <= 0) {
            performClick();
            jg.g gVar = this.f35589b;
            if (gVar.f14480t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35594s == 4) {
                    d91 d91Var = this.f35593r;
                    d91Var.e = new kg.e(d91Var.d, selectedDate);
                    g(false);
                } else if (this.f35593r.f36102g == null) {
                } else {
                    r91 r91Var = this.f35856w;
                    r91.Z(r91Var);
                    String str = this.f35593r.f36102g + "_" + selectedDate;
                    kg.b bVar = (kg.b) r91Var.V.get(str);
                    if (bVar != null) {
                        this.f35593r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35593r.f36102g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20500x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    r91Var.Z = obj;
                    r91Var.S.getClass();
                    obj.f40306a = RecyclerView.R(this);
                    gVar.f14480t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new vr0(this, str, obj, 10), null, null, 0, r91Var.f40628a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) r91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        r91.Z(this.f35856w);
    }
}
