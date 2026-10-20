package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f21655a;
    public final float f21656b;
    public final float f21657c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f21655a = i11;
        this.e = v4Var;
        this.f21656b = f7;
        this.f21657c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21655a) {
            case 0:
                float f10 = this.f21656b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f21657c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f21806i.setX(y3 + (v4Var.f21804f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f21809l.setAlpha(f11);
                v4Var.f21807j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21656b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f21657c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f21806i.setX(y10 + (v4Var2.f21804f.getWidth() - this.d));
                v4Var2.f21809l.setAlpha(f7);
                v4Var2.f21807j.setAlpha(f7);
                return;
        }
    }
}
