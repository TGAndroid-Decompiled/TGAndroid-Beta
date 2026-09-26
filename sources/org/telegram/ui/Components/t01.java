package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class t01 extends FrameLayout {
    public static final int e = 0;
    public TextView f28404a;
    public s01 f28405b;
    public TLRPC.TL_help_termsOfService f28406c;
    public int d;

    public final void a() {
        s01 s01Var = this.f28405b;
        int i10 = this.d;
        org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) s01Var;
        ra0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ra0Var.f37276a;
        ArrayList arrayList = launchActivity.f31105d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(ra0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18390id = this.f28406c.f18392id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(s01 s01Var) {
        this.f28405b = s01Var;
    }
}
