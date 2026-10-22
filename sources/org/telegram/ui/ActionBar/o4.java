package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f21658a;
    public final float f21659b;
    public final float f21660c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f21658a = i11;
        this.e = v4Var;
        this.f21659b = f7;
        this.f21660c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21658a) {
            case 0:
                float f10 = this.f21659b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f21660c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f21809i.setX(y3 + (v4Var.f21807f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f21812l.setAlpha(f11);
                v4Var.f21810j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21659b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f21660c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f21809i.setX(y10 + (v4Var2.f21807f.getWidth() - this.d));
                v4Var2.f21812l.setAlpha(f7);
                v4Var2.f21810j.setAlpha(f7);
                return;
        }
    }
}
