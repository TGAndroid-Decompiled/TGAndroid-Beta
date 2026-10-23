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
    public TextView f26760a;
    public g11 f26761b;
    public TLRPC.TL_help_termsOfService f26762c;
    public int d;

    public final void a() {
        g11 g11Var = this.f26761b;
        int i10 = this.d;
        org.telegram.ui.ha0 ha0Var = (org.telegram.ui.ha0) g11Var;
        ha0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ha0Var.f37809a;
        ArrayList arrayList = launchActivity.f33463d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) i2.o1.i(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.fz(ha0Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20398id = this.f26762c.f20400id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ci.d6(16));
    }

    public void setDelegate(g11 g11Var) {
        this.f26761b = g11Var;
    }
}
