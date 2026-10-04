package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class xb0 extends s4.s0 {
    public final int f32760a;
    public final Object f32761b;

    public xb0(Object obj, int i10) {
        this.f32760a = i10;
        this.f32761b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        il0 il0Var;
        int i11 = this.f32760a;
        rg.p1 p1Var = null;
        boolean z10 = false;
        Object obj = this.f32761b;
        switch (i11) {
            case 1:
                ch0 ch0Var = (ch0) obj;
                wg0 wg0Var = ch0Var.f25372b;
                if (i10 == 0 && ch0.G(ch0Var) + ((ch0Var.E - ch0.F(ch0Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wg0Var.canScrollVertically(1)) {
                    wg0Var.getChildAt(0);
                    il0 il0Var2 = (il0) wg0Var.K(0);
                    if (il0Var2 != null) {
                        View view = il0Var2.f46531a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            wg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zl0 zl0Var = (zl0) obj;
                if (i10 == 0) {
                    if (zl0Var.f33564v2) {
                        zl0Var.f33564v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zl0Var.f33564v2 && zl0Var.f33567x1) {
                    zl0Var.f33564v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zl0Var.N1 != null) {
                    ql0 ql0Var = zl0Var.f33530e1;
                    if (ql0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ql0Var);
                        zl0Var.f33530e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zl0Var.M1.G(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    zl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = zl0Var.N1;
                    zl0Var.k1(view2, 0.0f, 0.0f, false);
                    zl0Var.N1 = null;
                    zl0Var.n1(null, view2);
                    zl0Var.P1 = false;
                }
                s4.s0 s0Var = zl0Var.f33523a1;
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
            case 4:
                on0 on0Var = (on0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(on0Var.F.getCurrentFocus());
                }
                on0Var.a();
                return;
            case 9:
                n71 n71Var = (n71) obj;
                ai.w0 w0Var = n71Var.d;
                if (i10 == 0 && n71Var.G && AndroidUtilities.dp(13.0f) + n71.m(n71Var) + n71Var.f28902y < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (il0Var = (il0) w0Var.K(0)) != null) {
                    View view3 = il0Var.f46531a;
                    if (view3.getTop() > 0) {
                        w0Var.w0(0, view3.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                rg.t0 t0Var = (rg.t0) obj;
                if (i10 == 1) {
                    t0Var.f46269k3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        rg.p1 p1Var2 = (rg.p1) t0Var.getChildAt(i12);
                        if (p1Var == null || p1Var2.f46242a > p1Var.f46242a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.y1(p1Var, true);
                        t0Var.f46269k3 = false;
                        t0Var.w0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.z1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var.f46270l3);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xb0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
