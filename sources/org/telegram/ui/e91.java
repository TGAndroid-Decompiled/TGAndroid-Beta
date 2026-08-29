package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class e91 extends d91 {
    public final int v;
    public final t91 f37766w;

    public e91(t91 t91Var, Context context, int i10, int i11, tf.f fVar) {
        super(context, i11, fVar, null);
        this.f37766w = t91Var;
        this.v = i10;
    }

    @Override
    public final void b(f91 f91Var) {
        int i10;
        t91 t91Var = this.f37766w;
        i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
        f91Var.a(this.v, i10, t91Var.f42588a.stats_dc, new org.telegram.ui.Components.g51(1, t91Var, this.f37430r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f37430r.f38071c <= 0) {
            performClick();
            tf.g gVar = this.f37425b;
            if (gVar.f48278p0.C) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f37431s == 4) {
                    f91 f91Var = this.f37430r;
                    f91Var.f38072e = new uf.e(f91Var.d, selectedDate);
                    g(false);
                } else if (this.f37430r.f38074g == null) {
                } else {
                    t91 t91Var = this.f37766w;
                    t91.Z(t91Var);
                    String str = this.f37430r.f38074g + "_" + selectedDate;
                    uf.b bVar = (uf.b) t91Var.R.get(str);
                    if (bVar != null) {
                        this.f37430r.f38072e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f37430r.f38074g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22623x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    t91Var.V = obj;
                    t91Var.O.getClass();
                    obj.f42327a = RecyclerView.R(this);
                    gVar.f48278p0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new jr0(this, str, obj, 10), null, null, 0, t91Var.f42588a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        t91.Z(this.f37766w);
    }
}
