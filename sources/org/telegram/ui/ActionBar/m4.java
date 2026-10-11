package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f21388a;
    public final float f21389b;
    public final float f21390c;
    public final int d;
    public final t4 f21391e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f21388a = i11;
        this.f21391e = t4Var;
        this.f21389b = f7;
        this.f21390c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21388a) {
            case 0:
                float f10 = this.f21389b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21390c, f10, f7, f10);
                t4 t4Var = this.f21391e;
                t4Var.f21508i.setX(y3 + (t4Var.f21506f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f21511l.setAlpha(f11);
                t4Var.f21509j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21389b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21390c, f12, f7, f12);
                t4 t4Var2 = this.f21391e;
                t4Var2.f21508i.setX(y10 + (t4Var2.f21506f.getWidth() - this.d));
                t4Var2.f21511l.setAlpha(f7);
                t4Var2.f21509j.setAlpha(f7);
                return;
        }
    }
}
