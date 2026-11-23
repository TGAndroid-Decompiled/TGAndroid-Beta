package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
public final class s implements r10 {
    public final int f45008a;
    public final Object f45009b;
    public final Object f45010c;
    public final Object d;
    public final Object f45011e;

    public s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f45008a = i7;
        this.f45009b = obj;
        this.f45010c = obj2;
        this.d = obj3;
        this.f45011e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
    }

    public s(t0 t0Var, String str, String str2, String str3) {
        this.f45008a = 5;
        this.f45009b = t0Var;
        this.d = str;
        this.f45010c = str2;
        this.f45011e = str3;
    }

    public s(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f45008a = 10;
        this.f45010c = naVar;
        this.f45009b = u0Var;
        this.f45011e = user;
        this.d = str;
    }
}
