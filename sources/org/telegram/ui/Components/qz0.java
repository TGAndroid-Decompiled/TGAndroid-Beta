package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class qz0 extends FrameLayout {
    public static final int e = 0;
    public TextView f29844a;
    public pz0 f29845b;
    public TLRPC.TL_help_termsOfService f29846c;
    public int d;

    public final void a() {
        pz0 pz0Var = this.f29845b;
        int i10 = this.d;
        org.telegram.ui.n90 n90Var = (org.telegram.ui.n90) pz0Var;
        n90Var.getClass();
        org.telegram.messenger.e20.i(i10).Z = null;
        org.telegram.messenger.e20.i(i10).v(false);
        LaunchActivity launchActivity = n90Var.f39775a;
        ArrayList arrayList = launchActivity.f33360d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.k2) i0.a.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.i0.G).withEndAction(new org.telegram.ui.yy(n90Var, 18)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19849id = this.f29846c.f19851id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new ag.c3(17));
    }

    public void setDelegate(pz0 pz0Var) {
        this.f29845b = pz0Var;
    }
}
