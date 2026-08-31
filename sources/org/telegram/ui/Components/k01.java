package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k01 extends FrameLayout {
    public static final int f28241e = 0;
    public TextView f28242a;
    public j01 f28243b;
    public TLRPC.TL_help_termsOfService f28244c;
    public int d;

    public final void a() {
        j01 j01Var = this.f28243b;
        int i10 = this.d;
        org.telegram.ui.oa0 oa0Var = (org.telegram.ui.oa0) j01Var;
        oa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = oa0Var.f39696a;
        ArrayList arrayList = launchActivity.f34136a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList)).onResume();
        }
        launchActivity.f34183z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.c10(oa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20898id = this.f28244c.f20900id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new oh.p5(12));
    }

    public void setDelegate(j01 j01Var) {
        this.f28243b = j01Var;
    }
}
