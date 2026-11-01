package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l90 implements Runnable {
    public final int f39151a;
    public final Object f39152b;
    public final Object f39153c;
    public final Object d;
    public final Object e;
    public final Object f39154f;

    public l90(KeyEvent.Callback callback, TLObject tLObject, Object obj, TLRPC.TL_error tL_error, TLObject tLObject2, int i10) {
        this.f39151a = i10;
        this.d = callback;
        this.f39153c = tLObject;
        this.e = obj;
        this.f39152b = tL_error;
        this.f39154f = tLObject2;
    }

    private final void a() {
        ph.g4 g4Var = (ph.g4) this.d;
        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f39152b;
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f39154f;
        int i10 = g4Var.Q1;
        org.telegram.ui.ActionBar.k2 k2Var = g4Var.f26727o1;
        if (((TLObject) this.f39153c) instanceof TLRPC.TL_boolTrue) {
            org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
            Activity parentActivity = k2Var.getParentActivity();
            org.telegram.messenger.c a2 = org.telegram.messenger.c.a(i10);
            hf.b bVar = new hf.b(9, false);
            bVar.m0(g4Var.W1.h);
            i11.l(parentActivity, a2, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.K()));
        } else if (tL_error != null) {
            org.telegram.ui.Components.s4.e0(i10, tL_error, k2Var, tL_payments_canPurchaseStore, new Object[0]);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l90.run():void");
    }

    public l90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f39151a = i10;
        this.d = obj;
        this.f39153c = obj2;
        this.e = obj3;
        this.f39154f = obj4;
        this.f39152b = obj5;
    }

    public l90(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39151a = i10;
        this.d = obj;
        this.f39152b = tL_error;
        this.f39153c = obj2;
        this.e = obj3;
        this.f39154f = obj4;
    }

    public l90(fl0 fl0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
        this.f39151a = 10;
        this.d = fl0Var;
        this.f39152b = tL_error;
        this.e = bundle;
        this.f39153c = tLObject;
        this.f39154f = tL_auth_resendCode;
    }
}
