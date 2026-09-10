package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f35791a;
    public final le f35792b;

    public pd(le leVar, int i10) {
        this.f35791a = i10;
        this.f35792b = leVar;
    }

    @Override
    public final void run() {
        switch (this.f35791a) {
            case 0:
                nf.f.s(this.f35792b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.r61 r61Var = this.f35792b.f34662a1;
                if (r61Var != null) {
                    r61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                le leVar = this.f35792b;
                leVar.getClass();
                try {
                    org.telegram.ui.Components.vl0 currentListView = leVar.f34666e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                le leVar2 = this.f35792b;
                int i10 = leVar2.f34686y0;
                AndroidUtilities.cancelRunOnUIThread(leVar2.f34682v1);
                if (leVar2.f34673m1 != leVar2.f34674n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-leVar2.f34687z0);
                    tL_channels_restrictSponsoredMessages.restricted = leVar2.f34673m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(leVar2, 0));
                    return;
                }
                return;
            case 4:
                le leVar3 = this.f35792b;
                leVar3.f34674n1 = leVar3.f34673m1;
                return;
            case 5:
                this.f35792b.T0.setLoading(false);
                return;
            case 6:
                this.f35792b.f34664c1.setVisibility(8);
                return;
            case 7:
                this.f35792b.f34664c1.setVisibility(8);
                return;
            default:
                nf.f.s(this.f35792b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
