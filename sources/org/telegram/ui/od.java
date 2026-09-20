package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f36278a;
    public final ke f36279b;

    public od(ke keVar, int i10) {
        this.f36278a = i10;
        this.f36279b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f36278a) {
            case 0:
                nf.f.s(this.f36279b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.s61 s61Var = this.f36279b.f35132a1;
                if (s61Var != null) {
                    s61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f36279b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.vl0 currentListView = keVar.f35136e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f36279b;
                int i10 = keVar2.f35156y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f35152v1);
                if (keVar2.f35143m1 != keVar2.f35144n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f35157z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f35143m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f36279b;
                keVar3.f35144n1 = keVar3.f35143m1;
                return;
            case 5:
                this.f36279b.T0.setLoading(false);
                return;
            case 6:
                this.f36279b.f35134c1.setVisibility(8);
                return;
            case 7:
                this.f36279b.f35134c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f36279b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
