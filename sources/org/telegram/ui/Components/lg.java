package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f28232a;
    public final Object f28233b;
    public final Object f28234c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f28232a = i10;
        this.f28233b = obj;
        this.f28234c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.run():void");
    }

    public lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f28232a = i10;
        this.f28233b = obj;
        this.d = obj2;
        this.f28234c = arrayList;
    }

    public lg(te0 te0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28232a = 15;
        this.f28233b = te0Var;
        this.f28234c = tL_error;
        this.d = tLObject;
    }
}
