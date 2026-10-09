package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements Utilities.Callback2 {
    public final int f35016a;
    public final Object f35017b;
    public final Object f35018c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f35016a = i10;
        this.f35017b = obj;
        this.d = obj2;
        this.f35018c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i.run(java.lang.Object, java.lang.Object):void");
    }

    public i(Utilities.Callback callback, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f35016a = 10;
        this.d = callback;
        this.f35017b = k0Var;
        this.f35018c = connectionsManager;
    }

    public i(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f35016a = i10;
        this.f35017b = k0Var;
        this.f35018c = obj;
        this.d = obj2;
    }

    public i(k0 k0Var, n nVar, String str, String str2) {
        this.f35016a = 5;
        this.f35017b = nVar;
        this.d = str;
        this.f35018c = str2;
    }

    public i(l7 l7Var, org.telegram.ui.ActionBar.b2 b2Var, k0 k0Var) {
        this.f35016a = 11;
        this.d = l7Var;
        this.f35018c = b2Var;
        this.f35017b = k0Var;
    }
}
