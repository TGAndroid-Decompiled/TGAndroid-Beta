package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class q11 extends FrameLayout {
    public static final int e = 0;
    public TextView f31767a;
    public p11 f31768b;
    public TLRPC.TL_help_termsOfService f31769c;
    public int d;

    public final void a() {
        p11 p11Var = this.f31768b;
        int i10 = this.d;
        org.telegram.ui.ia0 ia0Var = (org.telegram.ui.ia0) p11Var;
        ia0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ia0Var.f40079a;
        ArrayList arrayList = launchActivity.f35553d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.r2) ic.a.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.r00(ia0Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f22083id = this.f31769c.f22085id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.d6(16));
    }

    public void setDelegate(p11 p11Var) {
        this.f31768b = p11Var;
    }
}
