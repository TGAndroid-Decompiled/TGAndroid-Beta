package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class q11 extends FrameLayout {
    public static final int f29649e = 0;
    public TextView f29650a;
    public p11 f29651b;
    public TLRPC.TL_help_termsOfService f29652c;
    public int d;

    public final void a() {
        p11 p11Var = this.f29651b;
        int i10 = this.d;
        org.telegram.ui.wa0 wa0Var = (org.telegram.ui.wa0) p11Var;
        wa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = wa0Var.f43114a;
        ArrayList arrayList = launchActivity.f33620d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.wz(wa0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19857id = this.f29652c.f19859id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.v7(16));
    }

    public void setDelegate(p11 p11Var) {
        this.f29651b = p11Var;
    }
}
