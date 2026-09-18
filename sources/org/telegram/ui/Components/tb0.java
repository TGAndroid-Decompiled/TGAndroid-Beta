package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class tb0 extends s4.s0 {
    public final int f28361a;
    public final Object f28362b;

    public tb0(Object obj, int i10) {
        this.f28361a = i10;
        this.f28362b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        gl0 gl0Var;
        int i11 = this.f28361a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f28362b;
        switch (i11) {
            case 2:
                ah0 ah0Var = (ah0) obj;
                ug0 ug0Var = ah0Var.f22608b;
                if (i10 == 0 && ah0.I(ah0Var) + ((ah0Var.E - ah0.H(ah0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ug0Var.canScrollVertically(1)) {
                    ug0Var.getChildAt(0);
                    gl0 gl0Var2 = (gl0) ug0Var.L(0);
                    if (gl0Var2 != null) {
                        View view = gl0Var2.f42929a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            ug0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wl0 wl0Var = (wl0) obj;
                if (i10 == 0) {
                    if (wl0Var.f30102v2) {
                        wl0Var.f30102v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!wl0Var.f30102v2 && wl0Var.f30105x1) {
                    wl0Var.f30102v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && wl0Var.N1 != null) {
                    ol0 ol0Var = wl0Var.f30068e1;
                    if (ol0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ol0Var);
                        wl0Var.f30068e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        wl0Var.M1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    wl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = wl0Var.N1;
                    wl0Var.i1(view2, 0.0f, 0.0f, false);
                    wl0Var.N1 = null;
                    wl0Var.l1(null, view2);
                    wl0Var.P1 = false;
                }
                s4.s0 s0Var = wl0Var.f30061a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                wl0Var.K1 = z10;
                if (z10) {
                    wl0Var.L1 = true;
                    return;
                }
                return;
            case 5:
                jn0 jn0Var = (jn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(jn0Var.F.getCurrentFocus());
                }
                jn0Var.a();
                return;
            case 9:
                d71 d71Var = (d71) obj;
                ai.w0 w0Var = d71Var.d;
                if (i10 == 0 && d71Var.G && AndroidUtilities.dp(13.0f) + d71.m(d71Var) + d71Var.f23477y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (gl0Var = (gl0) w0Var.L(0)) != null) {
                    View view3 = gl0Var.f42929a;
                    if (view3.getTop() > 0) {
                        w0Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                rg.s0 s0Var2 = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var2.f42662d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42648a > n1Var.f42648a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.x1(n1Var, true);
                        s0Var2.f42662d3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42663e3);
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.z0) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
