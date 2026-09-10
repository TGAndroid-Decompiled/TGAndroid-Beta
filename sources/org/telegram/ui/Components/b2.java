package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class b2 implements View.OnClickListener {
    public final int f21680a = 0;
    public final int[] f21681b;
    public final Object f21682c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f21683f;
    public final Object h;
    public final Object f21684n;
    public final Object f21685r;

    public b2(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.da daVar) {
        this.f21682c = frameLayout;
        this.e = f6Var;
        this.f21683f = h3Var;
        this.d = frameLayout2;
        this.f21681b = iArr;
        this.f21684n = strArr;
        this.h = iArr2;
        this.f21685r = daVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f21680a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f21682c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f21683f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f21684n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f21685r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new wc(frameLayout, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new bi.f0(17))).j();
                    return;
                }
                w70 F = w70.F(h3Var.container, f6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f21681b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f28683i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                au auVar = (au) this.f21684n;
                ((boolean[]) this.f21682c)[0] = false;
                fu.j((fu) auVar.f21589c, auVar.f21587a, auVar.f21588b, (int) (d5.c(null, (dd0) this.d, (dd0) this.e, (dd0) this.f21683f, (dd0) this.h) / 1000), this.f21681b[0]);
                runnable = ((org.telegram.ui.ActionBar.c3) this.f21685r).f17571a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public b2(boolean[] zArr, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4, au auVar, int[] iArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f21682c = zArr;
        this.d = dd0Var;
        this.e = dd0Var2;
        this.f21683f = dd0Var3;
        this.h = dd0Var4;
        this.f21684n = auVar;
        this.f21681b = iArr;
        this.f21685r = c3Var;
    }
}
