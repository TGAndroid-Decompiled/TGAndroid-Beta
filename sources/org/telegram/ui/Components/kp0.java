package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kp0 implements Runnable {
    public final int f36840a;
    public final Object f36841b;
    public final int f36842c;
    public final Object d;
    public final Object f36843e;

    public kp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f36840a = 16;
        this.f36842c = i7;
        this.f36841b = tL_error;
        this.d = h2Var;
        this.f36843e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        tg.e2 e2Var = (tg.e2) this.f36841b;
        int i7 = e2Var.U;
        int i10 = e2Var.V;
        e2Var.m((Bitmap) this.d, this.f36842c, i7, i10, (org.telegram.ui.on0) this.f36843e);
    }

    private final void b() {
        ia.c cVar = (ia.c) this.f36841b;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f36842c;
        Runnable runnable = (Runnable) this.f36843e;
        w5.c cVar2 = (w5.c) cVar.f16195f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f16193c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.z1(dVar, 4));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f16191a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new ai.r1(cVar, iVar, i7, 20));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp0.run():void");
    }

    public kp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f36840a = i10;
        this.f36841b = obj;
        this.f36842c = i7;
        this.d = obj2;
        this.f36843e = obj3;
    }

    public kp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f36840a = i10;
        this.f36841b = obj;
        this.d = obj2;
        this.f36842c = i7;
        this.f36843e = obj3;
    }

    public kp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f36840a = i10;
        this.f36841b = obj;
        this.d = obj2;
        this.f36843e = obj3;
        this.f36842c = i7;
    }

    public kp0(String str, int i7, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f36840a = 8;
        this.f36843e = str;
        this.f36842c = i7;
        this.f36841b = x2Var;
        this.d = i6Var;
    }

    public kp0(yw0 yw0Var, int i7, String str, ArrayList arrayList) {
        this.f36840a = 4;
        this.f36841b = yw0Var;
        this.f36842c = i7;
        this.f36843e = str;
        this.d = arrayList;
    }
}
