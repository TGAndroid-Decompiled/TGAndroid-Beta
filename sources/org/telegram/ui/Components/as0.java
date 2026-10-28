package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class as0 implements Runnable {
    public final int f26657a;
    public final int f26658b;
    public final Object f26659c;
    public final Object d;
    public final Object e;

    public as0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f26657a = 15;
        this.f26658b = i10;
        this.d = tL_error;
        this.e = r2Var;
        this.f26659c = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        aa.b0 b0Var = (aa.b0) this.d;
        m5.i iVar = (m5.i) this.e;
        int i10 = this.f26658b;
        Runnable runnable = (Runnable) this.f26659c;
        u5.c cVar = (u5.c) b0Var.d;
        try {
            try {
                t5.d dVar = (t5.d) b0Var.f1034f;
                Objects.requireNonNull(dVar);
                ((t5.g) cVar).f(new org.telegram.ui.Components.voip.j1(dVar, 7));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) b0Var.f1031a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    b0Var.e(iVar, i10);
                } else {
                    ((t5.g) cVar).f(new i2.z(b0Var, iVar, i10, 19));
                }
                runnable.run();
            } catch (u5.a unused) {
                ((s4.d) b0Var.f1032b).t(iVar, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.as0.run():void");
    }

    public as0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f26657a = i11;
        this.d = obj;
        this.f26658b = i10;
        this.e = obj2;
        this.f26659c = obj3;
    }

    public as0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f26657a = i11;
        this.d = obj;
        this.e = obj2;
        this.f26658b = i10;
        this.f26659c = obj3;
    }

    public as0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f26657a = i11;
        this.d = obj;
        this.e = obj2;
        this.f26659c = obj3;
        this.f26658b = i10;
    }

    public as0(String str, int i10, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f26657a = 7;
        this.f26659c = str;
        this.f26658b = i10;
        this.d = k3Var;
        this.e = u6Var;
    }

    public as0(uz0 uz0Var, int i10, String str, ArrayList arrayList) {
        this.f26657a = 3;
        this.d = uz0Var;
        this.f26658b = i10;
        this.f26659c = str;
        this.e = arrayList;
    }
}
