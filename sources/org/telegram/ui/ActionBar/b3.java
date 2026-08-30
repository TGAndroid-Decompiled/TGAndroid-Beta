package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.q6;
public final class b3 {
    public final g3 f19525a;

    public b3(Context context, f6 f6Var) {
        g3 g3Var = new g3(context, f6Var, false, false);
        this.f19525a = g3Var;
        g3Var.fixNavigationBar();
    }

    public final void a() {
        this.f19525a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f19525a.customView = viewGroup;
    }

    public final void c(q6 q6Var) {
        g3 g3Var = this.f19525a;
        g3Var.customView = q6Var;
        g3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f19525a.dimBehind = false;
    }
}
