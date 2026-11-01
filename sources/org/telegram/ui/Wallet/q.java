package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
public final class q implements k20 {
    public final int f35051a;
    public final Object f35052b;
    public final Object f35053c;
    public final Object d;
    public final Object e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35051a = i10;
        this.f35052b = obj;
        this.f35053c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(j0 j0Var, String str, String str2, String str3) {
        this.f35051a = 5;
        this.f35052b = j0Var;
        this.d = str;
        this.f35053c = str2;
        this.e = str3;
    }

    public q(ba baVar, k0 k0Var, TLRPC.User user, String str) {
        this.f35051a = 10;
        this.f35053c = baVar;
        this.f35052b = k0Var;
        this.e = user;
        this.d = str;
    }
}
