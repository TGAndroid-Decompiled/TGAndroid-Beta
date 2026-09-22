package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class vb0 extends s4.s0 {
    public final int f29049a;
    public final Object f29050b;

    public vb0(Object obj, int i10) {
        this.f29049a = i10;
        this.f29050b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        int i11 = this.f29049a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f29050b;
        switch (i11) {
            case 2:
                ch0 ch0Var = (ch0) obj;
                wg0 wg0Var = ch0Var.f23357b;
                if (i10 == 0 && ch0.I(ch0Var) + ((ch0Var.E - ch0.G(ch0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wg0Var.canScrollVertically(1)) {
                    wg0Var.getChildAt(0);
                    il0 il0Var2 = (il0) wg0Var.L(0);
                    if (il0Var2 != null) {
                        View view = il0Var2.f42995a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            wg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                yl0 yl0Var = (yl0) obj;
                if (i10 == 0) {
                    if (yl0Var.f30716v2) {
                        yl0Var.f30716v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!yl0Var.f30716v2 && yl0Var.f30719x1) {
                    yl0Var.f30716v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && yl0Var.N1 != null) {
                    ql0 ql0Var = yl0Var.f30682e1;
                    if (ql0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ql0Var);
                        yl0Var.f30682e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        yl0Var.M1.J(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    yl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = yl0Var.N1;
                    yl0Var.i1(view2, 0.0f, 0.0f, false);
                    yl0Var.N1 = null;
                    yl0Var.l1(null, view2);
                    yl0Var.P1 = false;
                }
                s4.s0 s0Var = yl0Var.f30675a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                yl0Var.K1 = z10;
                if (z10) {
                    yl0Var.L1 = true;
                    return;
                }
                return;
            case 5:
                kn0 kn0Var = (kn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(kn0Var.F.getCurrentFocus());
                }
                kn0Var.a();
                return;
            case 9:
                e71 e71Var = (e71) obj;
                ai.w0 w0Var = e71Var.d;
                if (i10 == 0 && e71Var.G && AndroidUtilities.dp(13.0f) + e71.m(e71Var) + e71Var.f23882y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (il0Var = (il0) w0Var.L(0)) != null) {
                    View view3 = il0Var.f42995a;
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
                    s0Var2.f42727d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42713a > n1Var.f42713a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.x1(n1Var, true);
                        s0Var2.f42727d3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42728e3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
