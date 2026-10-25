package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class p11 extends FrameLayout {
    public static final int e = 0;
    public TextView f31410a;
    public o11 f31411b;
    public TLRPC.TL_help_termsOfService f31412c;
    public int d;

    public final void a() {
        o11 o11Var = this.f31411b;
        int i10 = this.d;
        org.telegram.ui.ga0 ga0Var = (org.telegram.ui.ga0) o11Var;
        ga0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ga0Var.f39577a;
        ArrayList arrayList = launchActivity.f35526d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.p00(ga0Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f22082id = this.f31412c.f22084id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.d6(16));
    }

    public void setDelegate(o11 o11Var) {
        this.f31411b = o11Var;
    }
}
