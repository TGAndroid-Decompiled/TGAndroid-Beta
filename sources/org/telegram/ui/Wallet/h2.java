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
import org.telegram.ui.tp0;
public final class h2 implements Runnable {
    public final int f42531a;
    public final int f42532b;
    public final Object f42533c;

    public h2(int i7, g2 g2Var) {
        this.f42531a = 0;
        this.f42532b = i7;
        this.f42533c = g2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i7 = this.f42531a;
        int i10 = this.f42532b;
        Object obj = this.f42533c;
        switch (i7) {
            case 0:
                qs.f(i10).n((g2) obj, 251);
                return;
            case 1:
                z5 z5Var = (z5) obj;
                org.telegram.messenger.g0.h3(new d10(z5Var, i10, z5.h(z5Var.R, i10), 16));
                return;
            case 2:
                w6 w6Var = (w6) obj;
                if (w6Var.f43279r && !w6Var.f43283y && i10 == w6Var.f43276k0) {
                    w6Var.postDelayed(w6Var.f43277l0, 500L);
                    return;
                }
                return;
            case 3:
                f8 f8Var = (f8) obj;
                ArrayList arrayList = f8Var.f42472w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) f8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i11 = 0; i10 < arrayList.size() && i11 < split.length; i11++) {
                            ((oa) arrayList.get(i10)).setText(split[i11]);
                            i10++;
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
                if (!x9Var.f43319r && i10 == x9Var.J) {
                    x9Var.L = false;
                    x9Var.f34211a.f35167f3.O(true);
                    return;
                }
                return;
            case 5:
                try {
                    ((org.telegram.utils.twidget.h0) obj).e(i10);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 6:
                ((bx) obj).w0(i10, 0, null);
                return;
            case 7:
                tg.j jVar = (tg.j) obj;
                jVar.L = i10;
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
                duration.setInterpolator(xq.f40310f);
                jVar.P.addUpdateListener(new tg.f(jVar, 5));
                jVar.P.addListener(new tg.g(jVar, 2));
                jVar.P.start();
                return;
            case 8:
                tp0 tp0Var = (tp0) obj;
                sg.j1 j1Var = tp0Var.f55576t1;
                tp0Var.s0(j1Var, null);
                sg.l0.e(i10).j(j1Var.f54994c);
                return;
            case 9:
                qs.f(i10).k(215, Boolean.FALSE);
                ((tg.c2) obj).h();
                return;
            case 10:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    try {
                        u1Var.setOnCancelListener(new h60(i10, 1));
                        u1VarArr[0].show();
                    } catch (Exception unused4) {
                        return;
                    }
                }
                return;
            default:
                w70 w70Var = ((wg.p0) obj).f57680e;
                try {
                    if (w70Var.getLayout().getLineForOffset(i10) == 0) {
                        w70Var.getEditableText().insert(i10, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }

    public h2(Object obj, int i7, int i10) {
        this.f42531a = i10;
        this.f42533c = obj;
        this.f42532b = i7;
    }
}
