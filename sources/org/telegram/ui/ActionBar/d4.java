package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class d4 extends Animation {
    public final int f28844a;
    public final float f28845b;
    public final float f28846c;
    public final int d;
    public final j4 f28847e;

    public d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.f28844a = i10;
        this.f28847e = j4Var;
        this.f28845b = f10;
        this.f28846c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28844a) {
            case 0:
                float f11 = this.f28845b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28846c, f11, f10, f11);
                j4 j4Var = this.f28847e;
                j4Var.f29022i.setX(z10 + (j4Var.f29020f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.f29025l.setAlpha(f12);
                j4Var.f29023j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28845b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28846c, f13, f10, f13);
                j4 j4Var2 = this.f28847e;
                j4Var2.f29022i.setX(z11 + (j4Var2.f29020f.getWidth() - this.d));
                j4Var2.f29025l.setAlpha(f10);
                j4Var2.f29023j.setAlpha(f10);
                return;
        }
    }
}
