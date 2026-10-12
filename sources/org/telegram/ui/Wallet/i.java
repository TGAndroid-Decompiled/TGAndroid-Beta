package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements Utilities.Callback2 {
    public final int f33270a;
    public final Object f33271b;
    public final Object f33272c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f33270a = i10;
        this.f33271b = obj;
        this.d = obj2;
        this.f33272c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i.run(java.lang.Object, java.lang.Object):void");
    }

    public i(Utilities.Callback callback, j0 j0Var, ConnectionsManager connectionsManager) {
        this.f33270a = 10;
        this.d = callback;
        this.f33271b = j0Var;
        this.f33272c = connectionsManager;
    }

    public i(j0 j0Var, Object obj, Object obj2, int i10) {
        this.f33270a = i10;
        this.f33271b = j0Var;
        this.f33272c = obj;
        this.d = obj2;
    }

    public i(j0 j0Var, n nVar, String str, String str2) {
        this.f33270a = 5;
        this.f33271b = nVar;
        this.d = str;
        this.f33272c = str2;
    }

    public i(k7 k7Var, org.telegram.ui.ActionBar.a2 a2Var, j0 j0Var) {
        this.f33270a = 11;
        this.d = k7Var;
        this.f33272c = a2Var;
        this.f33271b = j0Var;
    }
}
