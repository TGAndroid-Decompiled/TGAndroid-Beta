package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cz implements RequestDelegate {
    public final int f38475a;
    public final oz f38476b;

    public cz(oz ozVar, int i10) {
        this.f38475a = i10;
        this.f38476b = ozVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38475a) {
            case 0:
                final oz ozVar = this.f38476b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oz ozVar2 = ozVar;
                                ozVar2.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(ozVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                oz.V(ozVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final oz ozVar2 = this.f38476b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                oz ozVar22 = ozVar2;
                                ozVar22.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(ozVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                oz.V(ozVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
