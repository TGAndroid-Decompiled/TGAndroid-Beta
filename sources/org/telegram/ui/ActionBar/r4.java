package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class r4 extends Animation {
    public final int f21813a;
    public final float f21814b;
    public final float f21815c;
    public final int d;
    public final y4 e;

    public r4(y4 y4Var, float f7, float f10, int i10, int i11) {
        this.f21813a = i11;
        this.e = y4Var;
        this.f21814b = f7;
        this.f21815c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21813a) {
            case 0:
                float f10 = this.f21814b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f21815c, f10, f7, f10);
                y4 y4Var = this.e;
                y4Var.f21996i.setX(y3 + (y4Var.f21994f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                y4Var.f21999l.setAlpha(f11);
                y4Var.f21997j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21814b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f21815c, f12, f7, f12);
                y4 y4Var2 = this.e;
                y4Var2.f21996i.setX(y10 + (y4Var2.f21994f.getWidth() - this.d));
                y4Var2.f21999l.setAlpha(f7);
                y4Var2.f21997j.setAlpha(f7);
                return;
        }
    }
}
