package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

public final class l4 extends Animation {

    public final int f23646a;

    public final int f23647b;

    public final int f23648c;
    public final float d;

    public final t4 f23649e;

    public l4(t4 t4Var, int i10, int i11, float f10, float f11, int i12) {
        this.f23646a = i12;
        this.f23649e = t4Var;
        this.f23647b = i10;
        this.f23648c = i11;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f23646a) {
            case 0:
                int i10 = this.f23647b;
                int i11 = this.f23648c;
                int i12 = (int) (f10 * (i10 - i11));
                t4 t4Var = this.f23649e;
                RelativeLayout relativeLayout = t4Var.f23786f;
                t4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + i12);
                if (t4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    t4.a(t4Var);
                }
                break;
            case 1:
                int i13 = this.f23647b;
                int i14 = this.f23648c;
                t4 t4Var2 = this.f23649e;
                RelativeLayout relativeLayout2 = t4Var2.f23786f;
                t4.l(relativeLayout2, ((int) (f10 * (i13 - i14))) + i14, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                t4Var2.f23787g.setX(relativeLayout2.getWidth() - i14);
                t4Var2.h.setX(relativeLayout2.getWidth() - i13);
                break;
            case 2:
                int i15 = this.f23647b;
                int i16 = this.f23648c;
                int i17 = (int) (f10 * (i15 - i16));
                t4 t4Var3 = this.f23649e;
                RelativeLayout relativeLayout3 = t4Var3.f23786f;
                t4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i17 + i16);
                if (t4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i16));
                    t4.a(t4Var3);
                }
                break;
            default:
                int i18 = this.f23647b;
                int i19 = this.f23648c;
                t4 t4Var4 = this.f23649e;
                RelativeLayout relativeLayout4 = t4Var4.f23786f;
                t4.l(relativeLayout4, ((int) (f10 * (i18 - i19))) + i19, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                t4Var4.f23787g.setX(relativeLayout4.getWidth() - i18);
                t4Var4.h.setX(relativeLayout4.getWidth() - i19);
                break;
        }
    }

    public l4(t4 t4Var, int i10, int i11, float f10, int i12) {
        this.f23646a = i12;
        this.f23649e = t4Var;
        this.f23647b = i10;
        this.f23648c = i11;
        this.d = f10;
    }
}
