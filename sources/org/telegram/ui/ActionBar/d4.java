package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class d4 extends Animation {
    public final int f28857a;
    public final int f28858b;
    public final int f28859c;
    public final float d;
    public final k4 f28860e;

    public d4(k4 k4Var, int i7, int i10, float f10, float f11, int i11) {
        this.f28857a = i11;
        this.f28860e = k4Var;
        this.f28858b = i7;
        this.f28859c = i10;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f28857a) {
            case 0:
                int i7 = this.f28858b;
                int i10 = this.f28859c;
                k4 k4Var = this.f28860e;
                RelativeLayout relativeLayout = k4Var.f29126f;
                k4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + ((int) (f10 * (i7 - i10))));
                if (k4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    k4.a(k4Var);
                    return;
                }
                return;
            case 1:
                int i11 = this.f28858b;
                int i12 = this.f28859c;
                k4 k4Var2 = this.f28860e;
                RelativeLayout relativeLayout2 = k4Var2.f29126f;
                k4.l(relativeLayout2, ((int) (f10 * (i11 - i12))) + i12, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                k4Var2.f29127g.setX(relativeLayout2.getWidth() - i12);
                k4Var2.h.setX(relativeLayout2.getWidth() - i11);
                return;
            case 2:
                int i13 = this.f28858b;
                int i14 = this.f28859c;
                k4 k4Var3 = this.f28860e;
                RelativeLayout relativeLayout3 = k4Var3.f29126f;
                k4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i13 - i14))) + i14);
                if (k4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i14));
                    k4.a(k4Var3);
                    return;
                }
                return;
            default:
                int i15 = this.f28858b;
                int i16 = this.f28859c;
                k4 k4Var4 = this.f28860e;
                RelativeLayout relativeLayout4 = k4Var4.f29126f;
                k4.l(relativeLayout4, ((int) (f10 * (i15 - i16))) + i16, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                k4Var4.f29127g.setX(relativeLayout4.getWidth() - i15);
                k4Var4.h.setX(relativeLayout4.getWidth() - i16);
                return;
        }
    }

    public d4(k4 k4Var, int i7, int i10, float f10, int i11) {
        this.f28857a = i11;
        this.f28860e = k4Var;
        this.f28858b = i7;
        this.f28859c = i10;
        this.d = f10;
    }
}
