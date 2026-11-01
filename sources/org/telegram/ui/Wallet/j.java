package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements k20 {
    public final int f34731a;
    public final Object f34732b;
    public final Object f34733c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f34731a = i10;
        this.f34732b = obj;
        this.f34733c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r25, java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(r20 r20Var, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f34731a = 10;
        this.f34733c = r20Var;
        this.f34732b = k0Var;
        this.d = connectionsManager;
    }

    public j(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f34731a = i10;
        this.f34732b = k0Var;
        this.d = obj;
        this.f34733c = obj2;
    }

    public j(k0 k0Var, q qVar, String str, String str2) {
        this.f34731a = 5;
        this.f34732b = qVar;
        this.f34733c = str;
        this.d = str2;
    }

    public j(t8 t8Var, org.telegram.ui.ActionBar.x1 x1Var, k0 k0Var) {
        this.f34731a = 11;
        this.f34733c = t8Var;
        this.d = x1Var;
        this.f34732b = k0Var;
    }
}
