package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class w31 implements Runnable {
    public final int f32006a;
    public final int f32007b;
    public final Object f32008c;
    public final Object d;

    public w31(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.m0 m0Var) {
        this.f32006a = 17;
        this.f32007b = i10;
        this.f32008c = callback;
        this.d = m0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w31.run():void");
    }

    public w31(Object obj, int i10, Object obj2, int i11) {
        this.f32006a = i11;
        this.f32008c = obj;
        this.f32007b = i10;
        this.d = obj2;
    }

    public w31(Object obj, Object obj2, int i10, int i11) {
        this.f32006a = i11;
        this.f32008c = obj;
        this.d = obj2;
        this.f32007b = i10;
    }
}
