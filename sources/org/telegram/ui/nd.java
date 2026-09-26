package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f35854a;
    public final je f35855b;

    public nd(je jeVar, int i10) {
        this.f35854a = i10;
        this.f35855b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f35854a) {
            case 0:
                nf.f.s(this.f35855b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.s61 s61Var = this.f35855b.f34751a1;
                if (s61Var != null) {
                    s61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f35855b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.xl0 currentListView = jeVar.f34755e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f35855b;
                int i10 = jeVar2.f34775y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f34771v1);
                if (jeVar2.f34762m1 != jeVar2.f34763n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f34776z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f34762m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f35855b;
                jeVar3.f34763n1 = jeVar3.f34762m1;
                return;
            case 5:
                this.f35855b.T0.setLoading(false);
                return;
            case 6:
                this.f35855b.f34753c1.setVisibility(8);
                return;
            case 7:
                this.f35855b.f34753c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35855b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
