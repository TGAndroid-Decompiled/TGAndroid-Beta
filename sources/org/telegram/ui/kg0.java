package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class kg0 extends m41 {
    public final lg0 f49269w;

    public kg0(lg0 lg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, fVar, i6Var);
        this.f49269w = lg0Var;
    }

    @Override
    public final void c() {
        int i7;
        int i10;
        int i11;
        ng0 ng0Var = this.f49269w.d;
        if (this.f49753r.f50465c <= 0) {
            performClick();
            lg.g gVar = this.f49748b;
            if (gVar.f19823u0.H) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f49754s == 4) {
                    o41 o41Var = this.f49753r;
                    o41Var.f50466e = new mg.e(o41Var.d, selectedDate);
                    g(false);
                } else if (this.f49753r.f50468g == null) {
                } else {
                    f();
                    String str = this.f49753r.f50468g + "_" + selectedDate;
                    mg.b bVar = (mg.b) ng0Var.f50190w.f(str);
                    if (bVar != null) {
                        this.f49753r.f50466e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f49753r.f50468g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f28638x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ng0Var.f50191x = obj;
                    ng0Var.f50185f.getClass();
                    obj.f45768a = RecyclerView.R(this);
                    gVar.f19823u0.d(true, false);
                    i7 = ((org.telegram.ui.ActionBar.h2) ng0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, (Object) obj, 25), null, null, 0, ng0Var.f50176a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.h2) ng0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.h2) ng0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        lg0 lg0Var = this.f49269w;
        ng0 ng0Var = lg0Var.d;
        b51 b51Var = ng0Var.f50191x;
        if (b51Var != null) {
            b51Var.f45769b = true;
        }
        int childCount = ng0Var.f50185f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = lg0Var.d.f50185f.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).f49748b.f19823u0.d(false, true);
            }
        }
    }

    @Override
    public final void b(o41 o41Var) {
    }
}
