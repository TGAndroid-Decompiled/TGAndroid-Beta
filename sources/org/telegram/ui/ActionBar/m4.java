package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f23688a;
    public final float f23689b;
    public final float f23690c;
    public final int d;
    public final t4 f23691e;

    public m4(t4 t4Var, float f9, float f10, int i10, int i11) {
        this.f23688a = i11;
        this.f23691e = t4Var;
        this.f23689b = f9;
        this.f23690c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f9, Transformation transformation) {
        switch (this.f23688a) {
            case 0:
                float f10 = this.f23689b;
                float z10 = com.google.android.recaptcha.internal.a.z(this.f23690c, f10, f9, f10);
                t4 t4Var = this.f23691e;
                t4Var.f23798i.setX(z10 + (t4Var.f23796f.getWidth() - this.d));
                float f11 = 1.0f - f9;
                t4Var.f23801l.setAlpha(f11);
                t4Var.f23799j.setAlpha(f11);
                return;
            default:
                float f12 = this.f23689b;
                float z11 = com.google.android.recaptcha.internal.a.z(this.f23690c, f12, f9, f12);
                t4 t4Var2 = this.f23691e;
                t4Var2.f23798i.setX(z11 + (t4Var2.f23796f.getWidth() - this.d));
                t4Var2.f23801l.setAlpha(f9);
                t4Var2.f23799j.setAlpha(f9);
                return;
        }
    }
}
