package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class ph0 extends e61 {
    public final qh0 f40673w;

    public ph0(qh0 qh0Var, Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, hVar, p6Var);
        this.f40673w = qh0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        sh0 sh0Var = this.f40673w.d;
        if (this.f36964r.f37435c <= 0) {
            performClick();
            bg.i iVar = this.f36960b;
            if (iVar.f2739t0.G) {
                long selectedDate = iVar.getSelectedDate();
                if (this.f36965s == 4) {
                    g61 g61Var = this.f36964r;
                    g61Var.e = new cg.e(g61Var.d, selectedDate);
                    g(false);
                } else if (this.f36964r.f37437g == null) {
                } else {
                    f();
                    String str = this.f36964r.f37437g + "_" + selectedDate;
                    cg.b bVar = (cg.b) sh0Var.f41524w.f(str);
                    if (bVar != null) {
                        this.f36964r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f36964r.f37437g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f20025x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    sh0Var.f41525x = obj;
                    sh0Var.f41520f.getClass();
                    obj.f41745a = RecyclerView.R(this);
                    iVar.f2739t0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.k2) sh0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, (Object) obj, 25), null, null, 0, sh0Var.f41512a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.k2) sh0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.k2) sh0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        qh0 qh0Var = this.f40673w;
        sh0 sh0Var = qh0Var.d;
        t61 t61Var = sh0Var.f41525x;
        if (t61Var != null) {
            t61Var.f41746b = true;
        }
        int childCount = sh0Var.f41520f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qh0Var.d.f41520f.getChildAt(i10);
            if (childAt instanceof e61) {
                ((e61) childAt).f36960b.f2739t0.d(false, true);
            }
        }
    }

    @Override
    public final void b(g61 g61Var) {
    }
}
