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
    public final int f23415a = 0;
    public final int[] f23416b;
    public final Object f23417c;
    public final ViewGroup d;
    public final Object e;
    public final KeyEvent.Callback f23418f;
    public final Object h;
    public final Object f23419n;
    public final Object f23420r;

    public a2(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, org.telegram.ui.p6 p6Var) {
        this.f23417c = frameLayout;
        this.e = c6Var;
        this.f23418f = e3Var;
        this.d = frameLayout2;
        this.f23416b = iArr;
        this.f23419n = strArr;
        this.h = iArr2;
        this.f23420r = p6Var;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f23415a) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f23417c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f23418f;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                String[] strArr = (String[]) this.f23419n;
                int[] iArr = (int[]) this.h;
                Runnable runnable2 = (Runnable) this.f23420r;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    new zc(frameLayout, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ah.j(23))).j();
                    return;
                }
                m80 F = m80.F(e3Var.container, c6Var, frameLayout2);
                int i10 = 0;
                while (true) {
                    int[] iArr2 = this.f23416b;
                    if (i10 < iArr2.length) {
                        F.c(0, strArr[i10], new f3(iArr, runnable2, iArr2[i10]), false);
                        i10++;
                    } else {
                        F.f27280i = 1;
                        F.Z();
                        return;
                    }
                }
            default:
                iu iuVar = (iu) this.f23419n;
                ((boolean[]) this.f23417c)[0] = false;
                nu.j((nu) iuVar.f26094c, iuVar.f26092a, iuVar.f26093b, (int) (g5.b(null, (ud0) this.d, (ud0) this.e, (ud0) this.f23418f, (ud0) this.h) / 1000), this.f23416b[0]);
                runnable = ((org.telegram.ui.ActionBar.z2) this.f23420r).f20838a.dismissRunnable;
                runnable.run();
                return;
        }
    }

    public a2(boolean[] zArr, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4, iu iuVar, int[] iArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f23417c = zArr;
        this.d = ud0Var;
        this.e = ud0Var2;
        this.f23418f = ud0Var3;
        this.h = ud0Var4;
        this.f23419n = iuVar;
        this.f23416b = iArr;
        this.f23420r = z2Var;
    }
}
