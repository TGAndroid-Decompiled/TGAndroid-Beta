package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class a2 implements View.OnClickListener {
    public final int f23285a = 0;
    public final int[] f23286b;
    public final Object f23287c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f23288f;
    public final Object h;
    public final Object f23289n;
    public final Object f23290r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.kh khVar) {
        this.f23287c = frameLayout;
        this.e = f6Var;
        this.f23288f = g3Var;
        this.d = frameLayout2;
        this.f23286b = iArr;
        this.f23289n = strArr;
        this.h = iArr2;
        this.f23290r = khVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f23285a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f23287c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f23288f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f23289n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f23290r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new cg.n0(25))).j();
                    return;
                }
                p70 F = p70.F(g3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f23286b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new z2(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f27759i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                lh.g0 g0Var = (lh.g0) this.f23289n;
                ((boolean[]) this.f23287c)[0] = false;
                ut.j((ut) g0Var.f12439c, g0Var.f12437a, g0Var.f12438b, (int) (z4.c(null, (xc0) this.d, (xc0) this.e, (xc0) this.f23288f, (xc0) this.h) / 1000), this.f23286b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f23290r).f19500a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, xc0 xc0Var4, lh.g0 g0Var, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f23287c = zArr;
        this.d = xc0Var;
        this.e = xc0Var2;
        this.f23288f = xc0Var3;
        this.h = xc0Var4;
        this.f23289n = g0Var;
        this.f23286b = iArr;
        this.f23290r = b3Var;
    }
}
