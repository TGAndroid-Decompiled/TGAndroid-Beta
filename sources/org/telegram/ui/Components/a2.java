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
    public final int f24445a = 0;
    public final int[] f24446b;
    public final Object f24447c;
    public final ViewGroup d;
    public final Object f24448e;
    public final KeyEvent.Callback f24449f;
    public final Object h;
    public final Object f24450n;
    public final Object f24451r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f24447c = frameLayout;
        this.f24448e = d6Var;
        this.f24449f = e3Var;
        this.d = frameLayout2;
        this.f24446b = iArr;
        this.f24450n = strArr;
        this.h = iArr2;
        this.f24451r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24445a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24447c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f24448e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f24449f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24450n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24451r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new ad(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                p80 F = p80.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24446b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f29761i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                nu nuVar = (nu) this.f24450n;
                ((boolean[]) this.f24447c)[0] = false;
                su.j((su) nuVar.f29277c, nuVar.f29275a, nuVar.f29276b, (int) (g5.b(null, (ud0) this.d, (ud0) this.f24448e, (ud0) this.f24449f, (ud0) this.h) / 1000), this.f24446b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f24451r).f21746a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4, nu nuVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f24447c = zArr;
        this.d = ud0Var;
        this.f24448e = ud0Var2;
        this.f24449f = ud0Var3;
        this.h = ud0Var4;
        this.f24450n = nuVar;
        this.f24446b = iArr;
        this.f24451r = z2Var;
    }
}
