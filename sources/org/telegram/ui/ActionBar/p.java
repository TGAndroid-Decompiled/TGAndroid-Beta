package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.r60;
public final class p implements Runnable {
    public final int f19475a;
    public final Object f19476b;
    public final Object f19477c;
    public final Object d;

    public p(Object obj, Object obj2, Object obj3, int i10) {
        this.f19475a = i10;
        this.f19477c = obj;
        this.f19476b = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.p.run():void");
    }

    public p(r60 r60Var, TLRPC.User user, n2 n2Var) {
        this.f19475a = 18;
        this.f19477c = r60Var;
        this.d = user;
        this.f19476b = n2Var;
    }

    public p(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19475a = 24;
        this.f19477c = ae0Var;
        this.f19476b = tL_error;
        this.d = tLObject;
    }
}
