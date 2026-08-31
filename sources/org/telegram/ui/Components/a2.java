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
    public final int f25119a = 0;
    public final int[] f25120b;
    public final Object f25121c;
    public final ViewGroup d;
    public final Object f25122e;
    public final KeyEvent.Callback f25123f;
    public final Object h;
    public final Object f25124n;
    public final Object f25125r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ih ihVar) {
        this.f25121c = frameLayout;
        this.f25122e = g6Var;
        this.f25123f = h3Var;
        this.d = frameLayout2;
        this.f25120b = iArr;
        this.f25124n = strArr;
        this.h = iArr2;
        this.f25125r = ihVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f25119a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f25121c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f25122e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f25123f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f25124n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f25125r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.f(27))).j();
                    return;
                }
                q70 F = q70.F(h3Var.container, g6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f25120b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new z2(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30311i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                mh.f0 f0Var = (mh.f0) this.f25124n;
                ((boolean[]) this.f25121c)[0] = false;
                xt.j((xt) f0Var.f14006c, f0Var.f14004a, f0Var.f14005b, (int) (z4.c(null, (yc0) this.d, (yc0) this.f25122e, (yc0) this.f25123f, (yc0) this.h) / 1000), this.f25120b[0]);
                runnable = ((org.telegram.ui.ActionBar.c3) this.f25125r).f21207a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, yc0 yc0Var4, mh.f0 f0Var, int[] iArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f25121c = zArr;
        this.d = yc0Var;
        this.f25122e = yc0Var2;
        this.f25123f = yc0Var3;
        this.h = yc0Var4;
        this.f25124n = f0Var;
        this.f25120b = iArr;
        this.f25125r = c3Var;
    }
}
