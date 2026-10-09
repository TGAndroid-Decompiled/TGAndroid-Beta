package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Utilities.Callback2 {
    public final int f35244a;
    public final Object f35245b;
    public final Object f35246c;
    public final Object d;
    public final Object f35247e;

    public n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35244a = i10;
        this.f35245b = obj;
        this.f35246c = obj2;
        this.d = obj3;
        this.f35247e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n.run(java.lang.Object, java.lang.Object):void");
    }

    public n(j0 j0Var, String str, String str2, String str3) {
        this.f35244a = 5;
        this.f35245b = j0Var;
        this.d = str;
        this.f35246c = str2;
        this.f35247e = str3;
    }

    public n(r8 r8Var, k0 k0Var, TLRPC.User user, String str) {
        this.f35244a = 10;
        this.f35246c = r8Var;
        this.f35245b = k0Var;
        this.f35247e = user;
        this.d = str;
    }
}
