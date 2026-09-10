package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f32683a;
    public final Object f32684b;

    public f5(Object obj, int i10) {
        this.f32683a = i10;
        this.f32684b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f32683a) {
            case 0:
                ((g5) this.f32684b).f32996b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f32684b).a();
                return;
            case 2:
                ((w70) this.f32684b).f37737b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((vp0) this.f32684b).f37604i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f32684b;
                f91Var.h.a();
                f91Var.f32728n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f32683a) {
            case 0:
                ((g5) this.f32684b).f32996b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f32684b).b();
                return;
            case 2:
                ((w70) this.f32684b).f37737b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((vp0) this.f32684b).f37604i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f32684b;
                f91Var.h.b();
                f91Var.f32728n.b();
                return;
        }
    }
}
