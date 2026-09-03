package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class qb extends f2.o0 {
    public final Context f37372c;
    public int d;
    public int e;
    public int f37373f;
    public int h;
    public final ub f37374n;

    public qb(ub ubVar, Context context) {
        this.f37374n = ubVar;
        new ArrayList();
        new ArrayList();
        this.f37372c = context;
        C(true);
    }

    public final void D(boolean z4) {
        this.d = 0;
        ub ubVar = this.f37374n;
        ArrayList arrayList = ubVar.f38748p0;
        if (!arrayList.isEmpty()) {
            if (!ubVar.f38751r0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.e = i10;
            } else {
                this.e = -1;
            }
            int i11 = this.d;
            this.f37373f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f37373f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f37373f && i10 < this.h) {
            ArrayList arrayList = this.f37374n.f38748p0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f37373f)) - 1)).stableId;
        } else if (i10 == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f37373f && i10 < this.h) {
            ArrayList arrayList = this.f37374n.f38748p0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f37373f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void v(f2.l1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qb.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        View view;
        ub ubVar = this.f37374n;
        ArrayList arrayList = ubVar.v;
        Context context = this.f37372c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                view = new org.telegram.ui.Cells.s1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(new lb(this));
            s1Var.setAllowAssistant(true);
            t1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
            v0Var.setDelegate(new ob(this));
            t1Var = v0Var;
        } else if (i10 == 2) {
            t1Var = new org.telegram.ui.Cells.u1(context, null);
        } else if (i10 == 10) {
            f6Var = ((org.telegram.ui.ActionBar.p2) ubVar).resourceProvider;
            org.telegram.ui.Cells.t1 t1Var2 = new org.telegram.ui.Cells.t1(context, f6Var);
            t1Var2.setDelegate(new h(this, 10));
            t1Var = t1Var2;
        } else {
            t1Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return ai.n(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if ((view instanceof org.telegram.ui.Cells.s1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new pb(this, view, l1Var));
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            s1Var.setBackgroundDrawable(null);
            s1Var.K3(true, false);
            s1Var.setHighlighted(false);
        }
    }
}
