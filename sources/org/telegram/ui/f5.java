package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33547a;
    public final Object f33548b;

    public f5(Object obj, int i10) {
        this.f33547a = i10;
        this.f33548b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33547a) {
            case 0:
                ((g5) this.f33548b).f33822b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33548b).a();
                return;
            case 2:
                ((s70) this.f33548b).f37616b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33548b).f36326i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33548b;
                u81Var.h.a();
                u81Var.f38355n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33547a) {
            case 0:
                ((g5) this.f33548b).f33822b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33548b).b();
                return;
            case 2:
                ((s70) this.f33548b).f37616b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33548b).f36326i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33548b;
                u81Var.h.b();
                u81Var.f38355n.b();
                return;
        }
    }
}
