package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class j01 extends FrameLayout {
    public static final int e = 0;
    public TextView f25802a;
    public i01 f25803b;
    public TLRPC.TL_help_termsOfService f25804c;
    public int d;

    public final void a() {
        i01 i01Var = this.f25803b;
        int i10 = this.d;
        org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) i01Var;
        pa0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = pa0Var.f37054a;
        ArrayList arrayList = launchActivity.f31588a0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList)).onResume();
        }
        launchActivity.f31635z0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.d10(pa0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19214id = this.f25804c.f19216id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new nh.p5(12));
    }

    public void setDelegate(i01 i01Var) {
        this.f25803b = i01Var;
    }
}
