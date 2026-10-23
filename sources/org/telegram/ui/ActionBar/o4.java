package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f21659a;
    public final float f21660b;
    public final float f21661c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f21659a = i11;
        this.e = v4Var;
        this.f21660b = f7;
        this.f21661c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21659a) {
            case 0:
                float f10 = this.f21660b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f21661c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f21810i.setX(y3 + (v4Var.f21808f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f21813l.setAlpha(f11);
                v4Var.f21811j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21660b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f21661c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f21810i.setX(y10 + (v4Var2.f21808f.getWidth() - this.d));
                v4Var2.f21813l.setAlpha(f7);
                v4Var2.f21811j.setAlpha(f7);
                return;
        }
    }
}
