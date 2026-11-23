package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class m20 implements org.telegram.ui.ActionBar.q2 {
    public final e40 f49936a;

    public m20(e40 e40Var) {
        this.f49936a = e40Var;
    }

    @Override
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        e40 e40Var = this.f49936a;
        if (e40Var.E3 == 6) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("reminderhint", false)) {
                g12.edit().putBoolean("reminderhint", true).commit();
                if (e40Var.f47352i2 == null) {
                    org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(e40Var.getContext(), 8);
                    e40Var.f47352i2 = j30Var;
                    j30Var.setAlpha(0.0f);
                    e40Var.f47352i2.setVisibility(4);
                    e40Var.f47352i2.setShowingDuration(4000L);
                    e40Var.f30226b.addView(e40Var.f47352i2, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    e40Var.f47352i2.setText(org.telegram.messenger.gd.N0(2131743188, null));
                    e40Var.f47352i2.b();
                }
                e40Var.f47352i2.setExtraTranslationY(-org.telegram.messenger.g0.f24220m);
                e40Var.f47352i2.c(e40Var.f47414w1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
