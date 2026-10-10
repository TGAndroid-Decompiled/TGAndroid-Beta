package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class of0 implements Runnable {
    public final int f40564a;
    public final Object f40565b;
    public final Object f40566c;
    public final Object d;

    public of0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40564a = i10;
        this.f40565b = callback;
        this.f40566c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.of0.run():void");
    }

    public of0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40564a = i10;
        this.f40565b = obj;
        this.d = obj2;
        this.f40566c = obj3;
    }
}
