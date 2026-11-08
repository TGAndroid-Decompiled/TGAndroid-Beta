package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements v10 {
    public final int f42655a;
    public final Object f42656b;
    public final Object f42657c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f42655a = i7;
        this.f42656b = obj;
        this.f42657c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(c20 c20Var, m0 m0Var, ConnectionsManager connectionsManager) {
        this.f42655a = 10;
        this.f42657c = c20Var;
        this.f42656b = m0Var;
        this.d = connectionsManager;
    }

    public j(m0 m0Var, Object obj, Object obj2, int i7) {
        this.f42655a = i7;
        this.f42656b = m0Var;
        this.d = obj;
        this.f42657c = obj2;
    }

    public j(m0 m0Var, r rVar, String str, String str2) {
        this.f42655a = 5;
        this.f42656b = rVar;
        this.f42657c = str;
        this.d = str2;
    }

    public j(n8 n8Var, org.telegram.ui.ActionBar.u1 u1Var, m0 m0Var) {
        this.f42655a = 11;
        this.f42657c = n8Var;
        this.d = u1Var;
        this.f42656b = m0Var;
    }
}
