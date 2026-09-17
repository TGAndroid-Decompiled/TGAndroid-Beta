package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.r60;
public final class q implements Runnable {
    public final int f19502a;
    public final Object f19503b;
    public final Object f19504c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f19502a = i10;
        this.f19504c = obj;
        this.f19503b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.q.run():void");
    }

    public q(r60 r60Var, TLRPC.User user, o2 o2Var) {
        this.f19502a = 18;
        this.f19504c = r60Var;
        this.d = user;
        this.f19503b = o2Var;
    }

    public q(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19502a = 24;
        this.f19504c = ae0Var;
        this.f19503b = tL_error;
        this.d = tLObject;
    }
}
