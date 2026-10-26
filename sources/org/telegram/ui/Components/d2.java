package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class d2 implements View.OnClickListener {
    public final int f27332a = 0;
    public final int[] f27333b;
    public final Object f27334c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f27335f;
    public final Object h;
    public final Object f27336n;
    public final Object f27337r;

    public d2(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.k3 k3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, m4.v0 v0Var) {
        this.f27334c = frameLayout;
        this.e = u6Var;
        this.f27335f = k3Var;
        this.d = frameLayout2;
        this.f27333b = iArr;
        this.f27336n = strArr;
        this.h = iArr2;
        this.f27337r = v0Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27332a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f27334c;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f27335f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f27336n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f27337r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new wc(frameLayout, u6Var).R(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.c(29))).j();
                    return;
                }
                k80 F = k80.F(k3Var.container, u6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f27333b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f29850i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                bi.r0 r0Var = (bi.r0) this.f27336n;
                ((boolean[]) this.f27334c)[0] = false;
                ju.j((ju) r0Var.f5314c, r0Var.f5312a, r0Var.f5313b, (int) (g5.c(null, (md0) this.d, (md0) this.e, (md0) this.f27335f, (md0) this.h) / 1000), this.f27333b[0]);
                runnable = ((org.telegram.ui.ActionBar.e3) this.f27337r).f22601a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public d2(boolean[] zArr, md0 md0Var, md0 md0Var2, md0 md0Var3, md0 md0Var4, bi.r0 r0Var, int[] iArr, org.telegram.ui.ActionBar.e3 e3Var) {
        this.f27334c = zArr;
        this.d = md0Var;
        this.e = md0Var2;
        this.f27335f = md0Var3;
        this.h = md0Var4;
        this.f27336n = r0Var;
        this.f27333b = iArr;
        this.f27337r = e3Var;
    }
}
