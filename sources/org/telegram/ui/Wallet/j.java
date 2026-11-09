package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements v10 {
    public final int f42607a;
    public final Object f42608b;
    public final Object f42609c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f42607a = i7;
        this.f42608b = obj;
        this.f42609c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(c20 c20Var, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f42607a = 10;
        this.f42609c = c20Var;
        this.f42608b = l0Var;
        this.d = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i7) {
        this.f42607a = i7;
        this.f42608b = l0Var;
        this.d = obj;
        this.f42609c = obj2;
    }

    public j(l0 l0Var, q qVar, String str, String str2) {
        this.f42607a = 5;
        this.f42608b = qVar;
        this.f42609c = str;
        this.d = str2;
    }

    public j(m8 m8Var, org.telegram.ui.ActionBar.u1 u1Var, l0 l0Var) {
        this.f42607a = 11;
        this.f42609c = m8Var;
        this.d = u1Var;
        this.f42608b = l0Var;
    }
}
