package org.telegram.ui;

import android.content.Context;
public final class ph0 implements org.telegram.ui.Components.w80 {
    public final org.telegram.ui.Components.x80 f37161a;
    public final qh0 f37162b;

    public ph0(qh0 qh0Var, org.telegram.ui.Components.x80 x80Var) {
        this.f37162b = qh0Var;
        this.f37161a = x80Var;
    }

    @Override
    public final void c() {
        rh0.W(this.f37162b.d);
    }

    @Override
    public final void f() {
        qh0 qh0Var = this.f37162b;
        rh0 rh0Var = qh0Var.d;
        Context context = this.f37161a.getContext();
        rh0 rh0Var2 = qh0Var.d;
        rh0Var.f37854i0 = new org.telegram.ui.Components.t60(context, rh0Var2.e, rh0Var2.d, rh0Var2.f37853h0, rh0Var2, rh0Var2.f37858n, true, rh0Var2.h);
        qh0Var.d.f37854i0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
