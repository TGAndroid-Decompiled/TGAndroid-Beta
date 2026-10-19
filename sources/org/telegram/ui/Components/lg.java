package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f28210a;
    public final Object f28211b;
    public final Object f28212c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f28210a = i10;
        this.f28211b = obj;
        this.f28212c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.run():void");
    }

    public lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f28210a = i10;
        this.f28211b = obj;
        this.d = obj2;
        this.f28212c = arrayList;
    }

    public lg(te0 te0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28210a = 15;
        this.f28211b = te0Var;
        this.f28212c = tL_error;
        this.d = tLObject;
    }
}
