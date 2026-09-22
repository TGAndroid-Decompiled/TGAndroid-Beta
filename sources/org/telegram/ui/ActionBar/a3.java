package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.t6;
public final class a3 {
    public final f3 f18440a;

    public a3(Context context, e6 e6Var) {
        f3 f3Var = new f3(1, context, e6Var, false);
        this.f18440a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f18440a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f18440a.customView = viewGroup;
    }

    public final void c(t6 t6Var) {
        f3 f3Var = this.f18440a;
        f3Var.customView = t6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f18440a.dimBehind = false;
    }
}
