package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class c4 extends Animation {
    public final int f27397a;
    public final float f27398b;
    public final float f27399c;
    public final int d;
    public final i4 f27400e;

    public c4(i4 i4Var, float f10, float f11, int i7, int i10) {
        this.f27397a = i10;
        this.f27400e = i4Var;
        this.f27398b = f10;
        this.f27399c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27397a) {
            case 0:
                float f11 = this.f27398b;
                float z9 = com.google.android.recaptcha.internal.a.z(this.f27399c, f11, f10, f11);
                i4 i4Var = this.f27400e;
                i4Var.f27573i.setX(z9 + (i4Var.f27571f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.f27576l.setAlpha(f12);
                i4Var.f27574j.setAlpha(f12);
                return;
            default:
                float f13 = this.f27398b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.f27399c, f13, f10, f13);
                i4 i4Var2 = this.f27400e;
                i4Var2.f27573i.setX(z10 + (i4Var2.f27571f.getWidth() - this.d));
                i4Var2.f27576l.setAlpha(f10);
                i4Var2.f27574j.setAlpha(f10);
                return;
        }
    }
}
