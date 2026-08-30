package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class hf0 implements Runnable {
    public final int f34852a;
    public final Object f34853b;
    public final Object f34854c;
    public final Object d;

    public hf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f34852a = i10;
        this.f34853b = callback;
        this.f34854c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hf0.run():void");
    }

    public hf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f34852a = i10;
        this.f34853b = obj;
        this.d = obj2;
        this.f34854c = obj3;
    }
}
