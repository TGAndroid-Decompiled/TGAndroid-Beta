package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements q10 {
    public final int f44411a;
    public final Object f44412b;
    public final Object f44413c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i7) {
        this.f44411a = i7;
        this.f44412b = obj;
        this.d = obj2;
        this.f44413c = obj3;
    }

    @Override
    public final void a(java.lang.Object r23, java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.a(java.lang.Object, java.lang.Object):void");
    }

    public j(u0 u0Var, Object obj, Object obj2, int i7) {
        this.f44411a = i7;
        this.f44412b = u0Var;
        this.f44413c = obj;
        this.d = obj2;
    }

    public j(u0 u0Var, s sVar, String str, String str2) {
        this.f44411a = 4;
        this.f44412b = sVar;
        this.d = str;
        this.f44413c = str2;
    }

    public j(x4 x4Var, u0 u0Var, ConnectionsManager connectionsManager) {
        this.f44411a = 10;
        this.d = x4Var;
        this.f44412b = u0Var;
        this.f44413c = connectionsManager;
    }

    public j(d9 d9Var, org.telegram.ui.ActionBar.t1 t1Var, u0 u0Var) {
        this.f44411a = 11;
        this.d = d9Var;
        this.f44413c = t1Var;
        this.f44412b = u0Var;
    }
}
