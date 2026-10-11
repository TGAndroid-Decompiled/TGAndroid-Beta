package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f21424a;
    public final float f21425b;
    public final float f21426c;
    public final int d;
    public final t4 f21427e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f21424a = i11;
        this.f21427e = t4Var;
        this.f21425b = f7;
        this.f21426c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21424a) {
            case 0:
                float f10 = this.f21425b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21426c, f10, f7, f10);
                t4 t4Var = this.f21427e;
                t4Var.f21544i.setX(y3 + (t4Var.f21542f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f21547l.setAlpha(f11);
                t4Var.f21545j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21425b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21426c, f12, f7, f12);
                t4 t4Var2 = this.f21427e;
                t4Var2.f21544i.setX(y10 + (t4Var2.f21542f.getWidth() - this.d));
                t4Var2.f21547l.setAlpha(f7);
                t4Var2.f21545j.setAlpha(f7);
                return;
        }
    }
}
