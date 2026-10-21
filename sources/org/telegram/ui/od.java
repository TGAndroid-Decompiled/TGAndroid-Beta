package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f39845a;
    public final ie f39846b;

    public od(ie ieVar, int i10) {
        this.f39845a = i10;
        this.f39846b = ieVar;
    }

    @Override
    public final void run() {
        switch (this.f39845a) {
            case 0:
                pf.d.r(this.f39846b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.c71 c71Var = this.f39846b.f37931a1;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ie ieVar = this.f39846b;
                ieVar.getClass();
                try {
                    org.telegram.ui.Components.jm0 currentListView = ieVar.f37935e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ie ieVar2 = this.f39846b;
                int i10 = ieVar2.f37955y0;
                AndroidUtilities.cancelRunOnUIThread(ieVar2.f37951v1);
                if (ieVar2.f37942m1 != ieVar2.f37943n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-ieVar2.f37956z0);
                    tL_channels_restrictSponsoredMessages.restricted = ieVar2.f37942m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(ieVar2, 0));
                    return;
                }
                return;
            case 4:
                ie ieVar3 = this.f39846b;
                ieVar3.f37943n1 = ieVar3.f37942m1;
                return;
            case 5:
                this.f39846b.T0.setLoading(false);
                return;
            case 6:
                this.f39846b.f37933c1.setVisibility(8);
                return;
            case 7:
                this.f39846b.f37933c1.setVisibility(8);
                return;
            default:
                pf.d.r(this.f39846b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
