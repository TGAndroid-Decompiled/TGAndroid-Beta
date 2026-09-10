package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class q4 extends Animation {
    public final int f18584a;
    public final float f18585b;
    public final float f18586c;
    public final int d;
    public final x4 e;

    public q4(x4 x4Var, float f7, float f10, int i10, int i11) {
        this.f18584a = i11;
        this.e = x4Var;
        this.f18585b = f7;
        this.f18586c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f18584a) {
            case 0:
                float f10 = this.f18585b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f18586c, f10, f7, f10);
                x4 x4Var = this.e;
                x4Var.f18737i.setX(z10 + (x4Var.f18735f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                x4Var.f18740l.setAlpha(f11);
                x4Var.f18738j.setAlpha(f11);
                return;
            default:
                float f12 = this.f18585b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f18586c, f12, f7, f12);
                x4 x4Var2 = this.e;
                x4Var2.f18737i.setX(z11 + (x4Var2.f18735f.getWidth() - this.d));
                x4Var2.f18740l.setAlpha(f7);
                x4Var2.f18738j.setAlpha(f7);
                return;
        }
    }
}
