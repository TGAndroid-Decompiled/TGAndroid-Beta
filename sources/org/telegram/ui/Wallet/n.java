package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n implements Utilities.Callback2 {
    public final int f33488a;
    public final Object f33489b;
    public final Object f33490c;
    public final Object d;
    public final Object e;

    public n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33488a = i10;
        this.f33489b = obj;
        this.f33490c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r27, java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n.run(java.lang.Object, java.lang.Object):void");
    }

    public n(i0 i0Var, String str, String str2, String str3) {
        this.f33488a = 5;
        this.f33489b = i0Var;
        this.d = str;
        this.f33490c = str2;
        this.e = str3;
    }

    public n(r8 r8Var, j0 j0Var, TLRPC.User user, String str) {
        this.f33488a = 10;
        this.f33490c = r8Var;
        this.f33489b = j0Var;
        this.e = user;
        this.d = str;
    }
}
