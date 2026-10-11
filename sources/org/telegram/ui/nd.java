package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f40219a;
    public final je f40220b;

    public nd(je jeVar, int i10) {
        this.f40219a = i10;
        this.f40220b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f40219a) {
            case 0:
                of.f.s(this.f40220b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.m71 m71Var = this.f40220b.f38995a1;
                if (m71Var != null) {
                    m71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f40220b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.sm0 currentListView = jeVar.f38999e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f40220b;
                int i10 = jeVar2.f39019y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f39015v1);
                if (jeVar2.f39006m1 != jeVar2.f39007n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f39020z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f39006m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f40220b;
                jeVar3.f39007n1 = jeVar3.f39006m1;
                return;
            case 5:
                this.f40220b.T0.setLoading(false);
                return;
            case 6:
                this.f40220b.f38997c1.setVisibility(8);
                return;
            case 7:
                this.f40220b.f38997c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f40220b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
