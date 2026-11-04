package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class a4 extends Animation {
    public final int f27374a;
    public final float f27375b;
    public final float f27376c;
    public final int d;
    public final i4 f27377e;

    public a4(i4 i4Var, float f10, float f11, int i3, int i10) {
        this.f27374a = i10;
        this.f27377e = i4Var;
        this.f27375b = f10;
        this.f27376c = f11;
        this.d = i3;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27374a) {
            case 0:
                float f11 = this.f27375b;
                float y9 = com.google.android.recaptcha.internal.a.y(this.f27376c, f11, f10, f11);
                i4 i4Var = this.f27377e;
                i4Var.f27614i.setX(y9 + (i4Var.f27612f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                i4Var.f27617l.setAlpha(f12);
                i4Var.f27615j.setAlpha(f12);
                return;
            default:
                float f13 = this.f27375b;
                float y10 = com.google.android.recaptcha.internal.a.y(this.f27376c, f13, f10, f13);
                i4 i4Var2 = this.f27377e;
                i4Var2.f27614i.setX(y10 + (i4Var2.f27612f.getWidth() - this.d));
                i4Var2.f27617l.setAlpha(f10);
                i4Var2.f27615j.setAlpha(f10);
                return;
        }
    }
}
