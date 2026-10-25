package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
public final class e3 {
    public final k3 f22599a;

    public e3(Context context, u6 u6Var) {
        k3 k3Var = new k3(1, context, u6Var, false);
        this.f22599a = k3Var;
        k3Var.fixNavigationBar();
    }

    public final void a() {
        this.f22599a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f22599a.customView = viewGroup;
    }

    public final void c(org.telegram.ui.Components.y6 y6Var) {
        k3 k3Var = this.f22599a;
        k3Var.customView = y6Var;
        k3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f22599a.dimBehind = false;
    }
}
