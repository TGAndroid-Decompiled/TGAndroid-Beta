package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class p9 extends org.telegram.ui.ActionBar.e3 {

    public final o9 f41300b;

    public final org.telegram.ui.ActionBar.b5[] f41301c;
    public final s9 d;

    public p9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, s9 s9Var) {
        super(activity, false);
        this.f41301c = b5VarArr;
        this.d = s9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i10);
        this.f41300b = o9Var;
        o9Var.f42827w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        o9Var.H = s9Var;
        if (s9Var.z0() != null) {
            o9Var.f42820b.setText(s9Var.z0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new s5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41301c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f41301c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var == null || b5Var.getFragmentStack().size() <= 1) {
            super.onBackPressed();
        } else {
            ((ActionBarLayout) b5VarArr[0]).G();
        }
    }
}
