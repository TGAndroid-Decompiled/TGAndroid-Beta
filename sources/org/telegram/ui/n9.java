package org.telegram.ui;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class n9 extends org.telegram.ui.ActionBar.t2 {
    public final m9 f47919j1;
    public final org.telegram.ui.ActionBar.q4[] k1;
    public final r9 f47920l1;

    public n9(Activity activity, org.telegram.ui.ActionBar.q4[] q4VarArr, int i3, r9 r9Var) {
        super(activity, false);
        this.k1 = q4VarArr;
        this.f47920l1 = r9Var;
        q4VarArr[0].setFragmentStack(new ArrayList());
        m9 m9Var = new m9(this, i3);
        this.f47919j1 = m9Var;
        m9Var.f49439y = true;
        ((ActionBarLayout) q4VarArr[0]).c(-1, m9Var);
        ((ActionBarLayout) q4VarArr[0]).f0();
        ViewGroup view = q4VarArr[0].getView();
        int i10 = this.f28618u0;
        view.setPadding(i10, 0, i10, 0);
        m9Var.N = r9Var;
        if (r9Var.M0() != null) {
            m9Var.f49426c.setText(r9Var.M0());
        }
        this.f28586b = q4VarArr[0].getView();
        this.f28621w0 = false;
        setOnDismissListener(new s5(this, 1));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.k1[0] = null;
        this.f47920l1.onDismiss();
    }

    @Override
    public final void onBackPressed() {
        org.telegram.ui.ActionBar.q4[] q4VarArr = this.k1;
        org.telegram.ui.ActionBar.q4 q4Var = q4VarArr[0];
        if (q4Var != null && q4Var.getFragmentStack().size() > 1) {
            ((ActionBarLayout) q4VarArr[0]).I();
        } else {
            super.onBackPressed();
        }
    }
}
