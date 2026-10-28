package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f42378a;
    public final ke f42379b;

    public pd(ke keVar, int i10) {
        this.f42378a = i10;
        this.f42379b = keVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42378a) {
            case 0:
                qf.d.r(this.f42379b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
            case 1:
                qf.d.r(this.f42379b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 2:
                ke keVar = this.f42379b;
                org.telegram.ui.Components.s71 s71Var = keVar.X0;
                if (s71Var != null) {
                    boolean z11 = keVar.f30653e0;
                    boolean z12 = false;
                    if (keVar.R0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.k71 k71Var = s71Var.f32504g3;
                    if (z10 == keVar.f40755a1.a()) {
                        z12 = true;
                    }
                    k71Var.O(z12);
                    if (z11 && keVar.R0 != -1) {
                        keVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ke keVar2 = this.f42379b;
                keVar2.f40765k1 = keVar2.f40764j1;
                return;
            case 4:
                this.f42379b.J0.setLoading(false);
                return;
            case 5:
                this.f42379b.Y0.setVisibility(8);
                return;
            case 6:
                this.f42379b.Y0.setVisibility(8);
                return;
            default:
                ke keVar3 = this.f42379b;
                int i10 = keVar3.f40769o0;
                AndroidUtilities.cancelRunOnUIThread(keVar3.f40778s1);
                if (keVar3.f40764j1 != keVar3.f40765k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar3.f40771p0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar3.f40764j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(keVar3, 0));
                    return;
                }
                return;
        }
    }
}
