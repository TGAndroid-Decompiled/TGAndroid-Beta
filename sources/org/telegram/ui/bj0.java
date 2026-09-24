package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class bj0 extends ca1 {
    public final cj0 v;

    public bj0(cj0 cj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = cj0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        ej0 ej0Var = this.v.d;
        if (this.f32603r.f33319c <= 0) {
            performClick();
            ig.g gVar = this.f32599b;
            if (gVar.f11152t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f32604s == 4) {
                    ea1 ea1Var = this.f32603r;
                    ea1Var.e = new jg.e(ea1Var.d, selectedDate);
                    g(false);
                } else if (this.f32603r.f33321g == null) {
                } else {
                    f();
                    String str = this.f32603r.f33321g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ej0Var.v.get(str);
                    if (bVar != null) {
                        this.f32603r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f32603r.f33321g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18550x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ej0Var.f33413w = obj;
                    ej0Var.f33409f.getClass();
                    obj.f37266a = RecyclerView.R(this);
                    gVar.f11152t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.m2) ej0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, ej0Var.f33401a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.m2) ej0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.m2) ej0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        cj0 cj0Var = this.v;
        ej0 ej0Var = cj0Var.d;
        ra1 ra1Var = ej0Var.f33413w;
        if (ra1Var != null) {
            ra1Var.f37267b = true;
        }
        int childCount = ej0Var.f33409f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cj0Var.d.f33409f.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).f32599b.f11152t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(ea1 ea1Var) {
    }
}
