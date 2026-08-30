package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pd implements Runnable {
    public final int f37279a;
    public final ke f37280b;

    public pd(ke keVar, int i10) {
        this.f37279a = i10;
        this.f37280b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f37279a) {
            case 0:
                af.g.s(this.f37280b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.g61 g61Var = this.f37280b.X0;
                if (g61Var != null) {
                    g61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f37280b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.sl0 currentListView = keVar.f35631b1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f37280b;
                int i10 = keVar2.f35651v0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f35647s1);
                if (keVar2.f35639j1 != keVar2.f35640k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f35652w0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f35639j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new vd(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f37280b;
                keVar3.f35640k1 = keVar3.f35639j1;
                return;
            case 5:
                this.f37280b.Q0.setLoading(false);
                return;
            case 6:
                this.f37280b.Z0.setVisibility(8);
                return;
            case 7:
                this.f37280b.Z0.setVisibility(8);
                return;
            default:
                af.g.s(this.f37280b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
