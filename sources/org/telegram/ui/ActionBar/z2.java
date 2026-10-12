package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.x6;
public final class z2 {
    public final e3 f21485a;

    public z2(Context context, c6 c6Var) {
        e3 e3Var = new e3(1, context, c6Var, false);
        this.f21485a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.f21485a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f21485a.customView = viewGroup;
    }

    public final void c(x6 x6Var) {
        e3 e3Var = this.f21485a;
        e3Var.customView = x6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f21485a.dimBehind = false;
    }
}
