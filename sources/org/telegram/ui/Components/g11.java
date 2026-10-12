package org.telegram.ui.Components;

import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class g11 extends FrameLayout {
    public static final int e = 0;
    public TextView f25162a;
    public f11 f25163b;
    public TLRPC.TL_help_termsOfService f25164c;
    public int d;

    public final void a() {
        f11 f11Var = this.f25163b;
        int i10 = this.d;
        org.telegram.ui.ab0 ab0Var = (org.telegram.ui.ab0) f11Var;
        ab0Var.getClass();
        UserConfig.getInstance(i10).unacceptedTermsOfService = null;
        UserConfig.getInstance(i10).saveConfig(false);
        LaunchActivity launchActivity = ab0Var.f34127a;
        ArrayList arrayList = launchActivity.f32109d0;
        if (!arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.m2) i2.d.g(1, arrayList)).onResume();
        }
        launchActivity.C0.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new org.telegram.ui.zz(ab0Var, 16)).start();
        TLRPC.TL_help_acceptTermsOfService tL_help_acceptTermsOfService = new TLRPC.TL_help_acceptTermsOfService();
        tL_help_acceptTermsOfService.f19271id = this.f25164c.f19273id;
        ConnectionsManager.getInstance(this.d).sendRequest(tL_help_acceptTermsOfService, new bi.g7(16));
    }

    public void setDelegate(f11 f11Var) {
        this.f25163b = f11Var;
    }
}
