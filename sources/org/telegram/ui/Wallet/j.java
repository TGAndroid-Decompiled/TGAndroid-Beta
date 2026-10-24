package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Utilities.Callback2 {
    public final int f34631a;
    public final Object f34632b;
    public final Object f34633c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f34631a = i10;
        this.f34632b = obj;
        this.d = obj2;
        this.f34633c = obj3;
    }

    @Override
    public final void run(java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.run(java.lang.Object, java.lang.Object):void");
    }

    public j(Utilities.Callback callback, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f34631a = 10;
        this.d = callback;
        this.f34632b = l0Var;
        this.f34633c = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i10) {
        this.f34631a = i10;
        this.f34632b = l0Var;
        this.f34633c = obj;
        this.d = obj2;
    }

    public j(l0 l0Var, p pVar, String str, String str2) {
        this.f34631a = 3;
        this.f34632b = pVar;
        this.d = str;
        this.f34633c = str2;
    }

    public j(i8 i8Var, org.telegram.ui.ActionBar.c2 c2Var, l0 l0Var) {
        this.f34631a = 11;
        this.d = i8Var;
        this.f34633c = c2Var;
        this.f34632b = l0Var;
    }
}
