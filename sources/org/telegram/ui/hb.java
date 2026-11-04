package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class hb extends u4.h0 {
    public final Context f45888c;
    public int d;
    public int f45889e;
    public int f45890f;
    public int h;
    public final kb f45891n;

    public hb(kb kbVar, Context context) {
        this.f45891n = kbVar;
        new ArrayList();
        new ArrayList();
        this.f45888c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        kb kbVar = this.f45891n;
        ArrayList arrayList = kbVar.f46876p0;
        if (!arrayList.isEmpty()) {
            if (!kbVar.f46879r0) {
                int i3 = this.d;
                this.d = i3 + 1;
                this.f45889e = i3;
            } else {
                this.f45889e = -1;
            }
            int i10 = this.d;
            this.f45890f = i10;
            int size = arrayList.size() + i10;
            this.d = size;
            this.h = size;
            return;
        }
        this.f45889e = -1;
        this.f45890f = -1;
        this.h = -1;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final long c(int i3) {
        if (i3 >= this.f45890f && i3 < this.h) {
            ArrayList arrayList = this.f45891n.f46876p0;
            return ((org.telegram.messenger.zi) arrayList.get((arrayList.size() - (i3 - this.f45890f)) - 1)).k1;
        } else if (i3 == this.f45889e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int d(int i3) {
        if (i3 >= this.f45890f && i3 < this.h) {
            ArrayList arrayList = this.f45891n.f46876p0;
            return ((org.telegram.messenger.zi) arrayList.get((arrayList.size() - (i3 - this.f45890f)) - 1)).U;
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
    public final void g(int i3) {
        D(false);
        try {
            super.g(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(int i3, int i10) {
        D(false);
        try {
            super.j(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void k(int i3, int i10) {
        D(false);
        try {
            super.k(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void o(int i3, int i10) {
        D(false);
        try {
            super.o(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void p(int i3, int i10) {
        D(false);
        try {
            super.p(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void t(u4.d1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hb.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Cells.y1 y1Var;
        int i10;
        View view;
        kb kbVar = this.f45891n;
        ArrayList arrayList = kbVar.h;
        Context context = this.f45888c;
        if (i3 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                view = new org.telegram.ui.Cells.q1(context, i10);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(new cb(this));
            q1Var.setAllowAssistant(true);
            y1Var = view;
        } else if (i3 == 1) {
            org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
            t0Var.setDelegate(new fb(this));
            y1Var = t0Var;
        } else if (i3 == 2) {
            y1Var = new org.telegram.ui.Cells.z1(context, null);
        } else if (i3 == 10) {
            e6Var = ((org.telegram.ui.ActionBar.d2) kbVar).resourceProvider;
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, e6Var);
            y1Var2.setDelegate(new f(this, 8));
            y1Var = y1Var2;
        } else {
            y1Var = new org.telegram.ui.Cells.w0(context, null);
        }
        return k2.p1.p(y1Var, y1Var, -1, -2);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if ((view instanceof org.telegram.ui.Cells.q1) || (view instanceof org.telegram.ui.Cells.t0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new gb(this, view, d1Var));
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            q1Var.setBackgroundDrawable(null);
            q1Var.i3(true, false);
            q1Var.setHighlighted(false);
        }
    }
}
