package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ig0 extends m41 {
    public final jg0 f46664w;

    public ig0(jg0 jg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, fVar, g6Var);
        this.f46664w = jg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        lg0 lg0Var = this.f46664w.d;
        if (this.f47749r.f48622c <= 0) {
            performClick();
            lg.g gVar = this.f47744b;
            if (gVar.f18322t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f47750s == 4) {
                    p41 p41Var = this.f47749r;
                    p41Var.f48623e = new mg.e(p41Var.d, selectedDate);
                    g(false);
                } else if (this.f47749r.f48625g == null) {
                } else {
                    f();
                    String str = this.f47749r.f48625g + "_" + selectedDate;
                    mg.b bVar = (mg.b) lg0Var.f47614w.f(str);
                    if (bVar != null) {
                        this.f47749r.f48623e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f47749r.f48625g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27189x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    lg0Var.f47615x = obj;
                    lg0Var.f47610f.getClass();
                    obj.f44225a = RecyclerView.R(this);
                    gVar.f18322t0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.f2) lg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, lg0Var.f47601a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.f2) lg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.f2) lg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        jg0 jg0Var = this.f46664w;
        lg0 lg0Var = jg0Var.d;
        c51 c51Var = lg0Var.f47615x;
        if (c51Var != null) {
            c51Var.f44226b = true;
        }
        int childCount = lg0Var.f47610f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jg0Var.d.f47610f.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).f47744b.f18322t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(p41 p41Var) {
    }
}
