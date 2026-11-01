package org.telegram.ui.Components;

import android.view.View;
public final class ty0 implements View.OnAttachStateChangeListener {
    public final int f30745a;
    public final d5 f30746b;

    public ty0(d5 d5Var, int i10) {
        this.f30745a = i10;
        this.f30746b = d5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f30745a) {
            case 0:
                this.f30746b.a();
                return;
            default:
                this.f30746b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f30745a) {
            case 0:
                this.f30746b.b();
                return;
            default:
                this.f30746b.b();
                return;
        }
    }
}
