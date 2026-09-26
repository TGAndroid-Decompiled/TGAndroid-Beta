package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class s01 extends FrameLayout {
    public static final int e = 0;
    public TextView f28094a;
    public r01 f28095b;
    public TLRPC.TL_help_termsOfService f28096c;
    public int d;

    public final void a() {
        r01 r01Var = this.f28095b;
        int i10 = this.d;
        org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) r01Var;
        ra0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ra0Var.f37277a;
        ArrayList arrayList = launchActivity.f31106d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(ra0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18390id = this.f28096c.f18392id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(r01 r01Var) {
        this.f28095b = r01Var;
    }
}
