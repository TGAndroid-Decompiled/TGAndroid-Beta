package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e01 extends FrameLayout {
    public static final int f25501e = 0;
    public TextView f25502a;
    public d01 f25503b;
    public TLRPC.TL_help_termsOfService f25504c;
    public int d;

    public final void a() {
        d01 d01Var = this.f25503b;
        int i10 = this.d;
        org.telegram.ui.xa0 xa0Var = (org.telegram.ui.xa0) d01Var;
        xa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = xa0Var.f42654a;
        ArrayList arrayList = launchActivity.f33429d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(xa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19924id = this.f25504c.f19926id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new bi.c7(16));
    }

    public void setDelegate(d01 d01Var) {
        this.f25503b = d01Var;
    }
}
