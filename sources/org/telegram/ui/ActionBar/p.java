package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.r60;
public final class p implements Runnable {
    public final int f21297a;
    public final Object f21298b;
    public final Object f21299c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f21297a = i10;
        this.f21299c = obj;
        this.f21298b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.p.run():void");
    }

    public p(r60 r60Var, TLRPC.User user, n2 n2Var) {
        this.f21297a = 18;
        this.f21299c = r60Var;
        this.d = user;
        this.f21298b = n2Var;
    }

    public p(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f21297a = 24;
        this.f21299c = ae0Var;
        this.f21298b = tL_error;
        this.d = tLObject;
    }
}
