package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class r5 extends w31 {
    public static final int f43115b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((s5) view).a(x31Var.f40155k, x31Var.f40156l, x31Var.f40157m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new s5(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }
}
