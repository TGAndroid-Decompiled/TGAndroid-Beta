package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class v41 implements Runnable {
    public final int f31172a;
    public final Object f31173b;
    public final Object f31174c;
    public final Object d;

    public v41(Object obj, Object obj2, Object obj3, int i10) {
        this.f31172a = i10;
        this.f31173b = obj;
        this.f31174c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v41.run():void");
    }

    public v41(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f31172a = i10;
        this.f31173b = obj;
        this.d = obj2;
        this.f31174c = obj3;
    }

    public v41(TLObject tLObject, org.telegram.ui.f0 f0Var, String str) {
        this.f31172a = 28;
        this.d = tLObject;
        this.f31173b = f0Var;
        this.f31174c = str;
    }

    public v41(rh.e4 e4Var, Runnable runnable, gf.e eVar, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f31172a = 24;
        this.f31173b = runnable;
        this.f31174c = eVar;
        this.d = twoStepVerificationActivity;
    }

    public v41(rh.e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, org.telegram.messenger.r20 r20Var) {
        this.f31172a = 29;
        this.d = tLObject;
        this.f31174c = tL_error;
        this.f31173b = r20Var;
    }
}
