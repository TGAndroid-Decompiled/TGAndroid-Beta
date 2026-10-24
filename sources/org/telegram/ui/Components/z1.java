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
    public final int f33117a = 0;
    public final int[] f33118b;
    public final Object f33119c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f33120f;
    public final Object h;
    public final Object f33121n;
    public final Object f33122r;

    public z1(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.messenger.camera.i iVar) {
        this.f33119c = frameLayout;
        this.e = g6Var;
        this.f33120f = h3Var;
        this.d = frameLayout2;
        this.f33118b = iArr;
        this.f33121n = strArr;
        this.h = iArr2;
        this.f33122r = iVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f33117a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f33119c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f33120f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f33121n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f33122r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new vc(frameLayout, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(27))).j();
                    return;
                }
                h80 F = h80.F(h3Var.container, g6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f33118b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new c3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f26911i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                ai.p0 p0Var = (ai.p0) this.f33121n;
                ((boolean[]) this.f33119c)[0] = false;
                gu.j((gu) p0Var.f1973c, p0Var.f1971a, p0Var.f1972b, (int) (d5.c(null, (od0) this.d, (od0) this.e, (od0) this.f33120f, (od0) this.h) / 1000), this.f33118b[0]);
                runnable = ((org.telegram.ui.ActionBar.b3) this.f33122r).f20729a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public z1(boolean[] zArr, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4, ai.p0 p0Var, int[] iArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f33119c = zArr;
        this.d = od0Var;
        this.e = od0Var2;
        this.f33120f = od0Var3;
        this.h = od0Var4;
        this.f33121n = p0Var;
        this.f33118b = iArr;
        this.f33122r = b3Var;
    }
}
