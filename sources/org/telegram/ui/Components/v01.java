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
    public TextView f28979a;
    public u01 f28980b;
    public TLRPC.TL_help_termsOfService f28981c;
    public int d;

    public final void a() {
        u01 u01Var = this.f28980b;
        int i10 = this.d;
        org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) u01Var;
        ra0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ra0Var.f37379a;
        ArrayList arrayList = launchActivity.f31180d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(ra0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18407id = this.f28981c.f18409id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(u01 u01Var) {
        this.f28980b = u01Var;
    }
}
