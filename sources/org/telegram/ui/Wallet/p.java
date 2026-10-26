package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback2 {
    public final int f37071a;
    public final Object f37072b;
    public final Object f37073c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f37071a = i10;
        this.f37072b = obj;
        this.f37073c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p.run(java.lang.Object, java.lang.Object):void");
    }

    public p(k0 k0Var, String str, String str2, String str3) {
        this.f37071a = 5;
        this.f37072b = k0Var;
        this.d = str;
        this.f37073c = str2;
        this.e = str3;
    }

    public p(r9 r9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f37071a = 10;
        this.f37073c = r9Var;
        this.f37072b = l0Var;
        this.e = user;
        this.d = str;
    }
}
