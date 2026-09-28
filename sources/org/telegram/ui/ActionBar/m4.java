package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f19650a;
    public final float f19651b;
    public final float f19652c;
    public final int d;
    public final t4 e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f19650a = i11;
        this.e = t4Var;
        this.f19651b = f7;
        this.f19652c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19650a) {
            case 0:
                float f10 = this.f19651b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19652c, f10, f7, f10);
                t4 t4Var = this.e;
                t4Var.f19763i.setX(z10 + (t4Var.f19761f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f19766l.setAlpha(f11);
                t4Var.f19764j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19651b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19652c, f12, f7, f12);
                t4 t4Var2 = this.e;
                t4Var2.f19763i.setX(z11 + (t4Var2.f19761f.getWidth() - this.d));
                t4Var2.f19766l.setAlpha(f7);
                t4Var2.f19764j.setAlpha(f7);
                return;
        }
    }
}
