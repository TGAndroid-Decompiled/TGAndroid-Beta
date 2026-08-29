package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g implements Runnable {
    public final int f28663a;
    public final Object f28664b;
    public final Object f28665c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i10) {
        this.f28663a = i10;
        this.f28664b = obj;
        this.f28665c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g.run():void");
    }

    public g(vd0 vd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28663a = 18;
        this.f28664b = vd0Var;
        this.f28665c = tL_error;
        this.d = tLObject;
    }

    public g(ts0 ts0Var, org.telegram.ui.ActionBar.c6 c6Var, j70 j70Var) {
        this.f28663a = 25;
        this.f28664b = ts0Var;
        this.d = c6Var;
        this.f28665c = j70Var;
    }
}
