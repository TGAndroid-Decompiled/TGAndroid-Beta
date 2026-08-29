package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n9 extends org.telegram.ui.ActionBar.f3 {
    public final m9 f40749b;
    public final org.telegram.ui.ActionBar.b5[] f40750c;
    public final q9 d;

    public n9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i10, q9 q9Var) {
        super(activity, false);
        this.f40750c = b5VarArr;
        this.d = q9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        m9 m9Var = new m9(this, i10);
        this.f40749b = m9Var;
        m9Var.f42009w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, m9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        m9Var.H = q9Var;
        if (q9Var.E0() != null) {
            m9Var.f42002b.setText(q9Var.E0());
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
        this.f40750c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f40750c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
