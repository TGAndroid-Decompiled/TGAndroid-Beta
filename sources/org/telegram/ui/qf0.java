package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class qf0 implements Runnable {
    public final int f36816a;
    public final Object f36817b;
    public final Object f36818c;
    public final Object d;

    public qf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f36816a = i10;
        this.f36817b = callback;
        this.f36818c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qf0.run():void");
    }

    public qf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f36816a = i10;
        this.f36817b = obj;
        this.d = obj2;
        this.f36818c = obj3;
    }
}
