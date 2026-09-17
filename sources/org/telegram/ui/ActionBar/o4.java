package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f21265a;
    public final float f21266b;
    public final float f21267c;
    public final int d;
    public final v4 f21268e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f21265a = i11;
        this.f21268e = v4Var;
        this.f21266b = f7;
        this.f21267c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21265a) {
            case 0:
                float f10 = this.f21266b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21267c, f10, f7, f10);
                v4 v4Var = this.f21268e;
                v4Var.f21418i.setX(z10 + (v4Var.f21416f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f21421l.setAlpha(f11);
                v4Var.f21419j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21266b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21267c, f12, f7, f12);
                v4 v4Var2 = this.f21268e;
                v4Var2.f21418i.setX(z11 + (v4Var2.f21416f.getWidth() - this.d));
                v4Var2.f21421l.setAlpha(f7);
                v4Var2.f21419j.setAlpha(f7);
                return;
        }
    }
}
