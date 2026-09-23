package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oz implements RequestDelegate {
    public final int f35976a;
    public final zz f35977b;

    public oz(zz zzVar, int i10) {
        this.f35976a = i10;
        this.f35977b = zzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35976a) {
            case 0:
                final zz zzVar = this.f35977b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zz zzVar2 = zzVar;
                                zzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.z0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(zzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                zz.U(zzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final zz zzVar2 = this.f35977b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zz zzVar22 = zzVar2;
                                zzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.z0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(zzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                zz.U(zzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
