package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class j01 extends FrameLayout {
    public static final int f27949e = 0;
    public TextView f27950a;
    public i01 f27951b;
    public TLRPC.TL_help_termsOfService f27952c;
    public int d;

    public final void a() {
        i01 i01Var = this.f27951b;
        int i10 = this.d;
        org.telegram.ui.oa0 oa0Var = (org.telegram.ui.oa0) i01Var;
        oa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = oa0Var.f39632a;
        ArrayList arrayList = launchActivity.f34136a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList)).onResume();
        }
        launchActivity.f34183z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(oa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20900id = this.f27952c.f20902id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new oh.p5(12));
    }

    public void setDelegate(i01 i01Var) {
        this.f27951b = i01Var;
    }
}
