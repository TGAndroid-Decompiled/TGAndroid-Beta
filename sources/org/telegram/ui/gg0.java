package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gg0 extends j41 {
    public final hg0 f47450w;

    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, fVar, e6Var);
        this.f47450w = hg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        jg0 jg0Var = this.f47450w.d;
        if (this.f48221r.f48832c <= 0) {
            performClick();
            lg.g gVar = this.f48216b;
            if (gVar.f19456u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f48222s == 4) {
                    l41 l41Var = this.f48221r;
                    l41Var.f48833e = new mg.e(l41Var.d, selectedDate);
                    g(false);
                } else if (this.f48221r.f48835g == null) {
                } else {
                    f();
                    String str = this.f48221r.f48835g + "_" + selectedDate;
                    mg.b bVar = (mg.b) jg0Var.f48346w.f(str);
                    if (bVar != null) {
                        this.f48221r.f48833e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f48221r.f48835g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28284x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jg0Var.f48347x = obj;
                    jg0Var.f48341f.getClass();
                    obj.f53411a = RecyclerView.R(this);
                    gVar.f19456u0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.e2) jg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, jg0Var.f48332a.stats_dc, 1, true);
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
        hg0 hg0Var = this.f47450w;
        jg0 jg0Var = hg0Var.d;
        y41 y41Var = jg0Var.f48347x;
        if (y41Var != null) {
            y41Var.f53412b = true;
        }
        int childCount = jg0Var.f48341f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f48341f.getChildAt(i7);
            if (childAt instanceof j41) {
                ((j41) childAt).f48216b.f19456u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(l41 l41Var) {
    }
}
