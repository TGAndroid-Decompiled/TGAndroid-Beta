package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class aj0 extends ca1 {
    public final bj0 v;

    public aj0(bj0 bj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = bj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        dj0 dj0Var = this.v.d;
        if (this.f32618r.f33347c <= 0) {
            performClick();
            ig.g gVar = this.f32614b;
            if (gVar.f11152t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f32619s == 4) {
                    ea1 ea1Var = this.f32618r;
                    ea1Var.e = new jg.e(ea1Var.d, selectedDate);
                    g(false);
                } else if (this.f32618r.f33349g == null) {
                } else {
                    f();
                    String str = this.f32618r.f33349g + "_" + selectedDate;
                    jg.b bVar = (jg.b) dj0Var.v.get(str);
                    if (bVar != null) {
                        this.f32618r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f32618r.f33349g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18565x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    dj0Var.f33145w = obj;
                    dj0Var.f33141f.getClass();
                    obj.f37279a = RecyclerView.R(this);
                    gVar.f11152t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) dj0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, dj0Var.f33133a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) dj0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) dj0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        bj0 bj0Var = this.v;
        dj0 dj0Var = bj0Var.d;
        ra1 ra1Var = dj0Var.f33145w;
        if (ra1Var != null) {
            ra1Var.f37280b = true;
        }
        int childCount = dj0Var.f33141f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = bj0Var.d.f33141f.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).f32614b.f11152t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ea1 ea1Var) {
    }
}
