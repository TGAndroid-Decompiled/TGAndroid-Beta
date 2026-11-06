package org.telegram.ui.Components;

import android.view.View;
public final class px0 implements View.OnAttachStateChangeListener {
    public final int f37094a;
    public final g5 f37095b;

    public px0(g5 g5Var, int i7) {
        this.f37094a = i7;
        this.f37095b = g5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37094a) {
            case 0:
                this.f37095b.a();
                return;
            default:
                this.f37095b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37094a) {
            case 0:
                this.f37095b.b();
                return;
            default:
                this.f37095b.b();
                return;
        }
    }
}
