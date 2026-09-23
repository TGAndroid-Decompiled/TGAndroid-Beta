package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class m4 extends Animation {
    public final int f19392a;
    public final int f19393b;
    public final int f19394c;
    public final float d;
    public final u4 e;

    public m4(u4 u4Var, int i10, int i11, float f7, float f10, int i12) {
        this.f19392a = i12;
        this.e = u4Var;
        this.f19393b = i10;
        this.f19394c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19392a) {
            case 0:
                int i10 = this.f19393b;
                int i11 = this.f19394c;
                u4 u4Var = this.e;
                RelativeLayout relativeLayout = u4Var.f19534f;
                u4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f7 * (i10 - i11))));
                if (u4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    u4.a(u4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f19393b;
                int i13 = this.f19394c;
                u4 u4Var2 = this.e;
                RelativeLayout relativeLayout2 = u4Var2.f19534f;
                u4.l(relativeLayout2, ((int) (f7 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                u4Var2.f19535g.setX(relativeLayout2.getWidth() - i13);
                u4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f19393b;
                int i15 = this.f19394c;
                u4 u4Var3 = this.e;
                RelativeLayout relativeLayout3 = u4Var3.f19534f;
                u4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f7 * (i14 - i15))) + i15);
                if (u4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    u4.a(u4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f19393b;
                int i17 = this.f19394c;
                u4 u4Var4 = this.e;
                RelativeLayout relativeLayout4 = u4Var4.f19534f;
                u4.l(relativeLayout4, ((int) (f7 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                u4Var4.f19535g.setX(relativeLayout4.getWidth() - i16);
                u4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public m4(u4 u4Var, int i10, int i11, float f7, int i12) {
        this.f19392a = i12;
        this.e = u4Var;
        this.f19393b = i10;
        this.f19394c = i11;
        this.d = f7;
    }
}
