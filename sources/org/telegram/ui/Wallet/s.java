package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class s implements q10 {
    public final int f45004a;
    public final Object f45005b;
    public final Object f45006c;
    public final Object d;
    public final Object f45007e;

    public s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f45004a = i7;
        this.f45005b = obj;
        this.f45006c = obj2;
        this.d = obj3;
        this.f45007e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
    }

    public s(t0 t0Var, String str, String str2, String str3) {
        this.f45004a = 5;
        this.f45005b = t0Var;
        this.d = str;
        this.f45006c = str2;
        this.f45007e = str3;
    }

    public s(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f45004a = 10;
        this.f45006c = naVar;
        this.f45005b = u0Var;
        this.f45007e = user;
        this.d = str;
    }
}
