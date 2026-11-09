package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class c4 extends Animation {
    public final int f27389a;
    public final float f27390b;
    public final float f27391c;
    public final int d;
    public final i4 f27392e;

    public c4(i4 i4Var, float f10, float f11, int i7, int i10) {
        this.f27389a = i10;
        this.f27392e = i4Var;
        this.f27390b = f10;
        this.f27391c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27389a) {
            case 0:
                float f11 = this.f27390b;
                float z9 = com.google.android.recaptcha.internal.a.z(this.f27391c, f11, f10, f11);
                i4 i4Var = this.f27392e;
                i4Var.f27548i.setX(z9 + (i4Var.f27546f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.f27551l.setAlpha(f12);
                i4Var.f27549j.setAlpha(f12);
                return;
            default:
                float f13 = this.f27390b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.f27391c, f13, f10, f13);
                i4 i4Var2 = this.f27392e;
                i4Var2.f27548i.setX(z10 + (i4Var2.f27546f.getWidth() - this.d));
                i4Var2.f27551l.setAlpha(f10);
                i4Var2.f27549j.setAlpha(f10);
                return;
        }
    }
}
