package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f39245a;
    public final ke f39246b;

    public od(ke keVar, int i10) {
        this.f39245a = i10;
        this.f39246b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f39245a) {
            case 0:
                of.f.s(this.f39246b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.d61 d61Var = this.f39246b.f38040a1;
                if (d61Var != null) {
                    d61Var.Y2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f39246b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.ll0 currentListView = keVar.f38044e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f39246b;
                int i10 = keVar2.f38064y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f38060v1);
                if (keVar2.f38051m1 != keVar2.f38052n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f38065z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f38051m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f39246b;
                keVar3.f38052n1 = keVar3.f38051m1;
                return;
            case 5:
                this.f39246b.T0.setLoading(false);
                return;
            case 6:
                this.f39246b.f38042c1.setVisibility(8);
                return;
            case 7:
                this.f39246b.f38042c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f39246b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
