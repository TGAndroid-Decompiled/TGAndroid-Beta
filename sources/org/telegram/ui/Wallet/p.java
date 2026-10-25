package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback2 {
    public final int f37068a;
    public final Object f37069b;
    public final Object f37070c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37068a = i10;
        this.f37069b = obj;
        this.f37070c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p.run(java.lang.Object, java.lang.Object):void");
    }

    public p(k0 k0Var, String str, String str2, String str3) {
        this.f37068a = 5;
        this.f37069b = k0Var;
        this.d = str;
        this.f37070c = str2;
        this.e = str3;
    }

    public p(r9 r9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f37068a = 10;
        this.f37070c = r9Var;
        this.f37069b = l0Var;
        this.e = user;
        this.d = str;
    }
}
