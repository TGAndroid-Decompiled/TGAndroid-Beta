package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class r20 extends dk0 {
    public final Context f39159c;
    public final jg.z1 d;
    public p20 f39160e;
    public int f39161f;
    public boolean h;
    public int f39162n;
    public int f39163r;
    public int f39164s;
    public int f39165w;
    public final s20 f39166x;

    public r20(s20 s20Var, Context context) {
        this.f39166x = s20Var;
        this.f39159c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17823a = new q20(this);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f39166x.f39467a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && f1Var.f59249f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f39161f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f39163r) {
            return 3;
        }
        if (i7 != this.f39165w && i7 != this.f39164s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f39161f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f17828g.size();
        if (size != 0) {
            int i7 = this.f39161f;
            this.f39164s = i7;
            this.f39161f = size + 1 + i7;
        } else {
            this.f39164s = -1;
        }
        int size2 = z1Var.f17826e.size();
        if (size2 != 0) {
            int i10 = this.f39161f;
            this.f39165w = i10;
            this.f39161f = size2 + 1 + i10;
        } else {
            this.f39165w = -1;
        }
        int i11 = this.f39161f;
        this.f39161f = i11 + 1;
        this.f39163r = i11;
        super.f();
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r20.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.f39159c;
            if (i7 != 1) {
                if (i7 != 2) {
                    b5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                    b5Var = view;
                }
            } else {
                ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29404ah, y3Var, null);
                y3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                b5Var = y3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.f39159c, 2, 2, false, null);
            b5Var2.setCustomRightImage(2131232197);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29444ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29517gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.f29590kh);
            b5Var = b5Var2;
        }
        return new v4.f1(b5Var);
    }
}
