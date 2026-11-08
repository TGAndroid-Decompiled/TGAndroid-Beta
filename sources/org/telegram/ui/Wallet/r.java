package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class r implements v10 {
    public final int f43082a;
    public final Object f43083b;
    public final Object f43084c;
    public final Object d;
    public final Object f43085e;

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f43082a = i7;
        this.f43083b = obj;
        this.f43084c = obj2;
        this.d = obj3;
        this.f43085e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.r.a(java.lang.Object, java.lang.Object):void");
    }

    public r(l0 l0Var, String str, String str2, String str3) {
        this.f43082a = 5;
        this.f43083b = l0Var;
        this.d = str;
        this.f43084c = str2;
        this.f43085e = str3;
    }

    public r(w9 w9Var, m0 m0Var, TLRPC.User user, String str) {
        this.f43082a = 10;
        this.f43084c = w9Var;
        this.f43083b = m0Var;
        this.f43085e = user;
        this.d = str;
    }
}
