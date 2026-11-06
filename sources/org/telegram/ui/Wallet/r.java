package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class r implements v10 {
    public final int f43074a;
    public final Object f43075b;
    public final Object f43076c;
    public final Object d;
    public final Object f43077e;

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43074a = i7;
        this.f43075b = obj;
        this.f43076c = obj2;
        this.d = obj3;
        this.f43077e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
    }

    public r(m0 m0Var, String str, String str2, String str3) {
        this.f43074a = 5;
        this.f43075b = m0Var;
        this.d = str;
        this.f43076c = str2;
        this.f43077e = str3;
    }

    public r(x9 x9Var, n0 n0Var, TLRPC.User user, String str) {
        this.f43074a = 10;
        this.f43076c = x9Var;
        this.f43075b = n0Var;
        this.f43077e = user;
        this.d = str;
    }
}
