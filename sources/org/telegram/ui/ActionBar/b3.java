package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.v6;
public final class b3 {
    public final g3 f18683a;

    public b3(Context context, e6 e6Var) {
        g3 g3Var = new g3(1, context, e6Var, false);
        this.f18683a = g3Var;
        g3Var.fixNavigationBar();
    }

    public final void a() {
        this.f18683a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f18683a.customView = viewGroup;
    }

    public final void c(v6 v6Var) {
        g3 g3Var = this.f18683a;
        g3Var.customView = v6Var;
        g3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f18683a.dimBehind = false;
    }
}
