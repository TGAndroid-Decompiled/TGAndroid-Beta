package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class q50 extends org.telegram.ui.Components.sj0 {
    public final Context f48752c;
    public ArrayList d = new ArrayList();
    public ArrayList f48753e = new ArrayList();
    public Timer f48754f;
    public boolean h;
    public final t50 f48755n;

    public q50(t50 t50Var, Context context) {
        this.f48755n = t50Var;
        this.f48752c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).f30197a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f48754f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.f48753e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f48754f = timer2;
        timer2.schedule(new kg.m1(3, this, str), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.f48755n.f49708w.size() + 2;
    }

    @Override
    public final int d(int i3) {
        if (!this.h) {
            if (i3 == 0) {
                return 1;
            }
            if (i3 == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i3;
        super.f();
        t50 t50Var = this.f48755n;
        q50 q50Var = t50Var.f49707s;
        if (q50Var != null && !t50Var.f49710y) {
            int b10 = q50Var.b();
            org.telegram.ui.Components.zu0 zu0Var = t50Var.f49706r;
            if (b10 == 2) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            zu0Var.setVisibility(i3);
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f55544f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.f55540a;
            boolean z10 = this.h;
            t50 t50Var = this.f48755n;
            if (z10) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i3);
                charSequence = (CharSequence) this.f48753e.get(i3);
            } else {
                d5Var = (org.telegram.messenger.d5) t50Var.f49708w.get(i3 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = t50Var.E.containsKey(d5Var.f22148b);
            org.telegram.ui.Components.wo woVar = q4Var.f30200e;
            if (woVar != null) {
                woVar.a(containsKey, false);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.l8 l8Var;
        Context context = this.f48752c;
        if (i3 == 1) {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            l8Var2.g(i10, i10);
            l8Var2.u(org.telegram.messenger.bd.M0(2131745437, null), "", false, 2131232365, false);
            l8Var = l8Var2;
        } else if (i3 == 2) {
            l8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        } else {
            l8Var = new org.telegram.ui.Cells.q4(context, true);
        }
        return new u4.d1(l8Var);
    }
}
