package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class g20 extends oj0 {
    public final Context f33747c;
    public final jg.z1 d;
    public e20 f33748e;
    public int f33749f;
    public boolean h;
    public int f33750n;
    public int f33751r;
    public int f33752s;
    public int f33753w;
    public final h20 f33754x;

    public g20(h20 h20Var, Context context) {
        this.f33754x = h20Var;
        this.f33747c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f16992a = new f20(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f33754x.Z1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f57056f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f33749f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f33751r) {
            return 3;
        }
        if (i7 != this.f33753w && i7 != this.f33752s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f33749f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            int i7 = this.f33749f;
            this.f33752s = i7;
            this.f33749f = size + 1 + i7;
        } else {
            this.f33752s = -1;
        }
        int size2 = z1Var.f16995e.size();
        if (size2 != 0) {
            int i10 = this.f33749f;
            this.f33753w = i10;
            this.f33749f = size2 + 1 + i10;
        } else {
            this.f33753w = -1;
        }
        int i11 = this.f33749f;
        this.f33749f = i11 + 1;
        this.f33751r = i11;
        super.f();
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g20.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f33747c;
            if (i7 != 1) {
                if (i7 != 2) {
                    a5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                    a5Var = view;
                }
            } else {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.m6.Eh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f33747c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27863bh, false));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27900dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.m6.f27973hh);
            a5Var = a5Var2;
        }
        return new v4.d1(a5Var);
    }
}
