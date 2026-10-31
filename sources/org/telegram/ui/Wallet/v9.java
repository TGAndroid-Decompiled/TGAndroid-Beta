package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class v9 implements q20 {
    public final int f35328a;
    public final ba f35329b;

    public v9(ba baVar, int i10) {
        this.f35328a = i10;
        this.f35329b = baVar;
    }

    @Override
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.n0 n0Var;
        switch (this.f35328a) {
            case 0:
                ba.d0(this.f35329b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ba baVar = this.f35329b;
                if (!baVar.isFinished && (n0Var = baVar.N) != null) {
                    if (user == null) {
                        org.telegram.messenger.i0.g3(new w9(baVar, 1));
                        return;
                    }
                    org.telegram.messenger.i0.v1(n0Var);
                    baVar.l0(null, user);
                    return;
                }
                return;
        }
    }
}
