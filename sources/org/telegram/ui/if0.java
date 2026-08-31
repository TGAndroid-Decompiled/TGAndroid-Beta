package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class if0 implements Runnable {
    public final int f37831a;
    public final Object f37832b;
    public final Object f37833c;
    public final Object d;

    public if0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f37831a = i10;
        this.f37832b = callback;
        this.f37833c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.if0.run():void");
    }

    public if0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37831a = i10;
        this.f37832b = obj;
        this.d = obj2;
        this.f37833c = obj3;
    }
}
