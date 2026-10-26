package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class h91 extends g91 {
    public final int v;
    public final w91 f39964w;

    public h91(w91 w91Var, Context context, int i10, int i11, kg.g gVar) {
        super(context, i11, gVar, null);
        this.f39964w = w91Var;
        this.v = i10;
    }

    @Override
    public final void b(i91 i91Var) {
        int i10;
        w91 w91Var = this.f39964w;
        i10 = ((org.telegram.ui.ActionBar.r2) w91Var).classGuid;
        i91Var.a(this.v, i10, w91Var.f45020a.stats_dc, new qh(2, w91Var, this.f39576r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f39576r.f40188c <= 0) {
            performClick();
            kg.h hVar = this.f39572b;
            if (hVar.f16618t0.G) {
                long selectedDate = hVar.getSelectedDate();
                if (this.f39577s == 4) {
                    i91 i91Var = this.f39576r;
                    i91Var.e = new lg.e(i91Var.d, selectedDate);
                    g(false);
                } else if (this.f39576r.f40190g == null) {
                } else {
                    w91 w91Var = this.f39964w;
                    w91.Y(w91Var);
                    String str = this.f39576r.f40190g + "_" + selectedDate;
                    lg.b bVar = (lg.b) w91Var.U.get(str);
                    if (bVar != null) {
                        this.f39576r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39576r.f40190g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22260x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    w91Var.Y = obj;
                    w91Var.S.getClass();
                    obj.f44749a = RecyclerView.R(this);
                    hVar.f16618t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new as0(this, str, obj, 10), null, null, 0, w91Var.f45020a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.r2) w91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        w91.Y(this.f39964w);
    }
}
