package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class d4 extends Animation {
    public final int f28929a;
    public final float f28930b;
    public final float f28931c;
    public final int d;
    public final j4 f28932e;

    public d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.f28929a = i10;
        this.f28932e = j4Var;
        this.f28930b = f10;
        this.f28931c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28929a) {
            case 0:
                float f11 = this.f28930b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28931c, f11, f10, f11);
                j4 j4Var = this.f28932e;
                j4Var.f29109i.setX(z10 + (j4Var.f29107f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.f29112l.setAlpha(f12);
                j4Var.f29110j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28930b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28931c, f13, f10, f13);
                j4 j4Var2 = this.f28932e;
                j4Var2.f29109i.setX(z11 + (j4Var2.f29107f.getWidth() - this.d));
                j4Var2.f29112l.setAlpha(f10);
                j4Var2.f29110j.setAlpha(f10);
                return;
        }
    }
}
