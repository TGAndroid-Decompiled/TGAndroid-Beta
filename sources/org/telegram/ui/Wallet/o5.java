package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class o5 extends x31 {
    public static final int f42941b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((p5) view).a(y31Var.f40567k, y31Var.f40568l, y31Var.f40569m);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new p5(context, g6Var);
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
