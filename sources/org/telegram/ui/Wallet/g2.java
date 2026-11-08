package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d10;
import org.telegram.ui.h60;
import org.telegram.ui.up0;
public final class g2 implements Runnable {
    public final int f42526a;
    public final int f42527b;
    public final Object f42528c;

    public g2(int i7, f2 f2Var) {
        this.f42526a = 0;
        this.f42527b = i7;
        this.f42528c = f2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.f42526a;
        int i11 = this.f42527b;
        Object obj = this.f42528c;
        switch (i10) {
            case 0:
                qs.f(i11).n((f2) obj, 251);
                return;
            case 1:
                y5 y5Var = (y5) obj;
                org.telegram.messenger.g0.h3(new d10(y5Var, i11, y5.h(y5Var.R, i11), 16));
                return;
            case 2:
                v6 v6Var = (v6) obj;
                if (v6Var.f43274r && !v6Var.f43278y && i11 == v6Var.f43271k0) {
                    v6Var.postDelayed(v6Var.f43272l0, 500L);
                    return;
                }
                return;
            case 3:
                e8 e8Var = (e8) obj;
                ArrayList arrayList = e8Var.f42464w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) e8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((na) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        e8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                w9 w9Var = (w9) obj;
                if (!w9Var.f43312r && i11 == w9Var.J) {
                    w9Var.L = false;
                    w9Var.f36243a.f37190f3.O(true);
                    return;
                }
                return;
            case 5:
                ((cx) obj).w0(i11, 0, null);
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
                duration.setInterpolator(xq.f40366f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                up0 up0Var = (up0) obj;
                sg.j1 j1Var = up0Var.f55692t1;
                up0Var.s0(j1Var, null);
                sg.l0.e(i11).j(j1Var.f55110c);
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
                        u1Var.setOnCancelListener(new h60(i11, 1));
                        u1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 10:
                w70 w70Var = ((wg.p0) obj).f57796e;
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
                if (d0Var != null && d0Var.f57949s != (i7 = ((i11 % 360) + 360) % 360)) {
                    d0Var.f57949s = i7;
                    d0Var.v();
                    return;
                }
                return;
        }
    }

    public g2(Object obj, int i7, int i10) {
        this.f42526a = i10;
        this.f42528c = obj;
        this.f42527b = i7;
    }
}
