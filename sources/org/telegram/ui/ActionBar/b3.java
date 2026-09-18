package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.t6;
public final class b3 {
    public final g3 f18471a;

    public b3(Context context, f6 f6Var) {
        g3 g3Var = new g3(1, context, f6Var, false);
        this.f18471a = g3Var;
        g3Var.fixNavigationBar();
    }

    public final void a() {
        this.f18471a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f18471a.customView = viewGroup;
    }

    public final void c(t6 t6Var) {
        g3 g3Var = this.f18471a;
        g3Var.customView = t6Var;
        g3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f18471a.dimBehind = false;
    }
}
