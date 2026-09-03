package org.telegram.ui;

import android.view.View;
public final class h5 implements View.OnAttachStateChangeListener {
    public final int f37222a;
    public final Object f37223b;

    public h5(Object obj, int i10) {
        this.f37222a = i10;
        this.f37223b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37222a) {
            case 0:
                ((i5) this.f37223b).f37543b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f37223b).a();
                return;
            case 2:
                ((q70) this.f37223b).f40355b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.f37223b).f37760i;
                if (j5Var != null) {
                    j5Var.a();
                    return;
                }
                return;
            default:
                q81 q81Var = (q81) this.f37223b;
                q81Var.h.a();
                q81Var.f40380n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37222a) {
            case 0:
                ((i5) this.f37223b).f37543b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f37223b).b();
                return;
            case 2:
                ((q70) this.f37223b).f40355b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.f37223b).f37760i;
                if (j5Var != null) {
                    j5Var.b();
                    return;
                }
                return;
            default:
                q81 q81Var = (q81) this.f37223b;
                q81Var.h.b();
                q81Var.f40380n.b();
                return;
        }
    }
}
