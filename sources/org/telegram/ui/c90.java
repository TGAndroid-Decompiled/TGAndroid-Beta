package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class c90 implements Runnable {
    public final int f34761a;
    public final int f34762b;
    public final Object f34763c;
    public final Object d;

    public c90(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.j0 j0Var) {
        this.f34761a = 13;
        this.f34762b = i10;
        this.f34763c = callback;
        this.d = j0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c90.run():void");
    }

    public c90(Object obj, int i10, Object obj2, int i11) {
        this.f34761a = i11;
        this.f34763c = obj;
        this.f34762b = i10;
        this.d = obj2;
    }

    public c90(Object obj, Object obj2, int i10, int i11) {
        this.f34761a = i11;
        this.f34763c = obj;
        this.d = obj2;
        this.f34762b = i10;
    }
}
