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
    public static final int f25515e = 0;
    public TextView f25516a;
    public c11 f25517b;
    public TLRPC.TL_help_termsOfService f25518c;
    public int d;

    public final void a() {
        c11 c11Var = this.f25517b;
        int i10 = this.d;
        org.telegram.ui.va0 va0Var = (org.telegram.ui.va0) c11Var;
        va0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = va0Var.f41636a;
        ArrayList arrayList = launchActivity.f33773d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(va0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20092id = this.f25518c.f20094id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(c11 c11Var) {
        this.f25517b = c11Var;
    }
}
