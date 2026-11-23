package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class ia implements w10 {
    public final int f44489a;
    public final oa f44490b;

    public ia(oa oaVar, int i7) {
        this.f44489a = i7;
        this.f44490b = oaVar;
    }

    @Override
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.f44489a) {
            case 0:
                oa.e0(this.f44490b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                oa oaVar = this.f44490b;
                if (!oaVar.isFinished && (iVar = oaVar.O) != null) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new ja(oaVar, 1));
                        return;
                    }
                    org.telegram.messenger.g0.v1(iVar);
                    oaVar.m0(null, user);
                    return;
                }
                return;
        }
    }
}
