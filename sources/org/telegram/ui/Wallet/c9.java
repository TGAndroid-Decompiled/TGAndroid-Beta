package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class c9 extends q61 {
    public static final int f34784a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        d9 d9Var = (d9) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) r61Var.G;
        d9Var.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                d9Var.f34826b.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            d9Var.f34827c.setText(tonconnectsession.manifest.name);
            d9Var.d.setText(AndroidUtilities.getHostAuthority(tonconnectsession.manifest.url));
        }
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d9(context, d6Var);
    }
}
