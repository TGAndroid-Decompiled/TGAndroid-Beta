package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class fz0 implements Runnable {
    public final int f26478a;
    public final Object f26479b;
    public final int f26480c;
    public final Object d;
    public final Object e;

    public fz0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f26478a = 13;
        this.f26480c = i10;
        this.f26479b = tL_error;
        this.e = o2Var;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fz0.run():void");
    }

    public fz0(View view, int i10, String str, Serializable serializable, int i11) {
        this.f26478a = i11;
        this.f26479b = view;
        this.f26480c = i10;
        this.d = str;
        this.e = serializable;
    }

    public fz0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f26478a = i11;
        this.f26479b = obj;
        this.f26480c = i10;
        this.e = obj2;
        this.d = obj3;
    }

    public fz0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f26478a = i11;
        this.f26479b = obj;
        this.e = obj2;
        this.f26480c = i10;
        this.d = obj3;
    }

    public fz0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f26478a = i11;
        this.f26479b = obj;
        this.e = obj2;
        this.d = obj3;
        this.f26480c = i10;
    }

    public fz0(String str, int i10, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26478a = 5;
        this.d = str;
        this.f26480c = i10;
        this.f26479b = h3Var;
        this.e = g6Var;
    }
}
