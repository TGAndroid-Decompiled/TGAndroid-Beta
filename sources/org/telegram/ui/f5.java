package org.telegram.ui;

import android.view.View;

public final class f5 implements View.OnAttachStateChangeListener {

    public final int f37936a;

    public final Object f37937b;

    public f5(Object obj, int i10) {
        this.f37936a = i10;
        this.f37937b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37936a) {
            case 0:
                ((g5) this.f37937b).f38316b.onAttachedToWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.i5) this.f37937b).a();
                break;
            case 2:
                ((f70) this.f37937b).f37952b.onAttachedToWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((wo0) this.f37937b).f44162i;
                if (i5Var != null) {
                    i5Var.a();
                }
                break;
            default:
                s71 s71Var = (s71) this.f37937b;
                s71Var.h.a();
                s71Var.f42548n.a();
                break;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37936a) {
            case 0:
                ((g5) this.f37937b).f38316b.onDetachedFromWindow();
                break;
            case 1:
                ((org.telegram.ui.Components.i5) this.f37937b).b();
                break;
            case 2:
                ((f70) this.f37937b).f37952b.onDetachedFromWindow();
                break;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((wo0) this.f37937b).f44162i;
                if (i5Var != null) {
                    i5Var.b();
                }
                break;
            default:
                s71 s71Var = (s71) this.f37937b;
                s71Var.h.b();
                s71Var.f42548n.b();
                break;
        }
    }
}
