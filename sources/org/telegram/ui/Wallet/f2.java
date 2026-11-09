package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.f10;
import org.telegram.ui.j60;
import org.telegram.ui.wp0;
public final class f2 implements Runnable {
    public final int f42444a;
    public final int f42445b;
    public final Object f42446c;

    public f2(int i7, e2 e2Var) {
        this.f42444a = 0;
        this.f42445b = i7;
        this.f42446c = e2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7;
        int i10 = this.f42444a;
        int i11 = this.f42445b;
        Object obj = this.f42446c;
        switch (i10) {
            case 0:
                qs.f(i11).n((e2) obj, 251);
                return;
            case 1:
                x5 x5Var = (x5) obj;
                org.telegram.messenger.g0.h3(new f10(x5Var, i11, x5.h(x5Var.R, i11), 16));
                return;
            case 2:
                u6 u6Var = (u6) obj;
                if (u6Var.f43192r && !u6Var.f43196y && i11 == u6Var.f43189k0) {
                    u6Var.postDelayed(u6Var.f43190l0, 500L);
                    return;
                }
                return;
            case 3:
                d8 d8Var = (d8) obj;
                ArrayList arrayList = d8Var.f42382w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) d8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((ma) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        d8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                v9 v9Var = (v9) obj;
                if (!v9Var.f43230r && i11 == v9Var.J) {
                    v9Var.L = false;
                    v9Var.f36649a.f37556f3.O(true);
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
                duration.setInterpolator(xq.f40458f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                wp0 wp0Var = (wp0) obj;
                sg.i1 i1Var = wp0Var.f55705t1;
                wp0Var.s0(i1Var, null);
                sg.l0.e(i11).j(i1Var.f55096c);
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
                        u1Var.setOnCancelListener(new j60(i11, 1));
                        u1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 10:
                x70 x70Var = ((wg.p0) obj).f57795e;
                try {
                    if (x70Var.getLayout().getLineForOffset(i11) == 0) {
                        x70Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                wi.d0 d0Var = ((wi.t) obj).N;
                if (d0Var != null && d0Var.f57962s != (i7 = ((i11 % 360) + 360) % 360)) {
                    d0Var.f57962s = i7;
                    d0Var.v();
                    return;
                }
                return;
        }
    }

    public f2(Object obj, int i7, int i10) {
        this.f42444a = i10;
        this.f42446c = obj;
        this.f42445b = i7;
    }
}
