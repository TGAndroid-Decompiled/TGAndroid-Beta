package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class wy0 extends FrameLayout {
    public static final int f41914e = 0;
    public TextView f41915a;
    public vy0 f41916b;
    public TLRPC.TL_help_termsOfService f41917c;
    public int d;

    public final void a() {
        vy0 vy0Var = this.f41916b;
        int i7 = this.d;
        org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) vy0Var;
        n80Var.getClass();
        org.telegram.messenger.k10.i(i7).f24971a0 = null;
        org.telegram.messenger.k10.i(i7).v(false);
        LaunchActivity launchActivity = n80Var.f50150a;
        ArrayList arrayList = launchActivity.f43120e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.lz(n80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f28489id = this.f41917c.f28491id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.l5(22));
    }

    public void setDelegate(vy0 vy0Var) {
        this.f41916b = vy0Var;
    }
}
