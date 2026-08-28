package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class m11 implements Runnable {
    public final int f40298a;
    public final z11 f40299b;

    public m11(z11 z11Var, int i9) {
        this.f40298a = i9;
        this.f40299b = z11Var;
    }

    @Override
    public final void run() {
        switch (this.f40298a) {
            case 0:
                y11 y11Var = this.f40299b.f45004f;
                if (y11Var != null) {
                    y11Var.f44681s.setClickable(true);
                    return;
                }
                return;
            case 1:
                z11 z11Var = this.f40299b;
                z11Var.c0(0, z11Var.F, true);
                org.telegram.ui.Components.mi0 animatedDrawable = z11Var.B.getAnimatedDrawable();
                if (z11Var.E == null && animatedDrawable != null) {
                    z11Var.E = Bitmap.createBitmap(animatedDrawable.f30842b, animatedDrawable.f30844c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(z11Var.E);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i9 = R.raw.default_pattern;
                z11 z11Var2 = this.f40299b;
                AndroidUtilities.runOnUIThread(new ys0(26, z11Var2, SvgHelper.getBitmap(i9, z11Var2.f45008w.getWidth(), z11Var2.f45008w.getHeight(), -16777216)));
                return;
            case 3:
                z11 z11Var3 = this.f40299b;
                org.telegram.ui.Cells.e3 e3Var = z11Var3.f45000a;
                e3Var.f24286b = z11Var3.F.b(((org.telegram.ui.ActionBar.o2) ((z11) e3Var.f24287c)).currentAccount, z11Var3.G ? 1 : 0);
                return;
            case 4:
                z11.W(this.f40299b);
                return;
            default:
                z11.U(this.f40299b);
                return;
        }
    }
}
