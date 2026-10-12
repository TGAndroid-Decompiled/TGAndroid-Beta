package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ff0;
public final class h implements Runnable {
    public final int f19988a;
    public final Object f19989b;
    public final Object f19990c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f19988a = i10;
        this.f19989b = obj;
        this.d = obj2;
        this.f19990c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.h.run():void");
    }

    public h(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f19988a = i10;
        this.f19989b = obj;
        this.f19990c = obj2;
        this.d = tLObject;
    }

    public h(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19988a = 28;
        this.f19989b = ff0Var;
        this.f19990c = tL_error;
        this.d = tLObject;
    }
}
