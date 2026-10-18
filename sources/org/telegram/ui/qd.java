package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qd implements Runnable {
    public final int f40390a;
    public final ke f40391b;

    public qd(ke keVar, int i10) {
        this.f40390a = i10;
        this.f40391b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f40390a) {
            case 0:
                pf.d.r(this.f40391b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.a71 a71Var = this.f40391b.f38487a1;
                if (a71Var != null) {
                    a71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                ke keVar = this.f40391b;
                keVar.getClass();
                try {
                    org.telegram.ui.Components.im0 currentListView = keVar.f38491e1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ke keVar2 = this.f40391b;
                int i10 = keVar2.f38511y0;
                AndroidUtilities.cancelRunOnUIThread(keVar2.f38507v1);
                if (keVar2.f38498m1 != keVar2.f38499n1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-keVar2.f38512z0);
                    tL_channels_restrictSponsoredMessages.restricted = keVar2.f38498m1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new wd(keVar2, 0));
                    return;
                }
                return;
            case 4:
                ke keVar3 = this.f40391b;
                keVar3.f38499n1 = keVar3.f38498m1;
                return;
            case 5:
                this.f40391b.T0.setLoading(false);
                return;
            case 6:
                this.f40391b.f38489c1.setVisibility(8);
                return;
            case 7:
                this.f40391b.f38489c1.setVisibility(8);
                return;
            default:
                pf.d.r(this.f40391b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
