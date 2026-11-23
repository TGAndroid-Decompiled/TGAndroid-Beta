package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class wy0 extends FrameLayout {
    public static final int f41871e = 0;
    public TextView f41872a;
    public vy0 f41873b;
    public TLRPC.TL_help_termsOfService f41874c;
    public int d;

    public final void a() {
        vy0 vy0Var = this.f41873b;
        int i7 = this.d;
        org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) vy0Var;
        n80Var.getClass();
        org.telegram.messenger.k10.i(i7).f24935a0 = null;
        org.telegram.messenger.k10.i(i7).v(false);
        LaunchActivity launchActivity = n80Var.f50138a;
        ArrayList arrayList = launchActivity.f43085e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.lz(n80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f28453id = this.f41874c.f28455id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.k5(22));
    }

    public void setDelegate(vy0 vy0Var) {
        this.f41873b = vy0Var;
    }
}
