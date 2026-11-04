package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class q implements n10 {
    public final int f43065a;
    public final Object f43066b;
    public final Object f43067c;
    public final Object d;
    public final Object f43068e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f43065a = i3;
        this.f43066b = obj;
        this.f43067c = obj2;
        this.d = obj3;
        this.f43068e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(j0 j0Var, String str, String str2, String str3) {
        this.f43065a = 5;
        this.f43066b = j0Var;
        this.d = str;
        this.f43067c = str2;
        this.f43068e = str3;
    }

    public q(w9 w9Var, k0 k0Var, TLRPC.User user, String str) {
        this.f43065a = 10;
        this.f43067c = w9Var;
        this.f43066b = k0Var;
        this.f43068e = user;
        this.d = str;
    }
}
