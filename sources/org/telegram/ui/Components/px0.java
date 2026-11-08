package org.telegram.ui.Components;

import android.view.View;
public final class px0 implements View.OnAttachStateChangeListener {
    public final int f37116a;
    public final g5 f37117b;

    public px0(g5 g5Var, int i7) {
        this.f37116a = i7;
        this.f37117b = g5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37116a) {
            case 0:
                this.f37117b.a();
                return;
            default:
                this.f37117b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37116a) {
            case 0:
                this.f37117b.b();
                return;
            default:
                this.f37117b.b();
                return;
        }
    }
}
