package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class uy0 extends FrameLayout {
    public static final int f40437e = 0;
    public TextView f40438a;
    public ty0 f40439b;
    public TLRPC.TL_help_termsOfService f40440c;
    public int d;

    public final void a() {
        ty0 ty0Var = this.f40439b;
        int i7 = this.d;
        org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) ty0Var;
        m80Var.getClass();
        org.telegram.messenger.j10.i(i7).f24776a0 = null;
        org.telegram.messenger.j10.i(i7).v(false);
        LaunchActivity launchActivity = m80Var.f49804a;
        ArrayList arrayList = launchActivity.f43075e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.lz(m80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f28460id = this.f40440c.f28462id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.k5(22));
    }

    public void setDelegate(ty0 ty0Var) {
        this.f40439b = ty0Var;
    }
}
