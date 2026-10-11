package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.x6;
public final class z2 {
    public final e3 f21746a;

    public z2(Context context, d6 d6Var) {
        e3 e3Var = new e3(1, context, d6Var, false);
        this.f21746a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.f21746a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f21746a.customView = viewGroup;
    }

    public final void c(x6 x6Var) {
        e3 e3Var = this.f21746a;
        e3Var.customView = x6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f21746a.dimBehind = false;
    }
}
