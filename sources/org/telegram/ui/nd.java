package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f35502a;
    public final je f35503b;

    public nd(je jeVar, int i10) {
        this.f35502a = i10;
        this.f35503b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f35502a) {
            case 0:
                nf.f.s(this.f35503b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.d61 d61Var = this.f35503b.f34416a1;
                if (d61Var != null) {
                    d61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f35503b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.ml0 currentListView = jeVar.f34420e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f35503b;
                int i10 = jeVar2.f34440y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f34436v1);
                if (jeVar2.f34427m1 != jeVar2.f34428n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f34441z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f34427m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f35503b;
                jeVar3.f34428n1 = jeVar3.f34427m1;
                return;
            case 5:
                this.f35503b.T0.setLoading(false);
                return;
            case 6:
                this.f35503b.f34418c1.setVisibility(8);
                return;
            case 7:
                this.f35503b.f34418c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35503b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
