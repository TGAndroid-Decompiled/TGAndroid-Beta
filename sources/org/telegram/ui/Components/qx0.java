package org.telegram.ui.Components;

import android.view.View;
public final class qx0 implements View.OnAttachStateChangeListener {
    public final int f37495a;
    public final g5 f37496b;

    public qx0(g5 g5Var, int i7) {
        this.f37495a = i7;
        this.f37496b = g5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37495a) {
            case 0:
                this.f37496b.a();
                return;
            default:
                this.f37496b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37495a) {
            case 0:
                this.f37496b.b();
                return;
            default:
                this.f37496b.b();
                return;
        }
    }
}
