package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33549a;
    public final Object f33550b;

    public f5(Object obj, int i10) {
        this.f33549a = i10;
        this.f33550b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33549a) {
            case 0:
                ((g5) this.f33550b).f33849b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33550b).a();
                return;
            case 2:
                ((z70) this.f33550b).f40142b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.f33550b).f39685i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                b91 b91Var = (b91) this.f33550b;
                b91Var.h.a();
                b91Var.f32082n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33549a) {
            case 0:
                ((g5) this.f33550b).f33849b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33550b).b();
                return;
            case 2:
                ((z70) this.f33550b).f40142b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((xp0) this.f33550b).f39685i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                b91 b91Var = (b91) this.f33550b;
                b91Var.h.b();
                b91Var.f32082n.b();
                return;
        }
    }
}
