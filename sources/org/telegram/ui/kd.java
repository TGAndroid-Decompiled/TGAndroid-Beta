package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class kd implements Runnable {
    public final int f39804a;
    public final fe f39805b;

    public kd(fe feVar, int i9) {
        this.f39804a = i9;
        this.f39805b = feVar;
    }

    @Override
    public final void run() {
        switch (this.f39804a) {
            case 0:
                ve.e.s(this.f39805b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.i51 i51Var = this.f39805b.W0;
                if (i51Var != null) {
                    i51Var.U2.N(true);
                    return;
                }
                return;
            case 2:
                fe feVar = this.f39805b;
                feVar.getClass();
                try {
                    org.telegram.ui.Components.wk0 currentListView = feVar.f38218a1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                fe feVar2 = this.f39805b;
                int i9 = feVar2.f38238u0;
                AndroidUtilities.cancelRunOnUIThread(feVar2.f38234r1);
                if (feVar2.f38226i1 != feVar2.f38227j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i9).getInputChannel(-feVar2.f38239v0);
                    tL_channels_restrictSponsoredMessages.restricted = feVar2.f38226i1;
                    ConnectionsManager.getInstance(i9).sendRequest(tL_channels_restrictSponsoredMessages, new qd(feVar2, 0));
                    return;
                }
                return;
            case 4:
                fe feVar3 = this.f39805b;
                feVar3.f38227j1 = feVar3.f38226i1;
                return;
            case 5:
                this.f39805b.P0.setLoading(false);
                return;
            case 6:
                this.f39805b.Y0.setVisibility(8);
                return;
            case 7:
                this.f39805b.Y0.setVisibility(8);
                return;
            default:
                ve.e.s(this.f39805b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
