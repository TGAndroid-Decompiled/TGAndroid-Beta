package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements p10 {
    public final int f44491a;
    public final Object f44492b;
    public final Object f44493c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f44491a = i7;
        this.f44492b = obj;
        this.d = obj2;
        this.f44493c = obj3;
    }

    @Override
    public final void a(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(v0 v0Var, Object obj, Object obj2, int i7) {
        this.f44491a = i7;
        this.f44492b = v0Var;
        this.f44493c = obj;
        this.d = obj2;
    }

    public j(v0 v0Var, t tVar, String str, String str2) {
        this.f44491a = 4;
        this.f44492b = tVar;
        this.d = str;
        this.f44493c = str2;
    }

    public j(x4 x4Var, v0 v0Var, ConnectionsManager connectionsManager) {
        this.f44491a = 10;
        this.d = x4Var;
        this.f44492b = v0Var;
        this.f44493c = connectionsManager;
    }

    public j(e9 e9Var, org.telegram.ui.ActionBar.t1 t1Var, v0 v0Var) {
        this.f44491a = 11;
        this.d = e9Var;
        this.f44493c = t1Var;
        this.f44492b = v0Var;
    }
}
