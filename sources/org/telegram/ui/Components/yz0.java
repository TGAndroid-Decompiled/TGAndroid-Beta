package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class yz0 extends FrameLayout {
    public static final int f35160e = 0;
    public TextView f35161a;
    public xz0 f35162b;
    public TLRPC.TL_help_termsOfService f35163c;
    public int d;

    public final void a() {
        xz0 xz0Var = this.f35162b;
        int i10 = this.d;
        org.telegram.ui.fa0 fa0Var = (org.telegram.ui.fa0) xz0Var;
        fa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = fa0Var.f38085a;
        ArrayList arrayList = launchActivity.Z;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList)).onResume();
        }
        launchActivity.f35608y0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.q00(fa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f22447id = this.f35163c.f22449id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new lh.o5(13));
    }

    public void setDelegate(xz0 xz0Var) {
        this.f35162b = xz0Var;
    }
}
