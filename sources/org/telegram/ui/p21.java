package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class p21 implements Runnable {
    public final int f40693a;
    public final e31 f40694b;

    public p21(e31 e31Var, int i10) {
        this.f40693a = i10;
        this.f40694b = e31Var;
    }

    @Override
    public final void run() {
        switch (this.f40693a) {
            case 0:
                d31 d31Var = this.f40694b.f37183f;
                if (d31Var != null) {
                    d31Var.f36873s.setClickable(true);
                    return;
                }
                return;
            case 1:
                e31 e31Var = this.f40694b;
                e31Var.c0(0, e31Var.J, true);
                org.telegram.ui.Components.dk0 animatedDrawable = e31Var.F.getAnimatedDrawable();
                if (e31Var.I == null && animatedDrawable != null) {
                    e31Var.I = Bitmap.createBitmap(animatedDrawable.f25727b, animatedDrawable.f25729c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(e31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                e31 e31Var2 = this.f40694b;
                AndroidUtilities.runOnUIThread(new rt0(28, e31Var2, SvgHelper.getBitmap(i10, e31Var2.f37187w.getWidth(), e31Var2.f37187w.getHeight(), -16777216)));
                return;
            case 3:
                e31 e31Var3 = this.f40694b;
                org.telegram.ui.ActionBar.b5 b5Var = e31Var3.f37179a;
                b5Var.f20465b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) b5Var.f20466c)).currentAccount, e31Var3.K ? 1 : 0);
                return;
            case 4:
                e31.W(this.f40694b);
                return;
            default:
                e31.U(this.f40694b);
                return;
        }
    }
}
