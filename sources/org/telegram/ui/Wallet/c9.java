package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class c9 extends t61 {
    public static final int f34595a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        d9 d9Var = (d9) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) u61Var.G;
        d9Var.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                d9Var.f34637b.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            d9Var.f34638c.setText(tonconnectsession.manifest.name);
            d9Var.d.setText(AndroidUtilities.getHostAuthority(tonconnectsession.manifest.url));
        }
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d9(context, c6Var);
    }
}
