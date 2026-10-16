package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class c90 implements Runnable {
    public final int f34483a;
    public final int f34484b;
    public final Object f34485c;
    public final Object d;

    public c90(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.k0 k0Var) {
        this.f34483a = 13;
        this.f34484b = i10;
        this.f34485c = callback;
        this.d = k0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c90.run():void");
    }

    public c90(Object obj, int i10, Object obj2, int i11) {
        this.f34483a = i11;
        this.f34485c = obj;
        this.f34484b = i10;
        this.d = obj2;
    }

    public c90(Object obj, Object obj2, int i10, int i11) {
        this.f34483a = i11;
        this.f34485c = obj;
        this.d = obj2;
        this.f34484b = i10;
    }
}
