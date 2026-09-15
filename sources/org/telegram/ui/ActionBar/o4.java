package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f19470a;
    public final float f19471b;
    public final float f19472c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f19470a = i11;
        this.e = v4Var;
        this.f19471b = f7;
        this.f19472c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19470a) {
            case 0:
                float f10 = this.f19471b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19472c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f19615i.setX(z10 + (v4Var.f19613f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f19618l.setAlpha(f11);
                v4Var.f19616j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19471b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19472c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f19615i.setX(z11 + (v4Var2.f19613f.getWidth() - this.d));
                v4Var2.f19618l.setAlpha(f7);
                v4Var2.f19616j.setAlpha(f7);
                return;
        }
    }
}
