package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.p6;
public final class a3 {
    public final f3 f22713a;

    public a3(Context context, b6 b6Var) {
        f3 f3Var = new f3(context, b6Var, false, false);
        this.f22713a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f22713a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f22713a.customView = viewGroup;
    }

    public final void c(p6 p6Var) {
        f3 f3Var = this.f22713a;
        f3Var.customView = p6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f22713a.dimBehind = false;
    }
}
