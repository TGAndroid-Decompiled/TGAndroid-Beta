package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class s01 extends FrameLayout {
    public static final int e = 0;
    public TextView f26891a;
    public r01 f26892b;
    public TLRPC.TL_help_termsOfService f26893c;
    public int d;

    public final void a() {
        r01 r01Var = this.f26892b;
        int i10 = this.d;
        org.telegram.ui.wa0 wa0Var = (org.telegram.ui.wa0) r01Var;
        wa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = wa0Var.f37785a;
        ArrayList arrayList = launchActivity.f29933d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.i10(wa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f17250id = this.f26893c.f17252id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new bi.g1(12));
    }

    public void setDelegate(r01 r01Var) {
        this.f26892b = r01Var;
    }
}
