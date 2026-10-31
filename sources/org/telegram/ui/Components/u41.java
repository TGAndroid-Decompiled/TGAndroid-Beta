package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u41 implements Runnable {
    public final int f30810a;
    public final Object f30811b;
    public final Object f30812c;
    public final Object d;

    public u41(Object obj, Object obj2, Object obj3, int i10) {
        this.f30810a = i10;
        this.f30811b = obj;
        this.f30812c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u41.run():void");
    }

    public u41(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f30810a = i10;
        this.f30811b = obj;
        this.d = obj2;
        this.f30812c = obj3;
    }

    public u41(TLObject tLObject, org.telegram.ui.f0 f0Var, String str) {
        this.f30810a = 28;
        this.d = tLObject;
        this.f30811b = f0Var;
        this.f30812c = str;
    }

    public u41(rh.e4 e4Var, Runnable runnable, gf.e eVar, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f30810a = 24;
        this.f30811b = runnable;
        this.f30812c = eVar;
        this.d = twoStepVerificationActivity;
    }

    public u41(rh.e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, org.telegram.messenger.q20 q20Var) {
        this.f30810a = 29;
        this.d = tLObject;
        this.f30812c = tL_error;
        this.f30811b = q20Var;
    }
}
