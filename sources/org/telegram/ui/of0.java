package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class of0 implements Runnable {
    public final int f40520a;
    public final Object f40521b;
    public final Object f40522c;
    public final Object d;

    public of0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40520a = i10;
        this.f40521b = callback;
        this.f40522c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.of0.run():void");
    }

    public of0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40520a = i10;
        this.f40521b = obj;
        this.d = obj2;
        this.f40522c = obj3;
    }
}
