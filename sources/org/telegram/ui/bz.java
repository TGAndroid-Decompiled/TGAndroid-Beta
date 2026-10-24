package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz implements RequestDelegate {
    public final int f36162a;
    public final oz f36163b;

    public bz(oz ozVar, int i10) {
        this.f36162a = i10;
        this.f36163b = ozVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36162a) {
            case 0:
                final oz ozVar = this.f36163b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oz ozVar2 = ozVar;
                                ozVar2.G = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.v0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.vc.a0(ozVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                oz.U(ozVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final oz ozVar2 = this.f36163b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oz ozVar22 = ozVar2;
                                ozVar22.G = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.v0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.vc.a0(ozVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                oz.U(ozVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
