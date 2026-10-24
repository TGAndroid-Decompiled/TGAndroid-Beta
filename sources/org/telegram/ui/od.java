package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f40161a;
    public final ie f40162b;

    public od(ie ieVar, int i10) {
        this.f40161a = i10;
        this.f40162b = ieVar;
    }

    @Override
    public final void run() {
        switch (this.f40161a) {
            case 0:
                pf.d.r(this.f40162b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.i71 i71Var = this.f40162b.f38239a1;
                if (i71Var != null) {
                    i71Var.Z2.N(true);
                    return;
                }
                return;
            case 2:
                ie ieVar = this.f40162b;
                ieVar.getClass();
                try {
                    org.telegram.ui.Components.lm0 currentListView = ieVar.f38243e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ie ieVar2 = this.f40162b;
                int i10 = ieVar2.f38263y0;
                AndroidUtilities.cancelRunOnUIThread(ieVar2.f38259v1);
                if (ieVar2.f38250m1 != ieVar2.f38251n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-ieVar2.f38264z0);
                    tL_channels_restrictSponsoredMessages.restricted = ieVar2.f38250m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(ieVar2, 0));
                    return;
                }
                return;
            case 4:
                ie ieVar3 = this.f40162b;
                ieVar3.f38251n1 = ieVar3.f38250m1;
                return;
            case 5:
                this.f40162b.T0.setLoading(false);
                return;
            case 6:
                this.f40162b.f38241c1.setVisibility(8);
                return;
            case 7:
                this.f40162b.f38241c1.setVisibility(8);
                return;
            default:
                pf.d.r(this.f40162b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
