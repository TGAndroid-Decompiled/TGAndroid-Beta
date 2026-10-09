package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class p21 implements Runnable {
    public final int f40647a;
    public final e31 f40648b;

    public p21(e31 e31Var, int i10) {
        this.f40647a = i10;
        this.f40648b = e31Var;
    }

    @Override
    public final void run() {
        switch (this.f40647a) {
            case 0:
                d31 d31Var = this.f40648b.f37137f;
                if (d31Var != null) {
                    d31Var.f36827s.setClickable(true);
                    return;
                }
                return;
            case 1:
                e31 e31Var = this.f40648b;
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
                e31 e31Var2 = this.f40648b;
                AndroidUtilities.runOnUIThread(new rt0(28, e31Var2, SvgHelper.getBitmap(i10, e31Var2.f37141w.getWidth(), e31Var2.f37141w.getHeight(), -16777216)));
                return;
            case 3:
                e31 e31Var3 = this.f40648b;
                org.telegram.ui.ActionBar.b5 b5Var = e31Var3.f37133a;
                b5Var.f20461b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) b5Var.f20462c)).currentAccount, e31Var3.K ? 1 : 0);
                return;
            case 4:
                e31.W(this.f40648b);
                return;
            default:
                e31.U(this.f40648b);
                return;
        }
    }
}
