package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class d4 extends Animation {
    public final int f28875a;
    public final float f28876b;
    public final float f28877c;
    public final int d;
    public final j4 f28878e;

    public d4(j4 j4Var, float f10, float f11, int i7, int i10) {
        this.f28875a = i10;
        this.f28878e = j4Var;
        this.f28876b = f10;
        this.f28877c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28875a) {
            case 0:
                float f11 = this.f28876b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28877c, f11, f10, f11);
                j4 j4Var = this.f28878e;
                j4Var.f29053i.setX(z10 + (j4Var.f29051f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                j4Var.f29056l.setAlpha(f12);
                j4Var.f29054j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28876b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28877c, f13, f10, f13);
                j4 j4Var2 = this.f28878e;
                j4Var2.f29053i.setX(z11 + (j4Var2.f29051f.getWidth() - this.d));
                j4Var2.f29056l.setAlpha(f10);
                j4Var2.f29054j.setAlpha(f10);
                return;
        }
    }
}
