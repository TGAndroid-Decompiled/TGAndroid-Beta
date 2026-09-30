package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class jf0 implements Runnable {
    public final int f34887a;
    public final Object f34888b;
    public final Object f34889c;
    public final Object d;

    public jf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f34887a = i10;
        this.f34888b = callback;
        this.f34889c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.run():void");
    }

    public jf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f34887a = i10;
        this.f34888b = obj;
        this.d = obj2;
        this.f34889c = obj3;
    }
}
