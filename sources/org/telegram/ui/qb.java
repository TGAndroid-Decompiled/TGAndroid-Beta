package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class qb extends s4.h0 {
    public final Context f39846c;
    public int d;
    public int f39847e;
    public int f39848f;
    public int h;
    public final ub f39849n;

    public qb(ub ubVar, Context context) {
        this.f39849n = ubVar;
        new ArrayList();
        new ArrayList();
        this.f39846c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        ub ubVar = this.f39849n;
        ArrayList arrayList = ubVar.f41067s0;
        if (!arrayList.isEmpty()) {
            if (!ubVar.f41069u0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.f39847e = i10;
            } else {
                this.f39847e = -1;
            }
            int i11 = this.d;
            this.f39848f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.f39847e = -1;
        this.f39848f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f39848f && i10 < this.h) {
            ArrayList arrayList = this.f39849n.f41067s0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39848f)) - 1)).stableId;
        } else if (i10 == this.f39847e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f39848f && i10 < this.h) {
            ArrayList arrayList = this.f39849n.f41067s0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39848f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qb.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        View view;
        ub ubVar = this.f39849n;
        ArrayList arrayList = ubVar.v;
        Context context = this.f39846c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
                view = new org.telegram.ui.Cells.t1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(new lb(this));
            t1Var.setAllowAssistant(true);
            u1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
            w0Var.setDelegate(new ob(this));
            u1Var = w0Var;
        } else if (i10 == 2) {
            u1Var = new org.telegram.ui.Cells.v1(context, null);
        } else if (i10 == 10) {
            f6Var = ((org.telegram.ui.ActionBar.n2) ubVar).resourceProvider;
            org.telegram.ui.Cells.u1 u1Var2 = new org.telegram.ui.Cells.u1(context, f6Var);
            u1Var2.setDelegate(new g(this, 10));
            u1Var = u1Var2;
        } else {
            u1Var = new org.telegram.ui.Cells.z0(context, null);
        }
        return com.google.android.gms.internal.vision.e2.l(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f45766a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.w0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new pb(this, view, c1Var));
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            t1Var.setBackgroundDrawable(null);
            t1Var.K3(true, false);
            t1Var.setHighlighted(false);
        }
    }
}
