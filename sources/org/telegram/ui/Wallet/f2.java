package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.h10;
import org.telegram.ui.k60;
import org.telegram.ui.xp0;
public final class f2 implements Runnable {
    public final int f42492a;
    public final int f42493b;
    public final Object f42494c;

    public f2(int i7, e2 e2Var) {
        this.f42492a = 0;
        this.f42493b = i7;
        this.f42494c = e2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.f42492a;
        int i11 = this.f42493b;
        Object obj = this.f42494c;
        switch (i10) {
            case 0:
                qs.f(i11).n((e2) obj, 251);
                return;
            case 1:
                a6 a6Var = (a6) obj;
                org.telegram.messenger.g0.h3(new h10(a6Var, i11, a6.h(a6Var.R, i11), 16));
                return;
            case 2:
                x6 x6Var = (x6) obj;
                if (x6Var.f43351r && !x6Var.f43355y && i11 == x6Var.f43348k0) {
                    x6Var.postDelayed(x6Var.f43349l0, 500L);
                    return;
                }
                return;
            case 3:
                g8 g8Var = (g8) obj;
                ArrayList arrayList = g8Var.f42545w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) g8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((pa) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        g8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                y9 y9Var = (y9) obj;
                if (!y9Var.f43399r && i11 == y9Var.J) {
                    y9Var.L = false;
                    y9Var.f36518a.f37496f3.O(true);
                    return;
                }
                return;
            case 5:
                ((bx) obj).w0(i11, 0, null);
                return;
            case 6:
                tg.j jVar = (tg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(wq.f40046f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                xp0 xp0Var = (xp0) obj;
                sg.i1 i1Var = xp0Var.f55704t1;
                xp0Var.s0(i1Var, null);
                sg.l0.e(i11).j(i1Var.f55095c);
                return;
            case 8:
                qs.f(i11).k(215, Boolean.FALSE);
                ((tg.c2) obj).h();
                return;
            case 9:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    try {
                        u1Var.setOnCancelListener(new k60(i11, 1));
                        u1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 10:
                w70 w70Var = ((wg.p0) obj).f57793e;
                try {
                    if (w70Var.getLayout().getLineForOffset(i11) == 0) {
                        w70Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                wi.d0 d0Var = ((wi.t) obj).N;
                if (d0Var != null && d0Var.f57966s != (i7 = ((i11 % 360) + 360) % 360)) {
                    d0Var.f57966s = i7;
                    d0Var.v();
                    return;
                }
                return;
        }
    }

    public f2(Object obj, int i7, int i10) {
        this.f42492a = i10;
        this.f42494c = obj;
        this.f42493b = i7;
    }
}
