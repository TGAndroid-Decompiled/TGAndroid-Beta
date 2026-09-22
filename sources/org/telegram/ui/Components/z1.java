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
    public final int f30771a = 0;
    public final int[] f30772b;
    public final Object f30773c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f30774f;
    public final Object h;
    public final Object f30775n;
    public final Object f30776r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f30773c = frameLayout;
        this.e = f6Var;
        this.f30774f = f3Var;
        this.d = frameLayout2;
        this.f30772b = iArr;
        this.f30775n = strArr;
        this.h = iArr2;
        this.f30776r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f30771a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f30773c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f30774f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f30775n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f30776r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                y70 F = y70.F(f3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f30772b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30550i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                wt wtVar = (wt) this.f30775n;
                ((boolean[]) this.f30773c)[0] = false;
                bu.j((bu) wtVar.f30139c, wtVar.f30137a, wtVar.f30138b, (int) (d5.c(null, (fd0) this.d, (fd0) this.e, (fd0) this.f30774f, (fd0) this.h) / 1000), this.f30772b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f30776r).f18674a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, fd0 fd0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f30773c = zArr;
        this.d = fd0Var;
        this.e = fd0Var2;
        this.f30774f = fd0Var3;
        this.h = fd0Var4;
        this.f30775n = wtVar;
        this.f30772b = iArr;
        this.f30776r = a3Var;
    }
}
