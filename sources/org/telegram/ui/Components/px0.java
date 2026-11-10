package org.telegram.ui.Components;

import android.view.View;
public final class px0 implements View.OnAttachStateChangeListener {
    public final int f37093a;
    public final f5 f37094b;

    public px0(f5 f5Var, int i7) {
        this.f37093a = i7;
        this.f37094b = f5Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37093a) {
            case 0:
                this.f37094b.a();
                return;
            default:
                this.f37094b.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37093a) {
            case 0:
                this.f37094b.b();
                return;
            default:
                this.f37094b.b();
                return;
        }
    }
}
