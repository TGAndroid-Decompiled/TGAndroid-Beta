package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class m4 extends Animation {

    public final int f23668a;

    public final float f23669b;

    public final float f23670c;
    public final int d;

    public final t4 f23671e;

    public m4(t4 t4Var, float f10, float f11, int i10, int i11) {
        this.f23668a = i11;
        this.f23671e = t4Var;
        this.f23669b = f10;
        this.f23670c = f11;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f23668a) {
            case 0:
                float f11 = this.f23669b;
                float fZ = com.google.android.recaptcha.internal.a.z(this.f23670c, f11, f10, f11);
                t4 t4Var = this.f23671e;
                t4Var.f23788i.setX(fZ + (t4Var.f23786f.getWidth() - this.d));
                float f12 = 1.0f - f10;
                t4Var.f23791l.setAlpha(f12);
                t4Var.f23789j.setAlpha(f12);
                break;
            default:
                float f13 = this.f23669b;
                float fZ2 = com.google.android.recaptcha.internal.a.z(this.f23670c, f13, f10, f13);
                t4 t4Var2 = this.f23671e;
                t4Var2.f23788i.setX(fZ2 + (t4Var2.f23786f.getWidth() - this.d));
                t4Var2.f23791l.setAlpha(f10);
                t4Var2.f23789j.setAlpha(f10);
                break;
        }
    }
}
