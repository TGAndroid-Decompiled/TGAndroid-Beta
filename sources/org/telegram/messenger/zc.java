package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.f40;
public final class zc implements RequestDelegate {
    public final int f28310a;
    public final int f28311b;
    public final boolean f28312c;
    public final Object d;

    public zc(gd gdVar, boolean z10, int i7) {
        this.f28310a = 0;
        this.d = gdVar;
        this.f28312c = z10;
        this.f28311b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28310a) {
            case 0:
                gd gdVar = (gd) this.d;
                if (tLObject instanceof Vector) {
                    g0.g3(new lb(this.f28311b, 1, gdVar, (Vector) tLObject, this.f28312c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f28311b, this.f28312c, tLObject, tL_error);
                return;
            default:
                g0.g3(new org.telegram.messenger.voip.l0(this.f28311b, 6, (f40) this.d, tLObject, this.f28312c));
                return;
        }
    }

    public zc(fs fsVar, int i7, boolean z10, int i10) {
        this.f28310a = i10;
        this.d = fsVar;
        this.f28311b = i7;
        this.f28312c = z10;
    }
}
