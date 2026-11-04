package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b60;
import org.telegram.ui.lp0;
import org.telegram.ui.rw;
public final class f2 implements Runnable {
    public final int f42512a;
    public final int f42513b;
    public final Object f42514c;

    public f2(int i3, e2 e2Var) {
        this.f42512a = 0;
        this.f42513b = i3;
        this.f42514c = e2Var;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i3 = this.f42512a;
        int i10 = this.f42513b;
        Object obj = this.f42514c;
        switch (i3) {
            case 0:
                hs.f(i10).n((e2) obj, 251);
                return;
            case 1:
                x5 x5Var = (x5) obj;
                org.telegram.messenger.g0.h3(new rw(x5Var, i10, x5.h(x5Var.R, i10), 17));
                return;
            case 2:
                u6 u6Var = (u6) obj;
                if (u6Var.f43263r && !u6Var.f43267y && i10 == u6Var.f43261l0) {
                    u6Var.postDelayed(u6Var.m0, 500L);
                    return;
                }
                return;
            case 3:
                e8 e8Var = (e8) obj;
                ArrayList arrayList = e8Var.f42487w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) e8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i11 = 0; i10 < arrayList.size() && i11 < split.length; i11++) {
                            ((na) arrayList.get(i10)).setText(split[i11]);
                            i10++;
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
                if (!w9Var.f43365r && i10 == w9Var.K) {
                    w9Var.M = false;
                    w9Var.f34298a.f35594g3.O(true);
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
                ((ax) obj).w0(i10, 0, null);
                return;
            case 7:
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    try {
                        s1Var.setOnCancelListener(new b60(i10, 1));
                        s1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 8:
                ug.j jVar = (ug.j) obj;
                jVar.M = i10;
                jVar.L = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused4) {
                }
                ValueAnimator valueAnimator = jVar.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.Q = duration;
                duration.setInterpolator(xq.f40452f);
                jVar.Q.addUpdateListener(new ug.f(jVar, 5));
                jVar.Q.addListener(new ug.g(jVar, 2));
                jVar.Q.start();
                return;
            case 9:
                lp0 lp0Var = (lp0) obj;
                tg.h1 h1Var = lp0Var.f55992u1;
                lp0Var.s0(h1Var, null);
                tg.k0.e(i10).j(h1Var.f55188c);
                return;
            case 10:
                hs.f(i10).k(215, Boolean.FALSE);
                ((ug.c2) obj).h();
                return;
            default:
                s70 s70Var = ((xg.p0) obj).f58749e;
                try {
                    if (s70Var.getLayout().getLineForOffset(i10) == 0) {
                        s70Var.getEditableText().insert(i10, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
        }
    }

    public f2(Object obj, int i3, int i10) {
        this.f42512a = i10;
        this.f42514c = obj;
        this.f42513b = i3;
    }
}
