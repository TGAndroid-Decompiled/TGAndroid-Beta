package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class hj0 extends pa1 {
    public final ij0 v;

    public hj0(ij0 ij0Var, Context context, int i10, hg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = ij0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        kj0 kj0Var = this.v.d;
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
                    f();
                    String str = this.f35757r.f36316g + "_" + selectedDate;
                    ig.b bVar = (ig.b) kj0Var.v.get(str);
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
                    kj0Var.f34396w = obj;
                    kj0Var.f34392f.getClass();
                    obj.f32143a = RecyclerView.R(this);
                    gVar.f9382t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.p2) kj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, kj0Var.f34384a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.p2) kj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.p2) kj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ij0 ij0Var = this.v;
        kj0 kj0Var = ij0Var.d;
        eb1 eb1Var = kj0Var.f34396w;
        if (eb1Var != null) {
            eb1Var.f32144b = true;
        }
        int childCount = kj0Var.f34392f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ij0Var.d.f34392f.getChildAt(i10);
            if (childAt instanceof pa1) {
                ((pa1) childAt).f35753b.f9382t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ra1 ra1Var) {
    }
}
