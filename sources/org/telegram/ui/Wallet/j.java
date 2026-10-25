package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Utilities.Callback2 {
    public final int f36717a;
    public final Object f36718b;
    public final Object f36719c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f36717a = i10;
        this.f36718b = obj;
        this.d = obj2;
        this.f36719c = obj3;
    }

    @Override
    public final void run(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.run(java.lang.Object, java.lang.Object):void");
    }

    public j(Utilities.Callback callback, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f36717a = 10;
        this.d = callback;
        this.f36718b = l0Var;
        this.f36719c = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i10) {
        this.f36717a = i10;
        this.f36718b = l0Var;
        this.f36719c = obj;
        this.d = obj2;
    }

    public j(l0 l0Var, p pVar, String str, String str2) {
        this.f36717a = 3;
        this.f36718b = pVar;
        this.d = str;
        this.f36719c = str2;
    }

    public j(h8 h8Var, org.telegram.ui.ActionBar.e2 e2Var, l0 l0Var) {
        this.f36717a = 11;
        this.d = h8Var;
        this.f36719c = e2Var;
        this.f36718b = l0Var;
    }
}
