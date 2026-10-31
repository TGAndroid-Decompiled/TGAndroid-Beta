package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class l60 extends org.telegram.ui.Components.r51 {
    public boolean e;

    @Override
    public final void Y(ArrayList arrayList, org.telegram.ui.Components.p51 p51Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) mi.e.f13391k.a();
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) mi.e.f13392l.a();
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749349, null)));
        org.telegram.ui.Components.a51 x10 = org.telegram.ui.Components.a51.x(11, org.telegram.messenger.cd.L0(2131749348, null));
        boolean z13 = false;
        if (k5Var == org.telegram.ui.ActionBar.k5.f20466b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.a51 x11 = org.telegram.ui.Components.a51.x(10, org.telegram.messenger.cd.L0(2131749347, null));
        if (k5Var == org.telegram.ui.ActionBar.k5.f20465a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131749346, null)));
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749342, null)));
        org.telegram.ui.Components.a51 x12 = org.telegram.ui.Components.a51.x(20, org.telegram.messenger.cd.L0(2131749341, null));
        if (j5Var == org.telegram.ui.ActionBar.j5.f20443a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.a51 x13 = org.telegram.ui.Components.a51.x(21, org.telegram.messenger.cd.L0(2131749340, null));
        if (j5Var == org.telegram.ui.ActionBar.j5.f20444b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.a51.C(null));
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749345, null)));
        org.telegram.ui.Components.a51 i10 = org.telegram.ui.Components.a51.i(30, org.telegram.messenger.cd.L0(2131749344, null));
        i10.L(this.e);
        arrayList.add(i10);
        arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131749343, null)));
    }

    @Override
    public final CharSequence Z() {
        return org.telegram.messenger.cd.L0(2131749339, null);
    }

    @Override
    public final void a0(org.telegram.ui.Components.a51 a51Var, View view) {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i10 = a51Var.d;
        if (i10 != 10 && i10 != 11) {
            if (i10 != 20 && i10 != 21) {
                if (i10 != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i10 == 21) {
                    j5Var = org.telegram.ui.ActionBar.j5.f20444b;
                } else {
                    j5Var = org.telegram.ui.ActionBar.j5.f20443a;
                }
                mi.e.f13392l.b(j5Var);
                c0();
            }
        } else {
            if (i10 == 10) {
                k5Var = org.telegram.ui.ActionBar.k5.f20465a;
            } else {
                k5Var = org.telegram.ui.ActionBar.k5.f20466b;
            }
            mi.e.f13391k.b(k5Var);
            c0();
        }
        this.f29837a.f30819f3.O(true);
    }

    @Override
    public final boolean b0(org.telegram.ui.Components.a51 a51Var, View view) {
        return false;
    }

    public final void c0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.l5 l5Var = i5Var.f20421n;
        if (l5Var != null) {
            i5Var.removeView(l5Var);
            i5Var.f20421n = null;
            i5Var.g();
            i5Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null)).a(this.e, false);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f29837a.r1();
        this.f29837a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f29837a;
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
