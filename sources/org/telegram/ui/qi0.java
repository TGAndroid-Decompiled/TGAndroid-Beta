package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class qi0 extends z81 {
    public final ri0 v;

    public qi0(ri0 ri0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = ri0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        ti0 ti0Var = this.v.d;
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
                    f();
                    String str = this.f43674r.f35555g + "_" + selectedDate;
                    kg.b bVar = (kg.b) ti0Var.v.get(str);
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
                    ti0Var.f41696w = obj;
                    ti0Var.f41692f.getClass();
                    obj.f39798a = RecyclerView.R(this);
                    gVar.f14482t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) ti0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, ti0Var.f41684a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) ti0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) ti0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        ri0 ri0Var = this.v;
        ti0 ti0Var = ri0Var.d;
        o91 o91Var = ti0Var.f41696w;
        if (o91Var != null) {
            o91Var.f39799b = true;
        }
        int childCount = ti0Var.f41692f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ri0Var.d.f41692f.getChildAt(i10);
            if (childAt instanceof z81) {
                ((z81) childAt).f43670b.f14482t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(b91 b91Var) {
    }
}
