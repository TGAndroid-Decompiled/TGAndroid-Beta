package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.v6;
public final class a3 {
    public final f3 f18414a;

    public a3(Context context, d6 d6Var) {
        f3 f3Var = new f3(1, context, d6Var, false);
        this.f18414a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f18414a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f18414a.customView = viewGroup;
    }

    public final void c(v6 v6Var) {
        f3 f3Var = this.f18414a;
        f3Var.customView = v6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f18414a.dimBehind = false;
    }
}
