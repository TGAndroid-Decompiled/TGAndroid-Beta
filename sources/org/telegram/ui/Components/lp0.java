package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class lp0 implements Runnable {
    public final int f37263a;
    public final Object f37264b;
    public final int f37265c;
    public final Object d;
    public final Object f37266e;

    public lp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f37263a = 17;
        this.f37265c = i7;
        this.f37264b = tL_error;
        this.d = g2Var;
        this.f37266e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        boolean z10;
        int i7;
        sg.b1 b1Var = (sg.b1) this.f37264b;
        sg.x0 x0Var = (sg.x0) this.d;
        ArrayList arrayList = (ArrayList) this.f37266e;
        ArrayList arrayList2 = b1Var.f57212c;
        if (x0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b1Var.d = z10;
        if (z10 && (i7 = this.f37265c) >= 0 && i7 < arrayList2.size()) {
            b1Var.f57210a++;
            ((sg.a1) arrayList2.get(i7)).f57204c++;
            b1Var.f57215g.edit().putInt(i5.c.i(i7, "score"), ((sg.a1) arrayList2.get(i7)).f57204c).putInt("scoreall", b1Var.f57210a).apply();
            b1Var.f57216i = null;
        } else {
            b1Var.f57216i = arrayList;
        }
        b1Var.f57213e.a(x0Var);
    }

    private final void b() {
        ia.c cVar = (ia.c) this.f37264b;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f37265c;
        Runnable runnable = (Runnable) this.f37266e;
        w5.c cVar2 = (w5.c) cVar.f16220f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f16218c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.o1(dVar, 5));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f16216a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new ai.u1(cVar, iVar, i7, 20));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp0.run():void");
    }

    public lp0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f37263a = i10;
        this.f37264b = obj;
        this.f37265c = i7;
        this.d = obj2;
        this.f37266e = obj3;
    }

    public lp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f37263a = i10;
        this.f37264b = obj;
        this.d = obj2;
        this.f37265c = i7;
        this.f37266e = obj3;
    }

    public lp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f37263a = i10;
        this.f37264b = obj;
        this.d = obj2;
        this.f37266e = obj3;
        this.f37265c = i7;
    }

    public lp0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, String str, int i7) {
        this.f37263a = 12;
        this.f37264b = notificationsCustomSettingsActivity;
        this.f37266e = view;
        this.d = str;
        this.f37265c = i7;
    }
}
