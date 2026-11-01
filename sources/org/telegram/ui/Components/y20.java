package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class y20 extends tk0 {
    public final Context f32701c;
    public final zf.m1 d;
    public w20 e;
    public int f32702f;
    public boolean h;
    public int f32703n;
    public int f32704r;
    public int f32705s;
    public int f32706w;
    public final z20 f32707x;

    public y20(z20 z20Var, Context context) {
        this.f32707x = z20Var;
        this.f32701c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.d = m1Var;
        m1Var.f55593a = new x20(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if ((!(view instanceof org.telegram.ui.Cells.e5) || !this.f32707x.W1.contains(Long.valueOf(((org.telegram.ui.Cells.e5) view).getUserId()))) && c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f32702f;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32704r) {
            return 3;
        }
        if (i10 != this.f32706w && i10 != this.f32705s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f32702f = 1;
        zf.m1 m1Var = this.d;
        int size = m1Var.f55597g.size();
        if (size != 0) {
            int i10 = this.f32702f;
            this.f32705s = i10;
            this.f32702f = size + 1 + i10;
        } else {
            this.f32705s = -1;
        }
        int size2 = m1Var.e.size();
        if (size2 != 0) {
            int i11 = this.f32702f;
            this.f32706w = i11;
            this.f32702f = size2 + 1 + i11;
        } else {
            this.f32706w = -1;
        }
        int i12 = this.f32702f;
        this.f32702f = i12 + 1;
        this.f32704r = i12;
        super.f();
    }

    @Override
    public final void t(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y20.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var;
        if (i10 != 0) {
            Context context = this.f32701c;
            if (i10 != 1) {
                if (i10 != 2) {
                    e5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                    e5Var = view;
                }
            } else {
                ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Xg, z3Var, null);
                z3Var.setTextColor(org.telegram.ui.ActionBar.t6.Eh);
                e5Var = z3Var;
            }
        } else {
            org.telegram.ui.Cells.e5 e5Var2 = new org.telegram.ui.Cells.e5(2, 2, this.f32701c, null, false);
            e5Var2.setCustomRightImage(2131232191);
            e5Var2.setNameColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20902bh, false));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20941dh, false);
            e5Var2.O = true;
            e5Var2.H = x02;
            e5Var2.I = x03;
            e5Var2.setDividerColor(org.telegram.ui.ActionBar.t6.f21012hh);
            e5Var = e5Var2;
        }
        return new s4.c1(e5Var);
    }
}
