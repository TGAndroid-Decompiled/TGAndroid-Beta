package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class n11 implements Runnable {
    public final int f40686a;
    public final a21 f40687b;

    public n11(a21 a21Var, int i10) {
        this.f40686a = i10;
        this.f40687b = a21Var;
    }

    @Override
    public final void run() {
        switch (this.f40686a) {
            case 0:
                z11 z11Var = this.f40687b.f36407f;
                if (z11Var != null) {
                    z11Var.f45031s.setClickable(true);
                    return;
                }
                return;
            case 1:
                a21 a21Var = this.f40687b;
                a21Var.d0(0, a21Var.F, true);
                org.telegram.ui.Components.xi0 animatedDrawable = a21Var.B.getAnimatedDrawable();
                if (a21Var.E == null && animatedDrawable != null) {
                    a21Var.E = Bitmap.createBitmap(animatedDrawable.f34732b, animatedDrawable.f34734c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(a21Var.E);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                a21 a21Var2 = this.f40687b;
                AndroidUtilities.runOnUIThread(new av0(23, a21Var2, SvgHelper.getBitmap(i10, a21Var2.f36411w.getWidth(), a21Var2.f36411w.getHeight(), -16777216)));
                return;
            case 3:
                a21 a21Var3 = this.f40687b;
                oc.i iVar = a21Var3.f36403a;
                iVar.f19483b = a21Var3.F.b(((org.telegram.ui.ActionBar.o2) ((a21) iVar.f19484c)).currentAccount, a21Var3.G ? 1 : 0);
                return;
            case 4:
                a21.X(this.f40687b);
                return;
            default:
                a21.V(this.f40687b);
                return;
        }
    }
}
