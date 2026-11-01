package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class nh0 extends c61 {
    public final oh0 f39911w;

    public nh0(oh0 oh0Var, Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, hVar, p6Var);
        this.f39911w = oh0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        qh0 qh0Var = this.f39911w.d;
        if (this.f36210r.f36750c <= 0) {
            performClick();
            bg.i iVar = this.f36206b;
            if (iVar.f2739t0.G) {
                long selectedDate = iVar.getSelectedDate();
                if (this.f36211s == 4) {
                    e61 e61Var = this.f36210r;
                    e61Var.e = new cg.e(e61Var.d, selectedDate);
                    g(false);
                } else if (this.f36210r.f36752g == null) {
                } else {
                    f();
                    String str = this.f36210r.f36752g + "_" + selectedDate;
                    cg.b bVar = (cg.b) qh0Var.f40792w.f(str);
                    if (bVar != null) {
                        this.f36210r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36210r.f36752g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20026x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    qh0Var.f40793x = obj;
                    qh0Var.f40788f.getClass();
                    obj.f40990a = RecyclerView.R(this);
                    iVar.f2739t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.k2) qh0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, qh0Var.f40780a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.k2) qh0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.k2) qh0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        oh0 oh0Var = this.f39911w;
        qh0 qh0Var = oh0Var.d;
        r61 r61Var = qh0Var.f40793x;
        if (r61Var != null) {
            r61Var.f40991b = true;
        }
        int childCount = qh0Var.f40788f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = oh0Var.d.f40788f.getChildAt(i10);
            if (childAt instanceof c61) {
                ((c61) childAt).f36206b.f2739t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(e61 e61Var) {
    }
}
