package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gg0 extends l41 {
    public final hg0 f46003w;

    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, fVar, f6Var);
        this.f46003w = hg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        jg0 jg0Var = this.f46003w.d;
        if (this.f47419r.f48255c <= 0) {
            performClick();
            lg.g gVar = this.f47414b;
            if (gVar.f18322t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f47420s == 4) {
                    o41 o41Var = this.f47419r;
                    o41Var.f48256e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f47419r.f48258g == null) {
                } else {
                    f();
                    String str = this.f47419r.f48258g + "_" + selectedDate;
                    mg.b bVar = (mg.b) jg0Var.f46971w.f(str);
                    if (bVar != null) {
                        this.f47419r.f48256e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f47419r.f48258g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27189x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jg0Var.f46972x = obj;
                    jg0Var.f46967f.getClass();
                    obj.f44202a = RecyclerView.R(this);
                    gVar.f18322t0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.f2) jg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, jg0Var.f46958a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.f2) jg0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.f2) jg0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        hg0 hg0Var = this.f46003w;
        jg0 jg0Var = hg0Var.d;
        b51 b51Var = jg0Var.f46972x;
        if (b51Var != null) {
            b51Var.f44203b = true;
        }
        int childCount = jg0Var.f46967f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f46967f.getChildAt(i7);
            if (childAt instanceof l41) {
                ((l41) childAt).f47414b.f18322t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(o41 o41Var) {
    }
}
