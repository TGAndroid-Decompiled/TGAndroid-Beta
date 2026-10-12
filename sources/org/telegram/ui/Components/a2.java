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
    public final int f24209a = 0;
    public final int[] f24210b;
    public final Object f24211c;
    public final ViewGroup d;
    public final Object f24212e;
    public final KeyEvent.Callback f24213f;
    public final Object h;
    public final Object f24214n;
    public final Object f24215r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.ActionBar.l5 l5Var) {
        this.f24211c = frameLayout;
        this.f24212e = c6Var;
        this.f24213f = e3Var;
        this.d = frameLayout2;
        this.f24210b = iArr;
        this.f24214n = strArr;
        this.h = iArr2;
        this.f24215r = l5Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f24209a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f24211c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f24212e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f24213f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f24214n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f24215r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new zc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ai.f(22))).j();
                    return;
                }
                s80 F = s80.F(e3Var.container, c6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f24210b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f30454i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                pu puVar = (pu) this.f24214n;
                ((boolean[]) this.f24211c)[0] = false;
                uu.j((uu) puVar.f29593c, puVar.f29591a, puVar.f29592b, (int) (g5.b(null, (yd0) this.d, (yd0) this.f24212e, (yd0) this.f24213f, (yd0) this.h) / 1000), this.f24210b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f24215r).f21484a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, yd0 yd0Var4, pu puVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f24211c = zArr;
        this.d = yd0Var;
        this.f24212e = yd0Var2;
        this.f24213f = yd0Var3;
        this.h = yd0Var4;
        this.f24214n = puVar;
        this.f24210b = iArr;
        this.f24215r = z2Var;
    }
}
