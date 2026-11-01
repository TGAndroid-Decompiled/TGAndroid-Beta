package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public abstract class d61 extends c61 {
    public final int f36506w;
    public final s61 f36507x;

    public d61(s61 s61Var, Context context, int i10, int i11, bg.h hVar) {
        super(context, i11, hVar, null);
        this.f36507x = s61Var;
        this.f36506w = i10;
    }

    @Override
    public final void b(e61 e61Var) {
        s61 s61Var = this.f36507x;
        e61Var.a(this.f36506w, s61.e0(s61Var), s61Var.f41236a.stats_dc, new uh(2, s61Var, this.f36210r));
    }

    @Override
    public final void c() {
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
                    s61 s61Var = this.f36507x;
                    s61.c0(s61Var);
                    String str = this.f36210r.f36752g + "_" + selectedDate;
                    cg.b bVar = (cg.b) s61Var.U.f(str);
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
                    s61Var.Y = obj;
                    s61Var.S.getClass();
                    obj.f40990a = RecyclerView.R(this);
                    iVar.f2739t0.d(true, false);
                    int i10 = this.f36506w;
                    ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new tp0(this, str, obj, 10), null, null, 0, s61Var.f41236a.stats_dc, 1, true), s61.d0(s61Var));
                }
            }
        }
    }

    @Override
    public final void f() {
        s61.c0(this.f36507x);
    }
}
