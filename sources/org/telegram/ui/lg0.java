package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class lg0 extends m41 {
    public final mg0 f49617w;

    public lg0(mg0 mg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, fVar, h6Var);
        this.f49617w = mg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        og0 og0Var = this.f49617w.d;
        if (this.f49764r.f50474c <= 0) {
            performClick();
            lg.g gVar = this.f49759b;
            if (gVar.f19851u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49765s == 4) {
                    o41 o41Var = this.f49764r;
                    o41Var.f50475e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f49764r.f50477g == null) {
                } else {
                    f();
                    String str = this.f49764r.f50477g + "_" + selectedDate;
                    mg.b bVar = (mg.b) og0Var.f50596w.f(str);
                    if (bVar != null) {
                        this.f49764r.f50475e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49764r.f50477g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28667x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    og0Var.f50597x = obj;
                    og0Var.f50591f.getClass();
                    obj.f45791a = RecyclerView.R(this);
                    gVar.f19851u0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.g2) og0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, og0Var.f50582a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.g2) og0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.g2) og0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        mg0 mg0Var = this.f49617w;
        og0 og0Var = mg0Var.d;
        b51 b51Var = og0Var.f50597x;
        if (b51Var != null) {
            b51Var.f45792b = true;
        }
        int childCount = og0Var.f50591f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = mg0Var.d.f50591f.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).f49759b.f19851u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(o41 o41Var) {
    }
}
