package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class my0 extends FrameLayout {
    public static final int f36168e = 0;
    public TextView f36169a;
    public ly0 f36170b;
    public TLRPC.TL_help_termsOfService f36171c;
    public int d;

    public final void a() {
        ly0 ly0Var = this.f36170b;
        int i7 = this.d;
        org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) ly0Var;
        m80Var.getClass();
        org.telegram.messenger.p10.i(i7).Z = null;
        org.telegram.messenger.p10.i(i7).v(false);
        LaunchActivity launchActivity = m80Var.f47792a;
        ArrayList arrayList = launchActivity.f41267d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList)).onResume();
        }
        launchActivity.A0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.jz(m80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f27011id = this.f36171c.f27013id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new di.v5(22));
    }

    public void setDelegate(ly0 ly0Var) {
        this.f36170b = ly0Var;
    }
}
