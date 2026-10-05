package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class n4 extends Animation {
    public final int f21433a;
    public final float f21434b;
    public final float f21435c;
    public final int d;
    public final u4 f21436e;

    public n4(u4 u4Var, float f7, float f10, int i10, int i11) {
        this.f21433a = i11;
        this.f21436e = u4Var;
        this.f21434b = f7;
        this.f21435c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21433a) {
            case 0:
                float f10 = this.f21434b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f21435c, f10, f7, f10);
                u4 u4Var = this.f21436e;
                u4Var.f21552i.setX(z10 + (u4Var.f21550f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                u4Var.f21555l.setAlpha(f11);
                u4Var.f21553j.setAlpha(f11);
                return;
            default:
                float f12 = this.f21434b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f21435c, f12, f7, f12);
                u4 u4Var2 = this.f21436e;
                u4Var2.f21552i.setX(z11 + (u4Var2.f21550f.getWidth() - this.d));
                u4Var2.f21555l.setAlpha(f7);
                u4Var2.f21553j.setAlpha(f7);
                return;
        }
    }
}
