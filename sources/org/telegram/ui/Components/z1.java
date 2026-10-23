package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class z1 implements View.OnClickListener {
    public final int f33104a = 0;
    public final int[] f33105b;
    public final Object f33106c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f33107f;
    public final Object h;
    public final Object f33108n;
    public final Object f33109r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.f33106c = frameLayout;
        this.e = g6Var;
        this.f33107f = h3Var;
        this.d = frameLayout2;
        this.f33105b = iArr;
        this.f33108n = strArr;
        this.h = iArr2;
        this.f33109r = iVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f33104a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f33106c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f33107f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f33108n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f33109r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new xc(frameLayout, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(27))).j();
                    return;
                }
                j80 F = j80.F(h3Var.container, g6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f33105b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new d3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f27562i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                ai.p0 p0Var = (ai.p0) this.f33108n;
                ((boolean[]) this.f33106c)[0] = false;
                iu.j((iu) p0Var.f1973c, p0Var.f1971a, p0Var.f1972b, (int) (f5.c(null, (qd0) this.d, (qd0) this.e, (qd0) this.f33107f, (qd0) this.h) / 1000), this.f33105b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f33109r).f20728a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, qd0 qd0Var4, ai.p0 p0Var, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f33106c = zArr;
        this.d = qd0Var;
        this.e = qd0Var2;
        this.f33107f = qd0Var3;
        this.h = qd0Var4;
        this.f33108n = p0Var;
        this.f33105b = iArr;
        this.f33109r = b3Var;
    }
}
