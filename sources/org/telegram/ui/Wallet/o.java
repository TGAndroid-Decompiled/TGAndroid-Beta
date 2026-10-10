package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Utilities.Callback2 {
    public final int f35357a;
    public final Object f35358b;
    public final Object f35359c;
    public final Object d;
    public final Object f35360e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35357a = i10;
        this.f35358b = obj;
        this.f35359c = obj2;
        this.d = obj3;
        this.f35360e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o.run(java.lang.Object, java.lang.Object):void");
    }

    public o(j0 j0Var, String str, String str2, String str3) {
        this.f35357a = 5;
        this.f35358b = j0Var;
        this.d = str;
        this.f35359c = str2;
        this.f35360e = str3;
    }

    public o(t8 t8Var, k0 k0Var, TLRPC.User user, String str) {
        this.f35357a = 10;
        this.f35359c = t8Var;
        this.f35358b = k0Var;
        this.f35360e = user;
        this.d = str;
    }
}
