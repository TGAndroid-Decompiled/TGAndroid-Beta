package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class vy0 extends FrameLayout {
    public static final int f41444e = 0;
    public TextView f41445a;
    public uy0 f41446b;
    public TLRPC.TL_help_termsOfService f41447c;
    public int d;

    public final void a() {
        uy0 uy0Var = this.f41446b;
        int i7 = this.d;
        org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) uy0Var;
        m80Var.getClass();
        org.telegram.messenger.i10.i(i7).f24640a0 = null;
        org.telegram.messenger.i10.i(i7).v(false);
        LaunchActivity launchActivity = m80Var.f50009a;
        ArrayList arrayList = launchActivity.f43195e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.kz(m80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f28547id = this.f41447c.f28549id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.l5(22));
    }

    public void setDelegate(uy0 uy0Var) {
        this.f41446b = uy0Var;
    }
}
