package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class dj0 extends ba1 {
    public final ej0 v;

    public dj0(ej0 ej0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = ej0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        gj0 gj0Var = this.v.d;
        if (this.f32306r.f32908c <= 0) {
            performClick();
            ig.g gVar = this.f32302b;
            if (gVar.f11155t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f32307s == 4) {
                    da1 da1Var = this.f32306r;
                    da1Var.e = new jg.e(da1Var.d, selectedDate);
                    g(false);
                } else if (this.f32306r.f32910g == null) {
                } else {
                    f();
                    String str = this.f32306r.f32910g + "_" + selectedDate;
                    jg.b bVar = (jg.b) gj0Var.v.get(str);
                    if (bVar != null) {
                        this.f32306r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f32306r.f32910g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18558x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    gj0Var.f33966w = obj;
                    gj0Var.f33962f.getClass();
                    obj.f36699a = RecyclerView.S(this);
                    gVar.f11155t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.o2) gj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new da(this, str, (Object) obj, 25), null, null, 0, gj0Var.f33954a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.o2) gj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.o2) gj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ej0 ej0Var = this.v;
        gj0 gj0Var = ej0Var.d;
        qa1 qa1Var = gj0Var.f33966w;
        if (qa1Var != null) {
            qa1Var.f36700b = true;
        }
        int childCount = gj0Var.f33962f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ej0Var.d.f33962f.getChildAt(i10);
            if (childAt instanceof ba1) {
                ((ba1) childAt).f32302b.f11155t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(da1 da1Var) {
    }
}
