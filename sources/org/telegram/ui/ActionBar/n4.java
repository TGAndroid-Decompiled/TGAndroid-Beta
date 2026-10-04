package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21424a;
    public final float f21425b;
    public final float f21426c;
    public final int d;
    public final u4 f21427e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21424a = i11;
        this.f21427e = u4Var;
        this.f21425b = f7;
        this.f21426c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21424a) {
            case 0:
                float f10 = this.f21425b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21426c, f10, f7, f10);
                u4 u4Var = this.f21427e;
                u4Var.f21543i.setX(z10 + (u4Var.f21541f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21546l.setAlpha(f11);
                u4Var.f21544j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21425b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21426c, f12, f7, f12);
                u4 u4Var2 = this.f21427e;
                u4Var2.f21543i.setX(z11 + (u4Var2.f21541f.getWidth() - this.d));
                u4Var2.f21546l.setAlpha(f7);
                u4Var2.f21544j.setAlpha(f7);
                return;
        }
    }
}
