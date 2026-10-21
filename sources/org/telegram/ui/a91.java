package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class a91 extends z81 {
    public final int v;
    public final p91 f35320w;

    public a91(p91 p91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.f35320w = p91Var;
        this.v = i10;
    }

    @Override
    public final void b(b91 b91Var) {
        int i10;
        p91 p91Var = this.f35320w;
        i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
        b91Var.a(this.v, i10, p91Var.f40127a.stats_dc, new oh(2, p91Var, this.f43675r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f43675r.f35544c <= 0) {
            performClick();
            jg.g gVar = this.f43671b;
            if (gVar.f14480t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f43676s == 4) {
                    b91 b91Var = this.f43675r;
                    b91Var.e = new kg.e(b91Var.d, selectedDate);
                    g(false);
                } else if (this.f43675r.f35546g == null) {
                } else {
                    p91 p91Var = this.f35320w;
                    p91.Z(p91Var);
                    String str = this.f43675r.f35546g + "_" + selectedDate;
                    kg.b bVar = (kg.b) p91Var.V.get(str);
                    if (bVar != null) {
                        this.f43675r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f43675r.f35546g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20504x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    p91Var.Z = obj;
                    p91Var.S.getClass();
                    obj.f39803a = RecyclerView.R(this);
                    gVar.f14480t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tr0(this, str, obj, 10), null, null, 0, p91Var.f40127a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        p91.Z(this.f35320w);
    }
}
