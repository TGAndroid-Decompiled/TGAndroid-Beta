package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f20236a;
    public final float f20237b;
    public final float f20238c;
    public final int d;
    public final t4 e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f20236a = i11;
        this.e = t4Var;
        this.f20237b = f7;
        this.f20238c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f20236a) {
            case 0:
                float f10 = this.f20237b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f20238c, f10, f7, f10);
                t4 t4Var = this.e;
                t4Var.f20350i.setX(y3 + (t4Var.f20348f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f20353l.setAlpha(f11);
                t4Var.f20351j.setAlpha(f11);
                return;
            default:
                float f12 = this.f20237b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f20238c, f12, f7, f12);
                t4 t4Var2 = this.e;
                t4Var2.f20350i.setX(y10 + (t4Var2.f20348f.getWidth() - this.d));
                t4Var2.f20353l.setAlpha(f7);
                t4Var2.f20351j.setAlpha(f7);
                return;
        }
    }
}
