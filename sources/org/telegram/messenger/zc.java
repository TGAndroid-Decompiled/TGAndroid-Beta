package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.a50;
public final class zc implements RequestDelegate {
    public final int f19683a;
    public final int f19684b;
    public final boolean f19685c;
    public final Object d;

    public zc(dd ddVar, boolean z10, int i10) {
        this.f19683a = 0;
        this.d = ddVar;
        this.f19685c = z10;
        this.f19684b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19683a) {
            case 0:
                dd ddVar = (dd) this.d;
                if (tLObject instanceof Vector) {
                    i0.g3(new ob(this.f19684b, 1, ddVar, (Vector) tLObject, this.f19685c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19684b, this.f19685c, tLObject, tL_error);
                return;
            default:
                i0.g3(new org.telegram.messenger.voip.p0(this.f19684b, 6, (a50) this.d, tLObject, this.f19685c));
                return;
        }
    }

    public zc(vs vsVar, int i10, boolean z10, int i11) {
        this.f19683a = i11;
        this.d = vsVar;
        this.f19684b = i10;
        this.f19685c = z10;
    }
}
