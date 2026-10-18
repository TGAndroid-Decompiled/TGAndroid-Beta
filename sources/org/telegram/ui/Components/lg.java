package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f28225a;
    public final Object f28226b;
    public final Object f28227c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f28225a = i10;
        this.f28226b = obj;
        this.f28227c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.run():void");
    }

    public lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f28225a = i10;
        this.f28226b = obj;
        this.d = obj2;
        this.f28227c = arrayList;
    }

    public lg(te0 te0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28225a = 15;
        this.f28226b = te0Var;
        this.f28227c = tL_error;
        this.d = tLObject;
    }
}
