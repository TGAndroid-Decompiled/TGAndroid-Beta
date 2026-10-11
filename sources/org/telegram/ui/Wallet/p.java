package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback2 {
    public final int f35421a;
    public final Object f35422b;
    public final Object f35423c;
    public final Object d;
    public final Object f35424e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35421a = i10;
        this.f35422b = obj;
        this.f35423c = obj2;
        this.d = obj3;
        this.f35424e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p.run(java.lang.Object, java.lang.Object):void");
    }

    public p(k0 k0Var, String str, String str2, String str3) {
        this.f35421a = 5;
        this.f35422b = k0Var;
        this.d = str;
        this.f35423c = str2;
        this.f35424e = str3;
    }

    public p(u8 u8Var, l0 l0Var, TLRPC.User user, String str) {
        this.f35421a = 10;
        this.f35423c = u8Var;
        this.f35422b = l0Var;
        this.f35424e = user;
        this.d = str;
    }
}
