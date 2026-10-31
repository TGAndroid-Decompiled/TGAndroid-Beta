package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
public final class q implements j20 {
    public final int f35052a;
    public final Object f35053b;
    public final Object f35054c;
    public final Object d;
    public final Object e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35052a = i10;
        this.f35053b = obj;
        this.f35054c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void a(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.a(java.lang.Object, java.lang.Object):void");
    }

    public q(j0 j0Var, String str, String str2, String str3) {
        this.f35052a = 5;
        this.f35053b = j0Var;
        this.d = str;
        this.f35054c = str2;
        this.e = str3;
    }

    public q(ba baVar, k0 k0Var, TLRPC.User user, String str) {
        this.f35052a = 10;
        this.f35054c = baVar;
        this.f35053b = k0Var;
        this.e = user;
        this.d = str;
    }
}
