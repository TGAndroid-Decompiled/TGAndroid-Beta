package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class pf0 implements Runnable {
    public final int f36568a;
    public final Object f36569b;
    public final Object f36570c;
    public final Object d;

    public pf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f36568a = i10;
        this.f36569b = callback;
        this.f36570c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pf0.run():void");
    }

    public pf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36568a = i10;
        this.f36569b = obj;
        this.d = obj2;
        this.f36570c = obj3;
    }
}
