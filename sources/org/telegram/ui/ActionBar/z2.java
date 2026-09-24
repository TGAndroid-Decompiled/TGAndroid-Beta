package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.v6;
public final class z2 {
    public final e3 f19935a;

    public z2(Context context, d6 d6Var) {
        e3 e3Var = new e3(1, context, d6Var, false);
        this.f19935a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.f19935a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f19935a.customView = viewGroup;
    }

    public final void c(v6 v6Var) {
        e3 e3Var = this.f19935a;
        e3Var.customView = v6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f19935a.dimBehind = false;
    }
}
