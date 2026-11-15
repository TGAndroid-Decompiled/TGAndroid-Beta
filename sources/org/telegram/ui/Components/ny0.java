package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ny0 extends FrameLayout {
    public static final int f37753e = 0;
    public TextView f37754a;
    public my0 f37755b;
    public TLRPC.TL_help_termsOfService f37756c;
    public int d;

    public final void a() {
        my0 my0Var = this.f37755b;
        int i7 = this.d;
        org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) my0Var;
        k80Var.getClass();
        org.telegram.messenger.m10.i(i7).f24937a0 = null;
        org.telegram.messenger.m10.i(i7).v(false);
        LaunchActivity launchActivity = k80Var.f48644a;
        ArrayList arrayList = launchActivity.f42630e0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList)).onResume();
        }
        launchActivity.B0.animate().alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.messenger.g0.G).withEndAction(new org.telegram.ui.iz(k80Var, 17)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f28106id = this.f37756c.f28108id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new fi.m5(22));
    }

    public void setDelegate(my0 my0Var) {
        this.f37755b = my0Var;
    }
}
