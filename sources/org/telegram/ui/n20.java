package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class n20 implements org.telegram.ui.ActionBar.p2 {
    public final e40 f48062a;

    public n20(e40 e40Var) {
        this.f48062a = e40Var;
    }

    @Override
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        e40 e40Var = this.f48062a;
        if (e40Var.f45284w3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("reminderhint", false)) {
                e12.edit().putBoolean("reminderhint", true).commit();
                if (e40Var.f45203e2 == null) {
                    org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(e40Var.getContext(), 8);
                    e40Var.f45203e2 = z20Var;
                    z20Var.setAlpha(0.0f);
                    e40Var.f45203e2.setVisibility(4);
                    e40Var.f45203e2.setShowingDuration(4000L);
                    e40Var.f28624b.addView(e40Var.f45203e2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    e40Var.f45203e2.setText(org.telegram.messenger.id.M0(2131743438, null));
                    e40Var.f45203e2.b();
                }
                e40Var.f45203e2.setExtraTranslationY(-org.telegram.messenger.g0.f22557m);
                e40Var.f45203e2.c(e40Var.f45265s1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
