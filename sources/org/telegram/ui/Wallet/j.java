package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Utilities.Callback2 {
    public final int f35107a;
    public final Object f35108b;
    public final Object f35109c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f35107a = i10;
        this.f35108b = obj;
        this.d = obj2;
        this.f35109c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.run(java.lang.Object, java.lang.Object):void");
    }

    public j(Utilities.Callback callback, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f35107a = 10;
        this.d = callback;
        this.f35108b = k0Var;
        this.f35109c = connectionsManager;
    }

    public j(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f35107a = i10;
        this.f35108b = k0Var;
        this.f35109c = obj;
        this.d = obj2;
    }

    public j(k0 k0Var, o oVar, String str, String str2) {
        this.f35107a = 5;
        this.f35108b = oVar;
        this.d = str;
        this.f35109c = str2;
    }

    public j(m7 m7Var, org.telegram.ui.ActionBar.b2 b2Var, k0 k0Var) {
        this.f35107a = 11;
        this.d = m7Var;
        this.f35109c = b2Var;
        this.f35108b = k0Var;
    }
}
