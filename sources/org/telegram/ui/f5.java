package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33480a;
    public final Object f33481b;

    public f5(Object obj, int i10) {
        this.f33480a = i10;
        this.f33481b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33480a) {
            case 0:
                ((g5) this.f33481b).f33758b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33481b).a();
                return;
            case 2:
                ((x70) this.f33481b).f39510b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((vp0) this.f33481b).f38669i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                z81 z81Var = (z81) this.f33481b;
                z81Var.h.a();
                z81Var.f40114n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33480a) {
            case 0:
                ((g5) this.f33481b).f33758b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33481b).b();
                return;
            case 2:
                ((x70) this.f33481b).f39510b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((vp0) this.f33481b).f38669i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                z81 z81Var = (z81) this.f33481b;
                z81Var.h.b();
                z81Var.f40114n.b();
                return;
        }
    }
}
