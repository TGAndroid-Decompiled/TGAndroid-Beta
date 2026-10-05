package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f39483a;
    public final me f39484b;

    public pd(me meVar, int i10) {
        this.f39483a = i10;
        this.f39484b = meVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39483a) {
            case 0:
                nf.f.s(this.f39484b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
            case 1:
                nf.f.s(this.f39484b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 2:
                me meVar = this.f39484b;
                org.telegram.ui.Components.e71 e71Var = meVar.X0;
                if (e71Var != null) {
                    boolean z11 = meVar.f25125e0;
                    boolean z12 = false;
                    if (meVar.R0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.w61 w61Var = e71Var.f26034f3;
                    if (z10 == meVar.f38580a1.a()) {
                        z12 = true;
                    }
                    w61Var.N(z12);
                    if (z11 && meVar.R0 != -1) {
                        meVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                me meVar2 = this.f39484b;
                meVar2.f38590k1 = meVar2.f38589j1;
                return;
            case 4:
                this.f39484b.J0.setLoading(false);
                return;
            case 5:
                this.f39484b.Y0.setVisibility(8);
                return;
            case 6:
                this.f39484b.Y0.setVisibility(8);
                return;
            default:
                me meVar3 = this.f39484b;
                int i10 = meVar3.f38594o0;
                AndroidUtilities.cancelRunOnUIThread(meVar3.f38603s1);
                if (meVar3.f38589j1 != meVar3.f38590k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar3.f38596p0);
                    tL_channels_restrictSponsoredMessages.restricted = meVar3.f38589j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(meVar3, 0));
                    return;
                }
                return;
        }
    }
}
