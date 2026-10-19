package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q implements Utilities.Callback2 {
    public final int f34743a;
    public final Object f34744b;
    public final Object f34745c;
    public final Object d;
    public final Object e;

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34743a = i10;
        this.f34744b = obj;
        this.f34745c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q.run(java.lang.Object, java.lang.Object):void");
    }

    public q(l0 l0Var, String str, String str2, String str3) {
        this.f34743a = 5;
        this.f34744b = l0Var;
        this.d = str;
        this.f34745c = str2;
        this.e = str3;
    }

    public q(r9 r9Var, m0 m0Var, TLRPC.User user, String str) {
        this.f34743a = 10;
        this.f34745c = r9Var;
        this.f34744b = m0Var;
        this.e = user;
        this.d = str;
    }
}
