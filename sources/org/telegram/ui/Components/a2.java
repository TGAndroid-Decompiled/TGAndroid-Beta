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
    public final int f23265a = 0;
    public final int[] f23266b;
    public final Object f23267c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f23268f;
    public final Object h;
    public final Object f23269n;
    public final Object f23270r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ih ihVar) {
        this.f23267c = frameLayout;
        this.e = f6Var;
        this.f23268f = g3Var;
        this.d = frameLayout2;
        this.f23266b = iArr;
        this.f23269n = strArr;
        this.h = iArr2;
        this.f23270r = ihVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f23265a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f23267c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f23268f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f23269n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f23270r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new cg.n0(25))).j();
                    return;
                }
                o70 F = o70.F(g3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f23266b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new z2(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f27471i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                lh.g0 g0Var = (lh.g0) this.f23269n;
                ((boolean[]) this.f23267c)[0] = false;
                vt.j((vt) g0Var.f12455c, g0Var.f12453a, g0Var.f12454b, (int) (z4.c(null, (wc0) this.d, (wc0) this.e, (wc0) this.f23268f, (wc0) this.h) / 1000), this.f23266b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f23270r).f19525a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3, wc0 wc0Var4, lh.g0 g0Var, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f23267c = zArr;
        this.d = wc0Var;
        this.e = wc0Var2;
        this.f23268f = wc0Var3;
        this.h = wc0Var4;
        this.f23269n = g0Var;
        this.f23266b = iArr;
        this.f23270r = b3Var;
    }
}
