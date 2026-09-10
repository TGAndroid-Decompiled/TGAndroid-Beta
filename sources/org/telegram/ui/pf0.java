package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class pf0 implements Runnable {
    public final int f35826a;
    public final Object f35827b;
    public final Object f35828c;
    public final Object d;

    public pf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f35826a = i10;
        this.f35827b = callback;
        this.f35828c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pf0.run():void");
    }

    public pf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35826a = i10;
        this.f35827b = obj;
        this.d = obj2;
        this.f35828c = obj3;
    }
}
