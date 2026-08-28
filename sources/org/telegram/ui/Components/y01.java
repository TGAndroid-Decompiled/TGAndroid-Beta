package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLRPC;
public final class y01 implements Runnable {
    public final int f34823a;
    public final int f34824b;
    public final Object f34825c;
    public final Object d;
    public final Object f34826e;

    public y01(int i9, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f34823a = 10;
        this.f34824b = i9;
        this.f34825c = tL_error;
        this.d = o2Var;
        this.f34826e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y01.run():void");
    }

    public y01(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f34823a = i10;
        this.f34825c = obj;
        this.f34824b = i9;
        this.d = obj2;
        this.f34826e = obj3;
    }

    public y01(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.f34823a = i10;
        this.f34825c = obj;
        this.d = obj2;
        this.f34824b = i9;
        this.f34826e = obj3;
    }

    public y01(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.f34823a = i10;
        this.f34825c = obj;
        this.d = obj2;
        this.f34826e = obj3;
        this.f34824b = i9;
    }

    public y01(yf.m2 m2Var, Bitmap bitmap, int i9, org.telegram.ui.mq0 mq0Var) {
        this.f34823a = 15;
        this.f34825c = m2Var;
        this.f34826e = bitmap;
        this.f34824b = i9;
        this.d = mq0Var;
    }
}
