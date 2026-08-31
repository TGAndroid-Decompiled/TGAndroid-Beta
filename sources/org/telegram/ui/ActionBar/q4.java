package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class q4 extends Animation {
    public final int f22241a;
    public final float f22242b;
    public final float f22243c;
    public final int d;
    public final x4 f22244e;

    public q4(x4 x4Var, float f10, float f11, int i10, int i11) {
        this.f22241a = i11;
        this.f22244e = x4Var;
        this.f22242b = f10;
        this.f22243c = f11;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f22241a) {
            case 0:
                float f11 = this.f22242b;
                float w10 = e2.c.w(this.f22243c, f11, f10, f11);
                x4 x4Var = this.f22244e;
                x4Var.f22429i.setX(w10 + (x4Var.f22427f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                x4Var.f22432l.setAlpha(f12);
                x4Var.f22430j.setAlpha(f12);
                return;
            default:
                float f13 = this.f22242b;
                float w11 = e2.c.w(this.f22243c, f13, f10, f13);
                x4 x4Var2 = this.f22244e;
                x4Var2.f22429i.setX(w11 + (x4Var2.f22427f.getWidth() - this.d));
                x4Var2.f22432l.setAlpha(f10);
                x4Var2.f22430j.setAlpha(f10);
                return;
        }
    }
}
