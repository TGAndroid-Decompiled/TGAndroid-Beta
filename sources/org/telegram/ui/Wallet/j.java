package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements Utilities.Callback2 {
    public final int f34904a;
    public final Object f34905b;
    public final Object f34906c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f34904a = i10;
        this.f34905b = obj;
        this.d = obj2;
        this.f34906c = obj3;
    }

    @Override
    public final void run(java.lang.Object r22, java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.j.run(java.lang.Object, java.lang.Object):void");
    }

    public j(Utilities.Callback callback, l0 l0Var, ConnectionsManager connectionsManager) {
        this.f34904a = 10;
        this.d = callback;
        this.f34905b = l0Var;
        this.f34906c = connectionsManager;
    }

    public j(l0 l0Var, Object obj, Object obj2, int i10) {
        this.f34904a = i10;
        this.f34905b = l0Var;
        this.f34906c = obj;
        this.d = obj2;
    }

    public j(l0 l0Var, o oVar, String str, String str2) {
        this.f34904a = 5;
        this.f34905b = oVar;
        this.d = str;
        this.f34906c = str2;
    }

    public j(n7 n7Var, org.telegram.ui.ActionBar.a2 a2Var, l0 l0Var) {
        this.f34904a = 11;
        this.d = n7Var;
        this.f34906c = a2Var;
        this.f34905b = l0Var;
    }
}
