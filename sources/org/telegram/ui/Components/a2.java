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
    public final int f24424a = 0;
    public final int[] f24425b;
    public final Object f24426c;
    public final ViewGroup d;
    public final Object f24427e;
    public final KeyEvent.Callback f24428f;
    public final Object h;
    public final Object f24429n;
    public final Object f24430r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.m5 m5Var) {
        this.f24426c = frameLayout;
        this.f24427e = d6Var;
        this.f24428f = f3Var;
        this.d = frameLayout2;
        this.f24425b = iArr;
        this.f24429n = strArr;
        this.h = iArr2;
        this.f24430r = m5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24424a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24426c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f24427e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24428f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24429n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24430r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                b80 F = b80.F(f3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24425b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f24831i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                zt ztVar = (zt) this.f24429n;
                ((boolean[]) this.f24426c)[0] = false;
                eu.j((eu) ztVar.f33647c, ztVar.f33645a, ztVar.f33646b, (int) (e5.c(null, (gd0) this.d, (gd0) this.f24427e, (gd0) this.f24428f, (gd0) this.h) / 1000), this.f24425b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24430r).f20378a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gd0 gd0Var4, zt ztVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24426c = zArr;
        this.d = gd0Var;
        this.f24427e = gd0Var2;
        this.f24428f = gd0Var3;
        this.h = gd0Var4;
        this.f24429n = ztVar;
        this.f24425b = iArr;
        this.f24430r = a3Var;
    }
}
