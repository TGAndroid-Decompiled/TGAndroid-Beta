package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.q6;
public final class c3 {
    public final h3 f21207a;

    public c3(Context context, g6 g6Var) {
        h3 h3Var = new h3(context, g6Var, false, false);
        this.f21207a = h3Var;
        h3Var.fixNavigationBar();
    }

    public final void a() {
        this.f21207a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f21207a.customView = viewGroup;
    }

    public final void c(q6 q6Var) {
        h3 h3Var = this.f21207a;
        h3Var.customView = q6Var;
        h3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f21207a.dimBehind = false;
    }
}
