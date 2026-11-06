package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class l20 implements org.telegram.ui.ActionBar.p2 {
    public final c40 f47390a;

    public l20(c40 c40Var) {
        this.f47390a = c40Var;
    }

    @Override
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        c40 c40Var = this.f47390a;
        if (c40Var.f44642w3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("reminderhint", false)) {
                e12.edit().putBoolean("reminderhint", true).commit();
                if (c40Var.f44561e2 == null) {
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(c40Var.getContext(), 8);
                    c40Var.f44561e2 = y20Var;
                    y20Var.setAlpha(0.0f);
                    c40Var.f44561e2.setVisibility(4);
                    c40Var.f44561e2.setShowingDuration(4000L);
                    c40Var.f28615b.addView(c40Var.f44561e2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    c40Var.f44561e2.setText(org.telegram.messenger.hd.M0(2131743439, null));
                    c40Var.f44561e2.b();
                }
                c40Var.f44561e2.setExtraTranslationY(-org.telegram.messenger.g0.f22531m);
                c40Var.f44561e2.c(c40Var.f44623s1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
