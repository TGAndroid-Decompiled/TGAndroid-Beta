package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class c20 extends sj0 {
    public final Context f32506c;
    public final kg.v1 d;
    public a20 f32507e;
    public int f32508f;
    public boolean h;
    public int f32509n;
    public int f32510r;
    public int f32511s;
    public int f32512w;
    public final d20 f32513x;

    public c20(d20 d20Var, Context context) {
        this.f32513x = d20Var;
        this.f32506c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.d = v1Var;
        v1Var.f17206a = new b20(this);
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f32513x.X1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f32508f;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == this.f32510r) {
            return 3;
        }
        if (i3 != this.f32512w && i3 != this.f32511s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f32508f = 1;
        kg.v1 v1Var = this.d;
        int size = v1Var.f17211g.size();
        if (size != 0) {
            int i3 = this.f32508f;
            this.f32511s = i3;
            this.f32508f = size + 1 + i3;
        } else {
            this.f32511s = -1;
        }
        int size2 = v1Var.f17209e.size();
        if (size2 != 0) {
            int i10 = this.f32508f;
            this.f32512w = i10;
            this.f32508f = size2 + 1 + i10;
        } else {
            this.f32512w = -1;
        }
        int i11 = this.f32508f;
        this.f32508f = i11 + 1;
        this.f32510r = i11;
        super.f();
    }

    @Override
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c20.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i3 != 0) {
            Context context = this.f32506c;
            if (i3 != 1) {
                if (i3 != 2) {
                    a5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                    a5Var = view;
                }
            } else {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.k6.Eh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f32506c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27889dh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.f27964hh);
            a5Var = a5Var2;
        }
        return new u4.d1(a5Var);
    }
}
