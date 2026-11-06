package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class b4 extends Animation {
    public final int f27340a;
    public final int f27341b;
    public final int f27342c;
    public final float d;
    public final i4 f27343e;

    public b4(i4 i4Var, int i7, int i10, float f10, float f11, int i11) {
        this.f27340a = i11;
        this.f27343e = i4Var;
        this.f27341b = i7;
        this.f27342c = i10;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f27340a) {
            case 0:
                int i7 = this.f27341b;
                int i10 = this.f27342c;
                i4 i4Var = this.f27343e;
                RelativeLayout relativeLayout = i4Var.f27567f;
                i4.l(relativeLayout, relativeLayout.getLayoutParams().width, i10 + ((int) (f10 * (i7 - i10))));
                if (i4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    i4.a(i4Var);
                    return;
                }
                return;
            case 1:
                int i11 = this.f27341b;
                int i12 = this.f27342c;
                i4 i4Var2 = this.f27343e;
                RelativeLayout relativeLayout2 = i4Var2.f27567f;
                i4.l(relativeLayout2, ((int) (f10 * (i11 - i12))) + i12, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                i4Var2.f27568g.setX(relativeLayout2.getWidth() - i12);
                i4Var2.h.setX(relativeLayout2.getWidth() - i11);
                return;
            case 2:
                int i13 = this.f27341b;
                int i14 = this.f27342c;
                i4 i4Var3 = this.f27343e;
                RelativeLayout relativeLayout3 = i4Var3.f27567f;
                i4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i13 - i14))) + i14);
                if (i4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i14));
                    i4.a(i4Var3);
                    return;
                }
                return;
            default:
                int i15 = this.f27341b;
                int i16 = this.f27342c;
                i4 i4Var4 = this.f27343e;
                RelativeLayout relativeLayout4 = i4Var4.f27567f;
                i4.l(relativeLayout4, ((int) (f10 * (i15 - i16))) + i16, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                i4Var4.f27568g.setX(relativeLayout4.getWidth() - i15);
                i4Var4.h.setX(relativeLayout4.getWidth() - i16);
                return;
        }
    }

    public b4(i4 i4Var, int i7, int i10, float f10, int i11) {
        this.f27340a = i11;
        this.f27343e = i4Var;
        this.f27341b = i7;
        this.f27342c = i10;
        this.d = f10;
    }
}
