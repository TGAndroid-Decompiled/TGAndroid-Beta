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
    public static final int e = 0;
    public TextView f25846a;
    public i01 f25847b;
    public TLRPC.TL_help_termsOfService f25848c;
    public int d;

    public final void a() {
        i01 i01Var = this.f25847b;
        int i10 = this.d;
        org.telegram.ui.na0 na0Var = (org.telegram.ui.na0) i01Var;
        na0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = na0Var.f36556a;
        ArrayList arrayList = launchActivity.f31614a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList)).onResume();
        }
        launchActivity.f31661z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(na0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19239id = this.f25848c.f19241id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new nh.p5(12));
    }

    public void setDelegate(i01 i01Var) {
        this.f25847b = i01Var;
    }
}
