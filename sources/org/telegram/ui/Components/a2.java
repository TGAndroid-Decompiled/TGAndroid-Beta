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
    public final int f24409a = 0;
    public final int[] f24410b;
    public final Object f24411c;
    public final ViewGroup d;
    public final Object f24412e;
    public final KeyEvent.Callback f24413f;
    public final Object h;
    public final Object f24414n;
    public final Object f24415r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f24411c = frameLayout;
        this.f24412e = d6Var;
        this.f24413f = e3Var;
        this.d = frameLayout2;
        this.f24410b = iArr;
        this.f24414n = strArr;
        this.h = iArr2;
        this.f24415r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24409a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24411c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f24412e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f24413f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24414n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24415r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new ad(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                q80 F = q80.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24410b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30065i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                nu nuVar = (nu) this.f24414n;
                ((boolean[]) this.f24411c)[0] = false;
                su.j((su) nuVar.f29140c, nuVar.f29138a, nuVar.f29139b, (int) (g5.b(null, (vd0) this.d, (vd0) this.f24412e, (vd0) this.f24413f, (vd0) this.h) / 1000), this.f24410b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f24415r).f21710a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, vd0 vd0Var4, nu nuVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f24411c = zArr;
        this.d = vd0Var;
        this.f24412e = vd0Var2;
        this.f24413f = vd0Var3;
        this.h = vd0Var4;
        this.f24414n = nuVar;
        this.f24410b = iArr;
        this.f24415r = z2Var;
    }
}
