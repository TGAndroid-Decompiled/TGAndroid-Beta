package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class jj0 extends la1 {
    public final kj0 v;

    public jj0(kj0 kj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = kj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        mj0 mj0Var = this.v.d;
        if (this.f35394r.f35950c <= 0) {
            performClick();
            ig.g gVar = this.f35390b;
            if (gVar.f11166t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f35395s == 4) {
                    na1 na1Var = this.f35394r;
                    na1Var.e = new jg.e(na1Var.d, selectedDate);
                    g(false);
                } else if (this.f35394r.f35952g == null) {
                } else {
                    f();
                    String str = this.f35394r.f35952g + "_" + selectedDate;
                    jg.b bVar = (jg.b) mj0Var.v.get(str);
                    if (bVar != null) {
                        this.f35394r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f35394r.f35952g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18557x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    mj0Var.f35759w = obj;
                    mj0Var.f35755f.getClass();
                    obj.f32027a = RecyclerView.S(this);
                    gVar.f11166t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.n2) mj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, (Object) obj, 25), null, null, 0, mj0Var.f35747a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.n2) mj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.n2) mj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        kj0 kj0Var = this.v;
        mj0 mj0Var = kj0Var.d;
        ab1 ab1Var = mj0Var.f35759w;
        if (ab1Var != null) {
            ab1Var.f32028b = true;
        }
        int childCount = mj0Var.f35755f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = kj0Var.d.f35755f.getChildAt(i10);
            if (childAt instanceof la1) {
                ((la1) childAt).f35390b.f11166t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(na1 na1Var) {
    }
}
