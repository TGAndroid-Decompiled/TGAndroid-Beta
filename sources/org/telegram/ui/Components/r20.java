package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class r20 extends bk0 {
    public final Context f38989c;
    public final jg.z1 d;
    public p20 f38990e;
    public int f38991f;
    public boolean h;
    public int f38992n;
    public int f38993r;
    public int f38994s;
    public int f38995w;
    public final s20 f38996x;

    public r20(s20 s20Var, Context context) {
        this.f38996x = s20Var;
        this.f38989c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17730a = new q20(this);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f38996x.f39451a2.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && f1Var.f59126f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f38991f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f38993r) {
            return 3;
        }
        if (i7 != this.f38995w && i7 != this.f38994s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f38991f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f17735g.size();
        if (size != 0) {
            int i7 = this.f38991f;
            this.f38994s = i7;
            this.f38991f = size + 1 + i7;
        } else {
            this.f38994s = -1;
        }
        int size2 = z1Var.f17733e.size();
        if (size2 != 0) {
            int i10 = this.f38991f;
            this.f38995w = i10;
            this.f38991f = size2 + 1 + i10;
        } else {
            this.f38995w = -1;
        }
        int i11 = this.f38991f;
        this.f38991f = i11 + 1;
        this.f38993r = i11;
        super.f();
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r20.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f38989c;
            if (i7 != 1) {
                if (i7 != 2) {
                    a5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                    a5Var = view;
                }
            } else {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29349ah, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f38989c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232194);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29389ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29462gh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.f29535kh);
            a5Var = a5Var2;
        }
        return new v4.f1(a5Var);
    }
}
