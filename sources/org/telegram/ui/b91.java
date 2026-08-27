package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

public abstract class b91 extends a91 {
    public final int v;

    public final q91 f36728w;

    public b91(q91 q91Var, Context context, int i10, int i11, rf.f fVar) {
        super(context, i11, fVar, null);
        this.f36728w = q91Var;
        this.v = i10;
    }

    @Override
    public final void b(c91 c91Var) {
        q91 q91Var = this.f36728w;
        c91Var.a(this.v, ((org.telegram.ui.ActionBar.n2) q91Var).classGuid, q91Var.f41549a.stats_dc, new org.telegram.ui.Components.x41(1, q91Var, this.f36469r));
    }

    @Override
    public final void c() {
        if (this.f36469r.f37023c > 0) {
            return;
        }
        performClick();
        rf.g gVar = this.f36464b;
        if (gVar.f46978p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.f36470s == 4) {
                c91 c91Var = this.f36469r;
                c91Var.f37024e = new sf.e(c91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.f36469r.f37026g == null) {
                return;
            }
            q91 q91Var = this.f36728w;
            q91.Z(q91Var);
            String str = this.f36469r.f37026g + "_" + selectedDate;
            sf.b bVar = (sf.b) q91Var.R.get(str);
            if (bVar != null) {
                this.f36469r.f37024e = bVar;
                g(false);
                return;
            }
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f36469r.f37026g;
            if (selectedDate != 0) {
                tL_loadAsyncGraph.f22611x = selectedDate;
                tL_loadAsyncGraph.flags |= 1;
            }
            p91 p91Var = new p91();
            q91Var.V = p91Var;
            q91Var.O.getClass();
            p91Var.f41304a = RecyclerView.R(this);
            gVar.f46978p0.d(true, false);
            int i10 = this.v;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new lr0(this, str, p91Var, 10), null, null, 0, q91Var.f41549a.stats_dc, 1, true), ((org.telegram.ui.ActionBar.n2) q91Var).classGuid);
        }
    }

    @Override
    public final void f() {
        q91.Z(this.f36728w);
    }
}
