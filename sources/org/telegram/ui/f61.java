package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class f61 extends e61 {
    public final int f37187w;
    public final u61 f37188x;

    public f61(u61 u61Var, Context context, int i10, int i11, bg.h hVar) {
        super(context, i11, hVar, null);
        this.f37188x = u61Var;
        this.f37187w = i10;
    }

    @Override
    public final void b(g61 g61Var) {
        u61 u61Var = this.f37188x;
        g61Var.a(this.f37187w, u61.d0(u61Var), u61Var.f42023a.stats_dc, new uh(2, u61Var, this.f36964r));
    }

    @Override
    public final void c() {
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
                    u61 u61Var = this.f37188x;
                    u61.b0(u61Var);
                    String str = this.f36964r.f37437g + "_" + selectedDate;
                    cg.b bVar = (cg.b) u61Var.U.f(str);
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
                    u61Var.Y = obj;
                    u61Var.S.getClass();
                    obj.f41745a = RecyclerView.R(this);
                    iVar.f2739t0.d(true, false);
                    int i10 = this.f37187w;
                    ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new vp0(this, str, obj, 10), null, null, 0, u61Var.f42023a.stats_dc, 1, true), u61.c0(u61Var));
                }
            }
        }
    }

    @Override
    public final void f() {
        u61.b0(this.f37188x);
    }
}
