package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jd implements Runnable {
    public final int f39509a;
    public final de f39510b;

    public jd(de deVar, int i10) {
        this.f39509a = i10;
        this.f39510b = deVar;
    }

    @Override
    public final void run() {
        switch (this.f39509a) {
            case 0:
                ye.d.s(this.f39510b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                return;
            case 1:
                org.telegram.ui.Components.u51 u51Var = this.f39510b.W0;
                if (u51Var != null) {
                    u51Var.U2.N(true);
                    return;
                }
                return;
            case 2:
                de deVar = this.f39510b;
                deVar.getClass();
                try {
                    org.telegram.ui.Components.jl0 currentListView = deVar.f37504a1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                de deVar2 = this.f39510b;
                int i10 = deVar2.f37524u0;
                AndroidUtilities.cancelRunOnUIThread(deVar2.f37520r1);
                if (deVar2.f37512i1 != deVar2.f37513j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-deVar2.f37525v0);
                    tL_channels_restrictSponsoredMessages.restricted = deVar2.f37512i1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new pd(deVar2, 0));
                    return;
                }
                return;
            case 4:
                de deVar3 = this.f39510b;
                deVar3.f37513j1 = deVar3.f37512i1;
                return;
            case 5:
                this.f39510b.P0.setLoading(false);
                return;
            case 6:
                this.f39510b.Y0.setVisibility(8);
                return;
            case 7:
                this.f39510b.Y0.setVisibility(8);
                return;
            default:
                ye.d.s(this.f39510b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                return;
        }
    }
}
