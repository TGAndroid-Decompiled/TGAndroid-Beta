package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class o21 implements Runnable {
    public final int f40435a;
    public final d31 f40436b;

    public o21(d31 d31Var, int i10) {
        this.f40435a = i10;
        this.f40436b = d31Var;
    }

    @Override
    public final void run() {
        switch (this.f40435a) {
            case 0:
                c31 c31Var = this.f40436b.f36920f;
                if (c31Var != null) {
                    c31Var.f36576s.setClickable(true);
                    return;
                }
                return;
            case 1:
                d31 d31Var = this.f40436b;
                d31Var.c0(0, d31Var.J, true);
                org.telegram.ui.Components.dk0 animatedDrawable = d31Var.F.getAnimatedDrawable();
                if (d31Var.I == null && animatedDrawable != null) {
                    d31Var.I = Bitmap.createBitmap(animatedDrawable.f25805b, animatedDrawable.f25807c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(d31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                d31 d31Var2 = this.f40436b;
                AndroidUtilities.runOnUIThread(new tt0(27, d31Var2, SvgHelper.getBitmap(i10, d31Var2.f36924w.getWidth(), d31Var2.f36924w.getHeight(), -16777216)));
                return;
            case 3:
                d31 d31Var3 = this.f40436b;
                n7.z0 z0Var = d31Var3.f36916a;
                z0Var.f16905b = d31Var3.J.b(((org.telegram.ui.ActionBar.m2) ((d31) z0Var.f16906c)).currentAccount, d31Var3.K ? 1 : 0);
                return;
            case 4:
                d31.W(this.f40436b);
                return;
            default:
                d31.U(this.f40436b);
                return;
        }
    }
}
