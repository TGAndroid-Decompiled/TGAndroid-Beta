package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class v01 extends FrameLayout {
    public static final int e = 0;
    public TextView f28935a;
    public u01 f28936b;
    public TLRPC.TL_help_termsOfService f28937c;
    public int d;

    public final void a() {
        u01 u01Var = this.f28936b;
        int i10 = this.d;
        org.telegram.ui.za0 za0Var = (org.telegram.ui.za0) u01Var;
        za0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = za0Var.f40173a;
        ArrayList arrayList = launchActivity.f31125d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(za0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18398id = this.f28937c.f18400id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.t7(16));
    }

    public void setDelegate(u01 u01Var) {
        this.f28936b = u01Var;
    }
}
