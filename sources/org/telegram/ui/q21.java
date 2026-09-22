package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class q21 implements Runnable {
    public final int f36770a;
    public final f31 f36771b;

    public q21(f31 f31Var, int i10) {
        this.f36770a = i10;
        this.f36771b = f31Var;
    }

    @Override
    public final void run() {
        switch (this.f36770a) {
            case 0:
                e31 e31Var = this.f36771b.f33495f;
                if (e31Var != null) {
                    e31Var.f33235s.setClickable(true);
                    return;
                }
                return;
            case 1:
                f31 f31Var = this.f36771b;
                f31Var.d0(0, f31Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = f31Var.F.getAnimatedDrawable();
                if (f31Var.I == null && animatedDrawable != null) {
                    f31Var.I = Bitmap.createBitmap(animatedDrawable.f25712b, animatedDrawable.f25714c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(f31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                f31 f31Var2 = this.f36771b;
                AndroidUtilities.runOnUIThread(new rx0(20, f31Var2, SvgHelper.getBitmap(i10, f31Var2.f33499w.getWidth(), f31Var2.f33499w.getHeight(), -16777216)));
                return;
            case 3:
                f31 f31Var3 = this.f36771b;
                m5.e eVar = f31Var3.f33492a;
                eVar.f14968b = f31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((f31) eVar.f14969c)).currentAccount, f31Var3.K ? 1 : 0);
                return;
            case 4:
                f31.X(this.f36771b);
                return;
            default:
                f31.V(this.f36771b);
                return;
        }
    }
}
