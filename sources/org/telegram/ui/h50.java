package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class h50 extends org.telegram.ui.Components.h41 {
    public boolean f45819e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.f58885k.a();
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) xi.e.f58886l.a();
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749348, null)));
        org.telegram.ui.Components.r31 x10 = org.telegram.ui.Components.r31.x(11, org.telegram.messenger.bd.M0(2131749347, null));
        boolean z13 = false;
        if (a5Var == org.telegram.ui.ActionBar.a5.f27379b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.r31 x11 = org.telegram.ui.Components.r31.x(10, org.telegram.messenger.bd.M0(2131749346, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f27378a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131749345, null)));
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749341, null)));
        org.telegram.ui.Components.r31 x12 = org.telegram.ui.Components.r31.x(20, org.telegram.messenger.bd.M0(2131749340, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28892a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.r31 x13 = org.telegram.ui.Components.r31.x(21, org.telegram.messenger.bd.M0(2131749339, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28893b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749344, null)));
        org.telegram.ui.Components.r31 i3 = org.telegram.ui.Components.r31.i(30, org.telegram.messenger.bd.M0(2131749343, null));
        i3.L(this.f45819e);
        arrayList.add(i3);
        arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131749342, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131749338, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i3 = r31Var.d;
        if (i3 != 10 && i3 != 11) {
            if (i3 != 20 && i3 != 21) {
                if (i3 != 30) {
                    return;
                }
                this.f45819e = !this.f45819e;
                this.simpleActionBar.getDoneButton().a(this.f45819e, true);
            } else {
                if (i3 == 21) {
                    z4Var = org.telegram.ui.ActionBar.z4.f28893b;
                } else {
                    z4Var = org.telegram.ui.ActionBar.z4.f28892a;
                }
                xi.e.f58886l.b(z4Var);
                d0();
            }
        } else {
            if (i3 == 10) {
                a5Var = org.telegram.ui.ActionBar.a5.f27378a;
            } else {
                a5Var = org.telegram.ui.ActionBar.a5.f27379b;
            }
            xi.e.f58885k.b(a5Var);
            d0();
        }
        this.f34298a.f35594g3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f34298a.r1();
        this.f34298a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.b5 b5Var = y4Var.f28867n;
        if (b5Var != null) {
            y4Var.removeView(b5Var);
            y4Var.f28867n = null;
            y4Var.g();
            y4Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null)).a(this.f45819e, false);
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f34298a;
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
