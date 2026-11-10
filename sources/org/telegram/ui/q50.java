package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class q50 extends org.telegram.ui.Components.o41 {
    public boolean f48963e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) xi.e.f58872k.a();
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.f58873l.a();
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749340, null)));
        org.telegram.ui.Components.x31 x10 = org.telegram.ui.Components.x31.x(11, org.telegram.messenger.id.M0(2131749339, null));
        boolean z12 = false;
        if (b5Var == org.telegram.ui.ActionBar.b5.f27353b) {
            z9 = true;
        } else {
            z9 = false;
        }
        x10.L(z9);
        arrayList.add(x10);
        org.telegram.ui.Components.x31 x11 = org.telegram.ui.Components.x31.x(10, org.telegram.messenger.id.M0(2131749338, null));
        if (b5Var == org.telegram.ui.ActionBar.b5.f27352a) {
            z10 = true;
        } else {
            z10 = false;
        }
        x11.L(z10);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131749337, null)));
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749333, null)));
        org.telegram.ui.Components.x31 x12 = org.telegram.ui.Components.x31.x(20, org.telegram.messenger.id.M0(2131749332, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f27315a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x12.L(z11);
        arrayList.add(x12);
        org.telegram.ui.Components.x31 x13 = org.telegram.ui.Components.x31.x(21, org.telegram.messenger.id.M0(2131749331, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f27316b) {
            z12 = true;
        }
        x13.L(z12);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749336, null)));
        org.telegram.ui.Components.x31 i7 = org.telegram.ui.Components.x31.i(30, org.telegram.messenger.id.M0(2131749335, null));
        i7.L(this.f48963e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131749334, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131749330, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.a5 a5Var;
        int i7 = x31Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f48963e = !this.f48963e;
                this.simpleActionBar.getDoneButton().a(this.f48963e, true);
            } else {
                if (i7 == 21) {
                    a5Var = org.telegram.ui.ActionBar.a5.f27316b;
                } else {
                    a5Var = org.telegram.ui.ActionBar.a5.f27315a;
                }
                xi.e.f58873l.b(a5Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                b5Var = org.telegram.ui.ActionBar.b5.f27352a;
            } else {
                b5Var = org.telegram.ui.ActionBar.b5.f27353b;
            }
            xi.e.f58872k.b(b5Var);
            d0();
        }
        this.f36518a.f37496f3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f36518a.r1();
        this.f36518a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.c5 c5Var = z4Var.f28836n;
        if (c5Var != null) {
            z4Var.removeView(c5Var);
            z4Var.f28836n = null;
            z4Var.i();
            z4Var.requestLayout();
        }
        this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null)).a(this.f48963e, false);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f36518a;
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
