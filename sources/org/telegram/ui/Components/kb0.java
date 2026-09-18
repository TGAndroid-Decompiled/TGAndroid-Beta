package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class kb0 extends s4.s0 {
    public final int f25612a;
    public final Object f25613b;

    public kb0(Object obj, int i10) {
        this.f25612a = i10;
        this.f25613b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        wk0 wk0Var;
        int i11 = this.f25612a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f25613b;
        switch (i11) {
            case 2:
                qg0 qg0Var = (qg0) obj;
                kg0 kg0Var = qg0Var.f27301b;
                if (i10 == 0 && qg0.I(qg0Var) + ((qg0Var.E - qg0.H(qg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && kg0Var.canScrollVertically(1)) {
                    kg0Var.getChildAt(0);
                    wk0 wk0Var2 = (wk0) kg0Var.L(0);
                    if (wk0Var2 != null) {
                        View view = wk0Var2.f42702a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            kg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ml0 ml0Var = (ml0) obj;
                if (i10 == 0) {
                    if (ml0Var.f26206v2) {
                        ml0Var.f26206v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!ml0Var.f26206v2 && ml0Var.f26209x1) {
                    ml0Var.f26206v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && ml0Var.N1 != null) {
                    el0 el0Var = ml0Var.f26172e1;
                    if (el0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(el0Var);
                        ml0Var.f26172e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ml0Var.M1.y(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    ml0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = ml0Var.N1;
                    ml0Var.i1(view2, 0.0f, 0.0f, false);
                    ml0Var.N1 = null;
                    ml0Var.l1(null, view2);
                    ml0Var.P1 = false;
                }
                s4.s0 s0Var = ml0Var.f26165a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                ml0Var.K1 = z10;
                if (z10) {
                    ml0Var.L1 = true;
                    return;
                }
                return;
            case 5:
                wm0 wm0Var = (wm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wm0Var.F.getCurrentFocus());
                }
                wm0Var.a();
                return;
            case 9:
                p61 p61Var = (p61) obj;
                ai.w0 w0Var = p61Var.d;
                if (i10 == 0 && p61Var.G && AndroidUtilities.dp(13.0f) + p61.m(p61Var) + p61Var.f26949y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (wk0Var = (wk0) w0Var.L(0)) != null) {
                    View view3 = wk0Var.f42702a;
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
                    s0Var2.f42435d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42421a > n1Var.f42421a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.x1(n1Var, true);
                        s0Var2.f42435d3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42436e3);
                return;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.a1) obj).Y.getEditText());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
