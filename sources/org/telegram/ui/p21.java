package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class p21 implements Runnable {
    public final int f40649a;
    public final e31 f40650b;

    public p21(e31 e31Var, int i10) {
        this.f40649a = i10;
        this.f40650b = e31Var;
    }

    @Override
    public final void run() {
        switch (this.f40649a) {
            case 0:
                d31 d31Var = this.f40650b.f37139f;
                if (d31Var != null) {
                    d31Var.f36829s.setClickable(true);
                    return;
                }
                return;
            case 1:
                e31 e31Var = this.f40650b;
                e31Var.c0(0, e31Var.J, true);
                org.telegram.ui.Components.ck0 animatedDrawable = e31Var.F.getAnimatedDrawable();
                if (e31Var.I == null && animatedDrawable != null) {
                    e31Var.I = Bitmap.createBitmap(animatedDrawable.f25396b, animatedDrawable.f25398c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(e31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                e31 e31Var2 = this.f40650b;
                AndroidUtilities.runOnUIThread(new rt0(28, e31Var2, SvgHelper.getBitmap(i10, e31Var2.f37143w.getWidth(), e31Var2.f37143w.getHeight(), -16777216)));
                return;
            case 3:
                e31 e31Var3 = this.f40650b;
                org.telegram.ui.ActionBar.b5 b5Var = e31Var3.f37135a;
                b5Var.f20461b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) b5Var.f20462c)).currentAccount, e31Var3.K ? 1 : 0);
                return;
            case 4:
                e31.W(this.f40650b);
                return;
            default:
                e31.U(this.f40650b);
                return;
        }
    }
}
