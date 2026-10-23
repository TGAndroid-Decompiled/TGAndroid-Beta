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
    public final int f24466a = 0;
    public final int[] f24467b;
    public final Object f24468c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f24469f;
    public final Object h;
    public final Object f24470n;
    public final Object f24471r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.f24468c = frameLayout;
        this.e = d6Var;
        this.f24469f = f3Var;
        this.d = frameLayout2;
        this.f24467b = iArr;
        this.f24470n = strArr;
        this.h = iArr2;
        this.f24471r = iVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24466a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24468c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f24469f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24470n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24471r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(27))).j();
                    return;
                }
                i80 F = i80.F(f3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24467b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new e3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f27171i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                ai.p0 p0Var = (ai.p0) this.f24470n;
                ((boolean[]) this.f24468c)[0] = false;
                iu.j((iu) p0Var.f1982c, p0Var.f1980a, p0Var.f1981b, (int) (f5.b(null, (od0) this.d, (od0) this.e, (od0) this.f24469f, (od0) this.h) / 1000), this.f24467b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f24471r).f20617a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4, ai.p0 p0Var, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f24468c = zArr;
        this.d = od0Var;
        this.e = od0Var2;
        this.f24469f = od0Var3;
        this.h = od0Var4;
        this.f24470n = p0Var;
        this.f24467b = iArr;
        this.f24471r = a3Var;
    }
}
