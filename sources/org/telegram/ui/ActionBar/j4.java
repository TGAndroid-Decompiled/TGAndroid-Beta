package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class j4 extends Animation {
    public final int f20440a;
    public final float f20441b;
    public final float f20442c;
    public final int d;
    public final q4 e;

    public j4(q4 q4Var, float f7, float f10, int i10, int i11) {
        this.f20440a = i11;
        this.e = q4Var;
        this.f20441b = f7;
        this.f20442c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f20440a) {
            case 0:
                float f10 = this.f20441b;
                float z10 = c3.i0.z(this.f20442c, f10, f7, f10);
                q4 q4Var = this.e;
                q4Var.f20686i.setX(z10 + (q4Var.f20684f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                q4Var.f20689l.setAlpha(f11);
                q4Var.f20687j.setAlpha(f11);
                return;
            default:
                float f12 = this.f20441b;
                float z11 = c3.i0.z(this.f20442c, f12, f7, f12);
                q4 q4Var2 = this.e;
                q4Var2.f20686i.setX(z11 + (q4Var2.f20684f.getWidth() - this.d));
                q4Var2.f20689l.setAlpha(f7);
                q4Var2.f20687j.setAlpha(f7);
                return;
        }
    }
}
