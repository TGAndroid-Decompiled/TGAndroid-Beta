package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class q implements v10 {
    public final int f43000a;
    public final Object f43001b;
    public final Object f43002c;
    public final Object d;
    public final Object f43003e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43000a = i7;
        this.f43001b = obj;
        this.f43002c = obj2;
        this.d = obj3;
        this.f43003e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(k0 k0Var, String str, String str2, String str3) {
        this.f43000a = 5;
        this.f43001b = k0Var;
        this.d = str;
        this.f43002c = str2;
        this.f43003e = str3;
    }

    public q(v9 v9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f43000a = 10;
        this.f43002c = v9Var;
        this.f43001b = l0Var;
        this.f43003e = user;
        this.d = str;
    }
}
