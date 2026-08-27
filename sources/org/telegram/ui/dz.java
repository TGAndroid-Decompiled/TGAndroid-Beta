package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class dz implements RequestDelegate {

    public final int f37571a;

    public final oz f37572b;

    public dz(oz ozVar, int i10) {
        this.f37571a = i10;
        this.f37572b = ozVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37571a) {
            case 0:
                final int i10 = 0;
                final oz ozVar = this.f37572b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                oz ozVar2 = ozVar;
                                ozVar2.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.y1.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.mc.a0(ozVar2), R.raw.contact_check, 36);
                                }
                                break;
                            default:
                                oz.U(ozVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final oz ozVar2 = this.f37572b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                oz ozVar3 = ozVar2;
                                ozVar3.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.y1.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.mc.a0(ozVar3), R.raw.contact_check, 36);
                                }
                                break;
                            default:
                                oz.U(ozVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
