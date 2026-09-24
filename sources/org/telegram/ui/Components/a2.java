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
    public final int f22545a = 0;
    public final int[] f22546b;
    public final Object f22547c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22548f;
    public final Object h;
    public final Object f22549n;
    public final Object f22550r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f22547c = frameLayout;
        this.e = d6Var;
        this.f22548f = e3Var;
        this.d = frameLayout2;
        this.f22546b = iArr;
        this.f22549n = strArr;
        this.h = iArr2;
        this.f22550r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22545a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22547c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22548f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22549n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22550r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                y70 F = y70.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22546b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30529i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                xt xtVar = (xt) this.f22549n;
                ((boolean[]) this.f22547c)[0] = false;
                cu.j((cu) xtVar.f30393c, xtVar.f30391a, xtVar.f30392b, (int) (e5.c(null, (ed0) this.d, (ed0) this.e, (ed0) this.f22548f, (ed0) this.h) / 1000), this.f22546b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f22550r).f19935a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, ed0 ed0Var4, xt xtVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f22547c = zArr;
        this.d = ed0Var;
        this.e = ed0Var2;
        this.f22548f = ed0Var3;
        this.h = ed0Var4;
        this.f22549n = xtVar;
        this.f22546b = iArr;
        this.f22550r = z2Var;
    }
}
