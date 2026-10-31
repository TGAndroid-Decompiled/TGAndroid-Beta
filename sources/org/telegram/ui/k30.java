package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class k30 implements org.telegram.ui.ActionBar.t2 {
    public final b50 f38674a;

    public k30(b50 b50Var) {
        this.f38674a = b50Var;
    }

    @Override
    public final void w() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        b50 b50Var = this.f38674a;
        if (b50Var.f36093w3 == 6) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("reminderhint", false)) {
                d12.edit().putBoolean("reminderhint", true).commit();
                if (b50Var.f36010e2 == null) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(b50Var.getContext(), 8);
                    b50Var.f36010e2 = q30Var;
                    q30Var.setAlpha(0.0f);
                    b50Var.f36010e2.setVisibility(4);
                    b50Var.f36010e2.setShowingDuration(4000L);
                    b50Var.f21586b.addView(b50Var.f36010e2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    b50Var.f36010e2.setText(org.telegram.messenger.cd.L0(2131743464, null));
                    b50Var.f36010e2.d();
                }
                b50Var.f36010e2.setExtraTranslationY(-org.telegram.messenger.i0.f16020m);
                b50Var.f36010e2.f(b50Var.f36073s1, true);
            }
        }
    }

    @Override
    public final boolean y() {
        return true;
    }
}
