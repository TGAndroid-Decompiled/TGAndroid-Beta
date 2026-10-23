package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.w6;
public final class a3 {
    public final f3 f20617a;

    public a3(Context context, d6 d6Var) {
        f3 f3Var = new f3(1, context, d6Var, false);
        this.f20617a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20617a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20617a.customView = viewGroup;
    }

    public final void c(w6 w6Var) {
        f3 f3Var = this.f20617a;
        f3Var.customView = w6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20617a.dimBehind = false;
    }
}
