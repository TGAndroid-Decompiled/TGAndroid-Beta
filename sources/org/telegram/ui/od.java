package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f39849a;
    public final ie f39850b;

    public od(ie ieVar, int i10) {
        this.f39849a = i10;
        this.f39850b = ieVar;
    }

    @Override
    public final void run() {
        switch (this.f39849a) {
            case 0:
                pf.d.r(this.f39850b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.c71 c71Var = this.f39850b.f37935a1;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ie ieVar = this.f39850b;
                ieVar.getClass();
                try {
                    org.telegram.ui.Components.jm0 currentListView = ieVar.f37939e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ie ieVar2 = this.f39850b;
                int i10 = ieVar2.f37959y0;
                AndroidUtilities.cancelRunOnUIThread(ieVar2.f37955v1);
                if (ieVar2.f37946m1 != ieVar2.f37947n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-ieVar2.f37960z0);
                    tL_channels_restrictSponsoredMessages.restricted = ieVar2.f37946m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(ieVar2, 0));
                    return;
                }
                return;
            case 4:
                ie ieVar3 = this.f39850b;
                ieVar3.f37947n1 = ieVar3.f37946m1;
                return;
            case 5:
                this.f39850b.T0.setLoading(false);
                return;
            case 6:
                this.f39850b.f37937c1.setVisibility(8);
                return;
            case 7:
                this.f39850b.f37937c1.setVisibility(8);
                return;
            default:
                pf.d.r(this.f39850b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
