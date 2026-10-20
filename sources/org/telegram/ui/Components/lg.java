package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f28148a;
    public final Object f28149b;
    public final Object f28150c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f28148a = i10;
        this.f28149b = obj;
        this.f28150c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.run():void");
    }

    public lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f28148a = i10;
        this.f28149b = obj;
        this.d = obj2;
        this.f28150c = arrayList;
    }

    public lg(ue0 ue0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28148a = 15;
        this.f28149b = ue0Var;
        this.f28150c = tL_error;
        this.d = tLObject;
    }
}
