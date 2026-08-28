package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f23668a;
    public final float f23669b;
    public final float f23670c;
    public final int d;
    public final t4 f23671e;

    public m4(t4 t4Var, float f10, float f11, int i9, int i10) {
        this.f23668a = i10;
        this.f23671e = t4Var;
        this.f23669b = f10;
        this.f23670c = f11;
        this.d = i9;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f23668a) {
            case 0:
                float f11 = this.f23669b;
                float z10 = e2.c.z(this.f23670c, f11, f10, f11);
                t4 t4Var = this.f23671e;
                t4Var.f23776i.setX(z10 + (t4Var.f23774f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                t4Var.f23779l.setAlpha(f12);
                t4Var.f23777j.setAlpha(f12);
                return;
            default:
                float f13 = this.f23669b;
                float z11 = e2.c.z(this.f23670c, f13, f10, f13);
                t4 t4Var2 = this.f23671e;
                t4Var2.f23776i.setX(z11 + (t4Var2.f23774f.getWidth() - this.d));
                t4Var2.f23779l.setAlpha(f10);
                t4Var2.f23777j.setAlpha(f10);
                return;
        }
    }
}
