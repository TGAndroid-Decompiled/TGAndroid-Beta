package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class n50 extends org.telegram.ui.Components.n41 {
    public boolean f47961e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.l41 l41Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.f58864k.a();
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) xi.e.f58865l.a();
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749341, null)));
        org.telegram.ui.Components.x31 x10 = org.telegram.ui.Components.x31.x(11, org.telegram.messenger.id.M0(2131749340, null));
        boolean z12 = false;
        if (a5Var == org.telegram.ui.ActionBar.a5.f27332b) {
            z9 = true;
        } else {
            z9 = false;
        }
        x10.L(z9);
        arrayList.add(x10);
        org.telegram.ui.Components.x31 x11 = org.telegram.ui.Components.x31.x(10, org.telegram.messenger.id.M0(2131749339, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f27331a) {
            z10 = true;
        } else {
            z10 = false;
        }
        x11.L(z10);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131749338, null)));
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749334, null)));
        org.telegram.ui.Components.x31 x12 = org.telegram.ui.Components.x31.x(20, org.telegram.messenger.id.M0(2131749333, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28833a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x12.L(z11);
        arrayList.add(x12);
        org.telegram.ui.Components.x31 x13 = org.telegram.ui.Components.x31.x(21, org.telegram.messenger.id.M0(2131749332, null));
        if (z4Var == org.telegram.ui.ActionBar.z4.f28834b) {
            z12 = true;
        }
        x13.L(z12);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131749337, null)));
        org.telegram.ui.Components.x31 i7 = org.telegram.ui.Components.x31.i(30, org.telegram.messenger.id.M0(2131749336, null));
        i7.L(this.f47961e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.x31.C(org.telegram.messenger.id.M0(2131749335, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131749331, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i7 = x31Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f47961e = !this.f47961e;
                this.simpleActionBar.getDoneButton().a(this.f47961e, true);
            } else {
                if (i7 == 21) {
                    z4Var = org.telegram.ui.ActionBar.z4.f28834b;
                } else {
                    z4Var = org.telegram.ui.ActionBar.z4.f28833a;
                }
                xi.e.f58865l.b(z4Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                a5Var = org.telegram.ui.ActionBar.a5.f27331a;
            } else {
                a5Var = org.telegram.ui.ActionBar.a5.f27332b;
            }
            xi.e.f58864k.b(a5Var);
            d0();
        }
        this.f36243a.f37190f3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f36243a.r1();
        this.f36243a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.b5 b5Var = y4Var.f28798n;
        if (b5Var != null) {
            y4Var.removeView(b5Var);
            y4Var.f28798n = null;
            y4Var.g();
            y4Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null)).a(this.f47961e, false);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f36243a;
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
