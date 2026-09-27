package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class mf0 implements Runnable {
    public final int f35682a;
    public final Object f35683b;
    public final Object f35684c;
    public final Object d;

    public mf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f35682a = i10;
        this.f35683b = callback;
        this.f35684c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mf0.run():void");
    }

    public mf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f35682a = i10;
        this.f35683b = obj;
        this.d = obj2;
        this.f35684c = obj3;
    }
}
