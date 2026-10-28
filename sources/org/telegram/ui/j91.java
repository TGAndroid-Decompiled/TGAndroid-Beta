package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class j91 extends i91 {
    public final int v;
    public final y91 f40496w;

    public j91(y91 y91Var, Context context, int i10, int i11, kg.g gVar) {
        super(context, i11, gVar, null);
        this.f40496w = y91Var;
        this.v = i10;
    }

    @Override
    public final void b(k91 k91Var) {
        int i10;
        y91 y91Var = this.f40496w;
        i10 = ((org.telegram.ui.ActionBar.r2) y91Var).classGuid;
        k91Var.a(this.v, i10, y91Var.f45908a.stats_dc, new rh(2, y91Var, this.f40076r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f40076r.f40706c <= 0) {
            performClick();
            kg.h hVar = this.f40072b;
            if (hVar.f16617t0.G) {
                long selectedDate = hVar.getSelectedDate();
                if (this.f40077s == 4) {
                    k91 k91Var = this.f40076r;
                    k91Var.e = new lg.e(k91Var.d, selectedDate);
                    g(false);
                } else if (this.f40076r.f40708g == null) {
                } else {
                    y91 y91Var = this.f40496w;
                    y91.Y(y91Var);
                    String str = this.f40076r.f40708g + "_" + selectedDate;
                    lg.b bVar = (lg.b) y91Var.U.get(str);
                    if (bVar != null) {
                        this.f40076r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f40076r.f40708g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22261x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    y91Var.Y = obj;
                    y91Var.S.getClass();
                    obj.f45633a = RecyclerView.R(this);
                    hVar.f16617t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new cs0(this, str, obj, 10), null, null, 0, y91Var.f45908a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.r2) y91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        y91.Y(this.f40496w);
    }
}
