package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class fx implements Runnable {
    public final int f39438a;
    public final Object f39439b;
    public final int f39440c;
    public final Object d;

    public fx(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.f39438a = 16;
        this.f39440c = i10;
        this.d = callback;
        this.f39439b = l0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fx.run():void");
    }

    public fx(Object obj, int i10, Object obj2, int i11) {
        this.f39438a = i11;
        this.d = obj;
        this.f39440c = i10;
        this.f39439b = obj2;
    }

    public fx(Object obj, Object obj2, int i10, int i11) {
        this.f39438a = i11;
        this.d = obj;
        this.f39439b = obj2;
        this.f39440c = i10;
    }
}
