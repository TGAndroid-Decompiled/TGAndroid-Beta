package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class c2 implements View.OnClickListener {
    public final int f27277a = 0;
    public final int[] f27278b;
    public final Object f27279c;
    public final ViewGroup d;
    public final Object f27280e;
    public final KeyEvent.Callback f27281f;
    public final Object h;
    public final Object f27282n;
    public final Object f27283r;

    public c2(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.f3 f3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.gg ggVar) {
        this.f27279c = frameLayout;
        this.f27280e = c6Var;
        this.f27281f = f3Var;
        this.d = frameLayout2;
        this.f27278b = iArr;
        this.f27282n = strArr;
        this.h = iArr2;
        this.f27283r = ggVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27277a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f27279c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f27280e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f27281f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f27282n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f27283r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new tc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ag.o0(29))).j();
                    return;
                }
                j70 F = j70.F(f3Var.container, c6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f27278b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f29582i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                jh.g0 g0Var = (jh.g0) this.f27282n;
                ((boolean[]) this.f27279c)[0] = false;
                st.j((st) g0Var.f12090c, g0Var.f12088a, g0Var.f12089b, (int) (c5.c(null, (qc0) this.d, (qc0) this.f27280e, (qc0) this.f27281f, (qc0) this.h) / 1000), this.f27278b[0]);
                runnable = ((org.telegram.ui.ActionBar.a3) this.f27283r).f22729a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public c2(boolean[] zArr, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, qc0 qc0Var4, jh.g0 g0Var, int[] iArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f27279c = zArr;
        this.d = qc0Var;
        this.f27280e = qc0Var2;
        this.f27281f = qc0Var3;
        this.h = qc0Var4;
        this.f27282n = g0Var;
        this.f27278b = iArr;
        this.f27283r = a3Var;
    }
}
