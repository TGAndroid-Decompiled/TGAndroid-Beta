package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ky0 extends FrameLayout {
    public static final int f35509e = 0;
    public TextView f35510a;
    public jy0 f35511b;
    public TLRPC.TL_help_termsOfService f35512c;
    public int d;

    public final void a() {
        jy0 jy0Var = this.f35511b;
        int i3 = this.d;
        org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) jy0Var;
        h80Var.getClass();
        org.telegram.messenger.h10.i(i3).f22832a0 = null;
        org.telegram.messenger.h10.i(i3).v(false);
        LaunchActivity launchActivity = h80Var.f45853a;
        ArrayList arrayList = launchActivity.f41291e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList)).onResume();
        }
        launchActivity.D0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.fz(h80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f27056id = this.f35512c.f27058id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ei.u5(22));
    }

    public void setDelegate(jy0 jy0Var) {
        this.f35511b = jy0Var;
    }
}
