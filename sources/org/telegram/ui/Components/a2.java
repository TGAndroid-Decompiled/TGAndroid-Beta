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
    public final int f24227a = 0;
    public final int[] f24228b;
    public final Object f24229c;
    public final ViewGroup d;
    public final Object f24230e;
    public final KeyEvent.Callback f24231f;
    public final Object h;
    public final Object f24232n;
    public final Object f24233r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f24229c = frameLayout;
        this.f24230e = f6Var;
        this.f24231f = f3Var;
        this.d = frameLayout2;
        this.f24228b = iArr;
        this.f24232n = strArr;
        this.h = iArr2;
        this.f24233r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24227a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24229c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f24230e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24231f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24232n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24233r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(23))).j();
                    return;
                }
                n70 F = n70.F(f3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24228b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f28642i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                ut utVar = (ut) this.f24232n;
                ((boolean[]) this.f24229c)[0] = false;
                zt.j((zt) utVar.f30969c, utVar.f30967a, utVar.f30968b, (int) (e5.c(null, (vc0) this.d, (vc0) this.f24230e, (vc0) this.f24231f, (vc0) this.h) / 1000), this.f24228b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24233r).f20204a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, vc0 vc0Var4, ut utVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24229c = zArr;
        this.d = vc0Var;
        this.f24230e = vc0Var2;
        this.f24231f = vc0Var3;
        this.h = vc0Var4;
        this.f24232n = utVar;
        this.f24228b = iArr;
        this.f24233r = a3Var;
    }
}
