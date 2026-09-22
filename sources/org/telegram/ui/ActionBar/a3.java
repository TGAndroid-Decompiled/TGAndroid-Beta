package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.u6;
public final class a3 {
    public final f3 f18674a;

    public a3(Context context, f6 f6Var) {
        f3 f3Var = new f3(1, context, f6Var, false);
        this.f18674a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f18674a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f18674a.customView = viewGroup;
    }

    public final void c(u6 u6Var) {
        f3 f3Var = this.f18674a;
        f3Var.customView = u6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f18674a.dimBehind = false;
    }
}
