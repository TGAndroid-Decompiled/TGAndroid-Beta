package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class p9 extends org.telegram.ui.ActionBar.z2 {
    public final o9 f40424i1;
    public final org.telegram.ui.ActionBar.z4[] f40425j1;
    public final t9 f40426k1;

    public p9(Activity activity, org.telegram.ui.ActionBar.z4[] z4VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.f40425j1 = z4VarArr;
        this.f40426k1 = t9Var;
        z4VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i10);
        this.f40424i1 = o9Var;
        o9Var.f41894y = true;
        ((ActionBarLayout) z4VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) z4VarArr[0]).e0();
        ViewGroup view = z4VarArr[0].getView();
        int i11 = this.f21616t0;
        view.setPadding(i11, 0, i11, 0);
        o9Var.M = t9Var;
        if (t9Var.P0() != null) {
            o9Var.f41883c.setText(t9Var.P0());
        }
        this.f21587b = z4VarArr[0].getView();
        this.f21618v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40425j1[0] = null;
        this.f40426k1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.z4[] z4VarArr = this.f40425j1;
        org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[0];
        if (z4Var != null && z4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) z4VarArr[0]).H();
        } else {
            super.onBackPressed();
        }
    }
}
