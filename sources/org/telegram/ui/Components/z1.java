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
    public final int f30360a = 0;
    public final int[] f30361b;
    public final Object f30362c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f30363f;
    public final Object h;
    public final Object f30364n;
    public final Object f30365r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.o5 o5Var) {
        this.f30362c = frameLayout;
        this.e = f6Var;
        this.f30363f = g3Var;
        this.d = frameLayout2;
        this.f30361b = iArr;
        this.f30364n = strArr;
        this.h = iArr2;
        this.f30365r = o5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f30360a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f30362c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f30363f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f30364n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f30365r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new vc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                n70 F = n70.F(g3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f30361b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new b3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f26366i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                wt wtVar = (wt) this.f30364n;
                ((boolean[]) this.f30362c)[0] = false;
                bu.j((bu) wtVar.f29738c, wtVar.f29736a, wtVar.f29737b, (int) (c5.c(null, (uc0) this.d, (uc0) this.e, (uc0) this.f30363f, (uc0) this.h) / 1000), this.f30361b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f30365r).f18470a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, uc0 uc0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f30362c = zArr;
        this.d = uc0Var;
        this.e = uc0Var2;
        this.f30363f = uc0Var3;
        this.h = uc0Var4;
        this.f30364n = wtVar;
        this.f30361b = iArr;
        this.f30365r = b3Var;
    }
}
