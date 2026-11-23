package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class o50 extends org.telegram.ui.Components.e51 {
    public boolean f50474e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.c51 c51Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) aj.e.f1627k.a();
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) aj.e.f1628l.a();
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749147, null)));
        org.telegram.ui.Components.o41 x10 = org.telegram.ui.Components.o41.x(11, org.telegram.messenger.hd.N0(2131749146, null));
        boolean z13 = false;
        if (b5Var == org.telegram.ui.ActionBar.b5.f28779b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.o41 x11 = org.telegram.ui.Components.o41.x(10, org.telegram.messenger.hd.N0(2131749145, null));
        if (b5Var == org.telegram.ui.ActionBar.b5.f28778a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131749144, null)));
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749140, null)));
        org.telegram.ui.Components.o41 x12 = org.telegram.ui.Components.o41.x(20, org.telegram.messenger.hd.N0(2131749139, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f28759a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.o41 x13 = org.telegram.ui.Components.o41.x(21, org.telegram.messenger.hd.N0(2131749138, null));
        if (a5Var == org.telegram.ui.ActionBar.a5.f28760b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749143, null)));
        org.telegram.ui.Components.o41 i7 = org.telegram.ui.Components.o41.i(30, org.telegram.messenger.hd.N0(2131749142, null));
        i7.L(this.f50474e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131749141, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.hd.N0(2131749137, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.o41 o41Var, View view) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.a5 a5Var;
        int i7 = o41Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f50474e = !this.f50474e;
                this.simpleActionBar.getDoneButton().a(this.f50474e, true);
            } else {
                if (i7 == 21) {
                    a5Var = org.telegram.ui.ActionBar.a5.f28760b;
                } else {
                    a5Var = org.telegram.ui.ActionBar.a5.f28759a;
                }
                aj.e.f1628l.b(a5Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                b5Var = org.telegram.ui.ActionBar.b5.f28778a;
            } else {
                b5Var = org.telegram.ui.ActionBar.b5.f28779b;
            }
            aj.e.f1627k.b(b5Var);
            d0();
        }
        this.f34671a.f35742g3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f34671a.r1();
        this.f34671a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.c5 c5Var = z4Var.f30305n;
        if (c5Var != null) {
            z4Var.removeView(c5Var);
            z4Var.f30305n = null;
            z4Var.l();
            z4Var.requestLayout();
        }
        this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null)).a(this.f50474e, false);
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f34671a;
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
