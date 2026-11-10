package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ly0 extends FrameLayout {
    public static final int f35761e = 0;
    public TextView f35762a;
    public ky0 f35763b;
    public TLRPC.TL_help_termsOfService f35764c;
    public int d;

    public final void a() {
        ky0 ky0Var = this.f35763b;
        int i7 = this.d;
        org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) ky0Var;
        n80Var.getClass();
        org.telegram.messenger.p10.i(i7).Z = null;
        org.telegram.messenger.p10.i(i7).v(false);
        LaunchActivity launchActivity = n80Var.f48158a;
        ArrayList arrayList = launchActivity.f41258d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList)).onResume();
        }
        launchActivity.A0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.kz(n80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f27015id = this.f35764c.f27017id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.v5(22));
    }

    public void setDelegate(ky0 ky0Var) {
        this.f35763b = ky0Var;
    }
}
