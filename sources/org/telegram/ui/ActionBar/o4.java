package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f19658a;
    public final float f19659b;
    public final float f19660c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f19658a = i11;
        this.e = v4Var;
        this.f19659b = f7;
        this.f19660c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19658a) {
            case 0:
                float f10 = this.f19659b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19660c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f19802i.setX(z10 + (v4Var.f19800f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f19805l.setAlpha(f11);
                v4Var.f19803j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19659b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19660c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f19802i.setX(z11 + (v4Var2.f19800f.getWidth() - this.d));
                v4Var2.f19805l.setAlpha(f7);
                v4Var2.f19803j.setAlpha(f7);
                return;
        }
    }
}
