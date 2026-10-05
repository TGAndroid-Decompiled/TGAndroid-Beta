package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e11 extends FrameLayout {
    public static final int f25944e = 0;
    public TextView f25945a;
    public d11 f25946b;
    public TLRPC.TL_help_termsOfService f25947c;
    public int d;

    public final void a() {
        d11 d11Var = this.f25946b;
        int i10 = this.d;
        org.telegram.ui.va0 va0Var = (org.telegram.ui.va0) d11Var;
        va0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = va0Var.f41685a;
        ArrayList arrayList = launchActivity.f33793d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(va0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20102id = this.f25947c.f20104id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(d11 d11Var) {
        this.f25946b = d11Var;
    }
}
