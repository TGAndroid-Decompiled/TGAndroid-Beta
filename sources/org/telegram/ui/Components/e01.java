package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e01 extends FrameLayout {
    public static final int e = 0;
    public TextView f23521a;
    public d01 f23522b;
    public TLRPC.TL_help_termsOfService f23523c;
    public int d;

    public final void a() {
        d01 d01Var = this.f23522b;
        int i10 = this.d;
        org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) d01Var;
        sa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = sa0Var.f37223a;
        ArrayList arrayList = launchActivity.f30791d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.d10(sa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18138id = this.f23523c.f18140id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(d01 d01Var) {
        this.f23522b = d01Var;
    }
}
