package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class e4 extends Animation {
    public final int f28894a;
    public final float f28895b;
    public final float f28896c;
    public final int d;
    public final k4 f28897e;

    public e4(k4 k4Var, float f10, float f11, int i7, int i10) {
        this.f28894a = i10;
        this.f28897e = k4Var;
        this.f28895b = f10;
        this.f28896c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28894a) {
            case 0:
                float f11 = this.f28895b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28896c, f11, f10, f11);
                k4 k4Var = this.f28897e;
                k4Var.f29130i.setX(z10 + (k4Var.f29128f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                k4Var.f29133l.setAlpha(f12);
                k4Var.f29131j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28895b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28896c, f13, f10, f13);
                k4 k4Var2 = this.f28897e;
                k4Var2.f29130i.setX(z11 + (k4Var2.f29128f.getWidth() - this.d));
                k4Var2.f29133l.setAlpha(f10);
                k4Var2.f29131j.setAlpha(f10);
                return;
        }
    }
}
