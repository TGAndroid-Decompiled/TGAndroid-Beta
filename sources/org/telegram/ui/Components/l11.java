package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class l11 extends FrameLayout {
    public static final int f28136e = 0;
    public TextView f28137a;
    public k11 f28138b;
    public TLRPC.TL_help_termsOfService f28139c;
    public int d;

    public final void a() {
        k11 k11Var = this.f28138b;
        int i10 = this.d;
        org.telegram.ui.va0 va0Var = (org.telegram.ui.va0) k11Var;
        va0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = va0Var.f42808a;
        ArrayList arrayList = launchActivity.f33821d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.uz(va0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20097id = this.f28139c.f20099id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.v7(16));
    }

    public void setDelegate(k11 k11Var) {
        this.f28138b = k11Var;
    }
}
