package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class l4 extends Animation {
    public final int f21389a;
    public final int f21390b;
    public final int f21391c;
    public final float d;
    public final t4 f21392e;

    public l4(t4 t4Var, int i10, int i11, float f7, float f10, int i12) {
        this.f21389a = i12;
        this.f21392e = t4Var;
        this.f21390b = i10;
        this.f21391c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f21389a) {
            case 0:
                int i10 = this.f21390b;
                int i11 = this.f21391c;
                t4 t4Var = this.f21392e;
                RelativeLayout relativeLayout = t4Var.f21542f;
                t4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f7 * (i10 - i11))));
                if (t4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    t4.a(t4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f21390b;
                int i13 = this.f21391c;
                t4 t4Var2 = this.f21392e;
                RelativeLayout relativeLayout2 = t4Var2.f21542f;
                t4.l(relativeLayout2, ((int) (f7 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                t4Var2.f21543g.setX(relativeLayout2.getWidth() - i13);
                t4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f21390b;
                int i15 = this.f21391c;
                t4 t4Var3 = this.f21392e;
                RelativeLayout relativeLayout3 = t4Var3.f21542f;
                t4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f7 * (i14 - i15))) + i15);
                if (t4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    t4.a(t4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f21390b;
                int i17 = this.f21391c;
                t4 t4Var4 = this.f21392e;
                RelativeLayout relativeLayout4 = t4Var4.f21542f;
                t4.l(relativeLayout4, ((int) (f7 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                t4Var4.f21543g.setX(relativeLayout4.getWidth() - i16);
                t4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public l4(t4 t4Var, int i10, int i11, float f7, int i12) {
        this.f21389a = i12;
        this.f21392e = t4Var;
        this.f21390b = i10;
        this.f21391c = i11;
        this.d = f7;
    }
}
