package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.d10;
import org.telegram.ui.h60;
import org.telegram.ui.up0;
public final class h2 implements Runnable {
    public final int f42555a;
    public final int f42556b;
    public final Object f42557c;

    public h2(int i7, g2 g2Var) {
        this.f42555a = 0;
        this.f42556b = i7;
        this.f42557c = g2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.f42555a;
        int i11 = this.f42556b;
        Object obj = this.f42557c;
        switch (i10) {
            case 0:
                qs.f(i11).n((g2) obj, 251);
                return;
            case 1:
                z5 z5Var = (z5) obj;
                org.telegram.messenger.g0.h3(new d10(z5Var, i11, z5.h(z5Var.R, i11), 16));
                return;
            case 2:
                w6 w6Var = (w6) obj;
                if (w6Var.f43303r && !w6Var.f43307y && i11 == w6Var.f43300k0) {
                    w6Var.postDelayed(w6Var.f43301l0, 500L);
                    return;
                }
                return;
            case 3:
                f8 f8Var = (f8) obj;
                ArrayList arrayList = f8Var.f42496w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) f8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((oa) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        f8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                x9 x9Var = (x9) obj;
                if (!x9Var.f43343r && i11 == x9Var.J) {
                    x9Var.L = false;
                    x9Var.f36227a.f37160f3.O(true);
                    return;
                }
                return;
            case 5:
                try {
                    ((org.telegram.utils.twidget.h0) obj).f(i11);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 6:
                ((bx) obj).w0(i11, 0, null);
                return;
            case 7:
                tg.j jVar = (tg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                duration.setInterpolator(xq.f40345f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, 2));
                jVar.P.start();
                return;
            case 8:
                up0 up0Var = (up0) obj;
                sg.j1 j1Var = up0Var.f55600t1;
                up0Var.s0(j1Var, null);
                sg.l0.e(i11).j(j1Var.f55018c);
                return;
            case 9:
                qs.f(i11).k(215, Boolean.FALSE);
                ((tg.c2) obj).h();
                return;
            case 10:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    try {
                        u1Var.setOnCancelListener(new h60(i11, 1));
                        u1VarArr[0].show();
                    } catch (Exception unused4) {
                        return;
                    }
                }
                return;
            case 11:
                w70 w70Var = ((wg.p0) obj).f57704e;
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
                wi.e0 e0Var = ((wi.u) obj).N;
                if (e0Var != null && e0Var.f57859s != (i7 = ((i11 % 360) + 360) % 360)) {
                    e0Var.f57859s = i7;
                    e0Var.v();
                    return;
                }
                return;
        }
    }

    public h2(Object obj, int i7, int i10) {
        this.f42555a = i10;
        this.f42557c = obj;
        this.f42556b = i7;
    }
}
