package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lx0 implements Runnable {
    public final int f40323a;
    public final Object f40324b;
    public final Object f40325c;
    public final Object d;
    public final Object f40326e;

    public lx0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40323a = i10;
        this.f40324b = obj;
        this.f40325c = obj2;
        this.d = obj3;
        this.f40326e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lx0.run():void");
    }

    public lx0(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, int i10) {
        this.f40323a = i10;
        this.f40324b = obj;
        this.f40325c = obj2;
        this.f40326e = tL_error;
        this.d = obj3;
    }

    public lx0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.s sVar, TLRPC.UserFull userFull) {
        this.f40323a = 18;
        this.f40325c = tLObject;
        this.f40324b = zArr;
        this.d = sVar;
        this.f40326e = userFull;
    }

    public lx0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, int i10) {
        this.f40323a = i10;
        this.f40324b = o2Var;
        this.f40326e = tL_error;
        this.f40325c = tLObject;
        this.d = str;
    }

    public lx0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        this.f40323a = 12;
        this.f40324b = twoStepVerificationActivity;
        this.d = bArr;
        this.f40325c = tLObject;
        this.f40326e = bArr2;
    }

    public lx0(rf.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f40323a = 20;
        this.f40324b = cVar;
        this.f40326e = tL_error;
        this.d = str;
        this.f40325c = tLObject;
    }
}
