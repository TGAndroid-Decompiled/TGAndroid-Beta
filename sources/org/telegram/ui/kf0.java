package org.telegram.ui;

import android.view.KeyEvent;
import org.telegram.tgnet.TLObject;
public final class kf0 implements Runnable {
    public final int f34703a;
    public final Object f34704b;
    public final Object f34705c;
    public final Object d;

    public kf0(KeyEvent.Callback callback, TLObject tLObject, Object obj, int i10) {
        this.f34703a = i10;
        this.f34704b = callback;
        this.f34705c = tLObject;
        this.d = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf0.run():void");
    }

    public kf0(Object obj, Object obj2, Object obj3, int i10) {
        this.f34703a = i10;
        this.f34704b = obj;
        this.d = obj2;
        this.f34705c = obj3;
    }
}
