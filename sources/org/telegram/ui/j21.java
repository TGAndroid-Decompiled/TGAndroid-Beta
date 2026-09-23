package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class j21 implements Runnable {
    public final int f34314a;
    public final x21 f34315b;

    public j21(x21 x21Var, int i10) {
        this.f34314a = i10;
        this.f34315b = x21Var;
    }

    @Override
    public final void run() {
        switch (this.f34314a) {
            case 0:
                w21 w21Var = this.f34315b.f39172f;
                if (w21Var != null) {
                    w21Var.f38521s.setClickable(true);
                    return;
                }
                return;
            case 1:
                x21 x21Var = this.f34315b;
                x21Var.d0(0, x21Var.J, true);
                org.telegram.ui.Components.yi0 animatedDrawable = x21Var.F.getAnimatedDrawable();
                if (x21Var.I == null && animatedDrawable != null) {
                    x21Var.I = Bitmap.createBitmap(animatedDrawable.f30259b, animatedDrawable.f30261c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(x21Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                x21 x21Var2 = this.f34315b;
                AndroidUtilities.runOnUIThread(new by0(14, x21Var2, SvgHelper.getBitmap(i10, x21Var2.f39176w.getWidth(), x21Var2.f39176w.getHeight(), -16777216)));
                return;
            case 3:
                x21 x21Var3 = this.f34315b;
                o0.a aVar = x21Var3.f39169a;
                aVar.f15275b = x21Var3.J.b(((org.telegram.ui.ActionBar.n2) ((x21) aVar.f15276c)).currentAccount, x21Var3.K ? 1 : 0);
                return;
            case 4:
                x21.X(this.f34315b);
                return;
            default:
                x21.V(this.f34315b);
                return;
        }
    }
}
