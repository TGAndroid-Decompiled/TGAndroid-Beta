package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class nf0 implements Runnable {
    public final int f40273a;
    public final Object f40274b;
    public final Object f40275c;
    public final Object d;

    public nf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40273a = i10;
        this.f40274b = callback;
        this.f40275c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf0.run():void");
    }

    public nf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40273a = i10;
        this.f40274b = obj;
        this.d = obj2;
        this.f40275c = obj3;
    }
}
