package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class a91 extends z81 {
    public final int v;
    public final p91 f35311w;

    public a91(p91 p91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f35311w = p91Var;
        this.v = i10;
    }

    @Override
    public final void b(b91 b91Var) {
        int i10;
        p91 p91Var = this.f35311w;
        i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
        b91Var.a(this.v, i10, p91Var.f40130a.stats_dc, new oh(2, p91Var, this.f43674r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f43674r.f35553c <= 0) {
            performClick();
            jg.g gVar = this.f43670b;
            if (gVar.f14482t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f43675s == 4) {
                    b91 b91Var = this.f43674r;
                    b91Var.e = new kg.e(b91Var.d, selectedDate);
                    g(false);
                } else if (this.f43674r.f35555g == null) {
                } else {
                    p91 p91Var = this.f35311w;
                    p91.Z(p91Var);
                    String str = this.f43674r.f35555g + "_" + selectedDate;
                    kg.b bVar = (kg.b) p91Var.V.get(str);
                    if (bVar != null) {
                        this.f43674r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f43674r.f35555g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20503x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    p91Var.Z = obj;
                    p91Var.S.getClass();
                    obj.f39798a = RecyclerView.R(this);
                    gVar.f14482t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tr0(this, str, obj, 10), null, null, 0, p91Var.f40130a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        p91.Z(this.f35311w);
    }
}
