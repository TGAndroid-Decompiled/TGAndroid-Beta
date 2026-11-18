package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class n20 implements org.telegram.ui.ActionBar.r2 {
    public final f40 f50040a;

    public n20(f40 f40Var) {
        this.f50040a = f40Var;
    }

    @Override
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        f40 f40Var = this.f50040a;
        if (f40Var.E3 == 6) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("reminderhint", false)) {
                g12.edit().putBoolean("reminderhint", true).commit();
                if (f40Var.f47430i2 == null) {
                    org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(f40Var.getContext(), 8);
                    f40Var.f47430i2 = j30Var;
                    j30Var.setAlpha(0.0f);
                    f40Var.f47430i2.setVisibility(4);
                    f40Var.f47430i2.setShowingDuration(4000L);
                    f40Var.f30190b.addView(f40Var.f47430i2, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    f40Var.f47430i2.setText(org.telegram.messenger.gd.M0(2131743201, null));
                    f40Var.f47430i2.b();
                }
                f40Var.f47430i2.setExtraTranslationY(-org.telegram.messenger.g0.f24112m);
                f40Var.f47430i2.c(f40Var.f47492w1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
