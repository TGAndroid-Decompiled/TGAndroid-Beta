package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class qi0 extends c91 {
    public final ri0 v;

    public qi0(ri0 ri0Var, Context context, int i9, qf.f fVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, fVar, b6Var);
        this.v = ri0Var;
    }

    @Override
    public final void c() {
        int i9;
        int i10;
        int i11;
        ti0 ti0Var = this.v.d;
        if (this.f37133r.f37871c <= 0) {
            performClick();
            qf.g gVar = this.f37128b;
            if (gVar.f46219p0.C) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f37134s == 4) {
                    e91 e91Var = this.f37133r;
                    e91Var.f37872e = new rf.e(e91Var.d, selectedDate);
                    g(false);
                } else if (this.f37133r.f37874g == null) {
                } else {
                    f();
                    String str = this.f37133r.f37874g + "_" + selectedDate;
                    rf.b bVar = (rf.b) ti0Var.v.get(str);
                    if (bVar != null) {
                        this.f37133r.f37872e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f37133r.f37874g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f22611x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ti0Var.f43019w = obj;
                    ti0Var.f43015f.getClass();
                    obj.f42334a = RecyclerView.R(this);
                    gVar.f46219p0.d(true, false);
                    i9 = ((org.telegram.ui.ActionBar.o2) ti0Var).currentAccount;
                    int sendRequest = ConnectionsManager.getInstance(i9).sendRequest(tL_loadAsyncGraph, new y9(this, str, (Object) obj, 25), null, null, 0, ti0Var.f43010a.stats_dc, 1, true);
                    i10 = ((org.telegram.ui.ActionBar.o2) ti0Var).currentAccount;
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    i11 = ((org.telegram.ui.ActionBar.o2) ti0Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i11);
                }
            }
        }
    }

    @Override
    public final void f() {
        ri0 ri0Var = this.v;
        ti0 ti0Var = ri0Var.d;
        r91 r91Var = ti0Var.f43019w;
        if (r91Var != null) {
            r91Var.f42335b = true;
        }
        int childCount = ti0Var.f43015f.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = ri0Var.d.f43015f.getChildAt(i9);
            if (childAt instanceof c91) {
                ((c91) childAt).f37128b.f46219p0.d(false, true);
            }
        }
    }

    @Override
    public final void b(e91 e91Var) {
    }
}
