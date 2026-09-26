package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class vg0 extends s4.s0 {
    public final int f29099a;
    public final Object f29100b;

    public vg0(Object obj, int i10) {
        this.f29099a = i10;
        this.f29100b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        hl0 hl0Var;
        int i11 = this.f29099a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f29100b;
        switch (i11) {
            case 0:
                bh0 bh0Var = (bh0) obj;
                ug0 ug0Var = bh0Var.f23017b;
                if (i10 == 0 && bh0.I(bh0Var) + ((bh0Var.E - bh0.H(bh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ug0Var.canScrollVertically(1)) {
                    ug0Var.getChildAt(0);
                    hl0 hl0Var2 = (hl0) ug0Var.K(0);
                    if (hl0Var2 != null) {
                        View view = hl0Var2.f42959a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            ug0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xl0 xl0Var = (xl0) obj;
                if (i10 == 0) {
                    if (xl0Var.f30411v2) {
                        xl0Var.f30411v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!xl0Var.f30411v2 && xl0Var.f30414x1) {
                    xl0Var.f30411v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && xl0Var.N1 != null) {
                    pl0 pl0Var = xl0Var.f30377e1;
                    if (pl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(pl0Var);
                        xl0Var.f30377e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        xl0Var.M1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    xl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = xl0Var.N1;
                    xl0Var.h1(view2, 0.0f, 0.0f, false);
                    xl0Var.N1 = null;
                    xl0Var.k1(null, view2);
                    xl0Var.P1 = false;
                }
                s4.s0 s0Var = xl0Var.f30370a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                xl0Var.K1 = z10;
                if (z10) {
                    xl0Var.L1 = true;
                    return;
                }
                return;
            case 3:
                jn0 jn0Var = (jn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(jn0Var.F.getCurrentFocus());
                }
                jn0Var.a();
                return;
            case 7:
                c71 c71Var = (c71) obj;
                ai.w0 w0Var = c71Var.d;
                if (i10 == 0 && c71Var.G && AndroidUtilities.dp(13.0f) + c71.m(c71Var) + c71Var.f23265y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (hl0Var = (hl0) w0Var.K(0)) != null) {
                    View view3 = hl0Var.f42959a;
                    if (view3.getTop() > 0) {
                        w0Var.v0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                rg.s0 s0Var2 = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var2.f42691d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42677a > n1Var.f42677a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.w1(n1Var, true);
                        s0Var2.f42691d3 = false;
                        s0Var2.v0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.x1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42692e3);
                return;
            case 12:
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
