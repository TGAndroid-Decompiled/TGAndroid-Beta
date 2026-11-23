package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements r10 {
    public final int f44381a;
    public final Object f44382b;
    public final Object f44383c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f44381a = i7;
        this.f44382b = obj;
        this.d = obj2;
        this.f44383c = obj3;
    }

    @Override
    public final void a(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(u0 u0Var, Object obj, Object obj2, int i7) {
        this.f44381a = i7;
        this.f44382b = u0Var;
        this.f44383c = obj;
        this.d = obj2;
    }

    public j(u0 u0Var, s sVar, String str, String str2) {
        this.f44381a = 4;
        this.f44382b = sVar;
        this.d = str;
        this.f44383c = str2;
    }

    public j(w4 w4Var, u0 u0Var, ConnectionsManager connectionsManager) {
        this.f44381a = 10;
        this.d = w4Var;
        this.f44382b = u0Var;
        this.f44383c = connectionsManager;
    }

    public j(d9 d9Var, org.telegram.ui.ActionBar.t1 t1Var, u0 u0Var) {
        this.f44381a = 11;
        this.d = d9Var;
        this.f44383c = t1Var;
        this.f44382b = u0Var;
    }
}
