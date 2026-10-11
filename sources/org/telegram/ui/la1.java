package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class la1 extends ka1 {
    public final int v;
    public final ab1 f39609w;

    public la1(ab1 ab1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f39609w = ab1Var;
        this.v = i10;
    }

    @Override
    public final void b(ma1 ma1Var) {
        int i10;
        ab1 ab1Var = this.f39609w;
        i10 = ((org.telegram.ui.ActionBar.m2) ab1Var).classGuid;
        ma1Var.a(this.v, i10, ab1Var.f35995a.stats_dc, new xh(2, ab1Var, this.f39288r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f39288r.f39917c <= 0) {
            performClick();
            ig.g gVar = this.f39283b;
            if (gVar.f12191t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f39289s == 4) {
                    ma1 ma1Var = this.f39288r;
                    ma1Var.f39918e = new jg.e(ma1Var.d, selectedDate);
                    g(false);
                } else if (this.f39288r.f39920g == null) {
                } else {
                    ab1 ab1Var = this.f39609w;
                    ab1.Z(ab1Var);
                    String str = this.f39288r.f39920g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ab1Var.V.get(str);
                    if (bVar != null) {
                        this.f39288r.f39918e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f39288r.f39920g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20299x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ab1Var.Z = obj;
                    ab1Var.S.getClass();
                    obj.f44661a = RecyclerView.R(this);
                    gVar.f12191t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ms0(this, str, obj, 10), null, null, 0, ab1Var.f35995a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.m2) ab1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ab1.Z(this.f39609w);
    }
}
