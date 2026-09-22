package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class o4 extends Animation {
    public final int f19466a;
    public final float f19467b;
    public final float f19468c;
    public final int d;
    public final v4 e;

    public o4(v4 v4Var, float f7, float f10, int i10, int i11) {
        this.f19466a = i11;
        this.e = v4Var;
        this.f19467b = f7;
        this.f19468c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19466a) {
            case 0:
                float f10 = this.f19467b;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.f19468c, f10, f7, f10);
                v4 v4Var = this.e;
                v4Var.f19611i.setX(z10 + (v4Var.f19609f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                v4Var.f19614l.setAlpha(f11);
                v4Var.f19612j.setAlpha(f11);
                return;
            default:
                float f12 = this.f19467b;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.f19468c, f12, f7, f12);
                v4 v4Var2 = this.e;
                v4Var2.f19611i.setX(z11 + (v4Var2.f19609f.getWidth() - this.d));
                v4Var2.f19614l.setAlpha(f7);
                v4Var2.f19612j.setAlpha(f7);
                return;
        }
    }
}
