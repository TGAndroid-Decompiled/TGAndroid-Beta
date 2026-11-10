package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class d4 extends Animation {
    public final int f27415a;
    public final float f27416b;
    public final float f27417c;
    public final int d;
    public final j4 f27418e;

    public d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.f27415a = i10;
        this.f27418e = j4Var;
        this.f27416b = f10;
        this.f27417c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27415a) {
            case 0:
                float f11 = this.f27416b;
                float z9 = com.google.android.recaptcha.internal.a.z(this.f27417c, f11, f10, f11);
                j4 j4Var = this.f27418e;
                j4Var.f27576i.setX(z9 + (j4Var.f27574f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.f27579l.setAlpha(f12);
                j4Var.f27577j.setAlpha(f12);
                return;
            default:
                float f13 = this.f27416b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.f27417c, f13, f10, f13);
                j4 j4Var2 = this.f27418e;
                j4Var2.f27576i.setX(z10 + (j4Var2.f27574f.getWidth() - this.d));
                j4Var2.f27579l.setAlpha(f10);
                j4Var2.f27577j.setAlpha(f10);
                return;
        }
    }
}
