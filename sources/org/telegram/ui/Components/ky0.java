package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ky0 extends FrameLayout {
    public static final int f35437e = 0;
    public TextView f35438a;
    public jy0 f35439b;
    public TLRPC.TL_help_termsOfService f35440c;
    public int d;

    public final void a() {
        jy0 jy0Var = this.f35439b;
        int i7 = this.d;
        org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) jy0Var;
        k80Var.getClass();
        org.telegram.messenger.p10.i(i7).Z = null;
        org.telegram.messenger.p10.i(i7).v(false);
        LaunchActivity launchActivity = k80Var.f47117a;
        ArrayList arrayList = launchActivity.f41232d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList)).onResume();
        }
        launchActivity.A0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.hz(k80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f27007id = this.f35440c.f27009id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.u5(22));
    }

    public void setDelegate(jy0 jy0Var) {
        this.f35439b = jy0Var;
    }
}
