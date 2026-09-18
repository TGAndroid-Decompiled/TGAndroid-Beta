package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.r60;
public final class q implements Runnable {
    public final int f19503a;
    public final Object f19504b;
    public final Object f19505c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f19503a = i10;
        this.f19505c = obj;
        this.f19504b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q.run():void");
    }

    public q(r60 r60Var, TLRPC.User user, o2 o2Var) {
        this.f19503a = 18;
        this.f19505c = r60Var;
        this.d = user;
        this.f19504b = o2Var;
    }

    public q(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19503a = 24;
        this.f19505c = ae0Var;
        this.f19504b = tL_error;
        this.d = tLObject;
    }
}
