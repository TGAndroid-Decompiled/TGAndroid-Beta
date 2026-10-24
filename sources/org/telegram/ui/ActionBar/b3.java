package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.u6;
public final class b3 {
    public final h3 f20729a;

    public b3(Context context, g6 g6Var) {
        h3 h3Var = new h3(1, context, g6Var, false);
        this.f20729a = h3Var;
        h3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20729a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20729a.customView = viewGroup;
    }

    public final void c(u6 u6Var) {
        h3 h3Var = this.f20729a;
        h3Var.customView = u6Var;
        h3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20729a.dimBehind = false;
    }
}
