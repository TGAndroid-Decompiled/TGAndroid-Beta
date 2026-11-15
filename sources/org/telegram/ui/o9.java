package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o9 extends org.telegram.ui.ActionBar.u2 {
    public final n9 f49867m1;
    public final org.telegram.ui.ActionBar.o4[] n1;
    public final s9 f49868o1;

    public o9(Activity activity, org.telegram.ui.ActionBar.o4[] o4VarArr, int i7, s9 s9Var) {
        super(activity, false);
        this.n1 = o4VarArr;
        this.f49868o1 = s9Var;
        o4VarArr[0].setFragmentStack(new ArrayList());
        n9 n9Var = new n9(this, i7);
        this.f49867m1 = n9Var;
        n9Var.f51510y = true;
        ((ActionBarLayout) o4VarArr[0]).c(-1, n9Var);
        ((ActionBarLayout) o4VarArr[0]).f0();
        ViewGroup view = o4VarArr[0].getView();
        int i10 = this.f29717u0;
        view.setPadding(i10, 0, i10, 0);
        n9Var.N = s9Var;
        if (s9Var.J0() != null) {
            n9Var.f51497c.setText(s9Var.J0());
        }
        this.f29682b = o4VarArr[0].getView();
        this.f29720w0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.n1[0] = null;
        this.f49868o1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.o4[] o4VarArr = this.n1;
        org.telegram.ui.ActionBar.o4 o4Var = o4VarArr[0];
        if (o4Var != null && o4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) o4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }
}
