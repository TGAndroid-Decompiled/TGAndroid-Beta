package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class o50 extends org.telegram.ui.Components.b51 {
    public boolean f50460e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) aj.e.f1657k.a();
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) aj.e.f1658l.a();
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749148, null)));
        org.telegram.ui.Components.l41 x10 = org.telegram.ui.Components.l41.x(11, org.telegram.messenger.gd.M0(2131749147, null));
        boolean z13 = false;
        if (c5Var == org.telegram.ui.ActionBar.c5.f28828b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.l41 x11 = org.telegram.ui.Components.l41.x(10, org.telegram.messenger.gd.M0(2131749146, null));
        if (c5Var == org.telegram.ui.ActionBar.c5.f28827a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131749145, null)));
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749141, null)));
        org.telegram.ui.Components.l41 x12 = org.telegram.ui.Components.l41.x(20, org.telegram.messenger.gd.M0(2131749140, null));
        if (b5Var == org.telegram.ui.ActionBar.b5.f28807a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.l41 x13 = org.telegram.ui.Components.l41.x(21, org.telegram.messenger.gd.M0(2131749139, null));
        if (b5Var == org.telegram.ui.ActionBar.b5.f28808b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.l41.C(null));
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749144, null)));
        org.telegram.ui.Components.l41 i7 = org.telegram.ui.Components.l41.i(30, org.telegram.messenger.gd.M0(2131749143, null));
        i7.L(this.f50460e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131749142, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.gd.M0(2131749138, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.l41 l41Var, View view) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i7 = l41Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f50460e = !this.f50460e;
                this.simpleActionBar.getDoneButton().a(this.f50460e, true);
            } else {
                if (i7 == 21) {
                    b5Var = org.telegram.ui.ActionBar.b5.f28808b;
                } else {
                    b5Var = org.telegram.ui.ActionBar.b5.f28807a;
                }
                aj.e.f1658l.b(b5Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                c5Var = org.telegram.ui.ActionBar.c5.f28827a;
            } else {
                c5Var = org.telegram.ui.ActionBar.c5.f28828b;
            }
            aj.e.f1657k.b(c5Var);
            d0();
        }
        this.f33530a.f34607g3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f33530a.r1();
        this.f33530a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.d5 d5Var = a5Var.f28775n;
        if (d5Var != null) {
            a5Var.removeView(d5Var);
            a5Var.f28775n = null;
            a5Var.l();
            a5Var.requestLayout();
        }
        this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null)).a(this.f50460e, false);
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f33530a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
