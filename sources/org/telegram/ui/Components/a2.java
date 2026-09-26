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
    public final int f22559a = 0;
    public final int[] f22560b;
    public final Object f22561c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f22562f;
    public final Object h;
    public final Object f22563n;
    public final Object f22564r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f22561c = frameLayout;
        this.e = d6Var;
        this.f22562f = e3Var;
        this.d = frameLayout2;
        this.f22560b = iArr;
        this.f22563n = strArr;
        this.h = iArr2;
        this.f22564r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22559a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f22561c;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f22562f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f22563n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f22564r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                y70 F = y70.F(e3Var.container, d6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f22560b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30536i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                xt xtVar = (xt) this.f22563n;
                ((boolean[]) this.f22561c)[0] = false;
                cu.j((cu) xtVar.f30400c, xtVar.f30398a, xtVar.f30399b, (int) (e5.c(null, (ed0) this.d, (ed0) this.e, (ed0) this.f22562f, (ed0) this.h) / 1000), this.f22560b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f22564r).f19949a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, ed0 ed0Var4, xt xtVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f22561c = zArr;
        this.d = ed0Var;
        this.e = ed0Var2;
        this.f22562f = ed0Var3;
        this.h = ed0Var4;
        this.f22563n = xtVar;
        this.f22560b = iArr;
        this.f22564r = z2Var;
    }
}
