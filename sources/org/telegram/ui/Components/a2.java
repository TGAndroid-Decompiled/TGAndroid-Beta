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
    public final int f22503a = 0;
    public final int[] f22504b;
    public final Object f22505c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22506f;
    public final Object h;
    public final Object f22507n;
    public final Object f22508r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f22505c = frameLayout;
        this.e = d6Var;
        this.f22506f = e3Var;
        this.d = frameLayout2;
        this.f22504b = iArr;
        this.f22507n = strArr;
        this.h = iArr2;
        this.f22508r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22503a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22505c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22506f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22507n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22508r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new yc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                a80 F = a80.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22504b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f22586i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                yt ytVar = (yt) this.f22507n;
                ((boolean[]) this.f22505c)[0] = false;
                du.j((du) ytVar.f30742c, ytVar.f30740a, ytVar.f30741b, (int) (e5.c(null, (gd0) this.d, (gd0) this.e, (gd0) this.f22506f, (gd0) this.h) / 1000), this.f22504b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f22508r).f19951a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gd0 gd0Var4, yt ytVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f22505c = zArr;
        this.d = gd0Var;
        this.e = gd0Var2;
        this.f22506f = gd0Var3;
        this.h = gd0Var4;
        this.f22507n = ytVar;
        this.f22504b = iArr;
        this.f22508r = z2Var;
    }
}
