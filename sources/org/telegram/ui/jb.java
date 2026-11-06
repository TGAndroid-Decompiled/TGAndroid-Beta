package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class jb extends v4.g0 {
    public final Context f46893c;
    public int d;
    public int f46894e;
    public int f46895f;
    public int h;
    public final mb f46896n;

    public jb(mb mbVar, Context context) {
        this.f46896n = mbVar;
        new ArrayList();
        new ArrayList();
        this.f46893c = context;
        C(true);
    }

    public final void D(boolean z9) {
        this.d = 0;
        mb mbVar = this.f46896n;
        ArrayList arrayList = mbVar.f47736o0;
        if (!arrayList.isEmpty()) {
            if (!mbVar.f47738q0) {
                int i7 = this.d;
                this.d = i7 + 1;
                this.f46894e = i7;
            } else {
                this.f46894e = -1;
            }
            int i10 = this.d;
            this.f46895f = i10;
            int size = arrayList.size() + i10;
            this.d = size;
            this.h = size;
            return;
        }
        this.f46894e = -1;
        this.f46895f = -1;
        this.h = -1;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final long c(int i7) {
        if (i7 >= this.f46895f && i7 < this.h) {
            ArrayList arrayList = this.f46896n.f47736o0;
            return ((org.telegram.messenger.ij) arrayList.get((arrayList.size() - (i7 - this.f46895f)) - 1)).f23239k1;
        } else if (i7 == this.f46894e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.f46895f && i7 < this.h) {
            ArrayList arrayList = this.f46896n.f47736o0;
            return ((org.telegram.messenger.ij) arrayList.get((arrayList.size() - (i7 - this.f46895f)) - 1)).U;
        }
        return 4;
    }

    @Override
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void g(int i7) {
        D(false);
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(int i7, int i10) {
        D(false);
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void k(int i7, int i10) {
        D(false);
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void o(int i7, int i10) {
        D(false);
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void p(int i7, int i10) {
        D(false);
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void t(v4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.y1 y1Var;
        int i10;
        View view;
        mb mbVar = this.f46896n;
        ArrayList arrayList = mbVar.h;
        Context context = this.f46893c;
        if (i7 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                view = new org.telegram.ui.Cells.q1(context, i10);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(new eb(this));
            q1Var.setAllowAssistant(true);
            y1Var = view;
        } else if (i7 == 1) {
            org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
            t0Var.setDelegate(new hb(this));
            y1Var = t0Var;
        } else if (i7 == 2) {
            y1Var = new org.telegram.ui.Cells.z1(context, null);
        } else if (i7 == 10) {
            f6Var = ((org.telegram.ui.ActionBar.f2) mbVar).resourceProvider;
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, f6Var);
            y1Var2.setDelegate(new f(this, 8));
            y1Var = y1Var2;
        } else {
            y1Var = new org.telegram.ui.Cells.w0(context, null);
        }
        return jg.g.r(y1Var, y1Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f56927a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new ib(this, view, d1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.j3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
