package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
public final class q implements s10 {
    public final int f44375a;
    public final Object f44376b;
    public final Object f44377c;
    public final Object d;
    public final Object f44378e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f44375a = i7;
        this.f44376b = obj;
        this.f44377c = obj2;
        this.d = obj3;
        this.f44378e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(k0 k0Var, String str, String str2, String str3) {
        this.f44375a = 5;
        this.f44376b = k0Var;
        this.d = str;
        this.f44377c = str2;
        this.f44378e = str3;
    }

    public q(z9 z9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f44375a = 10;
        this.f44377c = z9Var;
        this.f44376b = l0Var;
        this.f44378e = user;
        this.d = str;
    }
}
