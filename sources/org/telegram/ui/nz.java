package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz implements RequestDelegate {
    public final int f35992a;
    public final yz f35993b;

    public nz(yz yzVar, int i10) {
        this.f35992a = i10;
        this.f35993b = yzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35992a) {
            case 0:
                final yz yzVar = this.f35993b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                yz yzVar2 = yzVar;
                                yzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.yc.a0(yzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                yz.U(yzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final yz yzVar2 = this.f35993b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                yz yzVar22 = yzVar2;
                                yzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.yc.a0(yzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                yz.U(yzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
