package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
public final class s implements q10 {
    public final int f44964a;
    public final Object f44965b;
    public final Object f44966c;
    public final Object d;
    public final Object f44967e;

    public s(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f44964a = i7;
        this.f44965b = obj;
        this.f44966c = obj2;
        this.d = obj3;
        this.f44967e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.a(java.lang.Object, java.lang.Object):void");
    }

    public s(t0 t0Var, String str, String str2, String str3) {
        this.f44964a = 5;
        this.f44965b = t0Var;
        this.d = str;
        this.f44966c = str2;
        this.f44967e = str3;
    }

    public s(na naVar, u0 u0Var, TLRPC.User user, String str) {
        this.f44964a = 10;
        this.f44966c = naVar;
        this.f44965b = u0Var;
        this.f44967e = user;
        this.d = str;
    }
}
