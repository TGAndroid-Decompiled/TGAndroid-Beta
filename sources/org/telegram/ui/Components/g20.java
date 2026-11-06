package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class g20 extends oj0 {
    public final Context f33803c;
    public final jg.z1 d;
    public e20 f33804e;
    public int f33805f;
    public boolean h;
    public int f33806n;
    public int f33807r;
    public int f33808s;
    public int f33809w;
    public final h20 f33810x;

    public g20(h20 h20Var, Context context) {
        this.f33810x = h20Var;
        this.f33803c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f16989a = new f20(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56927a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        View view = d1Var.f56927a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f33810x.W1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f56931f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f33805f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f33807r) {
            return 3;
        }
        if (i7 != this.f33809w && i7 != this.f33808s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f33805f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f16994g.size();
        if (size != 0) {
            int i7 = this.f33805f;
            this.f33808s = i7;
            this.f33805f = size + 1 + i7;
        } else {
            this.f33808s = -1;
        }
        int size2 = z1Var.f16992e.size();
        if (size2 != 0) {
            int i10 = this.f33805f;
            this.f33809w = i10;
            this.f33805f = size2 + 1 + i10;
        } else {
            this.f33809w = -1;
        }
        int i11 = this.f33805f;
        this.f33805f = i11 + 1;
        this.f33807r = i11;
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
            Context context = this.f33803c;
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
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.k6.Eh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f33803c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27821bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27858dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.f27931hh);
            a5Var = a5Var2;
        }
        return new v4.d1(a5Var);
    }
}
