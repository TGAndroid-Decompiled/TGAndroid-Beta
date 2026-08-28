package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class l4 extends Animation {
    public final int f23642a;
    public final int f23643b;
    public final int f23644c;
    public final float d;
    public final t4 f23645e;

    public l4(t4 t4Var, int i9, int i10, float f10, float f11, int i11) {
        this.f23642a = i11;
        this.f23645e = t4Var;
        this.f23643b = i9;
        this.f23644c = i10;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f23642a) {
            case 0:
                int i9 = this.f23643b;
                int i10 = this.f23644c;
                t4 t4Var = this.f23645e;
                RelativeLayout relativeLayout = t4Var.f23774f;
                t4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + ((int) (f10 * (i9 - i10))));
                if (t4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    t4.a(t4Var);
                    return;
                }
                return;
            case 1:
                int i11 = this.f23643b;
                int i12 = this.f23644c;
                t4 t4Var2 = this.f23645e;
                RelativeLayout relativeLayout2 = t4Var2.f23774f;
                t4.l(relativeLayout2, ((int) (f10 * (i11 - i12))) + i12, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                t4Var2.f23775g.setX(relativeLayout2.getWidth() - i12);
                t4Var2.h.setX(relativeLayout2.getWidth() - i11);
                return;
            case 2:
                int i13 = this.f23643b;
                int i14 = this.f23644c;
                t4 t4Var3 = this.f23645e;
                RelativeLayout relativeLayout3 = t4Var3.f23774f;
                t4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i13 - i14))) + i14);
                if (t4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i14));
                    t4.a(t4Var3);
                    return;
                }
                return;
            default:
                int i15 = this.f23643b;
                int i16 = this.f23644c;
                t4 t4Var4 = this.f23645e;
                RelativeLayout relativeLayout4 = t4Var4.f23774f;
                t4.l(relativeLayout4, ((int) (f10 * (i15 - i16))) + i16, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                t4Var4.f23775g.setX(relativeLayout4.getWidth() - i15);
                t4Var4.h.setX(relativeLayout4.getWidth() - i16);
                return;
        }
    }

    public l4(t4 t4Var, int i9, int i10, float f10, int i11) {
        this.f23642a = i11;
        this.f23645e = t4Var;
        this.f23643b = i9;
        this.f23644c = i10;
        this.d = f10;
    }
}
