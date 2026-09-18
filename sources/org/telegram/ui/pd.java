package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f36606a;
    public final le f36607b;

    public pd(le leVar, int i10) {
        this.f36606a = i10;
        this.f36607b = leVar;
    }

    @Override
    public final void run() {
        switch (this.f36606a) {
            case 0:
                nf.f.s(this.f36607b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.f61 f61Var = this.f36607b.f35509a1;
                if (f61Var != null) {
                    f61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                le leVar = this.f36607b;
                leVar.getClass();
                try {
                    org.telegram.ui.Components.ml0 currentListView = leVar.f35513e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                le leVar2 = this.f36607b;
                int i10 = leVar2.f35533y0;
                AndroidUtilities.cancelRunOnUIThread(leVar2.f35529v1);
                if (leVar2.f35520m1 != leVar2.f35521n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-leVar2.f35534z0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar2.f35520m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(leVar2, 0));
                    return;
                }
                return;
            case 4:
                le leVar3 = this.f36607b;
                leVar3.f35521n1 = leVar3.f35520m1;
                return;
            case 5:
                this.f36607b.T0.setLoading(false);
                return;
            case 6:
                this.f36607b.f35511c1.setVisibility(8);
                return;
            case 7:
                this.f36607b.f35511c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f36607b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
