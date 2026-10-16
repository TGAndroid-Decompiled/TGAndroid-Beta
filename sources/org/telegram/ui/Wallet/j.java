package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Utilities.Callback2 {
    public final int f33043a;
    public final Object f33044b;
    public final Object f33045c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f33043a = i10;
        this.f33044b = obj;
        this.d = obj2;
        this.f33045c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.run(java.lang.Object, java.lang.Object):void");
    }

    public j(Utilities.Callback callback, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f33043a = 10;
        this.d = callback;
        this.f33044b = k0Var;
        this.f33045c = connectionsManager;
    }

    public j(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f33043a = i10;
        this.f33044b = k0Var;
        this.f33045c = obj;
        this.d = obj2;
    }

    public j(k0 k0Var, o oVar, String str, String str2) {
        this.f33043a = 5;
        this.f33044b = oVar;
        this.d = str;
        this.f33045c = str2;
    }

    public j(l7 l7Var, org.telegram.ui.ActionBar.a2 a2Var, k0 k0Var) {
        this.f33043a = 11;
        this.d = l7Var;
        this.f33045c = a2Var;
        this.f33044b = k0Var;
    }
}
