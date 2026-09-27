package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class u01 extends FrameLayout {
    public static final int e = 0;
    public TextView f28736a;
    public t01 f28737b;
    public TLRPC.TL_help_termsOfService f28738c;
    public int d;

    public final void a() {
        t01 t01Var = this.f28737b;
        int i10 = this.d;
        org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) t01Var;
        ua0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ua0Var.f38189a;
        ArrayList arrayList = launchActivity.f31108d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) hg.k0.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.f10(ua0Var, 15)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f18384id = this.f28738c.f18386id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.u7(16));
    }

    public void setDelegate(t01 t01Var) {
        this.f28737b = t01Var;
    }
}
