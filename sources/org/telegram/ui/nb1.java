package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.HashSet;
public final class nb1 implements Runnable {
    public final int f49539a;
    public final int f49540b;
    public final Object f49541c;

    public nb1(int i7, Object obj, int i10) {
        this.f49539a = i10;
        this.f49540b = i7;
        this.f49541c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.f49539a;
        int i11 = this.f49540b;
        Object obj = this.f49541c;
        switch (i10) {
            case 0:
                ec1 ec1Var = (ec1) obj;
                ec1Var.G.setSignalBarCount(i11);
                if (i11 <= 1) {
                    org.telegram.ui.Components.voip.y2 y2Var = ec1Var.f46721w;
                    if (y2Var.W != 3) {
                        y2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(y2Var.I, 255);
                        y2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var, 2));
                        y2Var.P.setDuration(500L);
                        y2Var.P.start();
                    }
                    ec1Var.G.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.y2 y2Var2 = ec1Var.f46721w;
                if (y2Var2.W != 2) {
                    y2Var2.W = 2;
                    y2Var2.c();
                    ValueAnimator valueAnimator = y2Var2.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        y2Var2.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(y2Var2.I, 0);
                    y2Var2.P = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var2, 0));
                    y2Var2.P.setDuration(500L);
                    y2Var2.P.start();
                }
                ec1Var.G.c(false);
                return;
            case 1:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    l0Var.S();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i11);
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i11);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(f10, (jd0) obj, x10);
                f10.b(a0Var, 251);
                org.telegram.messenger.g0.i3(a0Var, 10000L);
                if (x10.f44081e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                a0Var.a();
                return;
            case 3:
                org.telegram.messenger.ns.f(i11).n((org.telegram.ui.Wallet.e2) obj, 251);
                return;
            case 4:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u11(z5Var, i11, org.telegram.ui.Wallet.z5.h(z5Var.R, i11), 19));
                return;
            case 5:
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) obj;
                if (w6Var.f44650r && !w6Var.f44654y && i11 == w6Var.f44648l0) {
                    w6Var.postDelayed(w6Var.m0, 500L);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.f8 f8Var = (org.telegram.ui.Wallet.f8) obj;
                ArrayList arrayList = f8Var.f43847w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) f8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((org.telegram.ui.Wallet.pa) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        f8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) obj;
                if (!z9Var.f44861r && i11 == z9Var.K) {
                    z9Var.M = false;
                    z9Var.f38882a.f39895g3.O(true);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.hx) obj).w0(i11, 0, null);
                return;
            case 9:
                tg.j jVar = (tg.j) obj;
                jVar.M = i11;
                jVar.L = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.R;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.Q = duration;
                duration.setInterpolator(org.telegram.ui.Components.er.f34420f);
                jVar.Q.addUpdateListener(new tg.f(jVar, 5));
                jVar.Q.addListener(new tg.g(jVar, 2));
                jVar.Q.start();
                return;
            case 10:
                tp0 tp0Var = (tp0) obj;
                sg.h1 h1Var = tp0Var.f57296u1;
                tp0Var.s0(h1Var, null);
                sg.k0.e(i11).j(h1Var.f56646c);
                return;
            case 11:
                org.telegram.messenger.ns.f(i11).k(215, Boolean.FALSE);
                ((tg.f2) obj).h();
                return;
            case 12:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    try {
                        t1Var.setOnCancelListener(new g60(i11, 1));
                        t1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.Components.z70 z70Var = ((wg.n0) obj).f59221e;
                try {
                    if (z70Var.getLayout().getLineForOffset(i11) == 0) {
                        z70Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                zi.e0 e0Var = ((zi.u) obj).N;
                if (e0Var != null && e0Var.f61505s != (i7 = ((i11 % 360) + 360) % 360)) {
                    e0Var.f61505s = i7;
                    e0Var.v();
                    return;
                }
                return;
        }
    }

    public nb1(Object obj, int i7, int i10) {
        this.f49539a = i10;
        this.f49541c = obj;
        this.f49540b = i7;
    }
}
