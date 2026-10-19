package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class k implements Utilities.Callback2 {
    public final int f34402a;
    public final Object f34403b;
    public final Object f34404c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f34402a = i10;
        this.f34403b = obj;
        this.d = obj2;
        this.f34404c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.k.run(java.lang.Object, java.lang.Object):void");
    }

    public k(Utilities.Callback callback, m0 m0Var, ConnectionsManager connectionsManager) {
        this.f34402a = 10;
        this.d = callback;
        this.f34403b = m0Var;
        this.f34404c = connectionsManager;
    }

    public k(m0 m0Var, Object obj, Object obj2, int i10) {
        this.f34402a = i10;
        this.f34403b = m0Var;
        this.f34404c = obj;
        this.d = obj2;
    }

    public k(m0 m0Var, q qVar, String str, String str2) {
        this.f34402a = 3;
        this.f34403b = qVar;
        this.d = str;
        this.f34404c = str2;
    }

    public k(h8 h8Var, org.telegram.ui.ActionBar.b2 b2Var, m0 m0Var) {
        this.f34402a = 11;
        this.d = h8Var;
        this.f34404c = b2Var;
        this.f34403b = m0Var;
    }
}
