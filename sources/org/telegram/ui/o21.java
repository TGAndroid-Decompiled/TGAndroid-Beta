package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class o21 implements Runnable {
    public final int f40401a;
    public final d31 f40402b;

    public o21(d31 d31Var, int i10) {
        this.f40401a = i10;
        this.f40402b = d31Var;
    }

    @Override
    public final void run() {
        switch (this.f40401a) {
            case 0:
                c31 c31Var = this.f40402b.f36886f;
                if (c31Var != null) {
                    c31Var.f36542s.setClickable(true);
                    return;
                }
                return;
            case 1:
                d31 d31Var = this.f40402b;
                d31Var.c0(0, d31Var.J, true);
                org.telegram.ui.Components.ek0 animatedDrawable = d31Var.F.getAnimatedDrawable();
                if (d31Var.I == null && animatedDrawable != null) {
                    d31Var.I = Bitmap.createBitmap(animatedDrawable.f26038b, animatedDrawable.f26040c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(d31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                d31 d31Var2 = this.f40402b;
                AndroidUtilities.runOnUIThread(new tt0(27, d31Var2, SvgHelper.getBitmap(i10, d31Var2.f36890w.getWidth(), d31Var2.f36890w.getHeight(), -16777216)));
                return;
            case 3:
                d31 d31Var3 = this.f40402b;
                n7.z0 z0Var = d31Var3.f36882a;
                z0Var.f16869b = d31Var3.J.b(((org.telegram.ui.ActionBar.m2) ((d31) z0Var.f16870c)).currentAccount, d31Var3.K ? 1 : 0);
                return;
            case 4:
                d31.W(this.f40402b);
                return;
            default:
                d31.U(this.f40402b);
                return;
        }
    }
}
