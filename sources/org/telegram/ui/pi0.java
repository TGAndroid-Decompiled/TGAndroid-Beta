package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class pi0 extends d91 {
    public final qi0 v;

    public pi0(qi0 qi0Var, Context context, int i10, tf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = qi0Var;
    }

    @Override
    public final void c() {
        int i10;
        int i11;
        int i12;
        si0 si0Var = this.v.d;
        if (this.f37430r.f38071c <= 0) {
            performClick();
            tf.g gVar = this.f37425b;
            if (gVar.f48278p0.C) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f37431s == 4) {
                    f91 f91Var = this.f37430r;
                    f91Var.f38072e = new uf.e(f91Var.d, selectedDate);
                    g(false);
                } else if (this.f37430r.f38074g == null) {
                } else {
                    f();
                    String str = this.f37430r.f38074g + "_" + selectedDate;
                    uf.b bVar = (uf.b) si0Var.v.get(str);
                    if (bVar != null) {
                        this.f37430r.f38072e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f37430r.f38074g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22623x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    si0Var.f42410w = obj;
                    si0Var.f42406f.getClass();
                    obj.f42327a = RecyclerView.R(this);
                    gVar.f48278p0.d(true, false);
                    i10 = ((org.telegram.ui.ActionBar.o2) si0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new x9(this, str, (Object) obj, 25), null, null, 0, si0Var.f42401a.stats_dc, 1, true);
                    i11 = ((org.telegram.ui.ActionBar.o2) si0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i12 = ((org.telegram.ui.ActionBar.o2) si0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i12);
                }
            }
        }
    }

    @Override
    public final void f() {
        qi0 qi0Var = this.v;
        si0 si0Var = qi0Var.d;
        s91 s91Var = si0Var.f42410w;
        if (s91Var != null) {
            s91Var.f42328b = true;
        }
        int childCount = si0Var.f42406f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qi0Var.d.f42406f.getChildAt(i10);
            if (childAt instanceof d91) {
                ((d91) childAt).f37425b.f48278p0.d(false, true);
            }
        }
    }

    @Override
    public final void b(f91 f91Var) {
    }
}
