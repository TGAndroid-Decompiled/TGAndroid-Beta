package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.w6;
public final class a3 {
    public final f3 f20231a;

    public a3(Context context, f6 f6Var) {
        f3 f3Var = new f3(1, context, f6Var, false);
        this.f20231a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20231a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20231a.customView = viewGroup;
    }

    public final void c(w6 w6Var) {
        f3 f3Var = this.f20231a;
        f3Var.customView = w6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20231a.dimBehind = false;
    }
}
