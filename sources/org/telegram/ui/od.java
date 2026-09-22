package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f36296a;
    public final ke f36297b;

    public od(ke keVar, int i10) {
        this.f36296a = i10;
        this.f36297b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f36296a) {
            case 0:
                nf.f.s(this.f36297b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.u61 u61Var = this.f36297b.f35154a1;
                if (u61Var != null) {
                    u61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f36297b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.yl0 currentListView = keVar.f35158e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f36297b;
                int i10 = keVar2.f35178y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f35174v1);
                if (keVar2.f35165m1 != keVar2.f35166n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f35179z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f35165m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f36297b;
                keVar3.f35166n1 = keVar3.f35165m1;
                return;
            case 5:
                this.f36297b.T0.setLoading(false);
                return;
            case 6:
                this.f36297b.f35156c1.setVisibility(8);
                return;
            case 7:
                this.f36297b.f35156c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f36297b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
