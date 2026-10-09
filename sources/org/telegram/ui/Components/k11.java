package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k11 extends FrameLayout {
    public static final int f27816e = 0;
    public TextView f27817a;
    public j11 f27818b;
    public TLRPC.TL_help_termsOfService f27819c;
    public int d;

    public final void a() {
        j11 j11Var = this.f27818b;
        int i10 = this.d;
        org.telegram.ui.va0 va0Var = (org.telegram.ui.va0) j11Var;
        va0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = va0Var.f42764a;
        ArrayList arrayList = launchActivity.f33783d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.uz(va0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20093id = this.f27819c.f20095id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.v7(16));
    }

    public void setDelegate(j11 j11Var) {
        this.f27818b = j11Var;
    }
}
