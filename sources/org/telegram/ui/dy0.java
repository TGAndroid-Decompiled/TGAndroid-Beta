package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dy0 implements Runnable {
    public final int f33554a;
    public final Object f33555b;
    public final Object f33556c;
    public final Object d;
    public final Object e;

    public dy0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33554a = i10;
        this.f33556c = obj;
        this.d = obj2;
        this.f33555b = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy0.run():void");
    }

    public dy0(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f33554a = i10;
        this.f33556c = obj;
        this.f33555b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public dy0(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.f33554a = i10;
        this.f33556c = obj;
        this.d = obj2;
        this.e = str;
        this.f33555b = obj3;
    }

    public dy0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f33554a = i10;
        this.f33556c = obj;
        this.f33555b = tLObject;
        this.e = obj2;
        this.d = obj3;
    }

    public dy0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.r rVar, TLRPC.UserFull userFull) {
        this.f33554a = 19;
        this.f33555b = tLObject;
        this.f33556c = zArr;
        this.d = rVar;
        this.e = userFull;
    }

    public dy0(ph.t6 t6Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.f33554a = 14;
        this.f33556c = t6Var;
        this.e = str;
        this.d = iArr;
        this.f33555b = callback;
    }
}
