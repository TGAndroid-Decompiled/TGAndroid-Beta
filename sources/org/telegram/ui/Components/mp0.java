package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mp0 implements Runnable {
    public final int f37597a;
    public final Object f37598b;
    public final int f37599c;
    public final Object d;
    public final Object f37600e;

    public mp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f37597a = 16;
        this.f37599c = i7;
        this.f37598b = tL_error;
        this.d = g2Var;
        this.f37600e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        tg.f2 f2Var = (tg.f2) this.f37598b;
        int i7 = f2Var.U;
        int i10 = f2Var.V;
        f2Var.m((Bitmap) this.d, this.f37599c, i7, i10, (org.telegram.ui.on0) this.f37600e);
    }

    private final void b() {
        ia.c cVar = (ia.c) this.f37598b;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f37599c;
        Runnable runnable = (Runnable) this.f37600e;
        w5.c cVar2 = (w5.c) cVar.f16217f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f16215c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.o1(dVar, 5));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f16213a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new ai.t1(cVar, iVar, i7, 20));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((org.telegram.ui.md0) cVar.d).H(iVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp0.run():void");
    }

    public mp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f37597a = i10;
        this.f37598b = obj;
        this.f37599c = i7;
        this.d = obj2;
        this.f37600e = obj3;
    }

    public mp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f37597a = i10;
        this.f37598b = obj;
        this.d = obj2;
        this.f37599c = i7;
        this.f37600e = obj3;
    }

    public mp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f37597a = i10;
        this.f37598b = obj;
        this.d = obj2;
        this.f37600e = obj3;
        this.f37599c = i7;
    }

    public mp0(String str, int i7, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f37597a = 8;
        this.f37600e = str;
        this.f37599c = i7;
        this.f37598b = w2Var;
        this.d = h6Var;
    }

    public mp0(ax0 ax0Var, int i7, String str, ArrayList arrayList) {
        this.f37597a = 4;
        this.f37598b = ax0Var;
        this.f37599c = i7;
        this.f37600e = str;
        this.d = arrayList;
    }
}
