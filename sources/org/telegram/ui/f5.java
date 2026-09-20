package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33493a;
    public final Object f33494b;

    public f5(Object obj, int i10) {
        this.f33493a = i10;
        this.f33494b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33493a) {
            case 0:
                ((g5) this.f33494b).f33800b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f33494b).a();
                return;
            case 2:
                ((x70) this.f33494b).f39361b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.f33494b).f39711i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f33494b;
                d91Var.h.a();
                d91Var.f32979n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33493a) {
            case 0:
                ((g5) this.f33494b).f33800b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f33494b).b();
                return;
            case 2:
                ((x70) this.f33494b).f39361b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.f33494b).f39711i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f33494b;
                d91Var.h.b();
                d91Var.f32979n.b();
                return;
        }
    }
}
