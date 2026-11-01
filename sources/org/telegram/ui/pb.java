package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class pb extends s4.g0 {
    public final Context f40441c;
    public int d;
    public int e;
    public int f40442f;
    public int h;
    public final sb f40443n;

    public pb(sb sbVar, Context context) {
        this.f40443n = sbVar;
        new ArrayList();
        new ArrayList();
        this.f40441c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        sb sbVar = this.f40443n;
        ArrayList arrayList = sbVar.f41319o0;
        if (!arrayList.isEmpty()) {
            if (!sbVar.f41321q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f40442f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f40442f = -1;
        this.h = -1;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final long c(int i10) {
        if (i10 >= this.f40442f && i10 < this.h) {
            ArrayList arrayList = this.f40443n.f41319o0;
            return ((org.telegram.messenger.kj) arrayList.get((arrayList.size() - (i10 - this.f40442f)) - 1)).f16692k1;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int d(int i10) {
        if (i10 >= this.f40442f && i10 < this.h) {
            ArrayList arrayList = this.f40443n.f41319o0;
            return ((org.telegram.messenger.kj) arrayList.get((arrayList.size() - (i10 - this.f40442f)) - 1)).U;
        }
        return 4;
    }

    @Override
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void g(int i10) {
        D(false);
        try {
            super.g(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void j(int i10, int i11) {
        D(false);
        try {
            super.j(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void k(int i10, int i11) {
        D(false);
        try {
            super.k(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void o(int i10, int i11) {
        D(false);
        try {
            super.o(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void t(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pb.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.Cells.y1 y1Var;
        int i11;
        View view;
        sb sbVar = this.f40443n;
        ArrayList arrayList = sbVar.h;
        Context context = this.f40441c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                view = new org.telegram.ui.Cells.q1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(new jb(this));
            q1Var.setAllowAssistant(true);
            y1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
            s0Var.setDelegate(new nb(this));
            y1Var = s0Var;
        } else if (i10 == 2) {
            y1Var = new org.telegram.ui.Cells.z1(context, null);
        } else if (i10 == 10) {
            p6Var = ((org.telegram.ui.ActionBar.k2) sbVar).resourceProvider;
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, p6Var);
            y1Var2.setDelegate(new e(this, 8));
            y1Var = y1Var2;
        } else {
            y1Var = new org.telegram.ui.Cells.v0(context, null);
        }
        return sc.e.o(y1Var, y1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.s0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new ob(this, view, c1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.g3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
