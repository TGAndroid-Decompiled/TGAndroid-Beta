package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ff0;
public final class h implements Runnable {
    public final int f19989a;
    public final Object f19990b;
    public final Object f19991c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f19989a = i10;
        this.f19990b = obj;
        this.d = obj2;
        this.f19991c = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.h.run():void");
    }

    public h(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f19989a = i10;
        this.f19990b = obj;
        this.f19991c = obj2;
        this.d = tLObject;
    }

    public h(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19989a = 28;
        this.f19990b = ff0Var;
        this.f19991c = tL_error;
        this.d = tLObject;
    }
}
