package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f35859a;
    public final je f35860b;

    public nd(je jeVar, int i10) {
        this.f35859a = i10;
        this.f35860b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f35859a) {
            case 0:
                nf.f.s(this.f35860b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.t61 t61Var = this.f35860b.f34754a1;
                if (t61Var != null) {
                    t61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f35860b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.yl0 currentListView = jeVar.f34758e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f35860b;
                int i10 = jeVar2.f34778y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f34774v1);
                if (jeVar2.f34765m1 != jeVar2.f34766n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f34779z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f34765m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f35860b;
                jeVar3.f34766n1 = jeVar3.f34765m1;
                return;
            case 5:
                this.f35860b.T0.setLoading(false);
                return;
            case 6:
                this.f35860b.f34756c1.setVisibility(8);
                return;
            case 7:
                this.f35860b.f34756c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35860b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
