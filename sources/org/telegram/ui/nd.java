package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f40253a;
    public final je f40254b;

    public nd(je jeVar, int i10) {
        this.f40253a = i10;
        this.f40254b = jeVar;
    }

    @Override
    public final void run() {
        switch (this.f40253a) {
            case 0:
                of.f.s(this.f40254b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.l71 l71Var = this.f40254b.f39029a1;
                if (l71Var != null) {
                    l71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                je jeVar = this.f40254b;
                jeVar.getClass();
                try {
                    org.telegram.ui.Components.rm0 currentListView = jeVar.f39033e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                je jeVar2 = this.f40254b;
                int i10 = jeVar2.f39053y0;
                AndroidUtilities.cancelRunOnUIThread(jeVar2.f39049v1);
                if (jeVar2.f39040m1 != jeVar2.f39041n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-jeVar2.f39054z0);
                    tL_channels_restrictSponsoredMessages.restricted = jeVar2.f39040m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new td(jeVar2, 0));
                    return;
                }
                return;
            case 4:
                je jeVar3 = this.f40254b;
                jeVar3.f39041n1 = jeVar3.f39040m1;
                return;
            case 5:
                this.f40254b.T0.setLoading(false);
                return;
            case 6:
                this.f40254b.f39031c1.setVisibility(8);
                return;
            case 7:
                this.f40254b.f39031c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f40254b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
