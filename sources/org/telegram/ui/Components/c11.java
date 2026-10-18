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
    public TextView f25077a;
    public b11 f25078b;
    public TLRPC.TL_help_termsOfService f25079c;
    public int d;

    public final void a() {
        b11 b11Var = this.f25078b;
        int i10 = this.d;
        org.telegram.ui.ca0 ca0Var = (org.telegram.ui.ca0) b11Var;
        ca0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ca0Var.f35905a;
        ArrayList arrayList = launchActivity.f33156d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i2.d.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.fz(ca0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20334id = this.f25079c.f20336id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ci.e6(16));
    }

    public void setDelegate(b11 b11Var) {
        this.f25078b = b11Var;
    }
}
