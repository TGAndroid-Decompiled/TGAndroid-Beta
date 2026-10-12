package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o implements Utilities.Callback2 {
    public final int f35142a;
    public final Object f35143b;
    public final Object f35144c;
    public final Object d;
    public final Object f35145e;

    public o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35142a = i10;
        this.f35143b = obj;
        this.f35144c = obj2;
        this.d = obj3;
        this.f35145e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o.run(java.lang.Object, java.lang.Object):void");
    }

    public o(k0 k0Var, String str, String str2, String str3) {
        this.f35142a = 5;
        this.f35143b = k0Var;
        this.d = str;
        this.f35144c = str2;
        this.f35145e = str3;
    }

    public o(u8 u8Var, l0 l0Var, TLRPC.User user, String str) {
        this.f35142a = 10;
        this.f35144c = u8Var;
        this.f35143b = l0Var;
        this.f35145e = user;
        this.d = str;
    }
}
