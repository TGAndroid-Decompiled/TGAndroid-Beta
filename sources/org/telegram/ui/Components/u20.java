package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class u20 extends dk0 {
    public final Context f40192c;
    public final jg.z1 d;
    public s20 f40193e;
    public int f40194f;
    public boolean h;
    public int f40195n;
    public int f40196r;
    public int f40197s;
    public int f40198w;
    public final v20 f40199x;

    public u20(v20 v20Var, Context context) {
        this.f40199x = v20Var;
        this.f40192c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17721a = new t20(this);
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        View view = e1Var.f59111a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f40199x.f40606a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && e1Var.f59115f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f40194f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f40196r) {
            return 3;
        }
        if (i7 != this.f40198w && i7 != this.f40197s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f40194f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f17726g.size();
        if (size != 0) {
            int i7 = this.f40194f;
            this.f40197s = i7;
            this.f40194f = size + 1 + i7;
        } else {
            this.f40197s = -1;
        }
        int size2 = z1Var.f17724e.size();
        if (size2 != 0) {
            int i10 = this.f40194f;
            this.f40198w = i10;
            this.f40194f = size2 + 1 + i10;
        } else {
            this.f40198w = -1;
        }
        int i11 = this.f40194f;
        this.f40194f = i11 + 1;
        this.f40196r = i11;
        super.f();
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u20.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.f40192c;
            if (i7 != 1) {
                if (i7 != 2) {
                    b5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                    b5Var = view;
                }
            } else {
                ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29300ah, y3Var, null);
                y3Var.setTextColor(org.telegram.ui.ActionBar.m6.Hh);
                b5Var = y3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.f40192c, 2, 2, false, null);
            b5Var2.setCustomRightImage(2131232194);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29376eh, false));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29340ch, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29413gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.m6.f29486kh);
            b5Var = b5Var2;
        }
        return new v4.e1(b5Var);
    }
}
