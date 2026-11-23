package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class c4 extends Animation {
    public final int f28906a;
    public final int f28907b;
    public final int f28908c;
    public final float d;
    public final j4 f28909e;

    public c4(j4 j4Var, int i7, int i10, float f10, float f11, int i11) {
        this.f28906a = i11;
        this.f28909e = j4Var;
        this.f28907b = i7;
        this.f28908c = i10;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28906a) {
            case 0:
                int i7 = this.f28907b;
                int i10 = this.f28908c;
                j4 j4Var = this.f28909e;
                RelativeLayout relativeLayout = j4Var.f29107f;
                j4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + ((int) (f10 * (i7 - i10))));
                if (j4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    j4.a(j4Var);
                    return;
                }
                return;
            case 1:
                int i11 = this.f28907b;
                int i12 = this.f28908c;
                j4 j4Var2 = this.f28909e;
                RelativeLayout relativeLayout2 = j4Var2.f29107f;
                j4.l(relativeLayout2, ((int) (f10 * (i11 - i12))) + i12, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                j4Var2.f29108g.setX(relativeLayout2.getWidth() - i12);
                j4Var2.h.setX(relativeLayout2.getWidth() - i11);
                return;
            case 2:
                int i13 = this.f28907b;
                int i14 = this.f28908c;
                j4 j4Var3 = this.f28909e;
                RelativeLayout relativeLayout3 = j4Var3.f29107f;
                j4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i13 - i14))) + i14);
                if (j4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i14));
                    j4.a(j4Var3);
                    return;
                }
                return;
            default:
                int i15 = this.f28907b;
                int i16 = this.f28908c;
                j4 j4Var4 = this.f28909e;
                RelativeLayout relativeLayout4 = j4Var4.f29107f;
                j4.l(relativeLayout4, ((int) (f10 * (i15 - i16))) + i16, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                j4Var4.f29108g.setX(relativeLayout4.getWidth() - i15);
                j4Var4.h.setX(relativeLayout4.getWidth() - i16);
                return;
        }
    }

    public c4(j4 j4Var, int i7, int i10, float f10, int i11) {
        this.f28906a = i11;
        this.f28909e = j4Var;
        this.f28907b = i7;
        this.f28908c = i10;
        this.d = f10;
    }
}
