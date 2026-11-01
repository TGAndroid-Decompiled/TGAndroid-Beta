package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class j4 extends Animation {
    public final int f20441a;
    public final float f20442b;
    public final float f20443c;
    public final int d;
    public final q4 e;

    public j4(q4 q4Var, float f7, float f10, int i10, int i11) {
        this.f20441a = i11;
        this.e = q4Var;
        this.f20442b = f7;
        this.f20443c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f20441a) {
            case 0:
                float f10 = this.f20442b;
                float z10 = c3.i0.z(this.f20443c, f10, f7, f10);
                q4 q4Var = this.e;
                q4Var.f20687i.setX(z10 + (q4Var.f20685f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                q4Var.f20690l.setAlpha(f11);
                q4Var.f20688j.setAlpha(f11);
                return;
            default:
                float f12 = this.f20442b;
                float z11 = c3.i0.z(this.f20443c, f12, f7, f12);
                q4 q4Var2 = this.e;
                q4Var2.f20687i.setX(z11 + (q4Var2.f20685f.getWidth() - this.d));
                q4Var2.f20690l.setAlpha(f7);
                q4Var2.f20688j.setAlpha(f7);
                return;
        }
    }
}
