package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f40500a;
    public final ke f40501b;

    public od(ke keVar, int i10) {
        this.f40500a = i10;
        this.f40501b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f40500a) {
            case 0:
                of.f.s(this.f40501b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.k71 k71Var = this.f40501b.f39233a1;
                if (k71Var != null) {
                    k71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f40501b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.qm0 currentListView = keVar.f39237e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f40501b;
                int i10 = keVar2.f39257y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f39253v1);
                if (keVar2.f39244m1 != keVar2.f39245n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f39258z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f39244m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f40501b;
                keVar3.f39245n1 = keVar3.f39244m1;
                return;
            case 5:
                this.f40501b.T0.setLoading(false);
                return;
            case 6:
                this.f40501b.f39235c1.setVisibility(8);
                return;
            case 7:
                this.f40501b.f39235c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f40501b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
