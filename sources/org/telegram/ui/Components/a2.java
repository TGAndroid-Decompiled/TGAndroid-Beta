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
    public final int f22504a = 0;
    public final int[] f22505b;
    public final Object f22506c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22507f;
    public final Object h;
    public final Object f22508n;
    public final Object f22509r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f22506c = frameLayout;
        this.e = d6Var;
        this.f22507f = e3Var;
        this.d = frameLayout2;
        this.f22505b = iArr;
        this.f22508n = strArr;
        this.h = iArr2;
        this.f22509r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22504a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22506c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22507f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22508n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22509r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                z70 F = z70.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22505b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30821i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                yt ytVar = (yt) this.f22508n;
                ((boolean[]) this.f22506c)[0] = false;
                du.j((du) ytVar.f30702c, ytVar.f30700a, ytVar.f30701b, (int) (e5.c(null, (fd0) this.d, (fd0) this.e, (fd0) this.f22507f, (fd0) this.h) / 1000), this.f22505b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f22509r).f19949a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, fd0 fd0Var4, yt ytVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f22506c = zArr;
        this.d = fd0Var;
        this.e = fd0Var2;
        this.f22507f = fd0Var3;
        this.h = fd0Var4;
        this.f22508n = ytVar;
        this.f22505b = iArr;
        this.f22509r = z2Var;
    }
}
