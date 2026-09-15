package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class f01 extends FrameLayout {
    public static final int e = 0;
    public TextView f23773a;
    public e01 f23774b;
    public TLRPC.TL_help_termsOfService f23775c;
    public int d;

    public final void a() {
        e01 e01Var = this.f23774b;
        int i10 = this.d;
        org.telegram.ui.xa0 xa0Var = (org.telegram.ui.xa0) e01Var;
        xa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = xa0Var.f39562a;
        ArrayList arrayList = launchActivity.f30820d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.k0.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(xa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18167id = this.f23775c.f18169id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.t7(16));
    }

    public void setDelegate(e01 e01Var) {
        this.f23774b = e01Var;
    }
}
