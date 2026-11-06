package org.telegram.ui.Components;

import android.view.View;
public final class ox0 implements View.OnAttachStateChangeListener {
    public final int f36808a;
    public final g5 f36809b;

    public ox0(g5 g5Var, int i7) {
        this.f36808a = i7;
        this.f36809b = g5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36808a) {
            case 0:
                this.f36809b.a();
                return;
            default:
                this.f36809b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36808a) {
            case 0:
                this.f36809b.b();
                return;
            default:
                this.f36809b.b();
                return;
        }
    }
}
