package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class jg0 extends l41 {
    public final kg0 f49120w;

    public jg0(kg0 kg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, fVar, i6Var);
        this.f49120w = kg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        mg0 mg0Var = this.f49120w.d;
        if (this.f49590r.f50210c <= 0) {
            performClick();
            lg.g gVar = this.f49585b;
            if (gVar.f19917u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49591s == 4) {
                    n41 n41Var = this.f49590r;
                    n41Var.f50211e = new mg.e(n41Var.d, selectedDate);
                    g(false);
                } else if (this.f49590r.f50213g == null) {
                } else {
                    f();
                    String str = this.f49590r.f50213g + "_" + selectedDate;
                    mg.b bVar = (mg.b) mg0Var.f50068w.f(str);
                    if (bVar != null) {
                        this.f49590r.f50211e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49590r.f50213g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28725x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    mg0Var.f50069x = obj;
                    mg0Var.f50063f.getClass();
                    obj.f45591a = RecyclerView.R(this);
                    gVar.f19917u0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.g2) mg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, mg0Var.f50054a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.g2) mg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.g2) mg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        kg0 kg0Var = this.f49120w;
        mg0 mg0Var = kg0Var.d;
        a51 a51Var = mg0Var.f50069x;
        if (a51Var != null) {
            a51Var.f45592b = true;
        }
        int childCount = mg0Var.f50063f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = kg0Var.d.f50063f.getChildAt(i7);
            if (childAt instanceof l41) {
                ((l41) childAt).f49585b.f19917u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(n41 n41Var) {
    }
}
