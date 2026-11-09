package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hc;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class ea extends x31 {
    public static final int f42429b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        fa faVar = (fa) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) y31Var.G;
        faVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                faVar.f42490b.p(hc.p(m20.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            faVar.f42491c.setText(tonconnectsession.manifest.name);
            faVar.d.setText(org.telegram.messenger.g0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new fa(context, g6Var);
    }
}
