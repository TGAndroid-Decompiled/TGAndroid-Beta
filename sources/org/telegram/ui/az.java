package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az implements RequestDelegate {
    public final int f36578a;
    public final lz f36579b;

    public az(lz lzVar, int i9) {
        this.f36578a = i9;
        this.f36579b = lzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36578a) {
            case 0:
                final lz lzVar = this.f36579b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar2 = lzVar;
                                lzVar2.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.oc.a0(lzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.T(lzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final lz lzVar2 = this.f36579b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar22 = lzVar2;
                                lzVar22.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.oc.a0(lzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.T(lzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
