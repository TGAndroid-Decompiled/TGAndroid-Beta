package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class m11 extends FrameLayout {
    public static final int f28509e = 0;
    public TextView f28510a;
    public l11 f28511b;
    public TLRPC.TL_help_termsOfService f28512c;
    public int d;

    public final void a() {
        l11 l11Var = this.f28511b;
        int i10 = this.d;
        org.telegram.ui.ua0 ua0Var = (org.telegram.ui.ua0) l11Var;
        ua0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ua0Var.f42464a;
        ArrayList arrayList = launchActivity.f33811d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.tz(ua0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f20087id = this.f28512c.f20089id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ai.v7(16));
    }

    public void setDelegate(l11 l11Var) {
        this.f28511b = l11Var;
    }
}
