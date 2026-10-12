package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.y6;
public final class z2 {
    public final e3 f20838a;

    public z2(Context context, c6 c6Var) {
        e3 e3Var = new e3(1, context, c6Var, false);
        this.f20838a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20838a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20838a.customView = viewGroup;
    }

    public final void c(y6 y6Var) {
        e3 e3Var = this.f20838a;
        e3Var.customView = y6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20838a.dimBehind = false;
    }
}
