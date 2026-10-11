package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class p9 extends org.telegram.ui.ActionBar.e3 {
    public final o9 f40787b;
    public final org.telegram.ui.ActionBar.b5[] f40788c;
    public final t9 d;

    public p9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, boolean z10, t9 t9Var) {
        super(activity, false);
        this.f40788c = b5VarArr;
        this.d = t9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i10);
        this.f40787b = o9Var;
        o9Var.f42427x = true;
        o9Var.W = z10;
        ((ActionBarLayout) b5VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        o9Var.M = t9Var;
        if (t9Var.z0() != null) {
            o9Var.f42413b.setText(t9Var.z0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f40788c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f40788c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
