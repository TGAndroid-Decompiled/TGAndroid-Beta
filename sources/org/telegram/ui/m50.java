package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class m50 extends org.telegram.ui.Components.r41 {
    public boolean f49128e;

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.y4 y4Var = (org.telegram.ui.ActionBar.y4) aj.e.f1658k.a();
        org.telegram.ui.ActionBar.x4 x4Var = (org.telegram.ui.ActionBar.x4) aj.e.f1659l.a();
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749340, null)));
        org.telegram.ui.Components.b41 x10 = org.telegram.ui.Components.b41.x(11, org.telegram.messenger.hd.M0(2131749339, null));
        boolean z13 = false;
        if (y4Var == org.telegram.ui.ActionBar.y4.f29893b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x10.L(z10);
        arrayList.add(x10);
        org.telegram.ui.Components.b41 x11 = org.telegram.ui.Components.b41.x(10, org.telegram.messenger.hd.M0(2131749338, null));
        if (y4Var == org.telegram.ui.ActionBar.y4.f29892a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x11.L(z11);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131749337, null)));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749333, null)));
        org.telegram.ui.Components.b41 x12 = org.telegram.ui.Components.b41.x(20, org.telegram.messenger.hd.M0(2131749332, null));
        if (x4Var == org.telegram.ui.ActionBar.x4.f29869a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x12.L(z12);
        arrayList.add(x12);
        org.telegram.ui.Components.b41 x13 = org.telegram.ui.Components.b41.x(21, org.telegram.messenger.hd.M0(2131749331, null));
        if (x4Var == org.telegram.ui.ActionBar.x4.f29870b) {
            z13 = true;
        }
        x13.L(z13);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749336, null)));
        org.telegram.ui.Components.b41 i7 = org.telegram.ui.Components.b41.i(30, org.telegram.messenger.hd.M0(2131749335, null));
        i7.L(this.f49128e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131749334, null)));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131749330, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.x4 x4Var;
        int i7 = b41Var.d;
        if (i7 != 10 && i7 != 11) {
            if (i7 != 20 && i7 != 21) {
                if (i7 != 30) {
                    return;
                }
                this.f49128e = !this.f49128e;
                this.simpleActionBar.getDoneButton().a(this.f49128e, true);
            } else {
                if (i7 == 21) {
                    x4Var = org.telegram.ui.ActionBar.x4.f29870b;
                } else {
                    x4Var = org.telegram.ui.ActionBar.x4.f29869a;
                }
                aj.e.f1659l.b(x4Var);
                d0();
            }
        } else {
            if (i7 == 10) {
                y4Var = org.telegram.ui.ActionBar.y4.f29892a;
            } else {
                y4Var = org.telegram.ui.ActionBar.y4.f29893b;
            }
            aj.e.f1658k.b(y4Var);
            d0();
        }
        this.f38882a.f39895g3.O(true);
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f38882a.r1();
        this.f38882a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.z4 z4Var = w4Var.f29823n;
        if (z4Var != null) {
            w4Var.removeView(z4Var);
            w4Var.f29823n = null;
            w4Var.j();
            w4Var.requestLayout();
        }
        this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null)).a(this.f49128e, false);
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f38882a;
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
