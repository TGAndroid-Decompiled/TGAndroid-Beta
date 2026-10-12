package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ci0 implements Runnable {
    public final int f36440a;
    public final int f36441b;
    public final Object f36442c;
    public final Object d;

    public ci0(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.f36440a = 12;
        this.f36441b = i10;
        this.f36442c = callback;
        this.d = l0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci0.run():void");
    }

    public ci0(Object obj, int i10, Object obj2, int i11) {
        this.f36440a = i11;
        this.f36442c = obj;
        this.f36441b = i10;
        this.d = obj2;
    }

    public ci0(Object obj, Object obj2, int i10, int i11) {
        this.f36440a = i11;
        this.f36442c = obj;
        this.d = obj2;
        this.f36441b = i10;
    }
}
