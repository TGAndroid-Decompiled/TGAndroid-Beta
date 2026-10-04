package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21429a;
    public final float f21430b;
    public final float f21431c;
    public final int d;
    public final u4 f21432e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21429a = i11;
        this.f21432e = u4Var;
        this.f21430b = f7;
        this.f21431c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21429a) {
            case 0:
                float f10 = this.f21430b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21431c, f10, f7, f10);
                u4 u4Var = this.f21432e;
                u4Var.f21548i.setX(z10 + (u4Var.f21546f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21551l.setAlpha(f11);
                u4Var.f21549j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21430b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21431c, f12, f7, f12);
                u4 u4Var2 = this.f21432e;
                u4Var2.f21548i.setX(z11 + (u4Var2.f21546f.getWidth() - this.d));
                u4Var2.f21551l.setAlpha(f7);
                u4Var2.f21549j.setAlpha(f7);
                return;
        }
    }
}
