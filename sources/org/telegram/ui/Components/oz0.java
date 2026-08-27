package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

public final class oz0 extends FrameLayout {

    public static final int f31448e = 0;

    public TextView f31449a;

    public nz0 f31450b;

    public TLRPC.TL_help_termsOfService f31451c;
    public int d;

    public final void a() {
        nz0 nz0Var = this.f31450b;
        int i10 = this.d;
        org.telegram.ui.ga0 ga0Var = (org.telegram.ui.ga0) nz0Var;
        ga0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ga0Var.f38379a;
        ArrayList arrayList = launchActivity.Z;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList)).onResume();
        }
        launchActivity.f35544y0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.r00(ga0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f22435id = this.f31451c.f22437id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new jh.m5(13));
    }

    public void setDelegate(nz0 nz0Var) {
        this.f31450b = nz0Var;
    }
}
