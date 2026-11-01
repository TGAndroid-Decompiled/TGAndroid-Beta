package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.c30;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class ka extends a51 {
    public static final int f34831b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        la laVar = (la) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) b51Var.G;
        laVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                laVar.f34876b.p(jc.p(c30.c(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            laVar.f34877c.setText(tonconnectsession.manifest.name);
            laVar.d.setText(org.telegram.messenger.i0.K0(tonconnectsession.manifest.url, false));
        }
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new la(context, p6Var);
    }
}
