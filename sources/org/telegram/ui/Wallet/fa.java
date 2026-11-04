package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ac;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class fa extends q31 {
    public static final int f42552b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ga gaVar = (ga) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) r31Var.G;
        gaVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                gaVar.f42593b.p(ac.p(e20.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            gaVar.f42594c.setText(tonconnectsession.manifest.name);
            gaVar.d.setText(org.telegram.messenger.g0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ga(context, e6Var);
    }
}
