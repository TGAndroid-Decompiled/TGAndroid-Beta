package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class h20 extends pj0 {
    public final Context f34153c;
    public final jg.z1 d;
    public f20 f34154e;
    public int f34155f;
    public boolean h;
    public int f34156n;
    public int f34157r;
    public int f34158s;
    public int f34159w;
    public final i20 f34160x;

    public h20(i20 i20Var, Context context) {
        this.f34160x = i20Var;
        this.f34153c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f16992a = new g20(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f34160x.W1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f57060f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f34155f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f34157r) {
            return 3;
        }
        if (i7 != this.f34159w && i7 != this.f34158s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f34155f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            int i7 = this.f34155f;
            this.f34158s = i7;
            this.f34155f = size + 1 + i7;
        } else {
            this.f34158s = -1;
        }
        int size2 = z1Var.f16995e.size();
        if (size2 != 0) {
            int i10 = this.f34155f;
            this.f34159w = i10;
            this.f34155f = size2 + 1 + i10;
        } else {
            this.f34159w = -1;
        }
        int i11 = this.f34155f;
        this.f34155f = i11 + 1;
        this.f34157r = i11;
        super.f();
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h20.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f34153c;
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
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.l6.Eh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f34153c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27838bh, false));
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27875dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.l6.f27948hh);
            a5Var = a5Var2;
        }
        return new v4.d1(a5Var);
    }
}
