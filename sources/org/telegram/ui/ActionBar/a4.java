package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class a4 extends Animation {
    public final int f28403a;
    public final float f28404b;
    public final float f28405c;
    public final int d;
    public final g4 f28406e;

    public a4(g4 g4Var, float f10, float f11, int i7, int i10) {
        this.f28403a = i10;
        this.f28406e = g4Var;
        this.f28404b = f10;
        this.f28405c = f11;
        this.d = i7;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28403a) {
            case 0:
                float f11 = this.f28404b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f28405c, f11, f10, f11);
                g4 g4Var = this.f28406e;
                g4Var.f28568i.setX(z10 + (g4Var.f28566f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                g4Var.f28571l.setAlpha(f12);
                g4Var.f28569j.setAlpha(f12);
                return;
            default:
                float f13 = this.f28404b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f28405c, f13, f10, f13);
                g4 g4Var2 = this.f28406e;
                g4Var2.f28568i.setX(z11 + (g4Var2.f28566f.getWidth() - this.d));
                g4Var2.f28571l.setAlpha(f10);
                g4Var2.f28569j.setAlpha(f10);
                return;
        }
    }
}
