package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class gg0 extends l41 {
    public final hg0 f46002w;

    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, fVar, f6Var);
        this.f46002w = hg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        jg0 jg0Var = this.f46002w.d;
        if (this.f47415r.f48256c <= 0) {
            performClick();
            lg.g gVar = this.f47410b;
            if (gVar.f18319t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f47416s == 4) {
                    o41 o41Var = this.f47415r;
                    o41Var.f48257e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f47415r.f48259g == null) {
                } else {
                    f();
                    String str = this.f47415r.f48259g + "_" + selectedDate;
                    mg.b bVar = (mg.b) jg0Var.f46974w.f(str);
                    if (bVar != null) {
                        this.f47415r.f48257e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f47415r.f48259g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f27185x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    jg0Var.f46975x = obj;
                    jg0Var.f46970f.getClass();
                    obj.f44197a = RecyclerView.R(this);
                    gVar.f18319t0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.f2) jg0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, jg0Var.f46961a.stats_dc, 1, true);
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
        hg0 hg0Var = this.f46002w;
        jg0 jg0Var = hg0Var.d;
        b51 b51Var = jg0Var.f46975x;
        if (b51Var != null) {
            b51Var.f44198b = true;
        }
        int childCount = jg0Var.f46970f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f46970f.getChildAt(i7);
            if (childAt instanceof l41) {
                ((l41) childAt).f47410b.f18319t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(o41 o41Var) {
    }
}
