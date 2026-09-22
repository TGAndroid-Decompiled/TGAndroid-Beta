package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33500a;
    public final Object f33501b;

    public f5(Object obj, int i10) {
        this.f33500a = i10;
        this.f33501b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33500a) {
            case 0:
                ((g5) this.f33501b).f33768b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33501b).a();
                return;
            case 2:
                ((x70) this.f33501b).f39521b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((vp0) this.f33501b).f38605i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                a91 a91Var = (a91) this.f33501b;
                a91Var.h.a();
                a91Var.f31709n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33500a) {
            case 0:
                ((g5) this.f33501b).f33768b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f33501b).b();
                return;
            case 2:
                ((x70) this.f33501b).f39521b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = ((vp0) this.f33501b).f38605i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                a91 a91Var = (a91) this.f33501b;
                a91Var.h.b();
                a91Var.f31709n.b();
                return;
        }
    }
}
