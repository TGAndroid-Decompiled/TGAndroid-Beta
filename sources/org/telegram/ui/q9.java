package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class q9 extends org.telegram.ui.ActionBar.f3 {
    public final p9 f41046b;
    public final org.telegram.ui.ActionBar.d5[] f41047c;
    public final u9 d;

    public q9(Activity activity, org.telegram.ui.ActionBar.d5[] d5VarArr, int i10, boolean z10, u9 u9Var) {
        super(activity, false);
        this.f41047c = d5VarArr;
        this.d = u9Var;
        d5VarArr[0].setFragmentStack(new ArrayList());
        p9 p9Var = new p9(this, i10);
        this.f41046b = p9Var;
        p9Var.f42727x = true;
        p9Var.W = z10;
        ((ActionBarLayout) d5VarArr[0]).c(-1, p9Var);
        ((ActionBarLayout) d5VarArr[0]).c0();
        ViewGroup view = d5VarArr[0].getView();
        int i11 = this.backgroundPaddingLeft;
        view.setPadding(i11, 0, i11, 0);
        p9Var.M = u9Var;
        if (u9Var.z0() != null) {
            p9Var.f42713b.setText(u9Var.z0());
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
        this.f41047c[0] = null;
        this.d.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.d5[] d5VarArr = this.f41047c;
        org.telegram.ui.ActionBar.d5 d5Var = d5VarArr[0];
        if (d5Var != null && d5Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) d5VarArr[0]).G();
        } else {
            super.onBackPressed();
        }
    }
}
