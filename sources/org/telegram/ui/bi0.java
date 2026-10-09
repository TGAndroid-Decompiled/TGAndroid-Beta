package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bi0 implements Runnable {
    public final int f36342a;
    public final int f36343b;
    public final Object f36344c;
    public final Object d;

    public bi0(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.k0 k0Var) {
        this.f36342a = 12;
        this.f36343b = i10;
        this.f36344c = callback;
        this.d = k0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bi0.run():void");
    }

    public bi0(Object obj, int i10, Object obj2, int i11) {
        this.f36342a = i11;
        this.f36344c = obj;
        this.f36343b = i10;
        this.d = obj2;
    }

    public bi0(Object obj, Object obj2, int i10, int i11) {
        this.f36342a = i11;
        this.f36344c = obj;
        this.d = obj2;
        this.f36343b = i10;
    }
}
