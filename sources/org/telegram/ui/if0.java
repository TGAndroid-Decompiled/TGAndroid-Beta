package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class if0 implements Runnable {
    public final int f37648a;
    public final Object f37649b;
    public final Object f37650c;
    public final Object d;

    public if0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f37648a = i10;
        this.f37649b = callback;
        this.f37650c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.if0.run():void");
    }

    public if0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37648a = i10;
        this.f37649b = obj;
        this.d = obj2;
        this.f37650c = obj3;
    }
}
