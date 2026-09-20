package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class t01 extends FrameLayout {
    public static final int e = 0;
    public TextView f28255a;
    public s01 f28256b;
    public TLRPC.TL_help_termsOfService f28257c;
    public int d;

    public final void a() {
        s01 s01Var = this.f28256b;
        int i10 = this.d;
        org.telegram.ui.za0 za0Var = (org.telegram.ui.za0) s01Var;
        za0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = za0Var.f40151a;
        ArrayList arrayList = launchActivity.f31104d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(za0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18383id = this.f28257c.f18385id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.t7(16));
    }

    public void setDelegate(s01 s01Var) {
        this.f28256b = s01Var;
    }
}
