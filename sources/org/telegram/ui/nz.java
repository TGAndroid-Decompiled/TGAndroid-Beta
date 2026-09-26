package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz implements RequestDelegate {
    public final int f36015a;
    public final yz f36016b;

    public nz(yz yzVar, int i10) {
        this.f36015a = i10;
        this.f36016b = yzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36015a) {
            case 0:
                final yz yzVar = this.f36016b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                yz yzVar2 = yzVar;
                                yzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(yzVar2), R.raw.contact_check, 36);
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
                final yz yzVar2 = this.f36016b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                yz yzVar22 = yzVar2;
                                yzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.f0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(yzVar22), R.raw.contact_check, 36);
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
