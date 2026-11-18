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
        z1Var.f17727a = new q20(this);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if ((!(view instanceof org.telegram.ui.Cells.b5) || !this.f38996x.f39451a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && f1Var.f59127f == 0) {
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
        int size = z1Var.f17732g.size();
        if (size != 0) {
            int i7 = this.f38991f;
            this.f38994s = i7;
            this.f38991f = size + 1 + i7;
        } else {
            this.f38994s = -1;
        }
        int size2 = z1Var.f17730e.size();
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
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.f38989c;
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
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29347ah, y3Var, null);
                y3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                b5Var = y3Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.f38989c, 2, 2, false, null);
            b5Var2.setCustomRightImage(2131232194);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29423eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29387ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29460gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.f29533kh);
            b5Var = b5Var2;
        }
        return new v4.f1(b5Var);
    }
}
