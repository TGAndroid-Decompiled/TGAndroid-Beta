package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class r implements v10 {
    public final int f43050a;
    public final Object f43051b;
    public final Object f43052c;
    public final Object d;
    public final Object f43053e;

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43050a = i7;
        this.f43051b = obj;
        this.f43052c = obj2;
        this.d = obj3;
        this.f43053e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
    }

    public r(m0 m0Var, String str, String str2, String str3) {
        this.f43050a = 5;
        this.f43051b = m0Var;
        this.d = str;
        this.f43052c = str2;
        this.f43053e = str3;
    }

    public r(x9 x9Var, n0 n0Var, TLRPC.User user, String str) {
        this.f43050a = 10;
        this.f43052c = x9Var;
        this.f43051b = n0Var;
        this.f43053e = user;
        this.d = str;
    }
}
