package org.telegram.ui;

import android.view.View;
public final class i5 implements View.OnAttachStateChangeListener {
    public final int f40144a;
    public final Object f40145b;

    public i5(Object obj, int i10) {
        this.f40144a = i10;
        this.f40145b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f40144a) {
            case 0:
                ((j5) this.f40145b).f40457b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40145b).a();
                return;
            case 2:
                ((j70) this.f40145b).f40470b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.f40145b).f41638i;
                if (r5Var != null) {
                    r5Var.a();
                    return;
                }
                return;
            default:
                y71 y71Var = (y71) this.f40145b;
                y71Var.h.a();
                y71Var.f45981n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f40144a) {
            case 0:
                ((j5) this.f40145b).f40457b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40145b).b();
                return;
            case 2:
                ((j70) this.f40145b).f40470b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.f40145b).f41638i;
                if (r5Var != null) {
                    r5Var.b();
                    return;
                }
                return;
            default:
                y71 y71Var = (y71) this.f40145b;
                y71Var.h.b();
                y71Var.f45981n.b();
                return;
        }
    }
}
