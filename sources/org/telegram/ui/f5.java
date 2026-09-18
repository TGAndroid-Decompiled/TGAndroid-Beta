package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33553a;
    public final Object f33554b;

    public f5(Object obj, int i10) {
        this.f33553a = i10;
        this.f33554b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33553a) {
            case 0:
                ((g5) this.f33554b).f33853b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33554b).a();
                return;
            case 2:
                ((z70) this.f33554b).f40147b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.f33554b).f39690i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                b91 b91Var = (b91) this.f33554b;
                b91Var.h.a();
                b91Var.f32086n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33553a) {
            case 0:
                ((g5) this.f33554b).f33853b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33554b).b();
                return;
            case 2:
                ((z70) this.f33554b).f40147b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.f33554b).f39690i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                b91 b91Var = (b91) this.f33554b;
                b91Var.h.b();
                b91Var.f32086n.b();
                return;
        }
    }
}
