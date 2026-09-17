package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f21292a;
    public final float f21293b;
    public final float f21294c;
    public final int d;
    public final v4 f21295e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f21292a = i11;
        this.f21295e = v4Var;
        this.f21293b = f7;
        this.f21294c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21292a) {
            case 0:
                float f10 = this.f21293b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21294c, f10, f7, f10);
                v4 v4Var = this.f21295e;
                v4Var.f21445i.setX(z10 + (v4Var.f21443f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f21448l.setAlpha(f11);
                v4Var.f21446j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21293b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21294c, f12, f7, f12);
                v4 v4Var2 = this.f21295e;
                v4Var2.f21445i.setX(z11 + (v4Var2.f21443f.getWidth() - this.d));
                v4Var2.f21448l.setAlpha(f7);
                v4Var2.f21446j.setAlpha(f7);
                return;
        }
    }
}
