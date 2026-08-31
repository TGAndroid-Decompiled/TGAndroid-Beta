package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class p4 extends Animation {
    public final int f22225a;
    public final int f22226b;
    public final int f22227c;
    public final float d;
    public final x4 f22228e;

    public p4(x4 x4Var, int i10, int i11, float f10, float f11, int i12) {
        this.f22225a = i12;
        this.f22228e = x4Var;
        this.f22226b = i10;
        this.f22227c = i11;
        this.d = f11;
    }

    @Override
    public final void applyTransformation(float f10, Transformation transformation) {
        switch (this.f22225a) {
            case 0:
                int i10 = this.f22226b;
                int i11 = this.f22227c;
                x4 x4Var = this.f22228e;
                RelativeLayout relativeLayout = x4Var.f22427f;
                x4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f10 * (i10 - i11))));
                if (x4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    x4.a(x4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f22226b;
                int i13 = this.f22227c;
                x4 x4Var2 = this.f22228e;
                RelativeLayout relativeLayout2 = x4Var2.f22427f;
                x4.l(relativeLayout2, ((int) (f10 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                x4Var2.f22428g.setX(relativeLayout2.getWidth() - i13);
                x4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f22226b;
                int i15 = this.f22227c;
                x4 x4Var3 = this.f22228e;
                RelativeLayout relativeLayout3 = x4Var3.f22427f;
                x4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f10 * (i14 - i15))) + i15);
                if (x4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    x4.a(x4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f22226b;
                int i17 = this.f22227c;
                x4 x4Var4 = this.f22228e;
                RelativeLayout relativeLayout4 = x4Var4.f22427f;
                x4.l(relativeLayout4, ((int) (f10 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                x4Var4.f22428g.setX(relativeLayout4.getWidth() - i16);
                x4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public p4(x4 x4Var, int i10, int i11, float f10, int i12) {
        this.f22225a = i12;
        this.f22228e = x4Var;
        this.f22226b = i10;
        this.f22227c = i11;
        this.d = f10;
    }
}
