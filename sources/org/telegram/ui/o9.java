package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o9 extends org.telegram.ui.ActionBar.v2 {
    public final n9 f48330i1;
    public final org.telegram.ui.ActionBar.q4[] f48331j1;
    public final r9 f48332k1;

    public o9(Activity activity, org.telegram.ui.ActionBar.q4[] q4VarArr, int i7, r9 r9Var) {
        super(activity, false);
        this.f48331j1 = q4VarArr;
        this.f48332k1 = r9Var;
        q4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.f48330i1 = n9Var;
        n9Var.f49679y = true;
        ((ActionBarLayout) q4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i10 = this.f28649t0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.M = r9Var;
        if (r9Var.R0() != null) {
            n9Var.f49667c.setText(r9Var.R0());
        }
        this.f28619b = q4VarArr[0].getView();
        this.f28651v0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48331j1[0] = null;
        this.f48332k1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = this.f48331j1;
        org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[0];
        if (q4Var != null && q4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) q4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }
}
