package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.s60;
public final class p implements Runnable {
    public final int f19436a;
    public final Object f19437b;
    public final Object f19438c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f19436a = i10;
        this.f19438c = obj;
        this.f19437b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.p.run():void");
    }

    public p(s60 s60Var, TLRPC.User user, n2 n2Var) {
        this.f19436a = 18;
        this.f19438c = s60Var;
        this.d = user;
        this.f19437b = n2Var;
    }

    public p(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19436a = 24;
        this.f19438c = ae0Var;
        this.f19437b = tL_error;
        this.d = tLObject;
    }
}
