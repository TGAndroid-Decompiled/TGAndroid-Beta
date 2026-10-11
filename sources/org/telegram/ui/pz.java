package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pz implements RequestDelegate {
    public final int f41036a;
    public final b00 f41037b;

    public pz(b00 b00Var, int i10) {
        this.f41036a = i10;
        this.f41037b = b00Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41036a) {
            case 0:
                final b00 b00Var = this.f41037b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b00 b00Var2 = b00Var;
                                b00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.q.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.ad.a0(b00Var2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                b00.U(b00Var, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final b00 b00Var2 = this.f41037b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b00 b00Var22 = b00Var2;
                                b00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.q.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.ad.a0(b00Var22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                b00.U(b00Var2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
