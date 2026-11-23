package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
public final class s implements r10 {
    public final int f44974a;
    public final Object f44975b;
    public final Object f44976c;
    public final Object d;
    public final Object f44977e;

    public s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f44974a = i7;
        this.f44975b = obj;
        this.f44976c = obj2;
        this.d = obj3;
        this.f44977e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
    }

    public s(t0 t0Var, String str, String str2, String str3) {
        this.f44974a = 5;
        this.f44975b = t0Var;
        this.d = str;
        this.f44976c = str2;
        this.f44977e = str3;
    }

    public s(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f44974a = 10;
        this.f44976c = naVar;
        this.f44975b = u0Var;
        this.f44977e = user;
        this.d = str;
    }
}
