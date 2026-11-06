package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class dd implements Runnable {
    public final int f45027a;
    public final zd f45028b;

    public dd(zd zdVar, int i7) {
        this.f45027a = i7;
        this.f45028b = zdVar;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7 = this.f45027a;
        boolean z10 = false;
        zd zdVar = this.f45028b;
        switch (i7) {
            case 0:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.hd.M0(2131748403, null));
                return;
            case 1:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.hd.M0(2131748369, null));
                return;
            case 2:
                org.telegram.ui.Components.k41 k41Var = zdVar.X0;
                if (k41Var != null) {
                    boolean z11 = zdVar.f34422e0;
                    if (zdVar.R0 != -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    org.telegram.ui.Components.f41 f41Var = k41Var.f35167f3;
                    if (z9 == zdVar.f52524a1.a()) {
                        z10 = true;
                    }
                    f41Var.O(z10);
                    if (z11 && zdVar.R0 != -1) {
                        zdVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zdVar.f52534k1 = zdVar.f52533j1;
                return;
            case 4:
                zdVar.J0.setLoading(false);
                return;
            case 5:
                zdVar.Y0.setVisibility(8);
                return;
            case 6:
                zdVar.Y0.setVisibility(8);
                return;
            default:
                int i10 = zdVar.f52537o0;
                org.telegram.messenger.g0.r(zdVar.f52546s1);
                if (zdVar.f52533j1 != zdVar.f52534k1) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    tL_channels_restrictSponsoredMessages.channel = org.telegram.messenger.qp.s1(i10).h1(-zdVar.f52539p0);
                    tL_channels_restrictSponsoredMessages.restricted = zdVar.f52533j1;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_channels_restrictSponsoredMessages, new kd(zdVar, 0));
                    return;
                }
                return;
        }
    }
}
