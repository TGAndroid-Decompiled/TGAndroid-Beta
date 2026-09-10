package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class qa1 extends pa1 {
    public final int v;
    public final fb1 f36007w;

    public qa1(fb1 fb1Var, Context context, int i10, int i11, hg.f fVar) {
        super(context, i11, fVar, null);
        this.f36007w = fb1Var;
        this.v = i10;
    }

    @Override
    public final void b(ra1 ra1Var) {
        int i10;
        fb1 fb1Var = this.f36007w;
        i10 = ((org.telegram.ui.ActionBar.p2) fb1Var).classGuid;
        ra1Var.a(this.v, i10, fb1Var.f32740a.stats_dc, new org.telegram.ui.Components.f61(1, fb1Var, this.f35757r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f35757r.f36314c <= 0) {
            performClick();
            hg.g gVar = this.f35753b;
            if (gVar.f9382t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35758s == 4) {
                    ra1 ra1Var = this.f35757r;
                    ra1Var.e = new ig.e(ra1Var.d, selectedDate);
                    g(false);
                } else if (this.f35757r.f36316g == null) {
                } else {
                    fb1 fb1Var = this.f36007w;
                    fb1.Z(fb1Var);
                    String str = this.f35757r.f36316g + "_" + selectedDate;
                    ig.b bVar = (ig.b) fb1Var.V.get(str);
                    if (bVar != null) {
                        this.f35757r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35757r.f36316g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f17429x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    fb1Var.Z = obj;
                    fb1Var.S.getClass();
                    obj.f32143a = RecyclerView.R(this);
                    gVar.f9382t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ms0(this, str, obj, 10), null, null, 0, fb1Var.f32740a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.p2) fb1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        fb1.Z(this.f36007w);
    }
}
