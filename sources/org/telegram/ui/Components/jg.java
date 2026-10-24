package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f27694a;
    public final Object f27695b;
    public final Object f27696c;
    public final Object d;

    public jg(Object obj, Object obj2, Object obj3, int i10) {
        this.f27694a = i10;
        this.f27695b = obj;
        this.f27696c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg.run():void");
    }

    public jg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.f27694a = i10;
        this.f27695b = obj;
        this.d = obj2;
        this.f27696c = arrayList;
    }

    public jg(ve0 ve0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f27694a = 15;
        this.f27695b = ve0Var;
        this.f27696c = tL_error;
        this.d = tLObject;
    }
}
