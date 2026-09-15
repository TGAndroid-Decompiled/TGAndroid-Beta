package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f35952a;
    public final je f35953b;

    public nd(je jeVar, int i10) {
        this.f35952a = i10;
        this.f35953b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f35952a) {
            case 0:
                nf.f.s(this.f35953b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.e61 e61Var = this.f35953b.f34860a1;
                if (e61Var != null) {
                    e61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f35953b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.ll0 currentListView = jeVar.f34864e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f35953b;
                int i10 = jeVar2.f34884y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f34880v1);
                if (jeVar2.f34871m1 != jeVar2.f34872n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f34885z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f34871m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f35953b;
                jeVar3.f34872n1 = jeVar3.f34871m1;
                return;
            case 5:
                this.f35953b.T0.setLoading(false);
                return;
            case 6:
                this.f35953b.f34862c1.setVisibility(8);
                return;
            case 7:
                this.f35953b.f34862c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35953b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
