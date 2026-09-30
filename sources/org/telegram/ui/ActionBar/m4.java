package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f19667a;
    public final float f19668b;
    public final float f19669c;
    public final int d;
    public final t4 e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f19667a = i11;
        this.e = t4Var;
        this.f19668b = f7;
        this.f19669c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19667a) {
            case 0:
                float f10 = this.f19668b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19669c, f10, f7, f10);
                t4 t4Var = this.e;
                t4Var.f19780i.setX(z10 + (t4Var.f19778f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f19783l.setAlpha(f11);
                t4Var.f19781j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19668b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19669c, f12, f7, f12);
                t4 t4Var2 = this.e;
                t4Var2.f19780i.setX(z11 + (t4Var2.f19778f.getWidth() - this.d));
                t4Var2.f19783l.setAlpha(f7);
                t4Var2.f19781j.setAlpha(f7);
                return;
        }
    }
}
