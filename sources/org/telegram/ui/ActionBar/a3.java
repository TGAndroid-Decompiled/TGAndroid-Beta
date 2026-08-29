package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.u6;
public final class a3 {
    public final f3 f22729a;

    public a3(Context context, c6 c6Var) {
        f3 f3Var = new f3(context, c6Var, false, false);
        this.f22729a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.f22729a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.f22729a.customView = viewGroup;
    }

    public final void c(u6 u6Var) {
        f3 f3Var = this.f22729a;
        f3Var.customView = u6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.f22729a.dimBehind = false;
    }
}
