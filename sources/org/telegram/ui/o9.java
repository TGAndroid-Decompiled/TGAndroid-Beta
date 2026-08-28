package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o9 extends org.telegram.ui.ActionBar.f3 {
    public final n9 f41010b;
    public final org.telegram.ui.ActionBar.b5[] f41011c;
    public final r9 d;

    public o9(Activity activity, org.telegram.ui.ActionBar.b5[] b5VarArr, int i9, r9 r9Var) {
        super(activity, false);
        this.f41011c = b5VarArr;
        this.d = r9Var;
        b5VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i9);
        this.f41010b = n9Var;
        n9Var.f42602w = true;
        ((ActionBarLayout) b5VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) b5VarArr[0]).c0();
        ViewGroup view = b5VarArr[0].getView();
        int i10 = this.backgroundPaddingLeft;
        view.setPadding(i10, 0, i10, 0);
        n9Var.H = r9Var;
        if (r9Var.C0() != null) {
            n9Var.f42595b.setText(r9Var.C0());
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
        this.f41011c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.b5[] b5VarArr = this.f41011c;
        org.telegram.ui.ActionBar.b5 b5Var = b5VarArr[0];
        if (b5Var != null && b5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) b5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
