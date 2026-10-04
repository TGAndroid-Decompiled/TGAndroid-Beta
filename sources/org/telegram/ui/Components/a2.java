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
    public final int f24419a = 0;
    public final int[] f24420b;
    public final Object f24421c;
    public final ViewGroup d;
    public final Object f24422e;
    public final KeyEvent.Callback f24423f;
    public final Object h;
    public final Object f24424n;
    public final Object f24425r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.f24421c = frameLayout;
        this.f24422e = d6Var;
        this.f24423f = f3Var;
        this.d = frameLayout2;
        this.f24420b = iArr;
        this.f24424n = strArr;
        this.h = iArr2;
        this.f24425r = m5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24419a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24421c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f24422e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24423f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24424n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24425r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                b80 F = b80.F(f3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24420b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f24826i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                zt ztVar = (zt) this.f24424n;
                ((boolean[]) this.f24421c)[0] = false;
                eu.j((eu) ztVar.f33640c, ztVar.f33638a, ztVar.f33639b, (int) (e5.c(null, (gd0) this.d, (gd0) this.f24422e, (gd0) this.f24423f, (gd0) this.h) / 1000), this.f24420b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24425r).f20373a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gd0 gd0Var4, zt ztVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24421c = zArr;
        this.d = gd0Var;
        this.f24422e = gd0Var2;
        this.f24423f = gd0Var3;
        this.h = gd0Var4;
        this.f24424n = ztVar;
        this.f24420b = iArr;
        this.f24425r = a3Var;
    }
}
