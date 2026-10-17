package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Utilities.Callback2 {
    public final int f34373a;
    public final Object f34374b;
    public final Object f34375c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f34373a = i10;
        this.f34374b = obj;
        this.d = obj2;
        this.f34375c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k.run(java.lang.Object, java.lang.Object):void");
    }

    public k(Utilities.Callback callback, m0 m0Var, ConnectionsManager connectionsManager) {
        this.f34373a = 10;
        this.d = callback;
        this.f34374b = m0Var;
        this.f34375c = connectionsManager;
    }

    public k(m0 m0Var, Object obj, Object obj2, int i10) {
        this.f34373a = i10;
        this.f34374b = m0Var;
        this.f34375c = obj;
        this.d = obj2;
    }

    public k(m0 m0Var, q qVar, String str, String str2) {
        this.f34373a = 3;
        this.f34374b = qVar;
        this.d = str;
        this.f34375c = str2;
    }

    public k(k8 k8Var, org.telegram.ui.ActionBar.b2 b2Var, m0 m0Var) {
        this.f34373a = 11;
        this.d = k8Var;
        this.f34375c = b2Var;
        this.f34374b = m0Var;
    }
}
