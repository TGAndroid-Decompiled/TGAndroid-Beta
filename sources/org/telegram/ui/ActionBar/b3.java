package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.w6;
public final class b3 {
    public final h3 f20728a;

    public b3(Context context, g6 g6Var) {
        h3 h3Var = new h3(1, context, g6Var, false);
        this.f20728a = h3Var;
        h3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20728a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20728a.customView = viewGroup;
    }

    public final void c(w6 w6Var) {
        h3 h3Var = this.f20728a;
        h3Var.customView = w6Var;
        h3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20728a.dimBehind = false;
    }
}
