package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class ca1 extends ba1 {
    public final int v;
    public final ra1 f32300w;

    public ca1(ra1 ra1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.f32300w = ra1Var;
        this.v = i10;
    }

    @Override
    public final void b(da1 da1Var) {
        int i10;
        ra1 ra1Var = this.f32300w;
        i10 = ((org.telegram.ui.ActionBar.n2) ra1Var).classGuid;
        da1Var.a(this.v, i10, ra1Var.f36752a.stats_dc, new org.telegram.ui.Components.r51(1, ra1Var, this.f32039r));
    }

    @Override
    public final void c() {
        int i10;
        if (this.f32039r.f32553c <= 0) {
            performClick();
            ig.g gVar = this.f32035b;
            if (gVar.f11152t0.G) {
                long selectedDate = gVar.getSelectedDate();
                if (this.f32040s == 4) {
                    da1 da1Var = this.f32039r;
                    da1Var.e = new jg.e(da1Var.d, selectedDate);
                    g(false);
                } else if (this.f32039r.f32555g == null) {
                } else {
                    ra1 ra1Var = this.f32300w;
                    ra1.Z(ra1Var);
                    String str = this.f32039r.f32555g + "_" + selectedDate;
                    jg.b bVar = (jg.b) ra1Var.V.get(str);
                    if (bVar != null) {
                        this.f32039r.e = bVar;
                        g(false);
                        return;
                    }
                    TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                    tL_loadAsyncGraph.token = this.f32039r.f32555g;
                    if (selectedDate != 0) {
                        tL_loadAsyncGraph.f18312x = selectedDate;
                        tL_loadAsyncGraph.flags |= 1;
                    }
                    ?? obj = new Object();
                    ra1Var.Z = obj;
                    ra1Var.S.getClass();
                    obj.f36376a = RecyclerView.R(this);
                    gVar.f11152t0.d(true, false);
                    int i11 = this.v;
                    int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new gs0(this, str, obj, 10), null, null, 0, ra1Var.f36752a.stats_dc, 1, true);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                    i10 = ((org.telegram.ui.ActionBar.n2) ra1Var).classGuid;
                    connectionsManager.bindRequestToGuid(sendRequest, i10);
                }
            }
        }
    }

    @Override
    public final void f() {
        ra1.Z(this.f32300w);
    }
}
