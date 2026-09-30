package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class xg0 extends s4.s0 {
    public final int f30248a;
    public final Object f30249b;

    public xg0(Object obj, int i10) {
        this.f30248a = i10;
        this.f30249b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        jl0 jl0Var;
        int i11 = this.f30248a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f30249b;
        switch (i11) {
            case 0:
                dh0 dh0Var = (dh0) obj;
                wg0 wg0Var = dh0Var.f23639b;
                if (i10 == 0 && dh0.I(dh0Var) + ((dh0Var.E - dh0.H(dh0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wg0Var.canScrollVertically(1)) {
                    wg0Var.getChildAt(0);
                    jl0 jl0Var2 = (jl0) wg0Var.K(0);
                    if (jl0Var2 != null) {
                        View view = jl0Var2.f43068a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            wg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zl0 zl0Var = (zl0) obj;
                if (i10 == 0) {
                    if (zl0Var.f31027v2) {
                        zl0Var.f31027v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zl0Var.f31027v2 && zl0Var.f31030x1) {
                    zl0Var.f31027v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zl0Var.N1 != null) {
                    rl0 rl0Var = zl0Var.f30993e1;
                    if (rl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(rl0Var);
                        zl0Var.f30993e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zl0Var.M1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    zl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = zl0Var.N1;
                    zl0Var.k1(view2, 0.0f, 0.0f, false);
                    zl0Var.N1 = null;
                    zl0Var.n1(null, view2);
                    zl0Var.P1 = false;
                }
                s4.s0 s0Var = zl0Var.f30986a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                zl0Var.K1 = z10;
                if (z10) {
                    zl0Var.L1 = true;
                    return;
                }
                return;
            case 3:
                ln0 ln0Var = (ln0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(ln0Var.F.getCurrentFocus());
                }
                ln0Var.a();
                return;
            case 7:
                e71 e71Var = (e71) obj;
                ai.w0 w0Var = e71Var.d;
                if (i10 == 0 && e71Var.G && AndroidUtilities.dp(13.0f) + e71.m(e71Var) + e71Var.f23904y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (jl0Var = (jl0) w0Var.K(0)) != null) {
                    View view3 = jl0Var.f43068a;
                    if (view3.getTop() > 0) {
                        w0Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                rg.s0 s0Var2 = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var2.f42799k3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42783a > n1Var.f42783a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.y1(n1Var, true);
                        s0Var2.f42799k3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.z1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42800l3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xg0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
