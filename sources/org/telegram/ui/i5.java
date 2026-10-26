package org.telegram.ui;

import android.view.View;
public final class i5 implements View.OnAttachStateChangeListener {
    public final int f40147a;
    public final Object f40148b;

    public i5(Object obj, int i10) {
        this.f40147a = i10;
        this.f40148b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f40147a) {
            case 0:
                ((j5) this.f40148b).f40460b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40148b).a();
                return;
            case 2:
                ((j70) this.f40148b).f40473b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.f40148b).f41641i;
                if (r5Var != null) {
                    r5Var.a();
                    return;
                }
                return;
            default:
                y71 y71Var = (y71) this.f40148b;
                y71Var.h.a();
                y71Var.f45984n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f40147a) {
            case 0:
                ((j5) this.f40148b).f40460b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40148b).b();
                return;
            case 2:
                ((j70) this.f40148b).f40473b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((mp0) this.f40148b).f41641i;
                if (r5Var != null) {
                    r5Var.b();
                    return;
                }
                return;
            default:
                y71 y71Var = (y71) this.f40148b;
                y71Var.h.b();
                y71Var.f45984n.b();
                return;
        }
    }
}
