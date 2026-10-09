package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class of0 implements Runnable {
    public final int f40518a;
    public final Object f40519b;
    public final Object f40520c;
    public final Object d;

    public of0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40518a = i10;
        this.f40519b = callback;
        this.f40520c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.of0.run():void");
    }

    public of0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40518a = i10;
        this.f40519b = obj;
        this.d = obj2;
        this.f40520c = obj3;
    }
}
