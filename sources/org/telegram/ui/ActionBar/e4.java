package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class e4 extends Animation {
    public final int f28892a;
    public final float f28893b;
    public final float f28894c;
    public final int d;
    public final k4 f28895e;

    public e4(k4 k4Var, float f10, float f11, int i7, int i10) {
        this.f28892a = i10;
        this.f28895e = k4Var;
        this.f28893b = f10;
        this.f28894c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28892a) {
            case 0:
                float f11 = this.f28893b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28894c, f11, f10, f11);
                k4 k4Var = this.f28895e;
                k4Var.f29128i.setX(z10 + (k4Var.f29126f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                k4Var.f29131l.setAlpha(f12);
                k4Var.f29129j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28893b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28894c, f13, f10, f13);
                k4 k4Var2 = this.f28895e;
                k4Var2.f29128i.setX(z11 + (k4Var2.f29126f.getWidth() - this.d));
                k4Var2.f29131l.setAlpha(f10);
                k4Var2.f29129j.setAlpha(f10);
                return;
        }
    }
}
