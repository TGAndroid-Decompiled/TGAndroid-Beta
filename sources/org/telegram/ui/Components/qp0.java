package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class qp0 implements Runnable {
    public final int f37460a;
    public final int f37461b;
    public final Object f37462c;
    public final Object d;
    public final Object f37463e;

    public qp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f37460a = 15;
        this.f37461b = i7;
        this.d = tL_error;
        this.f37462c = f2Var;
        this.f37463e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ia.c cVar = (ia.c) this.f37462c;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f37461b;
        Runnable runnable = (Runnable) this.f37463e;
        w5.c cVar2 = (w5.c) cVar.f15422f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f15420c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new org.telegram.ui.ActionBar.m3(dVar, 28));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f15418a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new jg.a2(cVar, iVar, i7, 18));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.ky0) cVar.d).J(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qp0.run():void");
    }

    public qp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f37460a = i10;
        this.f37462c = obj;
        this.f37461b = i7;
        this.d = obj2;
        this.f37463e = obj3;
    }

    public qp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f37460a = i10;
        this.f37462c = obj;
        this.d = obj2;
        this.f37461b = i7;
        this.f37463e = obj3;
    }

    public qp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f37460a = i10;
        this.f37462c = obj;
        this.d = obj2;
        this.f37463e = obj3;
        this.f37461b = i7;
    }
}
