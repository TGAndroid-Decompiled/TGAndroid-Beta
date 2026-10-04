package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21425a;
    public final float f21426b;
    public final float f21427c;
    public final int d;
    public final u4 f21428e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21425a = i11;
        this.f21428e = u4Var;
        this.f21426b = f7;
        this.f21427c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21425a) {
            case 0:
                float f10 = this.f21426b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21427c, f10, f7, f10);
                u4 u4Var = this.f21428e;
                u4Var.f21544i.setX(z10 + (u4Var.f21542f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21547l.setAlpha(f11);
                u4Var.f21545j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21426b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21427c, f12, f7, f12);
                u4 u4Var2 = this.f21428e;
                u4Var2.f21544i.setX(z11 + (u4Var2.f21542f.getWidth() - this.d));
                u4Var2.f21547l.setAlpha(f7);
                u4Var2.f21545j.setAlpha(f7);
                return;
        }
    }
}
