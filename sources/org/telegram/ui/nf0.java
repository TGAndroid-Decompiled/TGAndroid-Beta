package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class nf0 implements Runnable {
    public final int f38969a;
    public final Object f38970b;
    public final Object f38971c;
    public final Object d;

    public nf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f38969a = i10;
        this.f38970b = callback;
        this.f38971c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf0.run():void");
    }

    public nf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f38969a = i10;
        this.f38970b = obj;
        this.d = obj2;
        this.f38971c = obj3;
    }
}
