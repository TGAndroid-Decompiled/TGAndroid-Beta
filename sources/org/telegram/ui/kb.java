package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class kb extends f2.p0 {
    public final Context f39826c;
    public int d;
    public int f39827e;
    public int f39828f;
    public int h;
    public final ob f39829n;

    public kb(ob obVar, Context context) {
        this.f39829n = obVar;
        new ArrayList();
        new ArrayList();
        this.f39826c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        ob obVar = this.f39829n;
        ArrayList arrayList = obVar.f41061o0;
        if (!arrayList.isEmpty()) {
            if (!obVar.f41063q0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.f39827e = i10;
            } else {
                this.f39827e = -1;
            }
            int i11 = this.d;
            this.f39828f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.f39827e = -1;
        this.f39828f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f39828f && i10 < this.h) {
            ArrayList arrayList = this.f39829n.f41061o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39828f)) - 1)).stableId;
        } else if (i10 == this.f39827e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f39828f && i10 < this.h) {
            ArrayList arrayList = this.f39829n.f41061o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39828f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void v(f2.n1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        View view;
        ob obVar = this.f39829n;
        ArrayList arrayList = obVar.v;
        Context context = this.f39826c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                view = new org.telegram.ui.Cells.s1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(new fb(this));
            s1Var.setAllowAssistant(true);
            t1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
            v0Var.setDelegate(new ib(this));
            t1Var = v0Var;
        } else if (i10 == 2) {
            t1Var = new org.telegram.ui.Cells.u1(context, null);
        } else if (i10 == 10) {
            c6Var = ((org.telegram.ui.ActionBar.o2) obVar).resourceProvider;
            org.telegram.ui.Cells.t1 t1Var2 = new org.telegram.ui.Cells.t1(context, c6Var);
            t1Var2.setDelegate(new h(this, 10));
            t1Var = t1Var2;
        } else {
            t1Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return th.m(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if ((view instanceof org.telegram.ui.Cells.s1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new jb(this, view, n1Var));
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
