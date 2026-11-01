package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class v9 implements r20 {
    public final int f35332a;
    public final ba f35333b;

    public v9(ba baVar, int i10) {
        this.f35332a = i10;
        this.f35333b = baVar;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.n0 n0Var;
        switch (this.f35332a) {
            case 0:
                ba.e0(this.f35333b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ba baVar = this.f35333b;
                if (!baVar.isFinished && (n0Var = baVar.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.i0.g3(new w9(baVar, 1));
                        return;
                    }
                    org.telegram.messenger.i0.v1(n0Var);
                    baVar.m0(null, user);
                    return;
                }
                return;
        }
    }
}
