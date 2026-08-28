package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
public final class lb extends f2.r0 {
    public final Context f40100c;
    public int d;
    public int f40101e;
    public int f40102f;
    public int h;
    public final pb f40103n;

    public lb(pb pbVar, Context context) {
        this.f40103n = pbVar;
        new ArrayList();
        new ArrayList();
        this.f40100c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        pb pbVar = this.f40103n;
        ArrayList arrayList = pbVar.f41413o0;
        if (!arrayList.isEmpty()) {
            if (!pbVar.f41415q0) {
                int i9 = this.d;
                this.d = i9 + 1;
                this.f40101e = i9;
            } else {
                this.f40101e = -1;
            }
            int i10 = this.d;
            this.f40102f = i10;
            int size = arrayList.size() + i10;
            this.d = size;
            this.h = size;
            return;
        }
        this.f40101e = -1;
        this.f40102f = -1;
        this.h = -1;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i9) {
        if (i9 >= this.f40102f && i9 < this.h) {
            ArrayList arrayList = this.f40103n.f41413o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i9 - this.f40102f)) - 1)).stableId;
        } else if (i9 == this.f40101e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int j(int i9) {
        if (i9 >= this.f40102f && i9 < this.h) {
            ArrayList arrayList = this.f40103n.f41413o0;
            return ((MessageObject) arrayList.get((arrayList.size() - (i9 - this.f40102f)) - 1)).contentType;
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
    public final void m(int i9) {
        D(false);
        try {
            super.m(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void p(int i9, int i10) {
        D(false);
        try {
            super.p(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void q(int i9, int i10) {
        D(false);
        try {
            super.q(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void s(int i9, int i10) {
        D(false);
        try {
            super.s(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void t(int i9, int i10) {
        D(false);
        try {
            super.t(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void v(f2.q1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Cells.u1 u1Var;
        int i10;
        View view;
        pb pbVar = this.f40103n;
        ArrayList arrayList = pbVar.v;
        Context context = this.f40100c;
        if (i9 == 0) {
            if (arrayList.isEmpty()) {
                i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                view = new org.telegram.ui.Cells.t1(context, i10);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(new gb(this));
            t1Var.setAllowAssistant(true);
            u1Var = view;
        } else if (i9 == 1) {
            org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
            w0Var.setDelegate(new jb(this));
            u1Var = w0Var;
        } else if (i9 == 2) {
            u1Var = new org.telegram.ui.Cells.v1(context, null);
        } else if (i9 == 10) {
            b6Var = ((org.telegram.ui.ActionBar.o2) pbVar).resourceProvider;
            org.telegram.ui.Cells.u1 u1Var2 = new org.telegram.ui.Cells.u1(context, b6Var);
            u1Var2.setDelegate(new g(this, 10));
            u1Var = u1Var2;
        } else {
            u1Var = new org.telegram.ui.Cells.z0(context, null);
        }
        return j3.r0.s(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if ((view instanceof org.telegram.ui.Cells.t1) || (view instanceof org.telegram.ui.Cells.w0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new kb(this, view, q1Var));
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
