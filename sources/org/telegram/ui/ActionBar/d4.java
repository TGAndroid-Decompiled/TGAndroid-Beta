package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class d4 extends Animation {
    public final int f28878a;
    public final float f28879b;
    public final float f28880c;
    public final int d;
    public final j4 f28881e;

    public d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.f28878a = i10;
        this.f28881e = j4Var;
        this.f28879b = f10;
        this.f28880c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28878a) {
            case 0:
                float f11 = this.f28879b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28880c, f11, f10, f11);
                j4 j4Var = this.f28881e;
                j4Var.f29056i.setX(z10 + (j4Var.f29054f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.f29059l.setAlpha(f12);
                j4Var.f29057j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28879b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28880c, f13, f10, f13);
                j4 j4Var2 = this.f28881e;
                j4Var2.f29056i.setX(z11 + (j4Var2.f29054f.getWidth() - this.d));
                j4Var2.f29059l.setAlpha(f10);
                j4Var2.f29057j.setAlpha(f10);
                return;
        }
    }
}
