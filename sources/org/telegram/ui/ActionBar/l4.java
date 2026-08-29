package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class l4 extends Animation {
    public final int f23664a;
    public final int f23665b;
    public final int f23666c;
    public final float d;
    public final t4 f23667e;

    public l4(t4 t4Var, int i10, int i11, float f9, float f10, int i12) {
        this.f23664a = i12;
        this.f23667e = t4Var;
        this.f23665b = i10;
        this.f23666c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f9, Transformation transformation) {
        switch (this.f23664a) {
            case 0:
                int i10 = this.f23665b;
                int i11 = this.f23666c;
                t4 t4Var = this.f23667e;
                RelativeLayout relativeLayout = t4Var.f23796f;
                t4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f9 * (i10 - i11))));
                if (t4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    t4.a(t4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f23665b;
                int i13 = this.f23666c;
                t4 t4Var2 = this.f23667e;
                RelativeLayout relativeLayout2 = t4Var2.f23796f;
                t4.l(relativeLayout2, ((int) (f9 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                t4Var2.f23797g.setX(relativeLayout2.getWidth() - i13);
                t4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f23665b;
                int i15 = this.f23666c;
                t4 t4Var3 = this.f23667e;
                RelativeLayout relativeLayout3 = t4Var3.f23796f;
                t4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f9 * (i14 - i15))) + i15);
                if (t4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    t4.a(t4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f23665b;
                int i17 = this.f23666c;
                t4 t4Var4 = this.f23667e;
                RelativeLayout relativeLayout4 = t4Var4.f23796f;
                t4.l(relativeLayout4, ((int) (f9 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                t4Var4.f23797g.setX(relativeLayout4.getWidth() - i16);
                t4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public l4(t4 t4Var, int i10, int i11, float f9, int i12) {
        this.f23664a = i12;
        this.f23667e = t4Var;
        this.f23665b = i10;
        this.f23666c = i11;
        this.d = f9;
    }
}
