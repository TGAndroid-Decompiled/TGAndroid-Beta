package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class sb0 extends s4.s0 {
    public final int f28087a;
    public final Object f28088b;

    public sb0(Object obj, int i10) {
        this.f28087a = i10;
        this.f28088b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        fl0 fl0Var;
        int i11 = this.f28087a;
        rg.n1 n1Var = null;
        boolean z10 = false;
        Object obj = this.f28088b;
        switch (i11) {
            case 2:
                zg0 zg0Var = (zg0) obj;
                tg0 tg0Var = zg0Var.f30816b;
                if (i10 == 0 && zg0.I(zg0Var) + ((zg0Var.E - zg0.H(zg0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && tg0Var.canScrollVertically(1)) {
                    tg0Var.getChildAt(0);
                    fl0 fl0Var2 = (fl0) tg0Var.L(0);
                    if (fl0Var2 != null) {
                        View view = fl0Var2.f42974a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            tg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vl0 vl0Var = (vl0) obj;
                if (i10 == 0) {
                    if (vl0Var.f29219v2) {
                        vl0Var.f29219v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!vl0Var.f29219v2 && vl0Var.f29222x1) {
                    vl0Var.f29219v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && vl0Var.N1 != null) {
                    nl0 nl0Var = vl0Var.f29185e1;
                    if (nl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(nl0Var);
                        vl0Var.f29185e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        vl0Var.M1.f0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    vl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = vl0Var.N1;
                    vl0Var.i1(view2, 0.0f, 0.0f, false);
                    vl0Var.N1 = null;
                    vl0Var.l1(null, view2);
                    vl0Var.P1 = false;
                }
                s4.s0 s0Var = vl0Var.f29178a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                z10 = (i10 == 1 || i10 == 2) ? true : true;
                vl0Var.K1 = z10;
                if (z10) {
                    vl0Var.L1 = true;
                    return;
                }
                return;
            case 5:
                in0 in0Var = (in0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(in0Var.F.getCurrentFocus());
                }
                in0Var.a();
                return;
            case 9:
                c71 c71Var = (c71) obj;
                ai.w0 w0Var = c71Var.d;
                if (i10 == 0 && c71Var.G && AndroidUtilities.dp(13.0f) + c71.m(c71Var) + c71Var.f23192y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (fl0Var = (fl0) w0Var.L(0)) != null) {
                    View view3 = fl0Var.f42974a;
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
                    s0Var2.f42706d3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i12);
                        if (n1Var == null || n1Var2.f42692a > n1Var.f42692a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.x1(n1Var, true);
                        s0Var2.f42706d3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.y1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var2.f42707e3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
