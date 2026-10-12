package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class a9 extends k61 {
    public static final int f32938a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        b9 b9Var = (b9) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) l61Var.G;
        b9Var.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                b9Var.f32993b.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            b9Var.f32994c.setText(tonconnectsession.manifest.name);
            b9Var.d.setText(AndroidUtilities.getHostAuthority(tonconnectsession.manifest.url));
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new b9(context, c6Var);
    }
}
