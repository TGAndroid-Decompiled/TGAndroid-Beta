package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oz implements RequestDelegate {
    public final int f36904a;
    public final a00 f36905b;

    public oz(a00 a00Var, int i10) {
        this.f36904a = i10;
        this.f36905b = a00Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36904a) {
            case 0:
                final a00 a00Var = this.f36905b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                a00 a00Var2 = a00Var;
                                a00Var2.C = 0;
                                if (tL_error == null) {
                                    kf.k0.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(a00Var2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                a00.U(a00Var, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final a00 a00Var2 = this.f36905b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                a00 a00Var22 = a00Var2;
                                a00Var22.C = 0;
                                if (tL_error == null) {
                                    kf.k0.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(a00Var22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                a00.U(a00Var2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
