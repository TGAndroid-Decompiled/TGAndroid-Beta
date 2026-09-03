package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class q4 extends Animation {
    public final int f22243a;
    public final float f22244b;
    public final float f22245c;
    public final int d;
    public final x4 f22246e;

    public q4(x4 x4Var, float f10, float f11, int i10, int i11) {
        this.f22243a = i11;
        this.f22246e = x4Var;
        this.f22244b = f10;
        this.f22245c = f11;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f22243a) {
            case 0:
                float f11 = this.f22244b;
                float w10 = e2.c.w(this.f22245c, f11, f10, f11);
                x4 x4Var = this.f22246e;
                x4Var.f22431i.setX(w10 + (x4Var.f22429f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                x4Var.f22434l.setAlpha(f12);
                x4Var.f22432j.setAlpha(f12);
                return;
            default:
                float f13 = this.f22244b;
                float w11 = e2.c.w(this.f22245c, f13, f10, f13);
                x4 x4Var2 = this.f22246e;
                x4Var2.f22431i.setX(w11 + (x4Var2.f22429f.getWidth() - this.d));
                x4Var2.f22434l.setAlpha(f10);
                x4Var2.f22432j.setAlpha(f10);
                return;
        }
    }
}
