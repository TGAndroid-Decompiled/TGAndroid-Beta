package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements Utilities.Callback2 {
    public final int f34994a;
    public final Object f34995b;
    public final Object f34996c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f34994a = i10;
        this.f34995b = obj;
        this.d = obj2;
        this.f34996c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i.run(java.lang.Object, java.lang.Object):void");
    }

    public i(Utilities.Callback callback, k0 k0Var, ConnectionsManager connectionsManager) {
        this.f34994a = 10;
        this.d = callback;
        this.f34995b = k0Var;
        this.f34996c = connectionsManager;
    }

    public i(k0 k0Var, Object obj, Object obj2, int i10) {
        this.f34994a = i10;
        this.f34995b = k0Var;
        this.f34996c = obj;
        this.d = obj2;
    }

    public i(k0 k0Var, n nVar, String str, String str2) {
        this.f34994a = 5;
        this.f34995b = nVar;
        this.d = str;
        this.f34996c = str2;
    }

    public i(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, k0 k0Var) {
        this.f34994a = 11;
        this.d = k7Var;
        this.f34996c = b2Var;
        this.f34995b = k0Var;
    }
}
