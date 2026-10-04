package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ej0 extends fa1 {
    public final fj0 v;

    public ej0(fj0 fj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = fj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        hj0 hj0Var = this.v.d;
        if (this.f36235r.f37017c <= 0) {
            performClick();
            ig.g gVar = this.f36230b;
            if (gVar.f12144t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f36236s == 4) {
                    ha1 ha1Var = this.f36235r;
                    ha1Var.f37018e = new jg.e(ha1Var.d, selectedDate);
                    g(false);
                } else if (this.f36235r.f37020g == null) {
                } else {
                    f();
                    String str = this.f36235r.f37020g + "_" + selectedDate;
                    jg.b bVar = (jg.b) hj0Var.v.get(str);
                    if (bVar != null) {
                        this.f36235r.f37018e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36235r.f37020g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20268x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    hj0Var.f37100w = obj;
                    hj0Var.f37096f.getClass();
                    obj.f41137a = RecyclerView.R(this);
                    gVar.f12144t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) hj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, (Object) obj, 25), null, null, 0, hj0Var.f37087a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) hj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) hj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        fj0 fj0Var = this.v;
        hj0 hj0Var = fj0Var.d;
        ua1 ua1Var = hj0Var.f37100w;
        if (ua1Var != null) {
            ua1Var.f41138b = true;
        }
        int childCount = hj0Var.f37096f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fj0Var.d.f37096f.getChildAt(i10);
            if (childAt instanceof fa1) {
                ((fa1) childAt).f36230b.f12144t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ha1 ha1Var) {
    }
}
