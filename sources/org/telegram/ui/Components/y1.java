package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class y1 implements View.OnClickListener {

    public final int f34751a = 0;

    public final int[] f34752b;

    public final Object f34753c;
    public final ViewGroup d;

    public final Object f34754e;

    public final KeyEvent.Callback f34755f;
    public final Object h;

    public final Object f34756n;

    public final Object f34757r;

    public y1(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.yf yfVar) {
        this.f34753c = frameLayout;
        this.f34754e = c6Var;
        this.f34755f = e3Var;
        this.d = frameLayout2;
        this.f34752b = iArr;
        this.f34756n = strArr;
        this.h = iArr2;
        this.f34757r = yfVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34751a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f34753c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f34754e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f34755f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f34756n;
                int[] iArr = (int[]) this.h;
                Runnable runnable = (Runnable) this.f34757r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new mc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.l3(26))).j();
                } else {
                    b70 b70VarF = b70.F(e3Var.container, c6Var, frameLayout2);
                    int i10 = 0;
                    while (true) {
                        int[] iArr2 = this.f34752b;
                        if (i10 >= iArr2.length) {
                            b70VarF.f26974i = 1;
                            b70VarF.Z();
                        } else {
                            b70VarF.c(0, strArr[i10], new y2(iArr, runnable, iArr2[i10]), false);
                            i10++;
                        }
                    }
                }
                break;
            default:
                boolean[] zArr = (boolean[]) this.f34753c;
                fc0 fc0Var = (fc0) this.d;
                fc0 fc0Var2 = (fc0) this.f34754e;
                fc0 fc0Var3 = (fc0) this.f34755f;
                fc0 fc0Var4 = (fc0) this.h;
                hh.h0 h0Var = (hh.h0) this.f34756n;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f34757r;
                zArr[0] = false;
                lt.j((lt) h0Var.f9368c, h0Var.f9366a, h0Var.f9367b, (int) (y4.c(null, fc0Var, fc0Var2, fc0Var3, fc0Var4) / 1000), this.f34752b[0]);
                z2Var.f23994a.dismissRunnable.run();
                break;
        }
    }

    public y1(boolean[] zArr, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4, hh.h0 h0Var, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f34753c = zArr;
        this.d = fc0Var;
        this.f34754e = fc0Var2;
        this.f34755f = fc0Var3;
        this.h = fc0Var4;
        this.f34756n = h0Var;
        this.f34752b = iArr;
        this.f34757r = z2Var;
    }
}
