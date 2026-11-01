package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class j30 implements org.telegram.ui.ActionBar.t2 {
    public final a50 f38265a;

    public j30(a50 a50Var) {
        this.f38265a = a50Var;
    }

    @Override
    public final void w() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        a50 a50Var = this.f38265a;
        if (a50Var.f35677w3 == 6) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("reminderhint", false)) {
                d12.edit().putBoolean("reminderhint", true).commit();
                if (a50Var.f35594e2 == null) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(a50Var.getContext(), 8);
                    a50Var.f35594e2 = q30Var;
                    q30Var.setAlpha(0.0f);
                    a50Var.f35594e2.setVisibility(4);
                    a50Var.f35594e2.setShowingDuration(4000L);
                    a50Var.f21587b.addView(a50Var.f35594e2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    a50Var.f35594e2.setText(org.telegram.messenger.dd.L0(2131743464, null));
                    a50Var.f35594e2.d();
                }
                a50Var.f35594e2.setExtraTranslationY(-org.telegram.messenger.i0.f16166m);
                a50Var.f35594e2.f(a50Var.f35657s1, true);
            }
        }
    }

    @Override
    public final boolean y() {
        return true;
    }
}
