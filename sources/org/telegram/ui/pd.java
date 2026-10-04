package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f39457a;
    public final me f39458b;

    public pd(me meVar, int i10) {
        this.f39457a = i10;
        this.f39458b = meVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39457a) {
            case 0:
                nf.f.s(this.f39458b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
            case 1:
                nf.f.s(this.f39458b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 2:
                me meVar = this.f39458b;
                org.telegram.ui.Components.c71 c71Var = meVar.a2;
                if (c71Var != null) {
                    boolean z11 = meVar.f24697h1;
                    boolean z12 = false;
                    if (meVar.U1 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.u61 u61Var = c71Var.f25250f3;
                    if (z10 == meVar.f38551d2.a()) {
                        z12 = true;
                    }
                    u61Var.N(z12);
                    if (z11 && meVar.U1 != -1) {
                        meVar.Z();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                me meVar2 = this.f39458b;
                meVar2.f38561n2 = meVar2.f38560m2;
                return;
            case 4:
                this.f39458b.M1.setLoading(false);
                return;
            case 5:
                this.f39458b.f38549b2.setVisibility(8);
                return;
            case 6:
                this.f39458b.f38549b2.setVisibility(8);
                return;
            default:
                me meVar3 = this.f39458b;
                int i10 = meVar3.f38567r1;
                AndroidUtilities.cancelRunOnUIThread(meVar3.f38576v2);
                if (meVar3.f38560m2 != meVar3.f38561n2) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar3.f38569s1);
                    tL_channels_restrictSponsoredMessages.restricted = meVar3.f38560m2;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(meVar3, 0));
                    return;
                }
                return;
        }
    }
}
