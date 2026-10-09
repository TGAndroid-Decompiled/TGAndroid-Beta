package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bi0 implements Runnable {
    public final int f36340a;
    public final int f36341b;
    public final Object f36342c;
    public final Object d;

    public bi0(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.k0 k0Var) {
        this.f36340a = 12;
        this.f36341b = i10;
        this.f36342c = callback;
        this.d = k0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bi0.run():void");
    }

    public bi0(Object obj, int i10, Object obj2, int i11) {
        this.f36340a = i11;
        this.f36342c = obj;
        this.f36341b = i10;
        this.d = obj2;
    }

    public bi0(Object obj, Object obj2, int i10, int i11) {
        this.f36340a = i11;
        this.f36342c = obj;
        this.d = obj2;
        this.f36341b = i10;
    }
}
