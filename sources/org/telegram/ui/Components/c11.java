package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class c11 extends FrameLayout {
    public static final int e = 0;
    public TextView f25070a;
    public b11 f25071b;
    public TLRPC.TL_help_termsOfService f25072c;
    public int d;

    public final void a() {
        b11 b11Var = this.f25071b;
        int i10 = this.d;
        org.telegram.ui.ca0 ca0Var = (org.telegram.ui.ca0) b11Var;
        ca0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ca0Var.f35892a;
        ArrayList arrayList = launchActivity.f33149d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.fz(ca0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20327id = this.f25072c.f20329id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ci.e6(16));
    }

    public void setDelegate(b11 b11Var) {
        this.f25071b = b11Var;
    }
}
