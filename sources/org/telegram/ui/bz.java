package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz implements RequestDelegate {
    public final int f35778a;
    public final nz f35779b;

    public bz(nz nzVar, int i10) {
        this.f35778a = i10;
        this.f35779b = nzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35778a) {
            case 0:
                final nz nzVar = this.f35779b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                nz nzVar2 = nzVar;
                                nzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(nzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                nz.U(nzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final nz nzVar2 = this.f35779b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                nz nzVar22 = nzVar2;
                                nzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(nzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                nz.U(nzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
