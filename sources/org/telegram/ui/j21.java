package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public final class j21 implements Runnable {
    public final int f34576a;
    public final y21 f34577b;

    public j21(y21 y21Var, int i10) {
        this.f34576a = i10;
        this.f34577b = y21Var;
    }

    @Override
    public final void run() {
        switch (this.f34576a) {
            case 0:
                x21 x21Var = this.f34577b.f40115f;
                if (x21Var != null) {
                    x21Var.f39507s.setClickable(true);
                    return;
                }
                return;
            case 1:
                y21 y21Var = this.f34577b;
                y21Var.d0(0, y21Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = y21Var.F.getAnimatedDrawable();
                if (y21Var.I == null && animatedDrawable != null) {
                    y21Var.I = Bitmap.createBitmap(animatedDrawable.f25747b, animatedDrawable.f25749c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(y21Var.I);
                    animatedDrawable.c();
                    return;
                }
                return;
            case 2:
                int i10 = R.raw.default_pattern;
                y21 y21Var2 = this.f34577b;
                AndroidUtilities.runOnUIThread(new by0(15, y21Var2, SvgHelper.getBitmap(i10, y21Var2.f40119w.getWidth(), y21Var2.f40119w.getHeight(), -16777216)));
                return;
            case 3:
                y21 y21Var3 = this.f34577b;
                o0.a aVar = y21Var3.f40112a;
                aVar.f15519b = y21Var3.J.b(((org.telegram.ui.ActionBar.o2) ((y21) aVar.f15520c)).currentAccount, y21Var3.K ? 1 : 0);
                return;
            case 4:
                y21.X(this.f34577b);
                return;
            default:
                y21.V(this.f34577b);
                return;
        }
    }
}
