package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class p4 extends Animation {
    public final int f20500a;
    public final float f20501b;
    public final float f20502c;
    public final int d;
    public final w4 e;

    public p4(w4 w4Var, float f10, float f11, int i10, int i11) {
        this.f20500a = i11;
        this.e = w4Var;
        this.f20501b = f10;
        this.f20502c = f11;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f20500a) {
            case 0:
                float f11 = this.f20501b;
                float w10 = e2.c.w(this.f20502c, f11, f10, f11);
                w4 w4Var = this.e;
                w4Var.f20676i.setX(w10 + (w4Var.f20674f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                w4Var.f20679l.setAlpha(f12);
                w4Var.f20677j.setAlpha(f12);
                return;
            default:
                float f13 = this.f20501b;
                float w11 = e2.c.w(this.f20502c, f13, f10, f13);
                w4 w4Var2 = this.e;
                w4Var2.f20676i.setX(w11 + (w4Var2.f20674f.getWidth() - this.d));
                w4Var2.f20679l.setAlpha(f10);
                w4Var2.f20677j.setAlpha(f10);
                return;
        }
    }
}
