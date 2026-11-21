package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class p9 extends org.telegram.ui.ActionBar.w2 {
    public final o9 f50816m1;
    public final org.telegram.ui.ActionBar.r4[] n1;
    public final s9 f50817o1;

    public p9(Activity activity, org.telegram.ui.ActionBar.r4[] r4VarArr, int i7, s9 s9Var) {
        super(activity, false);
        this.n1 = r4VarArr;
        this.f50817o1 = s9Var;
        r4VarArr[0].setFragmentStack(new ArrayList());
        o9 o9Var = new o9(this, i7);
        this.f50816m1 = o9Var;
        o9Var.f52279y = true;
        ((ActionBarLayout) r4VarArr[0]).c(-1, o9Var);
        ((ActionBarLayout) r4VarArr[0]).f0();
        ViewGroup view = r4VarArr[0].getView();
        int i10 = this.f30208u0;
        view.setPadding(i10, 0, i10, 0);
        o9Var.N = s9Var;
        if (s9Var.J0() != null) {
            o9Var.f52266c.setText(s9Var.J0());
        }
        this.f30173b = r4VarArr[0].getView();
        this.f30211w0 = false;
        setOnDismissListener(new q5(this, 1));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.n1[0] = null;
        this.f50817o1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.r4[] r4VarArr = this.n1;
        org.telegram.ui.ActionBar.r4 r4Var = r4VarArr[0];
        if (r4Var != null && r4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) r4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }
}
