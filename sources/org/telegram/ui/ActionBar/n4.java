package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21431a;
    public final float f21432b;
    public final float f21433c;
    public final int d;
    public final u4 f21434e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21431a = i11;
        this.f21434e = u4Var;
        this.f21432b = f7;
        this.f21433c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21431a) {
            case 0:
                float f10 = this.f21432b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21433c, f10, f7, f10);
                u4 u4Var = this.f21434e;
                u4Var.f21556i.setX(y3 + (u4Var.f21554f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21559l.setAlpha(f11);
                u4Var.f21557j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21432b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21433c, f12, f7, f12);
                u4 u4Var2 = this.f21434e;
                u4Var2.f21556i.setX(y10 + (u4Var2.f21554f.getWidth() - this.d));
                u4Var2.f21559l.setAlpha(f7);
                u4Var2.f21557j.setAlpha(f7);
                return;
        }
    }
}
