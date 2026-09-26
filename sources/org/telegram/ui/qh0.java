package org.telegram.ui;

import android.content.Context;
public final class qh0 implements org.telegram.ui.Components.g90 {
    public final org.telegram.ui.Components.h90 f36921a;
    public final rh0 f36922b;

    public qh0(rh0 rh0Var, org.telegram.ui.Components.h90 h90Var) {
        this.f36922b = rh0Var;
        this.f36921a = h90Var;
    }

    @Override
    public final void e() {
        sh0.W(this.f36922b.d);
    }

    @Override
    public final void j() {
        rh0 rh0Var = this.f36922b;
        sh0 sh0Var = rh0Var.d;
        Context context = this.f36921a.getContext();
        sh0 sh0Var2 = rh0Var.d;
        sh0Var.f37782l0 = new org.telegram.ui.Components.d70(context, sh0Var2.e, sh0Var2.d, sh0Var2.f37781k0, sh0Var2, sh0Var2.f37783n, true, sh0Var2.h);
        rh0Var.d.f37782l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
