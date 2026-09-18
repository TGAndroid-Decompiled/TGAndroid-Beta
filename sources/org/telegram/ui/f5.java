package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33435a;
    public final Object f33436b;

    public f5(Object obj, int i10) {
        this.f33435a = i10;
        this.f33436b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33435a) {
            case 0:
                ((g5) this.f33436b).f33693b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33436b).a();
                return;
            case 2:
                ((x70) this.f33436b).f39371b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((xp0) this.f33436b).f39606i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                a91 a91Var = (a91) this.f33436b;
                a91Var.h.a();
                a91Var.f31986n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33435a) {
            case 0:
                ((g5) this.f33436b).f33693b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33436b).b();
                return;
            case 2:
                ((x70) this.f33436b).f39371b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((xp0) this.f33436b).f39606i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                a91 a91Var = (a91) this.f33436b;
                a91Var.h.b();
                a91Var.f31986n.b();
                return;
        }
    }
}
