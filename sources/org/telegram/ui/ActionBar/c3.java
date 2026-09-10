package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.u6;
public final class c3 {
    public final h3 f17571a;

    public c3(Context context, f6 f6Var) {
        h3 h3Var = new h3(1, context, f6Var, false);
        this.f17571a = h3Var;
        h3Var.fixNavigationBar();
    }

    public final void a() {
        this.f17571a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f17571a.customView = viewGroup;
    }

    public final void c(u6 u6Var) {
        h3 h3Var = this.f17571a;
        h3Var.customView = u6Var;
        h3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f17571a.dimBehind = false;
    }
}
