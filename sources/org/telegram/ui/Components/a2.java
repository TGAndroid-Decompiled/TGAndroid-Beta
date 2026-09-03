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
    public final int f25123a = 0;
    public final int[] f25124b;
    public final Object f25125c;
    public final ViewGroup d;
    public final Object f25126e;
    public final KeyEvent.Callback f25127f;
    public final Object h;
    public final Object f25128n;
    public final Object f25129r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ih ihVar) {
        this.f25125c = frameLayout;
        this.f25126e = g6Var;
        this.f25127f = h3Var;
        this.d = frameLayout2;
        this.f25124b = iArr;
        this.f25128n = strArr;
        this.h = iArr2;
        this.f25129r = ihVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f25123a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f25125c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f25126e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f25127f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f25128n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f25129r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new qc(frameLayout, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.f(27))).j();
                    return;
                }
                q70 F = q70.F(h3Var.container, g6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f25124b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new z2(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30315i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                mh.f0 f0Var = (mh.f0) this.f25128n;
                ((boolean[]) this.f25125c)[0] = false;
                xt.j((xt) f0Var.f14008c, f0Var.f14006a, f0Var.f14007b, (int) (z4.c(null, (yc0) this.d, (yc0) this.f25126e, (yc0) this.f25127f, (yc0) this.h) / 1000), this.f25124b[0]);
                runnable = ((org.telegram.ui.ActionBar.c3) this.f25129r).f21209a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, yc0 yc0Var4, mh.f0 f0Var, int[] iArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f25125c = zArr;
        this.d = yc0Var;
        this.f25126e = yc0Var2;
        this.f25127f = yc0Var3;
        this.h = yc0Var4;
        this.f25128n = f0Var;
        this.f25124b = iArr;
        this.f25129r = c3Var;
    }
}
