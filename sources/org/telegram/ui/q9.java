package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q9 extends org.telegram.ui.ActionBar.h3 {
    public final p9 f35994b;
    public final org.telegram.ui.ActionBar.f5[] f35995c;
    public final t9 d;

    public q9(Activity activity, org.telegram.ui.ActionBar.f5[] f5VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.f35995c = f5VarArr;
        this.d = t9Var;
        f5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.f35994b = p9Var;
        p9Var.f37172w = true;
        ((ActionBarLayout) f5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) f5VarArr[0]).c0();
        ViewGroup view = f5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.L = t9Var;
        if (t9Var.J0() != null) {
            p9Var.f37162b.setText(t9Var.J0());
        }
        this.containerView = f5VarArr[0].getView();
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
        this.f35995c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.f5[] f5VarArr = this.f35995c;
        org.telegram.ui.ActionBar.f5 f5Var = f5VarArr[0];
        if (f5Var != null && f5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) f5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
