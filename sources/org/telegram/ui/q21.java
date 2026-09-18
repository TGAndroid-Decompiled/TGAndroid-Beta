package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class q21 implements Runnable {
    public final int f36667a;
    public final e31 f36668b;

    public q21(e31 e31Var, int i10) {
        this.f36667a = i10;
        this.f36668b = e31Var;
    }

    @Override
    public final void run() {
        switch (this.f36667a) {
            case 0:
                d31 d31Var = this.f36668b.f33161f;
                if (d31Var != null) {
                    d31Var.f32853s.setClickable(true);
                    return;
                }
                return;
            case 1:
                e31 e31Var = this.f36668b;
                e31Var.d0(0, e31Var.J, true);
                org.telegram.ui.Components.ij0 animatedDrawable = e31Var.F.getAnimatedDrawable();
                if (e31Var.I == null && animatedDrawable != null) {
                    e31Var.I = Bitmap.createBitmap(animatedDrawable.f24973b, animatedDrawable.f24975c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(e31Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                e31 e31Var2 = this.f36668b;
                AndroidUtilities.runOnUIThread(new cy0(18, e31Var2, SvgHelper.getBitmap(i10, e31Var2.f33165w.getWidth(), e31Var2.f33165w.getHeight(), -16777216)));
                return;
            case 3:
                e31 e31Var3 = this.f36668b;
                o0.a aVar = e31Var3.f33158a;
                aVar.f15439b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) aVar.f15440c)).currentAccount, e31Var3.K ? 1 : 0);
                return;
            case 4:
                e31.X(this.f36668b);
                return;
            default:
                e31.V(this.f36668b);
                return;
        }
    }
}
