package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements s10 {
    public final int f43997a;
    public final Object f43998b;
    public final Object f43999c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f43997a = i7;
        this.f43998b = obj;
        this.f43999c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(z10 z10Var, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f43997a = 10;
        this.f43999c = z10Var;
        this.f43998b = l0Var;
        this.d = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i7) {
        this.f43997a = i7;
        this.f43998b = l0Var;
        this.d = obj;
        this.f43999c = obj2;
    }

    public j(l0 l0Var, q qVar, String str, String str2) {
        this.f43997a = 5;
        this.f43998b = qVar;
        this.f43999c = str;
        this.d = str2;
    }

    public j(p8 p8Var, org.telegram.ui.ActionBar.t1 t1Var, l0 l0Var) {
        this.f43997a = 11;
        this.f43999c = p8Var;
        this.d = t1Var;
        this.f43998b = l0Var;
    }
}
