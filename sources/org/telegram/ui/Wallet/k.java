package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Utilities.Callback2 {
    public final int f34374a;
    public final Object f34375b;
    public final Object f34376c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f34374a = i10;
        this.f34375b = obj;
        this.d = obj2;
        this.f34376c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k.run(java.lang.Object, java.lang.Object):void");
    }

    public k(Utilities.Callback callback, m0 m0Var, ConnectionsManager connectionsManager) {
        this.f34374a = 10;
        this.d = callback;
        this.f34375b = m0Var;
        this.f34376c = connectionsManager;
    }

    public k(m0 m0Var, Object obj, Object obj2, int i10) {
        this.f34374a = i10;
        this.f34375b = m0Var;
        this.f34376c = obj;
        this.d = obj2;
    }

    public k(m0 m0Var, q qVar, String str, String str2) {
        this.f34374a = 3;
        this.f34375b = qVar;
        this.d = str;
        this.f34376c = str2;
    }

    public k(n8 n8Var, org.telegram.ui.ActionBar.b2 b2Var, m0 m0Var) {
        this.f34374a = 11;
        this.d = n8Var;
        this.f34376c = b2Var;
        this.f34375b = m0Var;
    }
}
