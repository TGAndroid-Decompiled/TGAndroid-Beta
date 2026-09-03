package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class f21 implements Runnable {
    public final int f36637a;
    public final u21 f36638b;

    public f21(u21 u21Var, int i10) {
        this.f36637a = i10;
        this.f36638b = u21Var;
    }

    @Override
    public final void run() {
        switch (this.f36637a) {
            case 0:
                t21 t21Var = this.f36638b.f41708f;
                if (t21Var != null) {
                    t21Var.f41396s.setClickable(true);
                    return;
                }
                return;
            case 1:
                u21 u21Var = this.f36638b;
                u21Var.d0(0, u21Var.G, true);
                org.telegram.ui.Components.hj0 animatedDrawable = u21Var.C.getAnimatedDrawable();
                if (u21Var.F == null && animatedDrawable != null) {
                    u21Var.F = Bitmap.createBitmap(animatedDrawable.f27519b, animatedDrawable.f27521c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(u21Var.F);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                u21 u21Var2 = this.f36638b;
                AndroidUtilities.runOnUIThread(new h21(0, u21Var2, SvgHelper.getBitmap(i10, u21Var2.f41712w.getWidth(), u21Var2.f41712w.getHeight(), -16777216)));
                return;
            case 3:
                u21 u21Var3 = this.f36638b;
                n7.qa qaVar = u21Var3.f41704a;
                qaVar.f15701b = u21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((u21) qaVar.f15702c)).currentAccount, u21Var3.H ? 1 : 0);
                return;
            case 4:
                u21.X(this.f36638b);
                return;
            default:
                u21.V(this.f36638b);
                return;
        }
    }
}
