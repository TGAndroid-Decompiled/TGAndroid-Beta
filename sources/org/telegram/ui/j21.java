package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class j21 implements Runnable {
    public final int f37565a;
    public final y21 f37566b;

    public j21(y21 y21Var, int i10) {
        this.f37565a = i10;
        this.f37566b = y21Var;
    }

    @Override
    public final void run() {
        switch (this.f37565a) {
            case 0:
                x21 x21Var = this.f37566b.f43021f;
                if (x21Var != null) {
                    x21Var.f42731s.setClickable(true);
                    return;
                }
                return;
            case 1:
                y21 y21Var = this.f37566b;
                y21Var.d0(0, y21Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = y21Var.F.getAnimatedDrawable();
                if (y21Var.I == null && animatedDrawable != null) {
                    y21Var.I = Bitmap.createBitmap(animatedDrawable.f28120b, animatedDrawable.f28122c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(y21Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                y21 y21Var2 = this.f37566b;
                AndroidUtilities.runOnUIThread(new wx0(17, y21Var2, SvgHelper.getBitmap(i10, y21Var2.f43025w.getWidth(), y21Var2.f43025w.getHeight(), -16777216)));
                return;
            case 3:
                y21 y21Var3 = this.f37566b;
                o0.a aVar = y21Var3.f43017a;
                aVar.f16928b = y21Var3.J.b(((org.telegram.ui.ActionBar.n2) ((y21) aVar.f16929c)).currentAccount, y21Var3.K ? 1 : 0);
                return;
            case 4:
                y21.W(this.f37566b);
                return;
            default:
                y21.T(this.f37566b);
                return;
        }
    }
}
