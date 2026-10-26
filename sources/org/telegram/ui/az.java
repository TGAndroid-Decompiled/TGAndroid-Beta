package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az implements RequestDelegate {
    public final int f37925a;
    public final lz f37926b;

    public az(lz lzVar, int i10) {
        this.f37925a = i10;
        this.f37926b = lzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37925a) {
            case 0:
                final lz lzVar = this.f37926b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar2 = lzVar;
                                lzVar2.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(lzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.V(lzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final lz lzVar2 = this.f37926b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar22 = lzVar2;
                                lzVar22.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(lzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.V(lzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
