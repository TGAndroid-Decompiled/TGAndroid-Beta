package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class j21 implements Runnable {
    public final int f37557a;
    public final y21 f37558b;

    public j21(y21 y21Var, int i10) {
        this.f37557a = i10;
        this.f37558b = y21Var;
    }

    @Override
    public final void run() {
        switch (this.f37557a) {
            case 0:
                x21 x21Var = this.f37558b.f43090f;
                if (x21Var != null) {
                    x21Var.f42805s.setClickable(true);
                    return;
                }
                return;
            case 1:
                y21 y21Var = this.f37558b;
                y21Var.d0(0, y21Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = y21Var.F.getAnimatedDrawable();
                if (y21Var.I == null && animatedDrawable != null) {
                    y21Var.I = Bitmap.createBitmap(animatedDrawable.f28211b, animatedDrawable.f28213c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(y21Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                y21 y21Var2 = this.f37558b;
                AndroidUtilities.runOnUIThread(new wx0(17, y21Var2, SvgHelper.getBitmap(i10, y21Var2.f43094w.getWidth(), y21Var2.f43094w.getHeight(), -16777216)));
                return;
            case 3:
                y21 y21Var3 = this.f37558b;
                o0.a aVar = y21Var3.f43086a;
                aVar.f16937b = y21Var3.J.b(((org.telegram.ui.ActionBar.n2) ((y21) aVar.f16938c)).currentAccount, y21Var3.K ? 1 : 0);
                return;
            case 4:
                y21.W(this.f37558b);
                return;
            default:
                y21.T(this.f37558b);
                return;
        }
    }
}
