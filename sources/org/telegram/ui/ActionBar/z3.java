package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class z3 extends Animation {
    public final int f29936a;
    public final int f29937b;
    public final int f29938c;
    public final float d;
    public final g4 f29939e;

    public z3(g4 g4Var, int i7, int i10, float f10, float f11, int i11) {
        this.f29936a = i11;
        this.f29939e = g4Var;
        this.f29937b = i7;
        this.f29938c = i10;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f29936a) {
            case 0:
                int i7 = this.f29937b;
                int i10 = this.f29938c;
                g4 g4Var = this.f29939e;
                RelativeLayout relativeLayout = g4Var.f28566f;
                g4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + ((int) (f10 * (i7 - i10))));
                if (g4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    g4.a(g4Var);
                    return;
                }
                return;
            case 1:
                int i11 = this.f29937b;
                int i12 = this.f29938c;
                g4 g4Var2 = this.f29939e;
                RelativeLayout relativeLayout2 = g4Var2.f28566f;
                g4.l(relativeLayout2, ((int) (f10 * (i11 - i12))) + i12, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                g4Var2.f28567g.setX(relativeLayout2.getWidth() - i12);
                g4Var2.h.setX(relativeLayout2.getWidth() - i11);
                return;
            case 2:
                int i13 = this.f29937b;
                int i14 = this.f29938c;
                g4 g4Var3 = this.f29939e;
                RelativeLayout relativeLayout3 = g4Var3.f28566f;
                g4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i13 - i14))) + i14);
                if (g4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i14));
                    g4.a(g4Var3);
                    return;
                }
                return;
            default:
                int i15 = this.f29937b;
                int i16 = this.f29938c;
                g4 g4Var4 = this.f29939e;
                RelativeLayout relativeLayout4 = g4Var4.f28566f;
                g4.l(relativeLayout4, ((int) (f10 * (i15 - i16))) + i16, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                g4Var4.f28567g.setX(relativeLayout4.getWidth() - i15);
                g4Var4.h.setX(relativeLayout4.getWidth() - i16);
                return;
        }
    }

    public z3(g4 g4Var, int i7, int i10, float f10, int i11) {
        this.f29936a = i11;
        this.f29939e = g4Var;
        this.f29937b = i7;
        this.f29938c = i10;
        this.d = f10;
    }
}
