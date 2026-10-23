package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class q4 extends Animation {
    public final int f21797a;
    public final int f21798b;
    public final int f21799c;
    public final float d;
    public final y4 e;

    public q4(y4 y4Var, int i10, int i11, float f7, float f10, int i12) {
        this.f21797a = i12;
        this.e = y4Var;
        this.f21798b = i10;
        this.f21799c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21797a) {
            case 0:
                int i10 = this.f21798b;
                int i11 = this.f21799c;
                y4 y4Var = this.e;
                RelativeLayout relativeLayout = y4Var.f21994f;
                y4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f7 * (i10 - i11))));
                if (y4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    y4.a(y4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f21798b;
                int i13 = this.f21799c;
                y4 y4Var2 = this.e;
                RelativeLayout relativeLayout2 = y4Var2.f21994f;
                y4.l(relativeLayout2, ((int) (f7 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                y4Var2.f21995g.setX(relativeLayout2.getWidth() - i13);
                y4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f21798b;
                int i15 = this.f21799c;
                y4 y4Var3 = this.e;
                RelativeLayout relativeLayout3 = y4Var3.f21994f;
                y4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f7 * (i14 - i15))) + i15);
                if (y4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    y4.a(y4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f21798b;
                int i17 = this.f21799c;
                y4 y4Var4 = this.e;
                RelativeLayout relativeLayout4 = y4Var4.f21994f;
                y4.l(relativeLayout4, ((int) (f7 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                y4Var4.f21995g.setX(relativeLayout4.getWidth() - i16);
                y4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public q4(y4 y4Var, int i10, int i11, float f7, int i12) {
        this.f21797a = i12;
        this.e = y4Var;
        this.f21798b = i10;
        this.f21799c = i11;
        this.d = f7;
    }
}
