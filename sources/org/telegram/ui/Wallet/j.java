package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements v10 {
    public final int f42658a;
    public final Object f42659b;
    public final Object f42660c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f42658a = i7;
        this.f42659b = obj;
        this.f42660c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(c20 c20Var, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f42658a = 10;
        this.f42660c = c20Var;
        this.f42659b = l0Var;
        this.d = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i7) {
        this.f42658a = i7;
        this.f42659b = l0Var;
        this.d = obj;
        this.f42660c = obj2;
    }

    public j(l0 l0Var, q qVar, String str, String str2) {
        this.f42658a = 5;
        this.f42659b = qVar;
        this.f42660c = str;
        this.d = str2;
    }

    public j(p8 p8Var, org.telegram.ui.ActionBar.u1 u1Var, l0 l0Var) {
        this.f42658a = 11;
        this.f42660c = p8Var;
        this.d = u1Var;
        this.f42659b = l0Var;
    }
}
