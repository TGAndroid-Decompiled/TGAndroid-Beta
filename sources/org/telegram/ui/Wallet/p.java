package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback2 {
    public final int f34980a;
    public final Object f34981b;
    public final Object f34982c;
    public final Object d;
    public final Object e;

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f34980a = i10;
        this.f34981b = obj;
        this.f34982c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p.run(java.lang.Object, java.lang.Object):void");
    }

    public p(k0 k0Var, String str, String str2, String str3) {
        this.f34980a = 5;
        this.f34981b = k0Var;
        this.d = str;
        this.f34982c = str2;
        this.e = str3;
    }

    public p(s9 s9Var, l0 l0Var, TLRPC.User user, String str) {
        this.f34980a = 10;
        this.f34982c = s9Var;
        this.f34981b = l0Var;
        this.e = user;
        this.d = str;
    }
}
