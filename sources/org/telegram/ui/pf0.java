package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class pf0 implements Runnable {
    public final int f36561a;
    public final Object f36562b;
    public final Object f36563c;
    public final Object d;

    public pf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f36561a = i10;
        this.f36562b = callback;
        this.f36563c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pf0.run():void");
    }

    public pf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36561a = i10;
        this.f36562b = obj;
        this.d = obj2;
        this.f36563c = obj3;
    }
}
