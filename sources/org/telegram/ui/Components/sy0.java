package org.telegram.ui.Components;

import android.view.View;
public final class sy0 implements View.OnAttachStateChangeListener {
    public final int f30384a;
    public final d5 f30385b;

    public sy0(d5 d5Var, int i10) {
        this.f30384a = i10;
        this.f30385b = d5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f30384a) {
            case 0:
                this.f30385b.a();
                return;
            default:
                this.f30385b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f30384a) {
            case 0:
                this.f30385b.b();
                return;
            default:
                this.f30385b.b();
                return;
        }
    }
}
