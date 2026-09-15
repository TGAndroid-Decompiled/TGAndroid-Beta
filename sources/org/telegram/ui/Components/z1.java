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
    public final int f30440a = 0;
    public final int[] f30441b;
    public final Object f30442c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f30443f;
    public final Object h;
    public final Object f30444n;
    public final Object f30445r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f30442c = frameLayout;
        this.e = e6Var;
        this.f30443f = f3Var;
        this.d = frameLayout2;
        this.f30441b = iArr;
        this.f30444n = strArr;
        this.h = iArr2;
        this.f30445r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f30440a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f30442c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f30443f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f30444n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f30445r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new vc(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                n70 F = n70.F(f3Var.container, e6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f30441b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new b3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f26350i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                wt wtVar = (wt) this.f30444n;
                ((boolean[]) this.f30442c)[0] = false;
                bu.j((bu) wtVar.f29781c, wtVar.f29779a, wtVar.f29780b, (int) (c5.c(null, (uc0) this.d, (uc0) this.e, (uc0) this.f30443f, (uc0) this.h) / 1000), this.f30441b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f30445r).f18442a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, uc0 uc0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f30442c = zArr;
        this.d = uc0Var;
        this.e = uc0Var2;
        this.f30443f = uc0Var3;
        this.h = uc0Var4;
        this.f30444n = wtVar;
        this.f30441b = iArr;
        this.f30445r = a3Var;
    }
}
