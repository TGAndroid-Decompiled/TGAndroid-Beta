package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class ha implements y10 {
    public final int f44328a;
    public final na f44329b;

    public ha(na naVar, int i7) {
        this.f44328a = i7;
        this.f44329b = naVar;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f44328a) {
            case 0:
                na.e0(this.f44329b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                na naVar = this.f44329b;
                if (!naVar.isFinished && (iVar = naVar.O) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new ia(naVar, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    naVar.m0(null, user);
                    return;
                }
                return;
        }
    }
}
