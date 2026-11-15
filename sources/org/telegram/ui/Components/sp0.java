package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class sp0 implements Runnable {
    public final int f39387a;
    public final int f39388b;
    public final Object f39389c;
    public final Object d;
    public final Object f39390e;

    public sp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f39387a = 15;
        this.f39388b = i7;
        this.d = tL_error;
        this.f39389c = e2Var;
        this.f39390e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ia.c cVar = (ia.c) this.f39389c;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f39388b;
        Runnable runnable = (Runnable) this.f39390e;
        w5.c cVar2 = (w5.c) cVar.f15877f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f15875c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.z1(dVar, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f15873a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new ai.r1(cVar, iVar, i7, 19));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.ld0) cVar.d).H(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp0.run():void");
    }

    public sp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f39387a = i10;
        this.f39389c = obj;
        this.f39388b = i7;
        this.d = obj2;
        this.f39390e = obj3;
    }

    public sp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f39387a = i10;
        this.f39389c = obj;
        this.d = obj2;
        this.f39388b = i7;
        this.f39390e = obj3;
    }

    public sp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f39387a = i10;
        this.f39389c = obj;
        this.d = obj2;
        this.f39390e = obj3;
        this.f39388b = i7;
    }
}
