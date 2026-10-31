package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements j20 {
    public final int f34726a;
    public final Object f34727b;
    public final Object f34728c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f34726a = i10;
        this.f34727b = obj;
        this.f34728c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(q20 q20Var, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f34726a = 10;
        this.f34728c = q20Var;
        this.f34727b = k0Var;
        this.d = connectionsManager;
    }

    public j(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f34726a = i10;
        this.f34727b = k0Var;
        this.d = obj;
        this.f34728c = obj2;
    }

    public j(k0 k0Var, q qVar, String str, String str2) {
        this.f34726a = 5;
        this.f34727b = qVar;
        this.f34728c = str;
        this.d = str2;
    }

    public j(t8 t8Var, org.telegram.ui.ActionBar.x1 x1Var, k0 k0Var) {
        this.f34726a = 11;
        this.f34728c = t8Var;
        this.d = x1Var;
        this.f34727b = k0Var;
    }
}
