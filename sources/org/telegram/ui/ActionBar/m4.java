package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
public final class m4 extends Animation {
    public final int f20536a;
    public final float f20537b;
    public final float f20538c;
    public final int d;
    public final t4 e;

    public m4(t4 t4Var, float f7, float f10, int i10, int i11) {
        this.f20536a = i11;
        this.e = t4Var;
        this.f20537b = f7;
        this.f20538c = f10;
        this.d = i10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f20536a) {
            case 0:
                float f10 = this.f20537b;
                float y3 = com.google.android.gms.internal.play_billing.k3.y(this.f20538c, f10, f7, f10);
                t4 t4Var = this.e;
                t4Var.f20650i.setX(y3 + (t4Var.f20648f.getWidth() - this.d));
                float f11 = 1.0f - f7;
                t4Var.f20653l.setAlpha(f11);
                t4Var.f20651j.setAlpha(f11);
                return;
            default:
                float f12 = this.f20537b;
                float y10 = com.google.android.gms.internal.play_billing.k3.y(this.f20538c, f12, f7, f12);
                t4 t4Var2 = this.e;
                t4Var2.f20650i.setX(y10 + (t4Var2.f20648f.getWidth() - this.d));
                t4Var2.f20653l.setAlpha(f7);
                t4Var2.f20651j.setAlpha(f7);
                return;
        }
    }
}
