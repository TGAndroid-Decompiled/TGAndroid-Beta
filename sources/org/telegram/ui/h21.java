package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class h21 implements Runnable {
    public final int f34113a;
    public final w21 f34114b;

    public h21(w21 w21Var, int i10) {
        this.f34113a = i10;
        this.f34114b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f34113a) {
            case 0:
                v21 v21Var = this.f34114b.f38875f;
                if (v21Var != null) {
                    v21Var.f38614s.setClickable(true);
                    return;
                }
                return;
            case 1:
                w21 w21Var = this.f34114b;
                w21Var.d0(0, w21Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = w21Var.F.getAnimatedDrawable();
                if (w21Var.I == null && animatedDrawable != null) {
                    w21Var.I = Bitmap.createBitmap(animatedDrawable.f25717b, animatedDrawable.f25719c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(w21Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                w21 w21Var2 = this.f34114b;
                AndroidUtilities.runOnUIThread(new ix0(20, w21Var2, SvgHelper.getBitmap(i10, w21Var2.f38879w.getWidth(), w21Var2.f38879w.getHeight(), -16777216)));
                return;
            case 3:
                w21 w21Var3 = this.f34114b;
                o0.a aVar = w21Var3.f38872a;
                aVar.f15483b = w21Var3.J.b(((org.telegram.ui.ActionBar.m2) ((w21) aVar.f15484c)).currentAccount, w21Var3.K ? 1 : 0);
                return;
            case 4:
                w21.X(this.f34114b);
                return;
            default:
                w21.V(this.f34114b);
                return;
        }
    }
}
