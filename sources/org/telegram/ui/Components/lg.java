package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lg implements Runnable {
    public final int f28357a;
    public final Object f28358b;
    public final Object f28359c;
    public final Object d;

    public lg(Object obj, Object obj2, Object obj3, int i10) {
        this.f28357a = i10;
        this.f28358b = obj;
        this.f28359c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.run():void");
    }

    public lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f28357a = i10;
        this.f28358b = obj;
        this.d = obj2;
        this.f28359c = arrayList;
    }

    public lg(xe0 xe0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f28357a = 15;
        this.f28358b = xe0Var;
        this.f28359c = tL_error;
        this.d = tLObject;
    }
}
