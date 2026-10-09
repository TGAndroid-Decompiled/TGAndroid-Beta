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
    public final int f24536a = 0;
    public final int[] f24537b;
    public final Object f24538c;
    public final ViewGroup d;
    public final Object f24539e;
    public final KeyEvent.Callback f24540f;
    public final Object h;
    public final Object f24541n;
    public final Object f24542r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f24538c = frameLayout;
        this.f24539e = e6Var;
        this.f24540f = f3Var;
        this.d = frameLayout2;
        this.f24537b = iArr;
        this.f24541n = strArr;
        this.h = iArr2;
        this.f24542r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24536a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24538c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f24539e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24540f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24541n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24542r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new ad(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                p80 F = p80.F(f3Var.container, e6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24537b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f29771i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                mu muVar = (mu) this.f24541n;
                ((boolean[]) this.f24538c)[0] = false;
                ru.j((ru) muVar.f28938c, muVar.f28936a, muVar.f28937b, (int) (g5.b(null, (ud0) this.d, (ud0) this.f24539e, (ud0) this.f24540f, (ud0) this.h) / 1000), this.f24537b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24542r).f20380a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4, mu muVar, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24538c = zArr;
        this.d = ud0Var;
        this.f24539e = ud0Var2;
        this.f24540f = ud0Var3;
        this.h = ud0Var4;
        this.f24541n = muVar;
        this.f24537b = iArr;
        this.f24542r = a3Var;
    }
}
