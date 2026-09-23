package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q9 extends org.telegram.ui.ActionBar.f3 {
    public final p9 f36322b;
    public final org.telegram.ui.ActionBar.c5[] f36323c;
    public final t9 d;

    public q9(Activity activity, org.telegram.ui.ActionBar.c5[] c5VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.f36323c = c5VarArr;
        this.d = t9Var;
        c5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.f36322b = p9Var;
        p9Var.f37967w = true;
        ((ActionBarLayout) c5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) c5VarArr[0]).c0();
        ViewGroup view = c5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.L = t9Var;
        if (t9Var.J0() != null) {
            p9Var.f37957b.setText(t9Var.J0());
        }
        this.containerView = c5VarArr[0].getView();
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
        this.f36323c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.c5[] c5VarArr = this.f36323c;
        org.telegram.ui.ActionBar.c5 c5Var = c5VarArr[0];
        if (c5Var != null && c5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) c5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
