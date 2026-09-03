package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class ob extends f2.p0 {
    public final Context f39635c;
    public int d;
    public int f39636e;
    public int f39637f;
    public int h;
    public final sb f39638n;

    public ob(sb sbVar, Context context) {
        this.f39638n = sbVar;
        new ArrayList();
        new ArrayList();
        this.f39635c = context;
        C(true);
    }

    public final void D(boolean z4) {
        this.d = 0;
        sb sbVar = this.f39638n;
        ArrayList arrayList = sbVar.f41108p0;
        if (!arrayList.isEmpty()) {
            if (!sbVar.f41111r0) {
                int i10 = this.d;
                this.d = i10 + 1;
                this.f39636e = i10;
            } else {
                this.f39636e = -1;
            }
            int i11 = this.d;
            this.f39637f = i11;
            int size = arrayList.size() + i11;
            this.d = size;
            this.h = size;
            return;
        }
        this.f39636e = -1;
        this.f39637f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 >= this.f39637f && i10 < this.h) {
            ArrayList arrayList = this.f39638n.f41108p0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39637f)) - 1)).stableId;
        } else if (i10 == this.f39636e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.f39637f && i10 < this.h) {
            ArrayList arrayList = this.f39638n.f41108p0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f39637f)) - 1)).contentType;
        }
        return 4;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void v(f2.m1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ob.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        View view;
        sb sbVar = this.f39638n;
        ArrayList arrayList = sbVar.v;
        Context context = this.f39635c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                view = new org.telegram.ui.Cells.t1(context, i11);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(new jb(this));
            t1Var.setAllowAssistant(true);
            u1Var = view;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
            v0Var.setDelegate(new mb(this));
            u1Var = v0Var;
        } else if (i10 == 2) {
            u1Var = new org.telegram.ui.Cells.v1(context, null);
        } else if (i10 == 10) {
            g6Var = ((org.telegram.ui.ActionBar.p2) sbVar).resourceProvider;
            org.telegram.ui.Cells.u1 u1Var2 = new org.telegram.ui.Cells.u1(context, g6Var);
            u1Var2.setDelegate(new h(this, 10));
            u1Var = u1Var2;
        } else {
            u1Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return yh.o(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new nb(this, view, m1Var));
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
