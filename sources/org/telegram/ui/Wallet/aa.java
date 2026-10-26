package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class aa extends s61 {
    public static final int f36376a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ba baVar = (ba) view;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) t61Var.G;
        baVar.getClass();
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null) {
            TLRPC.WebDocument webDocument = tonconnectmanifest.icon;
            if (webDocument != null) {
                baVar.f36405b.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "28_28", null, tonconnectsession.manifest);
            }
            baVar.f36406c.setText(tonconnectsession.manifest.name);
            baVar.d.setText(AndroidUtilities.getHostAuthority(tonconnectsession.manifest.url));
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ba(context, u6Var);
    }
}
