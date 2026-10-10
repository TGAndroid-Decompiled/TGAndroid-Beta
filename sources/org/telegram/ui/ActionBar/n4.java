package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21435a;
    public final float f21436b;
    public final float f21437c;
    public final int d;
    public final u4 f21438e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21435a = i11;
        this.f21438e = u4Var;
        this.f21436b = f7;
        this.f21437c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21435a) {
            case 0:
                float f10 = this.f21436b;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.f21437c, f10, f7, f10);
                u4 u4Var = this.f21438e;
                u4Var.f21560i.setX(y3 + (u4Var.f21558f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21563l.setAlpha(f11);
                u4Var.f21561j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21436b;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.f21437c, f12, f7, f12);
                u4 u4Var2 = this.f21438e;
                u4Var2.f21560i.setX(y10 + (u4Var2.f21558f.getWidth() - this.d));
                u4Var2.f21563l.setAlpha(f7);
                u4Var2.f21561j.setAlpha(f7);
                return;
        }
    }
}
