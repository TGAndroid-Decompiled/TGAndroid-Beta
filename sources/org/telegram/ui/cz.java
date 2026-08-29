package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cz implements RequestDelegate {
    public final int f37242a;
    public final nz f37243b;

    public cz(nz nzVar, int i10) {
        this.f37242a = i10;
        this.f37243b = nzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37242a) {
            case 0:
                final nz nzVar = this.f37243b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                nz nzVar2 = nzVar;
                                nzVar2.B = 0;
                                if (tL_error == null) {
                                    j7.l1.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.tc.a0(nzVar2), R.raw.contact_check, 36);
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
                final nz nzVar2 = this.f37243b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                nz nzVar22 = nzVar2;
                                nzVar22.B = 0;
                                if (tL_error == null) {
                                    j7.l1.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.tc.a0(nzVar22), R.raw.contact_check, 36);
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
