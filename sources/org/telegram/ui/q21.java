package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class q21 implements Runnable {
    public final int f36741a;
    public final e31 f36742b;

    public q21(e31 e31Var, int i10) {
        this.f36741a = i10;
        this.f36742b = e31Var;
    }

    @Override
    public final void run() {
        switch (this.f36741a) {
            case 0:
                d31 d31Var = this.f36742b.f33202f;
                if (d31Var != null) {
                    d31Var.f32911s.setClickable(true);
                    return;
                }
                return;
            case 1:
                e31 e31Var = this.f36742b;
                e31Var.d0(0, e31Var.J, true);
                org.telegram.ui.Components.xi0 animatedDrawable = e31Var.F.getAnimatedDrawable();
                if (e31Var.I == null && animatedDrawable != null) {
                    e31Var.I = Bitmap.createBitmap(animatedDrawable.f29947b, animatedDrawable.f29949c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.E0 = 33;
                    animatedDrawable.a(e31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                e31 e31Var2 = this.f36742b;
                AndroidUtilities.runOnUIThread(new iy0(14, e31Var2, SvgHelper.getBitmap(i10, e31Var2.f33206w.getWidth(), e31Var2.f33206w.getHeight(), -16777216)));
                return;
            case 3:
                e31 e31Var3 = this.f36742b;
                o0.a aVar = e31Var3.f33199a;
                aVar.f15300b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) aVar.f15301c)).currentAccount, e31Var3.K ? 1 : 0);
                return;
            case 4:
                e31.X(this.f36742b);
                return;
            default:
                e31.V(this.f36742b);
                return;
        }
    }
}
