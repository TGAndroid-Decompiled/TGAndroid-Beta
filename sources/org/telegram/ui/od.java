package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class od implements Runnable {
    public final int f40544a;
    public final ke f40545b;

    public od(ke keVar, int i10) {
        this.f40544a = i10;
        this.f40545b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f40544a) {
            case 0:
                of.f.s(this.f40545b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.l71 l71Var = this.f40545b.f39277a1;
                if (l71Var != null) {
                    l71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f40545b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.rm0 currentListView = keVar.f39281e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f40545b;
                int i10 = keVar2.f39301y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f39297v1);
                if (keVar2.f39288m1 != keVar2.f39289n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f39302z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f39288m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new ud(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f40545b;
                keVar3.f39289n1 = keVar3.f39288m1;
                return;
            case 5:
                this.f40545b.T0.setLoading(false);
                return;
            case 6:
                this.f40545b.f39279c1.setVisibility(8);
                return;
            case 7:
                this.f40545b.f39279c1.setVisibility(8);
                return;
            default:
                of.f.s(this.f40545b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
