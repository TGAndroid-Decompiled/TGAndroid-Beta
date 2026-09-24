package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q9 extends org.telegram.ui.ActionBar.e3 {
    public final p9 f36804b;
    public final org.telegram.ui.ActionBar.b5[] f36805c;
    public final t9 d;

    public q9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.f36805c = b5VarArr;
        this.d = t9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.f36804b = p9Var;
        p9Var.f38348w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.L = t9Var;
        if (t9Var.J0() != null) {
            p9Var.f38338b.setText(t9Var.J0());
        }
        this.containerView = b5VarArr[0].getView();
        setApplyBottomPadding(false);
        setApplyBottomPadding(false);
        setOnDismissListener(new r5(this, 1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36805c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f36805c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
