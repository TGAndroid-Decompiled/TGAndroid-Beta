package org.telegram.ui.Components;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class kp0 implements Runnable {
    public final int f36843a;
    public final Object f36844b;
    public final int f36845c;
    public final Object d;
    public final Object f36846e;

    public kp0(int i7, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f36843a = 17;
        this.f36845c = i7;
        this.f36844b = tL_error;
        this.d = g2Var;
        this.f36846e = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        boolean z10;
        int i7;
        sg.a1 a1Var = (sg.a1) this.f36844b;
        sg.w0 w0Var = (sg.w0) this.d;
        ArrayList arrayList = (ArrayList) this.f36846e;
        ArrayList arrayList2 = a1Var.f57285c;
        if (w0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1Var.d = z10;
        if (z10 && (i7 = this.f36845c) >= 0 && i7 < arrayList2.size()) {
            a1Var.f57283a++;
            ((sg.z0) arrayList2.get(i7)).f57534c++;
            a1Var.f57288g.edit().putInt(i5.c.i(i7, "score"), ((sg.z0) arrayList2.get(i7)).f57534c).putInt("scoreall", a1Var.f57283a).apply();
            a1Var.f57289i = null;
        } else {
            a1Var.f57289i = arrayList;
        }
        a1Var.f57286e.a(w0Var);
    }

    private final void b() {
        ia.c cVar = (ia.c) this.f36844b;
        o5.i iVar = (o5.i) this.d;
        int i7 = this.f36845c;
        Runnable runnable = (Runnable) this.f36846e;
        w5.c cVar2 = (w5.c) cVar.f16283f;
        try {
            try {
                v5.d dVar = (v5.d) cVar.f16281c;
                Objects.requireNonNull(dVar);
                ((v5.g) cVar2).f(new tg.s(dVar, 7));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar.f16279a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    cVar.c(iVar, i7);
                } else {
                    ((v5.g) cVar2).f(new ai.o1(cVar, iVar, i7, 20));
                }
                runnable.run();
            } catch (w5.a unused) {
                ((i61) cVar.d).N(iVar, i7 + 1, false);
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
        this.f36843a = i10;
        this.f36844b = obj;
        this.f36845c = i7;
        this.d = obj2;
        this.f36846e = obj3;
    }

    public kp0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f36843a = i10;
        this.f36844b = obj;
        this.d = obj2;
        this.f36845c = i7;
        this.f36846e = obj3;
    }

    public kp0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f36843a = i10;
        this.f36844b = obj;
        this.d = obj2;
        this.f36846e = obj3;
        this.f36845c = i7;
    }

    public kp0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, String str, int i7) {
        this.f36843a = 12;
        this.f36844b = notificationsCustomSettingsActivity;
        this.f36846e = view;
        this.d = str;
        this.f36845c = i7;
    }
}
