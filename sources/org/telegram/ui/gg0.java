package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gg0 extends j41 {
    public final hg0 f47440w;

    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, fVar, e6Var);
        this.f47440w = hg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        jg0 jg0Var = this.f47440w.d;
        if (this.f48206r.f48828c <= 0) {
            performClick();
            lg.g gVar = this.f48201b;
            if (gVar.f19456u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f48207s == 4) {
                    l41 l41Var = this.f48206r;
                    l41Var.f48829e = new mg.e(l41Var.d, selectedDate);
                    g(false);
                } else if (this.f48206r.f48831g == null) {
                } else {
                    f();
                    String str = this.f48206r.f48831g + "_" + selectedDate;
                    mg.b bVar = (mg.b) jg0Var.f48331w.f(str);
                    if (bVar != null) {
                        this.f48206r.f48829e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f48206r.f48831g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28284x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jg0Var.f48332x = obj;
                    jg0Var.f48326f.getClass();
                    obj.f53415a = RecyclerView.R(this);
                    gVar.f19456u0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.e2) jg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, jg0Var.f48317a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.e2) jg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.e2) jg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        hg0 hg0Var = this.f47440w;
        jg0 jg0Var = hg0Var.d;
        y41 y41Var = jg0Var.f48332x;
        if (y41Var != null) {
            y41Var.f53416b = true;
        }
        int childCount = jg0Var.f48326f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f48326f.getChildAt(i7);
            if (childAt instanceof j41) {
                ((j41) childAt).f48201b.f19456u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(l41 l41Var) {
    }
}
