package org.telegram.ui;

import android.content.Context;
public final class qh0 implements org.telegram.ui.Components.i90 {
    public final org.telegram.ui.Components.j90 f37022a;
    public final rh0 f37023b;

    public qh0(rh0 rh0Var, org.telegram.ui.Components.j90 j90Var) {
        this.f37023b = rh0Var;
        this.f37022a = j90Var;
    }

    @Override
    public final void e() {
        sh0.W(this.f37023b.d);
    }

    @Override
    public final void j() {
        rh0 rh0Var = this.f37023b;
        sh0 sh0Var = rh0Var.d;
        Context context = this.f37022a.getContext();
        sh0 sh0Var2 = rh0Var.d;
        sh0Var.f37879l0 = new org.telegram.ui.Components.f70(context, sh0Var2.e, sh0Var2.d, sh0Var2.f37878k0, sh0Var2, sh0Var2.f37880n, true, sh0Var2.h);
        rh0Var.d.f37879l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
