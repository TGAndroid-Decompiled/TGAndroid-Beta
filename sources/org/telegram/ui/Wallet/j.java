package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements v10 {
    public final int f42631a;
    public final Object f42632b;
    public final Object f42633c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f42631a = i7;
        this.f42632b = obj;
        this.f42633c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(c20 c20Var, n0 n0Var, ConnectionsManager connectionsManager) {
        this.f42631a = 10;
        this.f42633c = c20Var;
        this.f42632b = n0Var;
        this.d = connectionsManager;
    }

    public j(n0 n0Var, Object obj, Object obj2, int i7) {
        this.f42631a = i7;
        this.f42632b = n0Var;
        this.d = obj;
        this.f42633c = obj2;
    }

    public j(n0 n0Var, r rVar, String str, String str2) {
        this.f42631a = 5;
        this.f42632b = rVar;
        this.f42633c = str;
        this.d = str2;
    }

    public j(o8 o8Var, org.telegram.ui.ActionBar.u1 u1Var, n0 n0Var) {
        this.f42631a = 11;
        this.f42633c = o8Var;
        this.d = u1Var;
        this.f42632b = n0Var;
    }
}
