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
    public final int f30698a = 0;
    public final int[] f30699b;
    public final Object f30700c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f30701f;
    public final Object h;
    public final Object f30702n;
    public final Object f30703r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f30700c = frameLayout;
        this.e = e6Var;
        this.f30701f = f3Var;
        this.d = frameLayout2;
        this.f30699b = iArr;
        this.f30702n = strArr;
        this.h = iArr2;
        this.f30703r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f30698a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f30700c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f30701f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f30702n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f30703r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                w70 F = w70.F(f3Var.container, e6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f30699b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f29906i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                wt wtVar = (wt) this.f30702n;
                ((boolean[]) this.f30700c)[0] = false;
                bu.j((bu) wtVar.f30159c, wtVar.f30157a, wtVar.f30158b, (int) (e5.c(null, (dd0) this.d, (dd0) this.e, (dd0) this.f30701f, (dd0) this.h) / 1000), this.f30699b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f30703r).f18627a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4, wt wtVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f30700c = zArr;
        this.d = dd0Var;
        this.e = dd0Var2;
        this.f30701f = dd0Var3;
        this.h = dd0Var4;
        this.f30702n = wtVar;
        this.f30699b = iArr;
        this.f30703r = a3Var;
    }
}
