package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class z1 implements View.OnClickListener {
    public final int f30659a = 0;
    public final int[] f30660b;
    public final Object f30661c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f30662f;
    public final Object h;
    public final Object f30663n;
    public final Object f30664r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f30661c = frameLayout;
        this.e = f6Var;
        this.f30662f = f3Var;
        this.d = frameLayout2;
        this.f30660b = iArr;
        this.f30663n = strArr;
        this.h = iArr2;
        this.f30664r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f30659a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f30661c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f30662f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f30663n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f30664r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                v70 F = v70.F(f3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f30660b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f28976i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                wt wtVar = (wt) this.f30663n;
                ((boolean[]) this.f30661c)[0] = false;
                bu.j((bu) wtVar.f30087c, wtVar.f30085a, wtVar.f30086b, (int) (d5.c(null, (cd0) this.d, (cd0) this.e, (cd0) this.f30662f, (cd0) this.h) / 1000), this.f30660b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f30664r).f18659a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3, cd0 cd0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f30661c = zArr;
        this.d = cd0Var;
        this.e = cd0Var2;
        this.f30662f = cd0Var3;
        this.h = cd0Var4;
        this.f30663n = wtVar;
        this.f30660b = iArr;
        this.f30664r = a3Var;
    }
}
