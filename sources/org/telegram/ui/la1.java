package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class la1 extends ka1 {
    public final int v;
    public final ab1 f35496w;

    public la1(ab1 ab1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f35496w = ab1Var;
        this.v = i10;
    }

    @Override
    public final void b(ma1 ma1Var) {
        int i10;
        ab1 ab1Var = this.f35496w;
        i10 = ((org.telegram.ui.ActionBar.o2) ab1Var).classGuid;
        ma1Var.a(this.v, i10, ab1Var.f31786a.stats_dc, new org.telegram.ui.Components.t51(1, ab1Var, this.f35183r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f35183r.f35748c <= 0) {
            performClick();
            ig.g gVar = this.f35179b;
            if (gVar.f11165t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35184s == 4) {
                    ma1 ma1Var = this.f35183r;
                    ma1Var.e = new jg.e(ma1Var.d, selectedDate);
                    g(false);
                } else if (this.f35183r.f35750g == null) {
                } else {
                    ab1 ab1Var = this.f35496w;
                    ab1.Z(ab1Var);
                    String str = this.f35183r.f35750g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ab1Var.V.get(str);
                    if (bVar != null) {
                        this.f35183r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35183r.f35750g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18350x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ab1Var.Z = obj;
                    ab1Var.S.getClass();
                    obj.f40200a = RecyclerView.S(this);
                    gVar.f11165t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ps0(this, str, obj, 10), null, null, 0, ab1Var.f31786a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.o2) ab1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ab1.Z(this.f35496w);
    }
}
