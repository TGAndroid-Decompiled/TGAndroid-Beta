package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class k60 extends org.telegram.ui.Components.s51 {
    public boolean e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.q51 q51Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) mi.e.f13392k.a();
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) mi.e.f13393l.a();
        arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131749349, null)));
        org.telegram.ui.Components.b51 x10 = org.telegram.ui.Components.b51.x(11, org.telegram.messenger.dd.L0(2131749348, null));
        boolean z13 = false;
        if (k5Var == org.telegram.ui.ActionBar.k5.f20467b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.b51 x11 = org.telegram.ui.Components.b51.x(10, org.telegram.messenger.dd.L0(2131749347, null));
        if (k5Var == org.telegram.ui.ActionBar.k5.f20466a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131749346, null)));
        arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131749342, null)));
        org.telegram.ui.Components.b51 x12 = org.telegram.ui.Components.b51.x(20, org.telegram.messenger.dd.L0(2131749341, null));
        if (j5Var == org.telegram.ui.ActionBar.j5.f20444a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.b51 x13 = org.telegram.ui.Components.b51.x(21, org.telegram.messenger.dd.L0(2131749340, null));
        if (j5Var == org.telegram.ui.ActionBar.j5.f20445b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.b51.C(null));
        arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131749345, null)));
        org.telegram.ui.Components.b51 i10 = org.telegram.ui.Components.b51.i(30, org.telegram.messenger.dd.L0(2131749344, null));
        i10.L(this.e);
        arrayList.add(i10);
        arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.dd.L0(2131749343, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.dd.L0(2131749339, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.b51 b51Var, View view) {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i10 = b51Var.d;
        if (i10 != 10 && i10 != 11) {
            if (i10 != 20 && i10 != 21) {
                if (i10 != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i10 == 21) {
                    j5Var = org.telegram.ui.ActionBar.j5.f20445b;
                } else {
                    j5Var = org.telegram.ui.ActionBar.j5.f20444a;
                }
                mi.e.f13393l.b(j5Var);
                d0();
            }
        } else {
            if (i10 == 10) {
                k5Var = org.telegram.ui.ActionBar.k5.f20466a;
            } else {
                k5Var = org.telegram.ui.ActionBar.k5.f20467b;
            }
            mi.e.f13392k.b(k5Var);
            d0();
        }
        this.f30217a.f31183f3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f30217a.r1();
        this.f30217a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.l5 l5Var = i5Var.f20422n;
        if (l5Var != null) {
            i5Var.removeView(l5Var);
            i5Var.f20422n = null;
            i5Var.g();
            i5Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null)).a(this.e, false);
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f30217a;
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
