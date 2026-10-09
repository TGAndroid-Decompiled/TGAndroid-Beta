package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Utilities.Callback2 {
    public final int f35264a;
    public final Object f35265b;
    public final Object f35266c;
    public final Object d;
    public final Object f35267e;

    public n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f35264a = i10;
        this.f35265b = obj;
        this.f35266c = obj2;
        this.d = obj3;
        this.f35267e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n.run(java.lang.Object, java.lang.Object):void");
    }

    public n(j0 j0Var, String str, String str2, String str3) {
        this.f35264a = 5;
        this.f35265b = j0Var;
        this.d = str;
        this.f35266c = str2;
        this.f35267e = str3;
    }

    public n(s8 s8Var, k0 k0Var, TLRPC.User user, String str) {
        this.f35264a = 10;
        this.f35266c = s8Var;
        this.f35265b = k0Var;
        this.f35267e = user;
        this.d = str;
    }
}
