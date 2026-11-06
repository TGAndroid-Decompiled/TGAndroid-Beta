package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class pp0 implements Runnable {
    public final int f37026a;
    public final int f37027b;
    public final Object f37028c;
    public final Object d;
    public final Object f37029e;

    public pp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f37026a = 15;
        this.f37027b = i7;
        this.d = tL_error;
        this.f37028c = f2Var;
        this.f37029e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ia.c cVar = (ia.c) this.f37028c;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f37027b;
        Runnable runnable = (Runnable) this.f37029e;
        w5.c cVar2 = (w5.c) cVar.f15419f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f15417c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new org.telegram.ui.ActionBar.m3(dVar, 28));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f15415a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new jg.a2(cVar, iVar, i7, 18));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.hy0) cVar.d).J(iVar, i7 + 1, false);
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
        this.f37026a = i10;
        this.f37028c = obj;
        this.f37027b = i7;
        this.d = obj2;
        this.f37029e = obj3;
    }

    public pp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f37026a = i10;
        this.f37028c = obj;
        this.d = obj2;
        this.f37027b = i7;
        this.f37029e = obj3;
    }

    public pp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f37026a = i10;
        this.f37028c = obj;
        this.d = obj2;
        this.f37029e = obj3;
        this.f37027b = i7;
    }
}
