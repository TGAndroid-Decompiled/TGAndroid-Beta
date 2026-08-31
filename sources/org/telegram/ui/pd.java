package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f40015a;
    public final ke f40016b;

    public pd(ke keVar, int i10) {
        this.f40015a = i10;
        this.f40016b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f40015a) {
            case 0:
                af.g.s(this.f40016b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.i61 i61Var = this.f40016b.X0;
                if (i61Var != null) {
                    i61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f40016b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.tl0 currentListView = keVar.f38359b1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f40016b;
                int i10 = keVar2.f38379v0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f38375s1);
                if (keVar2.f38367j1 != keVar2.f38368k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f38380w0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f38367j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f40016b;
                keVar3.f38368k1 = keVar3.f38367j1;
                return;
            case 5:
                this.f40016b.Q0.setLoading(false);
                return;
            case 6:
                this.f40016b.Z0.setVisibility(8);
                return;
            case 7:
                this.f40016b.Z0.setVisibility(8);
                return;
            default:
                af.g.s(this.f40016b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
