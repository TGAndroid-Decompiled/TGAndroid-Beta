package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback2 {
    public final int f35387a;
    public final Object f35388b;
    public final Object f35389c;
    public final Object d;
    public final Object f35390e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35387a = i10;
        this.f35388b = obj;
        this.f35389c = obj2;
        this.d = obj3;
        this.f35390e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p.run(java.lang.Object, java.lang.Object):void");
    }

    public p(k0 k0Var, String str, String str2, String str3) {
        this.f35387a = 5;
        this.f35388b = k0Var;
        this.d = str;
        this.f35389c = str2;
        this.f35390e = str3;
    }

    public p(u8 u8Var, l0 l0Var, TLRPC.User user, String str) {
        this.f35387a = 10;
        this.f35389c = u8Var;
        this.f35388b = l0Var;
        this.f35390e = user;
        this.d = str;
    }
}
