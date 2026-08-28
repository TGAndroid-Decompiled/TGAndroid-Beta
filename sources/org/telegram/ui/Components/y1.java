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
    public final int f34827a = 0;
    public final int[] f34828b;
    public final Object f34829c;
    public final ViewGroup d;
    public final Object f34830e;
    public final KeyEvent.Callback f34831f;
    public final Object h;
    public final Object f34832n;
    public final Object f34833r;

    public y1(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.k6 k6Var) {
        this.f34829c = frameLayout;
        this.f34830e = b6Var;
        this.f34831f = f3Var;
        this.d = frameLayout2;
        this.f34828b = iArr;
        this.f34832n = strArr;
        this.h = iArr2;
        this.f34833r = k6Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f34827a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f34829c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f34830e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f34831f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f34832n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f34833r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new oc(frameLayout, b6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new bg.d2(27))).j();
                    return;
                }
                x60 F = x60.F(f3Var.container, b6Var, frameLayout2);
                int i9 = 0;
                while (true) {
                    int[] iArr2 = this.f34828b;
                    if (i9 < iArr2.length) {
                        F.c(0, strArr[i9], new y2(iArr, runnable2, iArr2[i9]), false);
                        i9++;
                    } else {
                        F.f34562i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                gh.h0 h0Var = (gh.h0) this.f34832n;
                ((boolean[]) this.f34829c)[0] = false;
                mt.j((mt) h0Var.f8190c, h0Var.f8188a, h0Var.f8189b, (int) (y4.c(null, (bc0) this.d, (bc0) this.f34830e, (bc0) this.f34831f, (bc0) this.h) / 1000), this.f34828b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f34833r).f22713a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public y1(boolean[] zArr, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, bc0 bc0Var4, gh.h0 h0Var, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f34829c = zArr;
        this.d = bc0Var;
        this.f34830e = bc0Var2;
        this.f34831f = bc0Var3;
        this.h = bc0Var4;
        this.f34832n = h0Var;
        this.f34828b = iArr;
        this.f34833r = a3Var;
    }
}
