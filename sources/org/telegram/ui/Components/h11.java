package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h11 extends FrameLayout {
    public static final int e = 0;
    public TextView f25152a;
    public g11 f25153b;
    public TLRPC.TL_help_termsOfService f25154c;
    public int d;

    public final void a() {
        g11 g11Var = this.f25153b;
        int i10 = this.d;
        org.telegram.ui.za0 za0Var = (org.telegram.ui.za0) g11Var;
        za0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = za0Var.f42253a;
        ArrayList arrayList = launchActivity.f31811d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) i2.d.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.zz(za0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18971id = this.f25154c.f18973id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new bi.g7(16));
    }

    public void setDelegate(g11 g11Var) {
        this.f25153b = g11Var;
    }
}
