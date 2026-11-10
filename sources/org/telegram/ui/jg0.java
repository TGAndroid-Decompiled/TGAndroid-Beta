package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class jg0 extends n41 {
    public final kg0 f47009w;

    public jg0(kg0 kg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, fVar, h6Var);
        this.f47009w = kg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        mg0 mg0Var = this.f47009w.d;
        if (this.f48119r.f48950c <= 0) {
            performClick();
            lg.g gVar = this.f48114b;
            if (gVar.f18325t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f48120s == 4) {
                    q41 q41Var = this.f48119r;
                    q41Var.f48951e = new mg.e(q41Var.d, selectedDate);
                    g(false);
                } else if (this.f48119r.f48953g == null) {
                } else {
                    f();
                    String str = this.f48119r.f48953g + "_" + selectedDate;
                    mg.b bVar = (mg.b) mg0Var.f47966w.f(str);
                    if (bVar != null) {
                        this.f48119r.f48951e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f48119r.f48953g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27193x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    mg0Var.f47967x = obj;
                    mg0Var.f47962f.getClass();
                    obj.f44901a = RecyclerView.R(this);
                    gVar.f18325t0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.f2) mg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, mg0Var.f47953a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.f2) mg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.f2) mg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        kg0 kg0Var = this.f47009w;
        mg0 mg0Var = kg0Var.d;
        d51 d51Var = mg0Var.f47967x;
        if (d51Var != null) {
            d51Var.f44902b = true;
        }
        int childCount = mg0Var.f47962f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = kg0Var.d.f47962f.getChildAt(i7);
            if (childAt instanceof n41) {
                ((n41) childAt).f48114b.f18325t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(q41 q41Var) {
    }
}
