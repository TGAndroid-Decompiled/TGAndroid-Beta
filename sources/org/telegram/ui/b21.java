package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class b21 implements Runnable {
    public final int f35309a;
    public final o21 f35310b;

    public b21(o21 o21Var, int i10) {
        this.f35309a = i10;
        this.f35310b = o21Var;
    }

    @Override
    public final void run() {
        switch (this.f35309a) {
            case 0:
                n21 n21Var = this.f35310b.f39569f;
                if (n21Var != null) {
                    n21Var.f39276s.setClickable(true);
                    return;
                }
                return;
            case 1:
                o21 o21Var = this.f35310b;
                o21Var.d0(0, o21Var.G, true);
                org.telegram.ui.Components.ij0 animatedDrawable = o21Var.C.getAnimatedDrawable();
                if (o21Var.F == null && animatedDrawable != null) {
                    o21Var.F = Bitmap.createBitmap(animatedDrawable.f27812b, animatedDrawable.f27814c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(o21Var.F);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                o21 o21Var2 = this.f35310b;
                AndroidUtilities.runOnUIThread(new w01(1, o21Var2, SvgHelper.getBitmap(i10, o21Var2.f39573w.getWidth(), o21Var2.f39573w.getHeight(), -16777216)));
                return;
            case 3:
                o21 o21Var3 = this.f35310b;
                n7.qa qaVar = o21Var3.f39565a;
                qaVar.f15699b = o21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((o21) qaVar.f15700c)).currentAccount, o21Var3.H ? 1 : 0);
                return;
            case 4:
                o21.X(this.f35310b);
                return;
            default:
                o21.V(this.f35310b);
                return;
        }
    }
}
