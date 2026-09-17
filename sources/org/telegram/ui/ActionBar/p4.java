package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class p4 extends Animation {
    public final int f19497a;
    public final float f19498b;
    public final float f19499c;
    public final int d;
    public final w4 e;

    public p4(w4 w4Var, float f7, float f10, int i10, int i11) {
        this.f19497a = i11;
        this.e = w4Var;
        this.f19498b = f7;
        this.f19499c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19497a) {
            case 0:
                float f10 = this.f19498b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19499c, f10, f7, f10);
                w4 w4Var = this.e;
                w4Var.f19642i.setX(z10 + (w4Var.f19640f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                w4Var.f19645l.setAlpha(f11);
                w4Var.f19643j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19498b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19499c, f12, f7, f12);
                w4 w4Var2 = this.e;
                w4Var2.f19642i.setX(z11 + (w4Var2.f19640f.getWidth() - this.d));
                w4Var2.f19645l.setAlpha(f7);
                w4Var2.f19643j.setAlpha(f7);
                return;
        }
    }
}
