package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class t4 extends Animation {
    public final int f23097a;
    public final float f23098b;
    public final float f23099c;
    public final int d;
    public final a5 e;

    public t4(a5 a5Var, float f7, float f10, int i10, int i11) {
        this.f23097a = i11;
        this.e = a5Var;
        this.f23098b = f7;
        this.f23099c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f23097a) {
            case 0:
                float f10 = this.f23098b;
                float z10 = c3.h0.z(this.f23099c, f10, f7, f10);
                a5 a5Var = this.e;
                a5Var.f22400i.setX(z10 + (a5Var.f22398f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                a5Var.f22403l.setAlpha(f11);
                a5Var.f22401j.setAlpha(f11);
                return;
            default:
                float f12 = this.f23098b;
                float z11 = c3.h0.z(this.f23099c, f12, f7, f12);
                a5 a5Var2 = this.e;
                a5Var2.f22400i.setX(z11 + (a5Var2.f22398f.getWidth() - this.d));
                a5Var2.f22403l.setAlpha(f7);
                a5Var2.f22401j.setAlpha(f7);
                return;
        }
    }
}
