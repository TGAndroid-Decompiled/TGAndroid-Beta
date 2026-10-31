package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.b50;
public final class yc implements RequestDelegate {
    public final int f19355a;
    public final int f19356b;
    public final boolean f19357c;
    public final Object d;

    public yc(cd cdVar, boolean z10, int i10) {
        this.f19355a = 0;
        this.d = cdVar;
        this.f19357c = z10;
        this.f19356b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19355a) {
            case 0:
                cd cdVar = (cd) this.d;
                if (tLObject instanceof Vector) {
                    i0.g3(new nb(this.f19356b, 1, cdVar, (Vector) tLObject, this.f19357c));
                    return;
                }
                return;
            case 1:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.f19356b, this.f19357c, tLObject, tL_error);
                return;
            default:
                i0.g3(new org.telegram.messenger.voip.p0(this.f19356b, 6, (b50) this.d, tLObject, this.f19357c));
                return;
        }
    }

    public yc(us usVar, int i10, boolean z10, int i11) {
        this.f19355a = i11;
        this.d = usVar;
        this.f19356b = i10;
        this.f19357c = z10;
    }
}
