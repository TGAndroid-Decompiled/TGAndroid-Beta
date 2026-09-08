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
    public static final int f25528e = 0;
    public TextView f25529a;
    public d01 f25530b;
    public TLRPC.TL_help_termsOfService f25531c;
    public int d;

    public final void a() {
        d01 d01Var = this.f25530b;
        int i10 = this.d;
        org.telegram.ui.xa0 xa0Var = (org.telegram.ui.xa0) d01Var;
        xa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = xa0Var.f42681a;
        ArrayList arrayList = launchActivity.f33456d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.g10(xa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19951id = this.f25531c.f19953id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new bi.c7(16));
    }

    public void setDelegate(d01 d01Var) {
        this.f25530b = d01Var;
    }
}
