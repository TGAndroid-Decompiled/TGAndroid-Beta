package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements q10 {
    public final int f44371a;
    public final Object f44372b;
    public final Object f44373c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f44371a = i7;
        this.f44372b = obj;
        this.d = obj2;
        this.f44373c = obj3;
    }

    @Override
    public final void a(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(u0 u0Var, Object obj, Object obj2, int i7) {
        this.f44371a = i7;
        this.f44372b = u0Var;
        this.f44373c = obj;
        this.d = obj2;
    }

    public j(u0 u0Var, s sVar, String str, String str2) {
        this.f44371a = 4;
        this.f44372b = sVar;
        this.d = str;
        this.f44373c = str2;
    }

    public j(w4 w4Var, u0 u0Var, ConnectionsManager connectionsManager) {
        this.f44371a = 10;
        this.d = w4Var;
        this.f44372b = u0Var;
        this.f44373c = connectionsManager;
    }

    public j(d9 d9Var, org.telegram.ui.ActionBar.u1 u1Var, u0 u0Var) {
        this.f44371a = 11;
        this.d = d9Var;
        this.f44373c = u1Var;
        this.f44372b = u0Var;
    }
}
