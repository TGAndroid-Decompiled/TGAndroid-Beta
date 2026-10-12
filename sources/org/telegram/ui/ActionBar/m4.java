package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f21163a;
    public final float f21164b;
    public final float f21165c;
    public final int d;
    public final t4 f21166e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f21163a = i11;
        this.f21166e = t4Var;
        this.f21164b = f7;
        this.f21165c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21163a) {
            case 0:
                float f10 = this.f21164b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21165c, f10, f7, f10);
                t4 t4Var = this.f21166e;
                t4Var.f21283i.setX(y3 + (t4Var.f21281f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f21286l.setAlpha(f11);
                t4Var.f21284j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21164b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21165c, f12, f7, f12);
                t4 t4Var2 = this.f21166e;
                t4Var2.f21283i.setX(y10 + (t4Var2.f21281f.getWidth() - this.d));
                t4Var2.f21286l.setAlpha(f7);
                t4Var2.f21284j.setAlpha(f7);
                return;
        }
    }
}
