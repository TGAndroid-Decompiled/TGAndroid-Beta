package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Utilities.Callback2 {
    public final int f33262a;
    public final Object f33263b;
    public final Object f33264c;
    public final Object d;
    public final Object e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33262a = i10;
        this.f33263b = obj;
        this.f33264c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o.run(java.lang.Object, java.lang.Object):void");
    }

    public o(j0 j0Var, String str, String str2, String str3) {
        this.f33262a = 5;
        this.f33263b = j0Var;
        this.d = str;
        this.f33264c = str2;
        this.e = str3;
    }

    public o(s8 s8Var, k0 k0Var, TLRPC.User user, String str) {
        this.f33262a = 10;
        this.f33264c = s8Var;
        this.f33263b = k0Var;
        this.e = user;
        this.d = str;
    }
}
