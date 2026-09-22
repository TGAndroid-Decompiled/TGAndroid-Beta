package org.telegram.ui.ActionBar;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
public final class n4 extends Animation {
    public final int f19444a;
    public final int f19445b;
    public final int f19446c;
    public final float d;
    public final v4 e;

    public n4(v4 v4Var, int i10, int i11, float f7, float f10, int i12) {
        this.f19444a = i12;
        this.e = v4Var;
        this.f19445b = i10;
        this.f19446c = i11;
        this.d = f10;
    }

    @Override
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f19444a) {
            case 0:
                int i10 = this.f19445b;
                int i11 = this.f19446c;
                v4 v4Var = this.e;
                RelativeLayout relativeLayout = v4Var.f19609f;
                v4.l(relativeLayout, relativeLayout.getLayoutParams().width, i11 + ((int) (f7 * (i10 - i11))));
                if (v4Var.M) {
                    relativeLayout.setY(this.d - relativeLayout.getHeight());
                    v4.a(v4Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f19445b;
                int i13 = this.f19446c;
                v4 v4Var2 = this.e;
                RelativeLayout relativeLayout2 = v4Var2.f19609f;
                v4.l(relativeLayout2, ((int) (f7 * (i12 - i13))) + i13, relativeLayout2.getLayoutParams().height);
                relativeLayout2.setX(this.d - relativeLayout2.getWidth());
                v4Var2.f19610g.setX(relativeLayout2.getWidth() - i13);
                v4Var2.h.setX(relativeLayout2.getWidth() - i12);
                return;
            case 2:
                int i14 = this.f19445b;
                int i15 = this.f19446c;
                v4 v4Var3 = this.e;
                RelativeLayout relativeLayout3 = v4Var3.f19609f;
                v4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, ((int) (f7 * (i14 - i15))) + i15);
                if (v4Var3.M) {
                    relativeLayout3.setY(this.d - (relativeLayout3.getHeight() - i15));
                    v4.a(v4Var3);
                    return;
                }
                return;
            default:
                int i16 = this.f19445b;
                int i17 = this.f19446c;
                v4 v4Var4 = this.e;
                RelativeLayout relativeLayout4 = v4Var4.f19609f;
                v4.l(relativeLayout4, ((int) (f7 * (i16 - i17))) + i17, relativeLayout4.getLayoutParams().height);
                relativeLayout4.setX(this.d - relativeLayout4.getWidth());
                v4Var4.f19610g.setX(relativeLayout4.getWidth() - i16);
                v4Var4.h.setX(relativeLayout4.getWidth() - i17);
                return;
        }
    }

    public n4(v4 v4Var, int i10, int i11, float f7, int i12) {
        this.f19444a = i12;
        this.e = v4Var;
        this.f19445b = i10;
        this.f19446c = i11;
        this.d = f7;
    }
}
