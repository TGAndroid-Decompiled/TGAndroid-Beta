package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class o4 extends Animation {
    public final int f20478a;
    public final int f20479b;
    public final int f20480c;
    public final float d;
    public final w4 e;

    public o4(w4 w4Var, int i10, int i11, float f10, float f11, int i12) {
        this.f20478a = i12;
        this.e = w4Var;
        this.f20479b = i10;
        this.f20480c = i11;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f20478a) {
            case 0:
                int i10 = this.f20479b;
                int i11 = this.f20480c;
                w4 w4Var = this.e;
                RelativeLayout relativeLayout = w4Var.f20674f;
                w4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f10 * (i10 - i11))));
                if (w4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    w4.a(w4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f20479b;
                int i13 = this.f20480c;
                w4 w4Var2 = this.e;
                RelativeLayout relativeLayout2 = w4Var2.f20674f;
                w4.l(relativeLayout2, ((int) (f10 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                w4Var2.f20675g.setX(relativeLayout2.getWidth() - i13);
                w4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f20479b;
                int i15 = this.f20480c;
                w4 w4Var3 = this.e;
                RelativeLayout relativeLayout3 = w4Var3.f20674f;
                w4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i14 - i15))) + i15);
                if (w4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    w4.a(w4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f20479b;
                int i17 = this.f20480c;
                w4 w4Var4 = this.e;
                RelativeLayout relativeLayout4 = w4Var4.f20674f;
                w4.l(relativeLayout4, ((int) (f10 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                w4Var4.f20675g.setX(relativeLayout4.getWidth() - i16);
                w4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public o4(w4 w4Var, int i10, int i11, float f10, int i12) {
        this.f20478a = i12;
        this.e = w4Var;
        this.f20479b = i10;
        this.f20480c = i11;
        this.d = f10;
    }
}
