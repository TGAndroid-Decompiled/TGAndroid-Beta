package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.x6;
public final class a3 {
    public final f3 f20384a;

    public a3(Context context, e6 e6Var) {
        f3 f3Var = new f3(1, context, e6Var, false);
        this.f20384a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f20384a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f20384a.customView = viewGroup;
    }

    public final void c(x6 x6Var) {
        f3 f3Var = this.f20384a;
        f3Var.customView = x6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f20384a.dimBehind = false;
    }
}
