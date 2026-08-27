package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class kd implements Runnable {

    public final int f39697a;

    public final fe f39698b;

    public kd(fe feVar, int i10) {
        this.f39697a = i10;
        this.f39698b = feVar;
    }

    @Override
    public final void run() {
        switch (this.f39697a) {
            case 0:
                we.e.s(this.f39698b.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 1:
                org.telegram.ui.Components.k51 k51Var = this.f39698b.W0;
                if (k51Var != null) {
                    k51Var.U2.N(true);
                }
                break;
            case 2:
                fe feVar = this.f39698b;
                feVar.getClass();
                try {
                    org.telegram.ui.Components.zk0 currentListView = feVar.f38080a1.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 3:
                fe feVar2 = this.f39698b;
                int i10 = feVar2.f38100u0;
                AndroidUtilities.cancelRunOnUIThread(feVar2.f38096r1);
                if (feVar2.f38088i1 != feVar2.f38089j1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i10).getInputChannel(-feVar2.f38101v0);
                    tL_channels_restrictSponsoredMessages.restricted = feVar2.f38088i1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new qd(feVar2, 0));
                    break;
                }
                break;
            case 4:
                fe feVar3 = this.f39698b;
                feVar3.f38089j1 = feVar3.f38088i1;
                break;
            case 5:
                this.f39698b.P0.setLoading(false);
                break;
            case 6:
                this.f39698b.Y0.setVisibility(8);
                break;
            case 7:
                this.f39698b.Y0.setVisibility(8);
                break;
            default:
                we.e.s(this.f39698b.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
        }
    }
}
