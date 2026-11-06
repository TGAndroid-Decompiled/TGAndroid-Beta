package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class n50 extends org.telegram.ui.Components.m41 {
    public boolean f47962e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.k41 k41Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.f58770k.a();
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) xi.e.f58771l.a();
        arrayList.add(org.telegram.ui.Components.w31.u(org.telegram.messenger.hd.M0(2131749339, null)));
        org.telegram.ui.Components.w31 x10 = org.telegram.ui.Components.w31.x(11, org.telegram.messenger.hd.M0(2131749338, null));
        boolean z12 = false;
        if (a5Var == org.telegram.ui.ActionBar.a5.f27328b) {
            z9 = true;
        } else {
            z9 = false;
        }
        x10.L(z9);
        arrayList.add(x10);
        org.telegram.ui.Components.w31 x11 = org.telegram.ui.Components.w31.x(10, org.telegram.messenger.hd.M0(2131749337, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f27327a) {
            z10 = true;
        } else {
            z10 = false;
        }
        x11.L(z10);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.w31.C(org.telegram.messenger.hd.M0(2131749336, null)));
        arrayList.add(org.telegram.ui.Components.w31.u(org.telegram.messenger.hd.M0(2131749332, null)));
        org.telegram.ui.Components.w31 x12 = org.telegram.ui.Components.w31.x(20, org.telegram.messenger.hd.M0(2131749331, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28829a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x12.L(z11);
        arrayList.add(x12);
        org.telegram.ui.Components.w31 x13 = org.telegram.ui.Components.w31.x(21, org.telegram.messenger.hd.M0(2131749330, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28830b) {
            z12 = true;
        }
        x13.L(z12);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.w31.C(null));
        arrayList.add(org.telegram.ui.Components.w31.u(org.telegram.messenger.hd.M0(2131749335, null)));
        org.telegram.ui.Components.w31 i7 = org.telegram.ui.Components.w31.i(30, org.telegram.messenger.hd.M0(2131749334, null));
        i7.L(this.f47962e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.w31.C(org.telegram.messenger.hd.M0(2131749333, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131749329, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.w31 w31Var, View view) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i7 = w31Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f47962e = !this.f47962e;
                this.simpleActionBar.getDoneButton().a(this.f47962e, true);
            } else {
                if (i7 == 21) {
                    z4Var = org.telegram.ui.ActionBar.z4.f28830b;
                } else {
                    z4Var = org.telegram.ui.ActionBar.z4.f28829a;
                }
                xi.e.f58771l.b(z4Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                a5Var = org.telegram.ui.ActionBar.a5.f27327a;
            } else {
                a5Var = org.telegram.ui.ActionBar.a5.f27328b;
            }
            xi.e.f58770k.b(a5Var);
            d0();
        }
        this.f35844a.f36781f3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.w31 w31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f35844a.r1();
        this.f35844a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.b5 b5Var = y4Var.f28794n;
        if (b5Var != null) {
            y4Var.removeView(b5Var);
            y4Var.f28794n = null;
            y4Var.g();
            y4Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null)).a(this.f47962e, false);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f35844a;
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
