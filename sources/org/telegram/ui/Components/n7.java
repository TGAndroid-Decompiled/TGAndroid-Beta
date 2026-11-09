package org.telegram.ui.Components;

import android.content.Context;
public final class n7 extends qj0 {
    public boolean f36276e3;
    public final b8 f36277f3;

    public n7(b8 b8Var, Context context) {
        super(context, null);
        this.f36277f3 = b8Var;
    }

    @Override
    public final boolean E0(float f10) {
        b8 b8Var = this.f36277f3;
        if (f10 < b8Var.f32154u1.getY() - b8Var.f32142o1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b8 b8Var = this.f36277f3;
        int i13 = b8Var.f32133i2;
        if (i13 != -1 && !b8Var.f32134j1.f27664n0) {
            this.f36276e3 = true;
            b8Var.f32144p1.h1(i13, b8Var.f32135j2 - b8Var.f32142o1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f36276e3 = false;
            b8Var.f32133i2 = -1;
        } else if (b8Var.f32131h2) {
            b8Var.f32131h2 = false;
            this.f36276e3 = true;
            if (b8Var.S0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f36276e3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36276e3) {
            return;
        }
        super.requestLayout();
    }
}
