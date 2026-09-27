package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f36386a;
    public final me f36387b;

    public pd(me meVar, int i10) {
        this.f36386a = i10;
        this.f36387b = meVar;
    }

    @Override
    public final void run() {
        switch (this.f36386a) {
            case 0:
                nf.f.s(this.f36387b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
            case 1:
                nf.f.s(this.f36387b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 2:
                de deVar = this.f36387b.f35641a1;
                if (deVar != null) {
                    deVar.Y2.N(true);
                    return;
                }
                return;
            case 3:
                me meVar = this.f36387b;
                meVar.f35653n1 = meVar.f35652m1;
                return;
            case 4:
                this.f36387b.T0.setLoading(false);
                return;
            case 5:
                this.f36387b.f35642b1.setVisibility(8);
                return;
            case 6:
                this.f36387b.f35642b1.setVisibility(8);
                return;
            case 7:
                me meVar2 = this.f36387b;
                meVar2.getClass();
                try {
                    org.telegram.ui.Components.yl0 currentListView = meVar2.f35644d1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                me meVar3 = this.f36387b;
                int i10 = meVar3.f35665y0;
                AndroidUtilities.cancelRunOnUIThread(meVar3.f35661v1);
                if (meVar3.f35652m1 != meVar3.f35653n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-meVar3.f35666z0);
                    tL_channels_restrictSponsoredMessages.restricted = meVar3.f35652m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(meVar3, 0));
                    return;
                }
                return;
        }
    }
}
