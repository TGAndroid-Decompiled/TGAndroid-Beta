package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f35855a;
    public final je f35856b;

    public nd(je jeVar, int i10) {
        this.f35855a = i10;
        this.f35856b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f35855a) {
            case 0:
                nf.f.s(this.f35856b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.r61 r61Var = this.f35856b.f34752a1;
                if (r61Var != null) {
                    r61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f35856b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.wl0 currentListView = jeVar.f34756e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f35856b;
                int i10 = jeVar2.f34776y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f34772v1);
                if (jeVar2.f34763m1 != jeVar2.f34764n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f34777z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f34763m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f35856b;
                jeVar3.f34764n1 = jeVar3.f34763m1;
                return;
            case 5:
                this.f35856b.T0.setLoading(false);
                return;
            case 6:
                this.f35856b.f34754c1.setVisibility(8);
                return;
            case 7:
                this.f35856b.f34754c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35856b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
