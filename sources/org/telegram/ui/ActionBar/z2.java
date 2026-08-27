package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.p6;

public final class z2 {

    public final e3 f23994a;

    public z2(Context context, c6 c6Var) {
        e3 e3Var = new e3(context, c6Var, false, false);
        this.f23994a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.f23994a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f23994a.customView = viewGroup;
    }

    public final void c(p6 p6Var) {
        e3 e3Var = this.f23994a;
        e3Var.customView = p6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f23994a.dimBehind = false;
    }
}
