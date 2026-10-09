package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f40498a;
    public final ke f40499b;

    public od(ke keVar, int i10) {
        this.f40498a = i10;
        this.f40499b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f40498a) {
            case 0:
                of.f.s(this.f40499b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.k71 k71Var = this.f40499b.f39231a1;
                if (k71Var != null) {
                    k71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f40499b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.qm0 currentListView = keVar.f39235e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f40499b;
                int i10 = keVar2.f39255y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f39251v1);
                if (keVar2.f39242m1 != keVar2.f39243n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f39256z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f39242m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f40499b;
                keVar3.f39243n1 = keVar3.f39242m1;
                return;
            case 5:
                this.f40499b.T0.setLoading(false);
                return;
            case 6:
                this.f40499b.f39233c1.setVisibility(8);
                return;
            case 7:
                this.f40499b.f39233c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f40499b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
