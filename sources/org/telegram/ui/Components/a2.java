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
    public final int f23103a = 0;
    public final int[] f23104b;
    public final Object f23105c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f23106f;
    public final Object h;
    public final Object f23107n;
    public final Object f23108r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.p6 p6Var) {
        this.f23105c = frameLayout;
        this.e = c6Var;
        this.f23106f = e3Var;
        this.d = frameLayout2;
        this.f23104b = iArr;
        this.f23107n = strArr;
        this.h = iArr2;
        this.f23108r = p6Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f23103a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f23105c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f23106f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f23107n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f23108r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new zc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(23))).j();
                    return;
                }
                l80 F = l80.F(e3Var.container, c6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f23104b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f26650i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                iu iuVar = (iu) this.f23107n;
                ((boolean[]) this.f23105c)[0] = false;
                nu.j((nu) iuVar.f25787c, iuVar.f25785a, iuVar.f25786b, (int) (g5.b(null, (ud0) this.d, (ud0) this.e, (ud0) this.f23106f, (ud0) this.h) / 1000), this.f23104b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f23108r).f20538a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4, iu iuVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f23105c = zArr;
        this.d = ud0Var;
        this.e = ud0Var2;
        this.f23106f = ud0Var3;
        this.h = ud0Var4;
        this.f23107n = iuVar;
        this.f23104b = iArr;
        this.f23108r = z2Var;
    }
}
