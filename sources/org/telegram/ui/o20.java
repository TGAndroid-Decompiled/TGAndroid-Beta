package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class o20 implements org.telegram.ui.ActionBar.q2 {
    public final f40 f48377a;

    public o20(f40 f40Var) {
        this.f48377a = f40Var;
    }

    @Override
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        f40 f40Var = this.f48377a;
        if (f40Var.f45612z3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("reminderhint", false)) {
                e12.edit().putBoolean("reminderhint", true).commit();
                if (f40Var.f45531h2 == null) {
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(f40Var.getContext(), 8);
                    f40Var.f45531h2 = y20Var;
                    y20Var.setAlpha(0.0f);
                    f40Var.f45531h2.setVisibility(4);
                    f40Var.f45531h2.setShowingDuration(4000L);
                    f40Var.f28672b.addView(f40Var.f45531h2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    f40Var.f45531h2.setText(org.telegram.messenger.id.M0(2131743438, null));
                    f40Var.f45531h2.b();
                }
                f40Var.f45531h2.setExtraTranslationY(-org.telegram.messenger.g0.f22561m);
                f40Var.f45531h2.c(f40Var.f45592v1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
