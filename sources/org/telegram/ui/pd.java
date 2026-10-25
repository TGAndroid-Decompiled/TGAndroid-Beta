package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f42462a;
    public final ke f42463b;

    public pd(ke keVar, int i10) {
        this.f42462a = i10;
        this.f42463b = keVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42462a) {
            case 0:
                qf.d.r(this.f42463b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
            case 1:
                qf.d.r(this.f42463b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 2:
                ke keVar = this.f42463b;
                org.telegram.ui.Components.r71 r71Var = keVar.X0;
                if (r71Var != null) {
                    boolean z11 = keVar.f30308e0;
                    boolean z12 = false;
                    if (keVar.R0 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.j71 j71Var = r71Var.f32150g3;
                    if (z10 == keVar.f40890a1.a()) {
                        z12 = true;
                    }
                    j71Var.O(z12);
                    if (z11 && keVar.R0 != -1) {
                        keVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ke keVar2 = this.f42463b;
                keVar2.f40900k1 = keVar2.f40899j1;
                return;
            case 4:
                this.f42463b.J0.setLoading(false);
                return;
            case 5:
                this.f42463b.Y0.setVisibility(8);
                return;
            case 6:
                this.f42463b.Y0.setVisibility(8);
                return;
            default:
                ke keVar3 = this.f42463b;
                int i10 = keVar3.f40904o0;
                AndroidUtilities.cancelRunOnUIThread(keVar3.f40913s1);
                if (keVar3.f40899j1 != keVar3.f40900k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar3.f40906p0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar3.f40899j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(keVar3, 0));
                    return;
                }
                return;
        }
    }
}
