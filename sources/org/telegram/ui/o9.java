package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o9 extends org.telegram.ui.ActionBar.w2 {
    public final n9 l1;
    public final org.telegram.ui.ActionBar.r4[] f48470m1;
    public final r9 n1;

    public o9(Activity activity, org.telegram.ui.ActionBar.r4[] r4VarArr, int i7, r9 r9Var) {
        super(activity, false);
        this.f48470m1 = r4VarArr;
        this.n1 = r9Var;
        r4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.l1 = n9Var;
        n9Var.f49754y = true;
        ((ActionBarLayout) r4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i10 = this.f28705t0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.M = r9Var;
        if (r9Var.R0() != null) {
            n9Var.f49742c.setText(r9Var.R0());
        }
        this.f28672b = r4VarArr[0].getView();
        this.f28707v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48470m1[0] = null;
        this.n1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.r4[] r4VarArr = this.f48470m1;
        org.telegram.ui.ActionBar.r4 r4Var = r4VarArr[0];
        if (r4Var != null && r4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) r4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }
}
