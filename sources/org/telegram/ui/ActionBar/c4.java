package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class c4 extends Animation {
    public final int f27394a;
    public final float f27395b;
    public final float f27396c;
    public final int d;
    public final i4 f27397e;

    public c4(i4 i4Var, float f10, float f11, int i7, int i10) {
        this.f27394a = i10;
        this.f27397e = i4Var;
        this.f27395b = f10;
        this.f27396c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27394a) {
            case 0:
                float f11 = this.f27395b;
                float z9 = com.google.android.recaptcha.internal.a.z(this.f27396c, f11, f10, f11);
                i4 i4Var = this.f27397e;
                i4Var.f27570i.setX(z9 + (i4Var.f27568f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.f27573l.setAlpha(f12);
                i4Var.f27571j.setAlpha(f12);
                return;
            default:
                float f13 = this.f27395b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.f27396c, f13, f10, f13);
                i4 i4Var2 = this.f27397e;
                i4Var2.f27570i.setX(z10 + (i4Var2.f27568f.getWidth() - this.d));
                i4Var2.f27573l.setAlpha(f10);
                i4Var2.f27571j.setAlpha(f10);
                return;
        }
    }
}
