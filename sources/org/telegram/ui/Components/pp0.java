package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class pp0 implements Runnable {
    public final int f37058a;
    public final int f37059b;
    public final Object f37060c;
    public final Object d;
    public final Object f37061e;

    public pp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f37058a = 15;
        this.f37059b = i7;
        this.d = tL_error;
        this.f37060c = f2Var;
        this.f37061e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ia.c cVar = (ia.c) this.f37060c;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f37059b;
        Runnable runnable = (Runnable) this.f37061e;
        w5.c cVar2 = (w5.c) cVar.f15424f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f15422c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new org.telegram.ui.ActionBar.n3(dVar, 28));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f15420a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new jg.a2(cVar, iVar, i7, 18));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.ly0) cVar.d).J(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pp0.run():void");
    }

    public pp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f37058a = i10;
        this.f37060c = obj;
        this.f37059b = i7;
        this.d = obj2;
        this.f37061e = obj3;
    }

    public pp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f37058a = i10;
        this.f37060c = obj;
        this.d = obj2;
        this.f37059b = i7;
        this.f37061e = obj3;
    }

    public pp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f37058a = i10;
        this.f37060c = obj;
        this.d = obj2;
        this.f37061e = obj3;
        this.f37059b = i7;
    }
}
