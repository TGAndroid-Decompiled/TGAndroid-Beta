package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements n10 {
    public final int f42676a;
    public final Object f42677b;
    public final Object f42678c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i3) {
        this.f42676a = i3;
        this.f42677b = obj;
        this.f42678c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(u10 u10Var, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f42676a = 10;
        this.f42678c = u10Var;
        this.f42677b = k0Var;
        this.d = connectionsManager;
    }

    public j(k0 k0Var, Object obj, Object obj2, int i3) {
        this.f42676a = i3;
        this.f42677b = k0Var;
        this.d = obj;
        this.f42678c = obj2;
    }

    public j(k0 k0Var, q qVar, String str, String str2) {
        this.f42676a = 5;
        this.f42677b = qVar;
        this.f42678c = str;
        this.d = str2;
    }

    public j(n8 n8Var, org.telegram.ui.ActionBar.s1 s1Var, k0 k0Var) {
        this.f42676a = 11;
        this.f42678c = n8Var;
        this.d = s1Var;
        this.f42677b = k0Var;
    }
}
