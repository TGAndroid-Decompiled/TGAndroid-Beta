package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.f40;
public final class zc implements RequestDelegate {
    public final int f28284a;
    public final int f28285b;
    public final boolean f28286c;
    public final Object d;

    public zc(gd gdVar, boolean z10, int i7) {
        this.f28284a = 0;
        this.d = gdVar;
        this.f28286c = z10;
        this.f28285b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28284a) {
            case 0:
                gd gdVar = (gd) this.d;
                if (tLObject instanceof Vector) {
                    g0.g3(new lb(this.f28285b, 1, gdVar, (Vector) tLObject, this.f28286c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f28285b, this.f28286c, tLObject, tL_error);
                return;
            default:
                g0.g3(new org.telegram.messenger.voip.l0(this.f28285b, 6, (f40) this.d, tLObject, this.f28286c));
                return;
        }
    }

    public zc(fs fsVar, int i7, boolean z10, int i10) {
        this.f28284a = i10;
        this.d = fsVar;
        this.f28285b = i7;
        this.f28286c = z10;
    }
}
