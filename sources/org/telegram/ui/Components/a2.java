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
    public final int f24421a = 0;
    public final int[] f24422b;
    public final Object f24423c;
    public final ViewGroup d;
    public final Object f24424e;
    public final KeyEvent.Callback f24425f;
    public final Object h;
    public final Object f24426n;
    public final Object f24427r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f24423c = frameLayout;
        this.f24424e = e6Var;
        this.f24425f = f3Var;
        this.d = frameLayout2;
        this.f24422b = iArr;
        this.f24426n = strArr;
        this.h = iArr2;
        this.f24427r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24421a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24423c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f24424e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24425f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24426n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24427r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new ad(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                q80 F = q80.F(f3Var.container, e6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24422b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30102i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                nu nuVar = (nu) this.f24426n;
                ((boolean[]) this.f24423c)[0] = false;
                su.j((su) nuVar.f29235c, nuVar.f29233a, nuVar.f29234b, (int) (g5.b(null, (vd0) this.d, (vd0) this.f24424e, (vd0) this.f24425f, (vd0) this.h) / 1000), this.f24422b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24427r).f20384a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, vd0 vd0Var4, nu nuVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24423c = zArr;
        this.d = vd0Var;
        this.f24424e = vd0Var2;
        this.f24425f = vd0Var3;
        this.h = vd0Var4;
        this.f24426n = nuVar;
        this.f24422b = iArr;
        this.f24427r = a3Var;
    }
}
