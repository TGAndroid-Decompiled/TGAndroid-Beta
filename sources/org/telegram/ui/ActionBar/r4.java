package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class r4 extends Animation {
    public final int f21814a;
    public final float f21815b;
    public final float f21816c;
    public final int d;
    public final y4 e;

    public r4(y4 y4Var, float f7, float f10, int i10, int i11) {
        this.f21814a = i11;
        this.e = y4Var;
        this.f21815b = f7;
        this.f21816c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21814a) {
            case 0:
                float f10 = this.f21815b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f21816c, f10, f7, f10);
                y4 y4Var = this.e;
                y4Var.f21997i.setX(y3 + (y4Var.f21995f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                y4Var.f22000l.setAlpha(f11);
                y4Var.f21998j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21815b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f21816c, f12, f7, f12);
                y4 y4Var2 = this.e;
                y4Var2.f21997i.setX(y10 + (y4Var2.f21995f.getWidth() - this.d));
                y4Var2.f22000l.setAlpha(f7);
                y4Var2.f21998j.setAlpha(f7);
                return;
        }
    }
}
