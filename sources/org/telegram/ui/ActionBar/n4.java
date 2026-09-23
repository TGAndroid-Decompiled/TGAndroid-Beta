package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f19422a;
    public final float f19423b;
    public final float f19424c;
    public final int d;
    public final u4 e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f19422a = i11;
        this.e = u4Var;
        this.f19423b = f7;
        this.f19424c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19422a) {
            case 0:
                float f10 = this.f19423b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19424c, f10, f7, f10);
                u4 u4Var = this.e;
                u4Var.f19536i.setX(z10 + (u4Var.f19534f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f19539l.setAlpha(f11);
                u4Var.f19537j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19423b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19424c, f12, f7, f12);
                u4 u4Var2 = this.e;
                u4Var2.f19536i.setX(z11 + (u4Var2.f19534f.getWidth() - this.d));
                u4Var2.f19539l.setAlpha(f7);
                u4Var2.f19537j.setAlpha(f7);
                return;
        }
    }
}
