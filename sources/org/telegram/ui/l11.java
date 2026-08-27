package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

public final class l11 implements Runnable {

    public final int f39913a;

    public final y11 f39914b;

    public l11(y11 y11Var, int i10) {
        this.f39913a = i10;
        this.f39914b = y11Var;
    }

    @Override
    public final void run() {
        switch (this.f39913a) {
            case 0:
                x11 x11Var = this.f39914b.f44670f;
                if (x11Var != null) {
                    x11Var.f44254s.setClickable(true);
                    break;
                }
                break;
            case 1:
                y11 y11Var = this.f39914b;
                y11Var.d0(0, y11Var.F, true);
                org.telegram.ui.Components.oi0 animatedDrawable = y11Var.B.getAnimatedDrawable();
                if (y11Var.E == null && animatedDrawable != null) {
                    y11Var.E = Bitmap.createBitmap(animatedDrawable.f31307b, animatedDrawable.f31309c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(y11Var.E);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                y11 y11Var2 = this.f39914b;
                AndroidUtilities.runOnUIThread(new zs0(26, y11Var2, SvgHelper.getBitmap(i10, y11Var2.f44674w.getWidth(), y11Var2.f44674w.getHeight(), -16777216)));
                break;
            case 3:
                y11 y11Var3 = this.f39914b;
                i6 i6Var = y11Var3.f44666a;
                i6Var.f38984b = y11Var3.F.b(((org.telegram.ui.ActionBar.n2) ((y11) i6Var.f38985c)).currentAccount, y11Var3.G ? 1 : 0);
                break;
            case 4:
                y11.X(this.f39914b);
                break;
            default:
                y11.V(this.f39914b);
                break;
        }
    }
}
