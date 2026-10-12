package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f21162a;
    public final float f21163b;
    public final float f21164c;
    public final int d;
    public final t4 f21165e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f21162a = i11;
        this.f21165e = t4Var;
        this.f21163b = f7;
        this.f21164c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21162a) {
            case 0:
                float f10 = this.f21163b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21164c, f10, f7, f10);
                t4 t4Var = this.f21165e;
                t4Var.f21282i.setX(y3 + (t4Var.f21280f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f21285l.setAlpha(f11);
                t4Var.f21283j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21163b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21164c, f12, f7, f12);
                t4 t4Var2 = this.f21165e;
                t4Var2.f21282i.setX(y10 + (t4Var2.f21280f.getWidth() - this.d));
                t4Var2.f21285l.setAlpha(f7);
                t4Var2.f21283j.setAlpha(f7);
                return;
        }
    }
}
