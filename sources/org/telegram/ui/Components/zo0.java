package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zo0 implements Runnable {
    public final int f41081a;
    public final Object f41082b;
    public final int f41083c;
    public final Object d;
    public final Object f41084e;

    public zo0(int i3, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f41081a = 16;
        this.f41083c = i3;
        this.f41082b = tL_error;
        this.d = d2Var;
        this.f41084e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        ha.c cVar = (ha.c) this.f41082b;
        n5.i iVar = (n5.i) this.d;
        int i3 = this.f41083c;
        Runnable runnable = (Runnable) this.f41084e;
        v5.c cVar2 = (v5.c) cVar.f14376f;
        try {
            try {
                u5.d dVar = (u5.d) cVar.f14374c;
                Objects.requireNonNull(dVar);
                ((u5.g) cVar2).f(new org.telegram.ui.ActionBar.e3(dVar, 12));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f14372a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i3);
                } else {
                    ((u5.g) cVar2).f(new k2.y(cVar, iVar, i3, 18));
                }
                runnable.run();
            } catch (v5.a unused) {
                ((p7.d) cVar.d).E(iVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zo0.run():void");
    }

    public zo0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f41081a = i10;
        this.f41082b = obj;
        this.f41083c = i3;
        this.d = obj2;
        this.f41084e = obj3;
    }

    public zo0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.f41081a = i10;
        this.f41082b = obj;
        this.d = obj2;
        this.f41083c = i3;
        this.f41084e = obj3;
    }

    public zo0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.f41081a = i10;
        this.f41082b = obj;
        this.d = obj2;
        this.f41084e = obj3;
        this.f41083c = i3;
    }

    public zo0(String str, int i3, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f41081a = 8;
        this.f41084e = str;
        this.f41083c = i3;
        this.f41082b = t2Var;
        this.d = e6Var;
    }

    public zo0(ow0 ow0Var, int i3, String str, ArrayList arrayList) {
        this.f41081a = 4;
        this.f41082b = ow0Var;
        this.f41083c = i3;
        this.f41084e = str;
        this.d = arrayList;
    }
}
