package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q9 extends org.telegram.ui.ActionBar.f3 {
    public final p9 f39755b;
    public final org.telegram.ui.ActionBar.d5[] f39756c;
    public final t9 d;

    public q9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, t9 t9Var) {
        super(activity, false);
        this.f39756c = d5VarArr;
        this.d = t9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.f39755b = p9Var;
        p9Var.f40990w = true;
        ((ActionBarLayout) d5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.L = t9Var;
        if (t9Var.K0() != null) {
            p9Var.f40979b.setText(t9Var.K0());
        }
        this.containerView = d5VarArr[0].getView();
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
        this.f39756c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f39756c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
