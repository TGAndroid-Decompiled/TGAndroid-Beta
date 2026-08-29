package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f37999a;
    public final Object f38000b;

    public f5(Object obj, int i10) {
        this.f37999a = i10;
        this.f38000b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37999a) {
            case 0:
                ((g5) this.f38000b).f38455b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f38000b).a();
                return;
            case 2:
                ((f70) this.f38000b).f38011b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((uo0) this.f38000b).f43303i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) this.f38000b;
                w71Var.h.a();
                w71Var.f43864n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37999a) {
            case 0:
                ((g5) this.f38000b).f38455b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f38000b).b();
                return;
            case 2:
                ((f70) this.f38000b).f38011b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((uo0) this.f38000b).f43303i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) this.f38000b;
                w71Var.h.b();
                w71Var.f43864n.b();
                return;
        }
    }
}
