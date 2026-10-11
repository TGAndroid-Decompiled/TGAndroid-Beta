package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class nf0 implements Runnable {
    public final int f40239a;
    public final Object f40240b;
    public final Object f40241c;
    public final Object d;

    public nf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f40239a = i10;
        this.f40240b = callback;
        this.f40241c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf0.run():void");
    }

    public nf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40239a = i10;
        this.f40240b = obj;
        this.d = obj2;
        this.f40241c = obj3;
    }
}
