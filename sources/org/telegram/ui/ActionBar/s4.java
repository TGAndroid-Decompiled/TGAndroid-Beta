package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class s4 extends Animation {
    public final int f23080a;
    public final int f23081b;
    public final int f23082c;
    public final float d;
    public final a5 e;

    public s4(a5 a5Var, int i10, int i11, float f7, float f10, int i12) {
        this.f23080a = i12;
        this.e = a5Var;
        this.f23081b = i10;
        this.f23082c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f23080a) {
            case 0:
                int i10 = this.f23081b;
                int i11 = this.f23082c;
                a5 a5Var = this.e;
                RelativeLayout relativeLayout = a5Var.f22398f;
                a5.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f7 * (i10 - i11))));
                if (a5Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    a5.a(a5Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f23081b;
                int i13 = this.f23082c;
                a5 a5Var2 = this.e;
                RelativeLayout relativeLayout2 = a5Var2.f22398f;
                a5.l(relativeLayout2, ((int) (f7 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                a5Var2.f22399g.setX(relativeLayout2.getWidth() - i13);
                a5Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f23081b;
                int i15 = this.f23082c;
                a5 a5Var3 = this.e;
                RelativeLayout relativeLayout3 = a5Var3.f22398f;
                a5.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f7 * (i14 - i15))) + i15);
                if (a5Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    a5.a(a5Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f23081b;
                int i17 = this.f23082c;
                a5 a5Var4 = this.e;
                RelativeLayout relativeLayout4 = a5Var4.f22398f;
                a5.l(relativeLayout4, ((int) (f7 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                a5Var4.f22399g.setX(relativeLayout4.getWidth() - i16);
                a5Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public s4(a5 a5Var, int i10, int i11, float f7, int i12) {
        this.f23080a = i12;
        this.e = a5Var;
        this.f23081b = i10;
        this.f23082c = i11;
        this.d = f7;
    }
}
