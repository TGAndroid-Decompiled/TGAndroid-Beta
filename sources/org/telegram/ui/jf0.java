package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class jf0 implements Runnable {
    public final int f35265a;
    public final Object f35266b;
    public final Object f35267c;
    public final Object d;

    public jf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f35265a = i10;
        this.f35266b = callback;
        this.f35267c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.run():void");
    }

    public jf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35265a = i10;
        this.f35266b = obj;
        this.d = obj2;
        this.f35267c = obj3;
    }
}
