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
    public final int f22307a = 0;
    public final int[] f22308b;
    public final Object f22309c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22310f;
    public final Object h;
    public final Object f22311n;
    public final Object f22312r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.f22309c = frameLayout;
        this.e = d6Var;
        this.f22310f = f3Var;
        this.d = frameLayout2;
        this.f22308b = iArr;
        this.f22311n = strArr;
        this.h = iArr2;
        this.f22312r = m5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22307a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22309c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f22310f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22311n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22312r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                o70 F = o70.F(f3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22308b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f26651i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                xt xtVar = (xt) this.f22311n;
                ((boolean[]) this.f22309c)[0] = false;
                cu.j((cu) xtVar.f30053c, xtVar.f30051a, xtVar.f30052b, (int) (e5.c(null, (tc0) this.d, (tc0) this.e, (tc0) this.f22310f, (tc0) this.h) / 1000), this.f22308b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f22312r).f18414a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, tc0 tc0Var4, xt xtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f22309c = zArr;
        this.d = tc0Var;
        this.e = tc0Var2;
        this.f22310f = tc0Var3;
        this.h = tc0Var4;
        this.f22311n = xtVar;
        this.f22308b = iArr;
        this.f22312r = a3Var;
    }
}
