package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class p4 extends Animation {
    public final int f19498a;
    public final float f19499b;
    public final float f19500c;
    public final int d;
    public final w4 e;

    public p4(w4 w4Var, float f7, float f10, int i10, int i11) {
        this.f19498a = i11;
        this.e = w4Var;
        this.f19499b = f7;
        this.f19500c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19498a) {
            case 0:
                float f10 = this.f19499b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19500c, f10, f7, f10);
                w4 w4Var = this.e;
                w4Var.f19643i.setX(z10 + (w4Var.f19641f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                w4Var.f19646l.setAlpha(f11);
                w4Var.f19644j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19499b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19500c, f12, f7, f12);
                w4 w4Var2 = this.e;
                w4Var2.f19643i.setX(z11 + (w4Var2.f19641f.getWidth() - this.d));
                w4Var2.f19646l.setAlpha(f7);
                w4Var2.f19644j.setAlpha(f7);
                return;
        }
    }
}
