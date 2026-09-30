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
    public final int f22522a = 0;
    public final int[] f22523b;
    public final Object f22524c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22525f;
    public final Object h;
    public final Object f22526n;
    public final Object f22527r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f22524c = frameLayout;
        this.e = d6Var;
        this.f22525f = e3Var;
        this.d = frameLayout2;
        this.f22523b = iArr;
        this.f22526n = strArr;
        this.h = iArr2;
        this.f22527r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22522a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22524c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22525f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22526n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22527r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                b80 F = b80.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22523b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f22854i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                zt ztVar = (zt) this.f22526n;
                ((boolean[]) this.f22524c)[0] = false;
                eu.j((eu) ztVar.f31059c, ztVar.f31057a, ztVar.f31058b, (int) (e5.c(null, (hd0) this.d, (hd0) this.e, (hd0) this.f22525f, (hd0) this.h) / 1000), this.f22523b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f22527r).f19966a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3, hd0 hd0Var4, zt ztVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f22524c = zArr;
        this.d = hd0Var;
        this.e = hd0Var2;
        this.f22525f = hd0Var3;
        this.h = hd0Var4;
        this.f22526n = ztVar;
        this.f22523b = iArr;
        this.f22527r = z2Var;
    }
}
