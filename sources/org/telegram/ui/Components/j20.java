package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class j20 extends tj0 {
    public final Context f35836c;
    public final jg.z1 d;
    public h20 f35837e;
    public int f35838f;
    public boolean h;
    public int f35839n;
    public int f35840r;
    public int f35841s;
    public int f35842w;
    public final k20 f35843x;

    public j20(k20 k20Var, Context context) {
        this.f35843x = k20Var;
        this.f35836c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17344a = new i20(this);
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if ((!(view instanceof org.telegram.ui.Cells.a5) || !this.f35843x.f36252a2.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && e1Var.f58539f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f35838f;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f35840r) {
            return 3;
        }
        if (i7 != this.f35842w && i7 != this.f35841s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f35838f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.f17349g.size();
        if (size != 0) {
            int i7 = this.f35838f;
            this.f35841s = i7;
            this.f35838f = size + 1 + i7;
        } else {
            this.f35841s = -1;
        }
        int size2 = z1Var.f17347e.size();
        if (size2 != 0) {
            int i10 = this.f35838f;
            this.f35842w = i10;
            this.f35838f = size2 + 1 + i10;
        } else {
            this.f35842w = -1;
        }
        int i11 = this.f35838f;
        this.f35838f = i11 + 1;
        this.f35840r = i11;
        super.f();
    }

    @Override
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j20.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f35836c;
            if (i7 != 1) {
                if (i7 != 2) {
                    a5Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                    a5Var = view;
                }
            } else {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28802ah, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.j6.Hh);
                a5Var = x3Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f35836c, 2, 2, false, null);
            a5Var2.setCustomRightImage(2131232193);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28878eh, false));
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28842ch, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28915gh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.f28988kh);
            a5Var = a5Var2;
        }
        return new v4.e1(a5Var);
    }
}
