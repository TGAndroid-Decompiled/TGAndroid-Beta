package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g70 extends org.telegram.ui.Components.m71 {
    public boolean e;

    @Override
    public final void V(ArrayList arrayList, org.telegram.ui.Components.j71 j71Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.ActionBar.t5 t5Var = (org.telegram.ui.ActionBar.t5) wi.e.f51280k.a();
        org.telegram.ui.ActionBar.s5 s5Var = (org.telegram.ui.ActionBar.s5) wi.e.f51281l.a();
        ic.a.p(R.string.HeaderDoneButtonColor, arrayList);
        org.telegram.ui.Components.t61 x9 = org.telegram.ui.Components.t61.x(11, LocaleController.getString(R.string.HeaderDoneButtonColorAccent));
        boolean z13 = false;
        if (t5Var == org.telegram.ui.ActionBar.t5.f23101b) {
            z10 = true;
        } else {
            z10 = false;
        }
        x9.L(z10);
        arrayList.add(x9);
        org.telegram.ui.Components.t61 x10 = org.telegram.ui.Components.t61.x(10, LocaleController.getString(R.string.HeaderDoneButtonColorGlass));
        if (t5Var == org.telegram.ui.ActionBar.t5.f23100a) {
            z11 = true;
        } else {
            z11 = false;
        }
        x10.L(z11);
        arrayList.add(x10);
        ic.a.z(R.string.HeaderDoneButtonColorInfo, arrayList);
        ic.a.p(R.string.HeaderDoneButtonShape, arrayList);
        org.telegram.ui.Components.t61 x11 = org.telegram.ui.Components.t61.x(20, LocaleController.getString(R.string.HeaderDoneButtonShapeIcon));
        if (s5Var == org.telegram.ui.ActionBar.s5.f23083a) {
            z12 = true;
        } else {
            z12 = false;
        }
        x11.L(z12);
        arrayList.add(x11);
        org.telegram.ui.Components.t61 x12 = org.telegram.ui.Components.t61.x(21, LocaleController.getString(R.string.HeaderDoneButtonShapeText));
        if (s5Var == org.telegram.ui.ActionBar.s5.f23084b) {
            z13 = true;
        }
        x12.L(z13);
        arrayList.add(x12);
        arrayList.add(org.telegram.ui.Components.t61.C(null));
        ic.a.p(R.string.HeaderDoneButtonPreview, arrayList);
        org.telegram.ui.Components.t61 i10 = org.telegram.ui.Components.t61.i(30, LocaleController.getString(R.string.HeaderDoneButtonPreviewChanges));
        i10.L(this.e);
        arrayList.add(i10);
        ic.a.z(R.string.HeaderDoneButtonPreviewInfo, arrayList);
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.HeaderSettings);
    }

    @Override
    public final void X(org.telegram.ui.Components.t61 t61Var, View view) {
        org.telegram.ui.ActionBar.t5 t5Var;
        org.telegram.ui.ActionBar.s5 s5Var;
        int i10 = t61Var.d;
        if (i10 != 10 && i10 != 11) {
            if (i10 != 20 && i10 != 21) {
                if (i10 != 30) {
                    return;
                }
                this.e = !this.e;
                this.simpleActionBar.getDoneButton().a(this.e, true);
            } else {
                if (i10 == 21) {
                    s5Var = org.telegram.ui.ActionBar.s5.f23084b;
                } else {
                    s5Var = org.telegram.ui.ActionBar.s5.f23083a;
                }
                wi.e.f51281l.b(s5Var);
                Z();
            }
        } else {
            if (i10 == 10) {
                t5Var = org.telegram.ui.ActionBar.t5.f23100a;
            } else {
                t5Var = org.telegram.ui.ActionBar.t5.f23101b;
            }
            wi.e.f51280k.b(t5Var);
            Z();
        }
        this.f30417a.f32150g3.O(true);
    }

    @Override
    public final boolean Y(org.telegram.ui.Components.t61 t61Var, View view) {
        return false;
    }

    public final void Z() {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u5 u5Var = r5Var.f23042n;
        if (u5Var != null) {
            r5Var.removeView(u5Var);
            r5Var.f23042n = null;
            r5Var.c();
            r5Var.requestLayout();
        }
        this.simpleActionBar.i(LocaleController.getString(R.string.Save)).a(this.e, false);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f30417a.u1();
        this.f30417a.setSectionsDrawBackground(true);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f30417a;
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
