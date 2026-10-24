package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class b41 implements Runnable {
    public final int f24909a;
    public final int f24910b;
    public final Object f24911c;
    public final Object d;

    public b41(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.f24909a = 17;
        this.f24910b = i10;
        this.f24911c = callback;
        this.d = l0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b41.run():void");
    }

    public b41(Object obj, int i10, Object obj2, int i11) {
        this.f24909a = i11;
        this.f24911c = obj;
        this.f24910b = i10;
        this.d = obj2;
    }

    public b41(Object obj, Object obj2, int i10, int i11) {
        this.f24909a = i11;
        this.f24911c = obj;
        this.d = obj2;
        this.f24910b = i10;
    }
}
