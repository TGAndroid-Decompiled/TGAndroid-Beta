package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Utilities.Callback2 {
    public final int f35171a;
    public final Object f35172b;
    public final Object f35173c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f35171a = i10;
        this.f35172b = obj;
        this.d = obj2;
        this.f35173c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k.run(java.lang.Object, java.lang.Object):void");
    }

    public k(Utilities.Callback callback, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f35171a = 10;
        this.d = callback;
        this.f35172b = l0Var;
        this.f35173c = connectionsManager;
    }

    public k(l0 l0Var, Object obj, Object obj2, int i10) {
        this.f35171a = i10;
        this.f35172b = l0Var;
        this.f35173c = obj;
        this.d = obj2;
    }

    public k(l0 l0Var, p pVar, String str, String str2) {
        this.f35171a = 5;
        this.f35172b = pVar;
        this.d = str;
        this.f35173c = str2;
    }

    public k(n7 n7Var, org.telegram.ui.ActionBar.a2 a2Var, l0 l0Var) {
        this.f35171a = 11;
        this.d = n7Var;
        this.f35173c = a2Var;
        this.f35172b = l0Var;
    }
}
