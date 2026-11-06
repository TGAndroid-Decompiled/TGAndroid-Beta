package org.telegram.ui.Components;

import android.view.View;
public final class ox0 implements View.OnAttachStateChangeListener {
    public final int f36686a;
    public final g5 f36687b;

    public ox0(g5 g5Var, int i7) {
        this.f36686a = i7;
        this.f36687b = g5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36686a) {
            case 0:
                this.f36687b.a();
                return;
            default:
                this.f36687b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36686a) {
            case 0:
                this.f36687b.b();
                return;
            default:
                this.f36687b.b();
                return;
        }
    }
}
