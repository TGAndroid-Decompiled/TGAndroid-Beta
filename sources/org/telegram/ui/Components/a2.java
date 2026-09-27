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

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.g3 g3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.n5 n5Var) {
        this.f22506c = frameLayout;
        this.e = e6Var;
        this.f22507f = g3Var;
        this.d = frameLayout2;
        this.f22505b = iArr;
        this.f22508n = strArr;
        this.h = iArr2;
        this.f22509r = n5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22504a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22506c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f22507f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22508n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22509r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                a80 F = a80.F(g3Var.container, e6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22505b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f22588i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                yt ytVar = (yt) this.f22508n;
                ((boolean[]) this.f22506c)[0] = false;
                du.j((du) ytVar.f30775c, ytVar.f30773a, ytVar.f30774b, (int) (e5.c(null, (ed0) this.d, (ed0) this.e, (ed0) this.f22507f, (ed0) this.h) / 1000), this.f22505b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f22509r).f18683a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, ed0 ed0Var4, yt ytVar, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f22506c = zArr;
        this.d = ed0Var;
        this.e = ed0Var2;
        this.f22507f = ed0Var3;
        this.h = ed0Var4;
        this.f22508n = ytVar;
        this.f22505b = iArr;
        this.f22509r = b3Var;
    }
}
