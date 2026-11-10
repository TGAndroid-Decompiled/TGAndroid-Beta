package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class q implements v10 {
    public final int f43035a;
    public final Object f43036b;
    public final Object f43037c;
    public final Object d;
    public final Object f43038e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43035a = i7;
        this.f43036b = obj;
        this.f43037c = obj2;
        this.d = obj3;
        this.f43038e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(k0 k0Var, String str, String str2, String str3) {
        this.f43035a = 5;
        this.f43036b = k0Var;
        this.d = str;
        this.f43037c = str2;
        this.f43038e = str3;
    }

    public q(y9 y9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f43035a = 10;
        this.f43037c = y9Var;
        this.f43036b = l0Var;
        this.f43038e = user;
        this.d = str;
    }
}
