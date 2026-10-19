package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class d11 extends FrameLayout {
    public static final int e = 0;
    public TextView f25387a;
    public c11 f25388b;
    public TLRPC.TL_help_termsOfService f25389c;
    public int d;

    public final void a() {
        c11 c11Var = this.f25388b;
        int i10 = this.d;
        org.telegram.ui.aa0 aa0Var = (org.telegram.ui.aa0) c11Var;
        aa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = aa0Var.f35314a;
        ArrayList arrayList = launchActivity.f33155d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.dz(aa0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20330id = this.f25389c.f20332id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ci.e6(16));
    }

    public void setDelegate(c11 c11Var) {
        this.f25388b = c11Var;
    }
}
