package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nz implements RequestDelegate {
    public final int f39546a;
    public final zz f39547b;

    public nz(zz zzVar, int i10) {
        this.f39546a = i10;
        this.f39547b = zzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39546a) {
            case 0:
                final zz zzVar = this.f39547b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zz zzVar2 = zzVar;
                                zzVar2.C = 0;
                                if (tL_error == null) {
                                    l.d.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(zzVar2), R.raw.contact_check, 36);
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
                final zz zzVar2 = this.f39547b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zz zzVar22 = zzVar2;
                                zzVar22.C = 0;
                                if (tL_error == null) {
                                    l.d.v(R.string.FilterInviteNameEdited, org.telegram.ui.Components.qc.a0(zzVar22), R.raw.contact_check, 36);
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
