package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
public final class t implements p10 {
    public final int f45136a;
    public final Object f45137b;
    public final Object f45138c;
    public final Object d;
    public final Object f45139e;

    public t(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f45136a = i7;
        this.f45137b = obj;
        this.f45138c = obj2;
        this.d = obj3;
        this.f45139e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t.a(java.lang.Object, java.lang.Object):void");
    }

    public t(u0 u0Var, String str, String str2, String str3) {
        this.f45136a = 5;
        this.f45137b = u0Var;
        this.d = str;
        this.f45138c = str2;
        this.f45139e = str3;
    }

    public t(oa oaVar, v0 v0Var, TLRPC.User user, String str) {
        this.f45136a = 10;
        this.f45138c = oaVar;
        this.f45137b = v0Var;
        this.f45139e = user;
        this.d = str;
    }
}
